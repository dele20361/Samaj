

/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
*****************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.lang.Integer;
import java.util.ArrayList;
import java.awt.Desktop; //Manejo de URL
import java.net.URI; //Manejo de URL


//Main driver para el proyecto Semaj-2020
public class Main {
  public static void main(String[] args) {
    
    //Instancias
    Random rand = new Random();
    Vista vista = new Vista();
    Documentos docs = new Documentos();
    TrabajoTemp ttemp = new TrabajoTemp();
    Scanner scan = new Scanner(System.in);

    //Atributos
    int opcion = 0; 
    int subop = 0; 
    int o_user;
    int cons = 0;
    int menu;
    int submenu1;
    boolean salir = false;

    //Info de submenú crear TrabajadorFormal
    String TrabajadorFN;
    String TrabajadorFA;
    int TrabajadorFI;
    String CorreoFC;
    int idiom;
    String ingreso;
    boolean TrabajadorFT;
    boolean TrabajadorHO;
    boolean TrabajadorFL;
    String ingresoHO;
    int TrabajadorFE;
    int TrabajadorINT;
    
    String TrabajadorIN;
    String TrabajadorIA;
    String TrabajadorIC;
    int TrabajadorINT2;
    
  
    //Bienvenida al programa
    vista.MensajeBienvenida();

    //Preguntar Existencia de perfil
    

    //inicializar ciclo para menú
    while ( salir == false ) {
      if ( menu == 1 ) {
        //Sub menú crear perfil
        boolean salirSub1 = false;
        submenu1 = vista.SubMenu();
        while(salirSub1 == false) {
          if (submenu1 == 1){//Crear perfil TrabajadorFormal
            System.out.println( "----------Trabajo bajo contrato----------" );
            //Pedirle los datos para la creación de su perfil al usuario.
            //Nombre
             TrabajadorFN = vista.ingresarNombre();

            //Apellido
             TrabajadorFA = vista.ingresarApellido();

            //Edad
             TrabajadorFI = vista.ingresarEdad();

            //Correo
            CorreoFC = vista.ingresarCorreo();

            //Eduacion
            TrabajadorFE = vista.ingresarEducacion();

            //Experiencia Laboral
            TrabajadorFL = vista.ingresarExperienciaLaboral();

            //Idioma
            idiom = vista.ingresarIdioma();

            //Transporte
            TrabajadorFT = vista.ingresarTransporte();
            
            //Telefono
            TrabajadorINT = vista.ingresarTelefono();
           
            //Home Office
            TrabajadorHO = vista.ingresarHomeOffice();
          
            int cod = Documentos.generarCod(docs);
                      
            //Construir TrabajadorF y subir su perfil a la base de datos.
            TrabajadorFormal entacuchado = new TrabajadorFormal(TrabajadorFN, TrabajadorFA, TrabajadorFI, TrabajadorINT, CorreoFC, TrabajadorFE, idiom, TrabajadorFL, TrabajadorFT, TrabajadorHO, cod);
            }
            
            // Subiendo perfil...
            Documentos.AddTrabajadorFormal( entacuchado );

          }

          else if (submenu1 == 2) {
            //Crear perfil TrabajadorInformal
            //Se despliega la informacion a solicitar al usuario:

            //Nombre
            TrabajadorIN = vista.ingresarNombre();

            //Apellido
            Trabajador
         
       IA = vista.ingresarApellido();
            scan.nextLine();

            //Conocimiento
            TrabajadorIC = vista.ingresarConocimiento();
            scan.nextLine();

          //POSIBLE DISCREPANCIA detectada con TrabajadorINT2 (pendiente)
            TrabajadorINT2 = vista.ingresarTelefono();

            int cod = generarCod(docs);

            //Construir TrabajadorIF y subir perfil a base de datos.
            TrabajadorInformal don = new TrabajadorInformal (cod, TrabajadorIN, TrabajadorIA, TrabajadorIC, TrabajadorINT2);
            don.SubirPerfil(don); //Subiendo perfil...
          }
          else if (submenu1 == 3){
            System.out.println("");
          }
          else if (submenu1 == 4){
            System.out.println("");
          }
          //Salir al menú principal.
          else if (submenu1 == 5){
            System.out.println("");
            salirSub1 = true;
          }
          else {
            //En caso se ingrese un valor erroneo
            System.out.println("Opción invalida, por favor intente de nuevo.");
          }
        
         

      if (menu == 2 ) {r
        vista.enlistarCategoriasTrabajo();
      }

      else if (menu == 3){
        // Pedir código del empleador
        boolean existe = false;
        while ( existe == false ) {
          System.out.println("Ingrese su código: ");
          int codigo = scan.input;
          boolean verif;
          verif = docs.verificarEx( codigo );
          if ( verif == true ) {
            existe = true;
            // Pedir información al usuario sobre el trabajo temporal
            vista.encabezadoPublicarTrabajo();
            String Nombre = vista.ingresarNombre();
            int Contacto = vista.ingresarTelefono();
            String Categoria = vista.ingresarCategoriaTrabajo();
            String Descripcion = vista.ingresarDescripcion();
            int Sueldo = vista.ingresarSueldo();

            // Crear una objeto del trabajo temporal
            TrabajoTemp ttemp = new TrabajoTemp( Nombre, Contacto, Categoria, Descripcion, Sueldo );
            // Se agregará el trabajo en la proxima entrega
            // empleador.AddTrabajoTemp( ttemp,  );

            //Salir del while
            existe = true;
          }
          else {
            System.out.println("\nDebe crear un perfil antes...");
            
            System.out.println("Ingrese su nombre: ");
            String EmpleadorN = scan.nextLine();

            System.out.println("Ingrese su contacto: ");
            int EmpleadorNum = scan.nextInt();
            scan.nextLine();
            int EmpleadorCod = Documentos.generarCod(docs);

            Empleador Senito = new Empleador(EmpleadorN, EmpleadorNum, EmpleadorCod);
          }
        }
        
      }

      //Terminado
      else if (menu == 4){
        while (cons != 5){ 
          System.out.println("Consejos:");
          System.out.println("1. Manejo de crisis \n 2.Reestructuracion de negocios \n 3.Linea antisuicidio \n 4.Contacto de ayuda \n 5.Regresar a menu ");
          Desktop d = new Desktop.getDesktop();
          cons = scan.nextInt();
          scan.nextLine();
          if(cons ==1){
            //Opcion 1: Manejo de Crisis
            System.out.println("\n1. Manejo de Crisis");
            System.out.println("Los siguientes links le serán de mucha ayuda:");
            d.browse(new URI("https://www.elempleo.com/co/noticias/consejos-profesionales/claves-para-el-manejo-de-crisis-en-las-organizaciones-5608"));
            d.browse(new URI("https://emprendedoresynegocios.com/manejo-de-crisis-empresarial/"));
          }
          if(cons ==2){
            //Opcion 2: Reestructuracion de negocios
            System.out.println("\n2.Reestructuracion de negocios");
            System.out.println("Los siguientes links le serán de mucha ayuda:");
            d.browse(new URI("https://www.emprendepyme.net/como-reestructurar-una-empresa-de-forma-exitosa.html"));
            d.browse(new URI("https://www.emprendepyme.net/reestructuracion-empresarial"));
          }
          if(cons ==3) {
            //Opcion 3: Linea antisuicidio
            System.out.println("\n3.Linea antisuicidio");
            System.out.println("En caso necesite ayuda, recuerde que siempre hay alguien dispuesto a escucharlo");
            System.out.println("Linea de apoyo para Guatemala: 2232-6269 o 2238-3739");
            System.out.println("Direccion:  12 calle A 0-27, zona 1");
          }
          if(cons ==4){
            //Opcion 4: Contacto de ayuda
            System.out.println("\n4.Contacto de ayuda");
            System.out.println("Hemos habilitado una pagina para que pueda acudir en caso tenga cualquier duda");
            d.browse(new URI("https://www.facebook.com/Samaj-2020-107001737815812"));
          }
        }
      }
      else if ( menu == 5 ) {
        System.out.println( "Usted ha salido del programa." );
        System.out.println( "Creditos: Alejandro Gomez, Alejandra Guzman, Paola de León Molina, Marco Jurado,Andres Osorio. ");
        salir = true;
      }
    }
  }
}