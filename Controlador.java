/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Controlador del programa
Samaj-20
*****************/

public class Controlador {
  public static void main(String[] args) {

    //Propiedades
    int opc;
    int CodigoUsuario;

    int TrabajadorFormalEdad;
    int TrabajadorFormalEducacion;
    boolean TrabajdorFormalExpLaboral;
    int TrabajadorFormalIdioma;
    boolean TrabajadorFormalTransporte;

    String TrabajadorInformalArea;
  
    //Instanciar
    Documentos docs = new Documentos();
    Vista v = new Vista();
    usuarioSamaj user = null;
    boolean salir = false;

    v.MensajeBienvenida();
    
    // C R E A R   U S U A R I O  
    // Proceso de verificar existencia de perfil y/o creación de perfil

    int varTemporal = v.MensajeTieneUsuario(); //Preguntar si tiene o no perfil.
    if(varTemporal == 1){
      //El usuario dice que tiene perfil
      CodigoUsuario = v.IngresoCodigo();
      /*
      Se buscará el CodigoUsuario en el CSV
      para verificar que el código del 
      usuario en realidad existe.        */

    } else if(varTemporal == -1){
      /* Se ejecuta en caso el usuario
        no posea un perfil creado en
        Samaj-2020          */ 
      String NombreUsuario = v.ingresarNombre();
      String ApellidoUsuario = v.ingresarApellido();
      String CorreoUsuario = v.ingresarCorreo();
      int TelefonoUsuario = v.ingresarTelefono();
      int CodigoUsuario = v.IngresoCodigo(); 
      user = new usuarioSamaj(NombreUsuario, ApellidoUsuario, CorreoUsuario, TelefonoUsuario, CodigoUsuario );
      
    }
    
    // C O M I E N Z A   M E N Ú   G E N E R A L
    while( salir == false){
      int opcion = v.MenuGeneral(); //Método de Menú de vista
      if(opcion == 1){

        //Sub Menú 
        boolean salirSub1 = false;
        submenu1 = v.SubMenu();
        while(salirSub1 == false) {
          if(submenu1 == 1){
            /* Ingresar los datos para crear el perfil donde se obtienen los
               datos adicionales para crear el Trabajador Formal. */

            TrabajadorFormalEdad = v.ingresarEdad();
            TrabajadorFormalEducacion = v.ingresarEdicacion();
            TrabajdorFormalExpLaboral = v.ingresarExperienciaLaboral(); 
            TrabajadorFormalIdioma = v.ingresarIdioma();
            TrabajadorFormalTransporte = v.ingresarTransporte();
            TrabajadorFormalHomeOffice = v.ingresarHomeOffice();

            //Construir TrabajadorFormal y subir perfil a Documentos
            TrabajadorFormal entacuchado = new TrabajadorFormal(user, TrabajadorFormalEdad, TrabajadorFormalEducacion, TrabajadorFormalIdioma, TrabajdorFormalExpLaboral, TrabajadorFormalTransporte, TrabajadorFormalHomeOffice );
            docs.AddTrabajadorFormal( entacuchado );
          }
          else if(submenu1 == 2){
            /* Ingresar los datos para crear el perfil donde se obtienen los
               datos adicionales para crear el Trabajador Informal. */

            TrabajadorInformalArea = v.ingresarArea();

            //Construir TrabajadorInformal y subir perfil a Documentos
            TrabajadorInformal don = new TrabajadorInformal(user, TrabajadorInformalArea);
            docs.AddTrabajadorInformal( entacuchado );
          }
          else if(submenu1 == 3){
            //Construir EmpleadorFormal y subir perfil a Documentos
            EmpleadorFormal Jefe = new EmpleadorFormal(user);
            docs.AddEmpleadorFormal( Jefe );
          }
          else if(submenu1 == 4){
            //Construir EmpleadorTemporal y subir perfil a Documentos
            EmpleadorTemporal EmpleadorTemporal = new EmpleadorTemporal(user);
            docs.AddEmpleadorTemporal(EmpleadorTemporal);
          }
          else if(submenu1 == 5){
            // Modificar perfil de un trabajador sin contrato
          }
          else if(submenu1 == 6){
            //Modificar perfil de un trabajador bajo contrato
          }
          else if(submenu1 == 7){
            v.MensajeRegresoMenuPrincipal();
            salirSub1 = true;
          }
          else{
            v.MensjeErrorMenu();
          }
        }

      }
      else if(opcion == 2){
        v.enlistarCategoriasTrabajo();
      }
      else if(opcion == 3) { 
        v.encabezadoPublicarTrabajo();
        String CategoriaTrabajo = v.ingresarCategoriaTrabajo();
        String DescripcionTrabajo = v.ingresarCategoriaTrabajo();
        int Suelo = v.ingresarSueldo();
        TrabajoTemp TrabajoTemp = new TrabajoTemp( user, CategoriaTrabajo, DescripcionTrabajo, Sueldo );
        user.addTrabajoTemp(TrabajoTemp);
      }
      else if(opcion == 4){}
      else if(opcion == 5){
        v.MensajeDespedida();
        salir = true;
      }
      else{
        v.MensajeErrorMenu(); //Error de dato fuera de rango.
      }
    }
    


  }
  
}