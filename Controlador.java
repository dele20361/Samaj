/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Controlador del programa
Samaj-20
*****************/

import java.util.ArrayList;

public class Controlador {
  public static void main(String[] args) {

    //Propiedades
    int opc;
    String NombreUsuario;
    String ApellidoUsuario;
    String CorreoUsuario;
    int TelefonoUsuario;
    int CodigoUsuario;

    int TrabajadorFormalEdad;
    int TrabajadorFormalEducacion;
    boolean TrabajdorFormalExpLaboral;
    int TrabajadorFormalIdioma;
    boolean TrabajadorFormalTransporte;
    boolean TrabajadorFormalHomeOffice;

    String TrabajadorInformalArea;
  
    //Instanciar
    Documentos docs = new Documentos();
    Vista v = new Vista();
    usuarioSamaj user = null;
    boolean salir = false;
    Persistencia p = new Persistencia("Usuario.CSV");

    v.MensajeBienvenida();

    //Bajar la base de datos para tener perfiles guardados del CSV
    ArrayList<ArrayList<String>> BaseDatos = p.obtenerDatos();
    docs.setInfoUsuarios(BaseDatos); //Guarada en la clase Documentos los datos de la base de datos.
    
    // C R E A R   U S U A R I O  
    // Proceso de verificar existencia de perfil y/o creación de perfil
    int varTemporal = v.ExisteUsuario(); //Preguntar si tiene o no perfil. Devuelve 1 o 2 únicamente.
    if(varTemporal == 1){
      //El usuario dice que tiene perfil
      CodigoUsuario = v.IngresoCodigo(docs);
      if(CodigoUsuario == -1){ //El código se verificó y no existe.
        v.IngresoInfo();
        NombreUsuario = v.ingresarNombre();
        ApellidoUsuario = v.ingresarApellido();
        CorreoUsuario = v.ingresarCorreo();
        TelefonoUsuario = v.ingresarTelefono();
        CodigoUsuario = v.IngresoCodigo(docs); 
        user = new usuarioSamaj(NombreUsuario, ApellidoUsuario, CorreoUsuario, TelefonoUsuario, CodigoUsuario );
        p.nuevoRegistro(user);
        v.PerfilExito(); //Mensaje de creado con éxito. CHILERISIMO
      }
      else{ //Código si existe entonces se toman datos del ArrayList que tenga el código
        ArrayList<String> datosUsuario = docs.devolverDatos(CodigoUsuario);
        String NombreU = datosUsuario.get(1);
        String ApellidoU = datosUsuario.get(2);
        String CorreoU = datosUsuario.get(4);
        // TelefonoU
        String TelefonoU = datosUsuario.get(3); 
        // codigoU
        String CodigoU = datosUsuario.get(0); 
        int Telefono = Integer.parseInt(TelefonoU);
        int Codigo = Integer.parseInt(CodigoU);
        user = new usuarioSamaj(NombreU, ApellidoU, CorreoU, Telefono, Codigo);
        p.nuevoRegistro(user);
        v.PerfilExito(); //Mensaje de creado con éxito. CHILERISIMO
      }

      /*
      Se buscará el CodigoUsuario en el CSV
      para verificar que el código del 
      usuario en realidad existe.        */

    } else if(varTemporal == 2){
      /* Se ejecuta en caso el usuario
        no posea un perfil creado en
        Samaj-2020          */ 
      v.IngresoInfo();
      NombreUsuario = v.ingresarNombre();
      ApellidoUsuario = v.ingresarApellido();
      CorreoUsuario = v.ingresarCorreo();
      TelefonoUsuario = v.ingresarTelefono();
      CodigoUsuario = v.IngresoCodigo(docs); 
      user = new usuarioSamaj(NombreUsuario, ApellidoUsuario, CorreoUsuario, TelefonoUsuario, CodigoUsuario );
      p.nuevoRegistro(user);
      v.PerfilExito(); //Mensaje de creado con éxito. CHILERISIMO
    }


    // C O M I E N Z A   M E N Ú   G E N E R A L
    while( salir == false){
      int opcion = v.MenuGeneral(); //Método de Menú de vista
      if(opcion == 1){

        //Sub Menú 
        boolean salirSub1 = false;
        while(salirSub1 == false) {
          int submenu1 = v.SubMenu();
          if(submenu1 == 1){
            /* Ingresar los datos para crear el perfil donde se obtienen los
               datos adicionales para crear el Trabajador Formal. */
            v.IngresoInfo();
            TrabajadorFormalEdad = v.ingresarEdad();
            TrabajadorFormalEducacion = v.ingresarEducacion();
            TrabajdorFormalExpLaboral = v.ingresarExperienciaLaboral(); 
            TrabajadorFormalIdioma = v.ingresarIdioma();
            TrabajadorFormalTransporte = v.ingresarTransporte();
            TrabajadorFormalHomeOffice = v.ingresarHomeOffice();

            //Construir TrabajadorFormal y subir perfil a Documentos
            TrabajadorFormal entacuchado = new TrabajadorFormal(user, TrabajadorFormalEdad, TrabajadorFormalEducacion, TrabajadorFormalIdioma, TrabajdorFormalExpLaboral, TrabajadorFormalTransporte, TrabajadorFormalHomeOffice );
            docs.AddTrabajadorFormal( entacuchado );
            v.PerfilExito();
            v.MensajeTrabajadorFormalExito();
          }
          else if ( submenu1 == 2 ) {
            /* Ingresar los datos para crear el perfil donde se obtienen los
               datos adicionales para crear el Trabajador Informal. */
            v.IngresoInfo();
            TrabajadorInformalArea = v.ingresarConocimiento();

            //Construir TrabajadorInformal y subir perfil a Documentos
            TrabajadorInformal don = new TrabajadorInformal(user, TrabajadorInformalArea);
            docs.AddTrabajadorInformal( don );
            v.PerfilExito();
          }
          else if(submenu1 == 3) {
            
            //Construir EmpleadorFormal y subir perfil a Documentos
            EmpleadorFormal Jefe = new EmpleadorFormal(user);
            docs.AddEmpleadorFormal( Jefe );
            v.PerfilExito();
          }
          else if(submenu1 == 4){
            //Construir EmpleadorTemporal y subir perfil a Documentos
            EmpleadorTemporal EmpleadorTemporal = new EmpleadorTemporal(user);
            docs.AddEmpleadorTemporal(EmpleadorTemporal);
            v.PerfilExito();
          }
          else if(submenu1 == 5){
            v.MensajeRegresoMenuPrincipal();
            salirSub1 = true;
          
          }
          else{
            v.MensajeErrorMenu();
          }
      }
    }

      else if(opcion == 2){
        // Crear Trabajos temporales
        v.CrearTemp();
        String CategoriaTrabajo = v.ingresarCategoriaTrabajo();
        String DescripcionTrabajo = v.ingresarDescripcion();
        int Sueldo = v.ingresarSueldo();
        TrabajoTemp TrabajoTemp = new TrabajoTemp( user, CategoriaTrabajo, DescripcionTrabajo, Sueldo );
        docs.AddTrabajoTemp(TrabajoTemp);
      }
      else if(opcion == 3){
        boolean submenu3 = false;
        while(submenu3 == false){
          int buscarTrabajos = v.submenu2();
          if(buscarTrabajos == 1){
            //Trabajo Temporal
            v.enlistarCategoriasTrabajo(docs);
          }
          else if(buscarTrabajos == 2){
            //Salir al menú principal
            submenu3 = true;
          }
          else{
            v.MensajeErrorMenu();
          }
        }
        
      }
      else if(opcion == 4){
        boolean salirsub4 = false;
        while(salirsub4 == false){
          int opc4 = v.Consejos(); //  
          if(opc4 == 1){
            v.ConsejosCrisis();
          }
          else if(opc4 == 2){
            v.ConsejosRestruc();
          }
          else if(opc4 == 3){
            v.ConsejosAntiS();
          }
          else if(opc4 == 4){
            v.ConsejosAyuda();
          }
          else if(opc4 == 5){
            salirsub4 = true;
          }
          else{
            v.MensajeErrorMenu();
          }
        }
         
        
      }
      else if(opcion == 5){
        v.MensajeDespedida();
        salir = true;
      }
      else {
        v.MensajeErrorMenu(); //Error de dato fuera de rango.
      }
    }
  }
}