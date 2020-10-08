/*****************
Proyecto Semestral
Autor: Alejandro Gomez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
***************1**/

import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;
//import java.awt.Desktop; //Manejo de URL
//import java.net.URI; //Manejo de URL

public class Vista {
    
  // Propiedades
  Scanner scan = new Scanner(System.in);
  //Desktop d = new Desktop.getDesktop();
  String opc;

  /**
   * Metodo para que el usuario indique si tiene o no una cuenta
   * @return
   */
  public int ExisteUsuario () {
    int opc = 0;
    String opcS;
    boolean Valide = true;
    while ( Valide == true ) {
      
      System.out.println("\n\nYa cuenta con un usuario?" +
      "\n1) Si" +
      "\n2) No" );
      System.out.println ( "Ingrese el numero de opcion: " );
      opcS = scan.nextLine ();
      opc = ValideNum( opcS );
      if ( opc != -1 ) {
        if(opc == 1){
          Valide = false;
        }
        else if(opc == 2){
          Valide = false;
        }  
        else { 
          System.out.println("Por favor ingrese una opción valida. \nIntente Nuevamente");
        }
      }
    }
    
    return opc;
  }
    /**Metodo para mostrar el menu general
    * @param n/a
    * @return numero de opciones
    * @author Alejandra Guzman
    */

    public int MenuGeneral(){
      String opcS;
      int opc = 0;
      boolean Valide = true;
      System.out.println(
        "Menu:"+
        "\n\n1) Crear perfil\n" +
        "2) Crear trabajos temporales\n"+
        "3) Buscar trabajos temporales\n"+
        "4) Consejos\n"+
        "5) Salir\n"
      );
      while(Valide == true){
        System.out.println("Ingrese numero de opcion: ");
        opcS = scan.nextLine();
        opc = ValideNum( opcS );
        if( opc != -1 ){
          Valide = false;
 
        }
        else{}
      }
      return opc;

    }


  /**
  * Método para mostrar el menu para generar perfil y seleccionar una opción.
   * @param n/a
   * @return Numero de opción del menu ingresado por el usuario.
   * @author Alejandro y Paola
  */
  public int SubMenu () {
    int opc = 1;
    String opcS;
    boolean Valide = true;

    System.out.println( 
    "Opciones:"+
    "\n\nCrear perfil\n" +
    "1) Crear perfil para trabajo bajo contrato\n" +
    "2) Crear perfil para un trabajo temporal\n" +
    "3) Crear perfil para un empleador empresarial\n" +
    "4) Crear perfil para un empleador sin contrato\n"+
    "5) Salir a menu principal\n"
    );
      
    while ( Valide == true ) {
      System.out.println ( "Ingrese el numero de opcion: " );
      opcS = scan.nextLine ();
      opc = ValideNum( opcS );
      if ( opc != -1 ) {
          Valide = false;
      }
      else { }
    }
    
    return opc;
  } 
  //

  /**
   * Método para indicar que no hay trabajos publicados aún.
   * @author Paola de Leon
  **/
  public void NullTrabajosTemp() {
    System.out.println("Aun no hay trabajos temporales publicados...\n");
  }

  
  /**
   * Método para validar cualquier número ingresado.
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Paola de Leon
  **/  
  public int ValideNum ( String Num ) {
    int newNum = -1;
    try {
       newNum = Integer.parseInt(Num);
    }
    catch ( NumberFormatException e )
    {
       System.out.println( "\nError! Ingrese un número valido por favor" );
    }
    
    return newNum;
  }

  /**
  * Metodo para mostrar mensaje que ha ocurrido un error.
  * @author Paola de Leon
  */
  public void ErrorMns ( ) {
    System.out.println ( "Error! Vuelva a intentarlo..." );
  }

  /**
  *Mensaje de Bienvenida a Programa
  * @author Alejandro Gomez
   */
   public void MensajeBienvenida(){
     System.out.println( "\n \n \nBienvenido a Samaj-20 " +
     "\nEmpleo facil, rapido y seguro");
   }

   //**Metodo para ingresar al 
   //sub menu del prototipo */
   //@author Alejandra Guzman

   public int submenu2(){
     int opc = 2;
     String opcS = "";
     boolean valide = true; 

     System.out.println(
       "Opciones:"+
       "\n\nBuscar Trabajo\n \n"+
       "1) Buscar trabajos temporales\n"+
       "2) Salir al menú principal\n"
     );
     while ( valide == true ) {
      System.out.println ( "Ingrese el numero de opcion: " );
      opcS = scan.nextLine ();
      opc = ValideNum( opcS );
      if ( opc != -1 ) {
          valide = false;
      }
      else { }
    }
    
    return opc;
  } 


/** Metodo para ingresar
 * al submenu 3
 * @author Alejandra Guzman
 */
    public int submenu3 (){
      int opc = 3;
      String opcS = "";
      boolean Valide = true;

      System.out.println(
        "Opciones:\n"+
        "1) Publicar trabajo bajo contrato.\n"+
        "2) Publicar trabajo temporal.\n"

      );
      while ( Valide == true ) {
        System.out.println ( "Ingrese el numero de opcion: " );
        opcS = scan.nextLine ();
        opc = ValideNum( opcS );
        if ( opc != -1 ) {
            Valide = false;
        }
        else { }
      }
      
      return opc;
    } 
  /** Metodo para ingresar submenu 4
   * el cual accede a Manejo de crisis
   * @author Alejandra Guzman 
   */
  public int submenu4(){
    int opc = 4;
    String opcS = "";
    boolean Valide = true;

    System.out.println(
      "Opciones:\n"+
      "1) Manejo de crisis\n"+
      "2) Restructuracion de negocios\n"+
      "3) Linea anti suicidio\n"+
      "4) Salir al menú general"
    );
    while ( Valide == true ) {
      System.out.println ( "Ingrese el numero de opcion: " );
      opcS = scan.nextLine ();
      opc = ValideNum( opcS );
      if ( opc != -1 ) {
          Valide = false;
      }
      else { }
    }
    
    return opc;
  } 

  
   /** Metodo para preguntar el directorio
    * en el cual se almacenara el
    archivo csv de Samaj 2020 
    @author Alejandro Gomez */
    
    public String DirectorioCSV(){
      System.out.println("Ingrese su directorio completo para almacenar la base de datos");
      String csvPath = scan.nextLine();
      return csvPath;
    }


  
/* ------------------------------------------ S U B M E N U # 1 ------------------------------------------

*   Funcion:
*     Crear un nuevo Perfil para TrabajadorFormal
*     Metodos a utilizar descritos a continuacion. 
      Autores: Alejandro Gomez y Andres Osorio  */
  

  /**
   * Metodo para obtener el nombre y su respectivo mensaje al usuario.
   * @param N/A.
   * @return String.
   * @author Andrés y Alejandro
  */  
  
   public String ingresarNombre(){
     System.out.println("Ingrese su nombre: ");
     String nombre = scan.nextLine();
     return nombre;
   }

  /**
   * Metodo para obtener el apellido y su respectivo mensaje al usuario.
   * @param N/A.
   * @return String.
   * @author Andrésy Alejandro
  */   

   public String ingresarApellido(){
     System.out.println("Ingrese su apellido: ");
     String apellido = scan.nextLine();
     return apellido;
   }

  /**
   * Metodo para obtener la edad y su respectivo mensaje al usuario.
   * @param N/A.
   * @return int.
   * @author Andrés
  */  

   public int ingresarEdad(){
     int valor = 0 ;
     boolean continuar = false;
     while(continuar==false){
       System.out.println("Ingrese su edad: ");
       opc = scan.nextLine();
       int edad = ValideNum(opc);
       if(edad != -1){
         valor = edad;
         continuar = true;
       }else{
         // No hace falta agregar un mensaje de invalidacion, puesto que el metodo ValideNum ya lo tiene.
          continuar = false;
       }
     }

     return valor;
   }

  /**
   * Metodo para obtener el correo y su respectivo mensaje al usuario.
   * @param N/A.
   * @return int.
   * @author Andrés
  */  

   public String ingresarCorreo(){
     String valor = " ";
     boolean continuar = false;
     while(continuar==false){
       System.out.println("Ingrese su correo electronico: ");
       opc = scan.nextLine();
       if(opc.contains("@")){
         valor = opc;
         continuar = true;
       }else{
         MensajeErrorCorreo();
         continuar = false;
       }
     }

     return valor;
   }

  /**
   * Metodo para obtener la educacion y su respectivo mensaje al usuario.
   * @param N/A.
   * @return int.
   * @author Andrés y Alejandro
  */  

    public int ingresarEducacion(){
      int valor = 0;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("\nIngrese su nivel de educacion");
        System.out.println("1. Primaria \n2. Secundaria \n3. Universitaria \n4. Posgrado");
        opc = scan.nextLine();
        int opcion = ValideNum(opc);
        if(opcion==1 || opcion==2 || opcion==3 || opcion==4){
          valor = opcion;
          continuar = true;
        } else{
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }
      return valor;
    }


 /**
   * Método para obtener la experiencia laboral y su respectivo mensaje al usuario.
   * @param N/A.
   * @return boolean.
   * @author Andrés y Alejandro
  */ 
    public boolean ingresarExperienciaLaboral(){
      boolean expLab = false;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("Experiencia laboral (SI/NO): ");
        opc = scan.nextLine();
        opc = opc.toLowerCase();
        if(opc.equals("si")){
          expLab = true;
          continuar = true;
        }else if(opc.equals("no")){
          expLab = false;
          continuar = true;
        }else{
          ErrorMns();
          continuar = false;
        }
      }
      return expLab;
    }

  /**
   * Método para obtener el idioma y respectivo mensaje al usuario.
   * @param N/A.
   * @return int.
   * @author Andrés
  */ 

    public int ingresarIdioma(){
      int valor = 0;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("Ingrese el idioma (1) de su dominio que desea mostrar en su perfil.");
        System.out.println("1.Español \n2.Ingles \n3.Aleman \n4.Frances \n5.Mandarin\n6.Portugues\n7. Otros");
        opc = scan.nextLine();
        int opcion = ValideNum(opc);
        if(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6 || opcion ==7){
          valor = opcion;
          continuar = true;
        }else{ 
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }

      return valor;
    }

  /**
   * Método para obtener el transporte y su respectivo mensaje al usuario.
   * @param N/A.
   * @return boolean.
   * @author Andrés
  */ 

    public boolean ingresarTransporte(){
      boolean valor = false;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("Transporte (SI/NO)");
        opc = scan.nextLine();
        opc = opc.toLowerCase();
        if(opc.equals("si")){
          valor = true;
          continuar = true;
        }else if(opc.equals("no")){
          valor = false;
          continuar = true;
        }else{
          ErrorMns();
          continuar = false;
        }
      }
      return valor;
    }

     /**
   * Método para obtener el telefono y su respectivo mensaje.
   * @param N/A.
   * @return int.
   * @author Andrés y Alejandro
  */ 

    public int ingresarTelefono(){
      int valor = 0;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("Ingrese su numero de telefono: ");
        String opc = scan.nextLine();
        int tel = ValideNum(opc);
        if(tel != -1){
          valor = tel;
          continuar = true;
        } else {
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }

      return valor;
    }

  /**
   * Método para obtener el telefono y su respectivo mensaje.
   * @param N/A.
   * @return int.
   * @author Andrés con modificaciones de Alejandro Gomez
  */ 

 /* public int ingresarTelefonoModificado(){
    int valor = 0;
    boolean continuar = false;
    while(continuar==false){
      System.out.println("Ingrese su numero de telefono: ");
      String opc = scan.nextLine();
      String numLongitud = Integer.toString(opc);
      if (numLongitud == 8){
        int tel = ValideNum(opc);
        if(tel != -1){
          valor = tel;
          continuar = true;
        }else{
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }
      if (numLongitud > 8 || numLongitud < 8 ){ 
      scan.nextLine();
      int tel = ValideNum(opc);
      }

    return valor;
    }
  }
*/

  // /**
  //  * Método para obtener el telefono y su respectivo mensaje.
  //  * @param N/A.
  //  * @return int.
  //  * @author Andrés con modificaciones de Alejandro Gomez
  // */ 
  // public int ingresarTelefono() {
  //   int opc = 0;
  //   String opcS;
  //   boolean Valide = true;
  //   while ( Valide == true ) {
  //     System.out.println ( "Ingrese su número telefónico: " );
  //     opcS = scan.nextLine ();
  //     if ( opcS.length() == 8 ) {

  //     }
  //     else {
  //       V
  //     }
  //     opc = ValideNum( opcS );
  //     if ( opc != -1 ) {
  //       Valide = false;
  //     }
  //   }
    
  //   return opc;
  // }


   /**
   * Método para obtener la experiencia de HomeOffice y mostrar su respectivo mensaje.
   * @param N/A.
   * @return boolean.
   * @author Andrés
  */ 
  public boolean ingresarHomeOffice(){
    boolean valor = false ;
    boolean continuar = false;
    while(continuar==false){
      System.out.println("Cuenta con herramientas de Homeoffice? (SI/NO): ");
      opc = scan.nextLine();
      opc = opc.toLowerCase();
      if(opc.equals("si")){
        valor = true;
        continuar = true;
      } else if(opc.equals("no")){
        valor = false;
        continuar = true;
      } else{
        ErrorMns();
        continuar = false;
      }
    }

    return valor;
  }

  /**
   * Método para obtener el conocimiento y mostrar su respectivo mensaje.
   * @param N/A.
   * @return boolean.
   * @author Andrés
  */ 

    public String ingresarConocimiento(){
      String valor = "";
      System.out.println("Ingrese el area de cocimiento de interes a laborar ");
      System.out.println("(Ejemplos: Jardineria, educacion, construccion, carpinteria) :");
      opc = scan.nextLine();
      valor = opc;

      return valor;
    }

    /**
   * Método para obtener la categoria del trabajo y mostrar su respectivo mensaje.
   * @param N/A.
   * @return String Categoria del trabajo.
   * @author Andrés
  */ 

  public String ingresarCategoriaTrabajo(){
    System.out.println( "- Categoria (Ingrese solamente una palabra clave) : " );
    String valor = "";
    opc = scan.nextLine();
    valor = opc;

    return valor;
  }


  /**
   * Método para imprimir todas las categorias de trabajo.
   * @param N/A.
   * @return N/A.
   * @author Andrés
  */ 

    public void enlistarCategoriasTrabajo(Documentos docs){
      int cont = 0;
      ArrayList<String> palabrasClave = new ArrayList<String>();

        System.out.println("BUSCAR TRABAJO");
        System.out.println("A continuacion se le presentaran la informacion de los trabajos: ");
        ArrayList<TrabajoTemp> TrabajosTemporales = docs.getTrabajoTemp();
        if (TrabajosTemporales.size() == 0 ) {
          NullTrabajosTemp();
        }
        else {
          for (int i = 0 ; i<TrabajosTemporales.size()  ; i++){   //por que :_(  )
            //for (int h = 0 ; h<(BaseET.get(i)).getTrabajoTemporal().size() ; h++){
              TrabajoTemp Tempo = TrabajosTemporales.get(i);
              System.out.println(Tempo.toString());
              System.out.println("\n");
              // cont = cont + 1;
              // System.out.println(Integer.toString(cont)+". "+((Documentos.getET()).get(i)).getTrabajoTemporal().get(h).getCategoriaTrabajo());
              // palabrasClave.add((BaseET.get(i)).getTrabajoTemporal().get(h).getCategoriaTrabajo());
            //}
          }
        //ingresarOpcionTrabajo(palabrasClave);
        }
    }
    

  /**
   * Método para ingresar la opción del listado de las categorias de trabajo.
   * @param N/A.
   * @return boolean.
   * @author Andres y Alejandro
  */ 
    private void ingresarOpcionTrabajo(ArrayList<String> categoriasTrabajo) {
      int valor = 0;
      boolean continuar = false;
      while(continuar==false) {
        opc = scan.nextLine();
        scan.nextLine();
        int opcion = ValideNum(opc);
        if (opcion != -1 && (categoriasTrabajo.size() < opcion || opcion > 0) ) {
          valor = opcion;
          continuar = true;
        } else{
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }

      enlistarTrabajos(valor, categoriasTrabajo);
    }

  /**
   * Método para enlistar los trabajos en los que el usuario estaba interesado.
   * @param opcion(valor) y enlistar.
   * @return boolean.
   * @author Andrés
  */ 
    private void enlistarTrabajos(int valor, ArrayList<String> categoriasTrabajo){
      String palabraClaveSeleccionada =  categoriasTrabajo.get(valor);
      System.out.println("Los trabajos de su interes son los siguientes: ");
        for(int i = 0 ; i<(Documentos.getET()).size() ; i++){
          for(int h = 0 ; h<((Documentos.getET()).get(i)).getTrabajoTemporal().size() ; h++){
            if(((Documentos.getET()).get(i)).getTrabajoTemporal().get(h).getCategoriaTrabajo().equals(palabraClaveSeleccionada)){
              System.out.println("- "+((Documentos.getET()).get(i)).getTrabajoTemporal().get(h).getCategoriaTrabajo().toString());
            }
          }
        }
    }

/* ------------------------------------------ C R E A R   U S U A R I O  ------------------------------------------

*  Funcion:
*    Crear un nuevo Usuario.
*    Metodos a utilizar descritos a continuacion. 
*  Autores: Marco Jurado  */

  /**
   * Método para preguntar a usuario si tiene un perfil creado anteriormente en Samaj 2020.
   * @param n/a.
   * @return int.
   * @author Marco 
  */

    public int MensajeTieneUsuario(){
      System.out.println("¿Posee codigo ID en Samaj 2020? \nIngrese Si / No según su respuesta.");
      int devolucion = 0;
      String ingreso = "";
      boolean correct = false;
      while(correct == false){
        ingreso = scan.nextLine();
        ingreso = ingreso.toLowerCase();
        if(ingreso == "si" || ingreso =="sí" ){
          devolucion = 1;
          correct = true;
        }else if(ingreso == "no"){
          devolucion = -1;
          correct = true;
        }else{
          System.out.println("Por favor ingrese unicamente si o no. Por favor intente nuevamente.");
        }
      }
      return devolucion;
    }

  
  /**
   * Método para ingresar el código del usuario.
   * @param docs. Esta es la instancia de Documentos en controlador.
   * @return int.
   * @author Marco 
  */
  public int IngresoCodigo(Documentos docs){
    int numeritoCOD = 0;
    String num = "";
    boolean Valide = false;
    while ( Valide == false ) {
      boolean Existe = false;
        System.out.println ( "Ingrese el codigo que desea para ingresar a su perfil: " );
        num = scan.nextLine();
        numeritoCOD = ValideNum( num );
        if ( numeritoCOD != -1 ) {
          boolean ExisteCod = docs.verificarCodigo(numeritoCOD);//Método para verificar que sea único.
          if (ExisteCod == false){
            Existe = true;
          }
        }
        else{
        System.out.println("erigei Tu CODIGO  no existe");
        numeritoCOD = -1;
        }
      
      Valide = true;
    }

    return numeritoCOD;
  }
  public void MensajeErrorMenu(){
    System.out.println("Ha ingresado un numero invalido. Porfavor intente nuevamente");
  }
  public void MensajeDespedida(){
    System.out.println("Usted ha salido del programa. \nCreditos: Alejandro Gomez, Alejandra Guzman, Paola de León Molina, Marco Jurado,Andres Osorio. ");
    System.out.println("¡Esperamos que vuelva pronto!");
  }
  public void MensajeRegresoMenuPrincipal(){
    System.out.println("Regresando a menu principal... \n \n \n \n");
  }
   

//--------------------------P U B L I C A R   T R A B A J O   T E M P O R A L --------------------

    public void encabezadoPublicarTrabajo(){
      System.out.println( "PUBLICAR TRABAJO TEMPORAL");
      System.out.println( "Ingrese los siguientes datos: " );
    }
 

    public String ingresarDescripcion(){
      System.out.println("Ingrese descripcion: ");
      opc = scan.nextLine();
      return opc;
    }

    public int ingresarSueldo(){
      int valor = 0 ;
      boolean continuar = false;
      while(continuar==false){
        System.out.println("Ingrese sueldo: ");
        opc = scan.nextLine();
        int sueldo = ValideNum(opc);
        if(sueldo != -1){
          valor = sueldo;
          continuar = true;
        }else{
          // No hace falta agregar un mensaje de invalidación, puesto que el método ValideNum ya lo tiene.
          continuar = false;
        }
      }

      return valor;
    }

//------------------------- Opcion de Consejos ------------------------------------------
/**
 * Método que muestra opciones de consejos 
 * y abre paginas web.
 * @param N/A
 * @return N/A
 * @author Alejandro Gómez
*/
  public int Consejos(){
    boolean Validar = true;
    System.out.println("Consejos:");
    System.out.println(" 1. Manejo de crisis \n 2. Reestructuracion de negocios \n 3. Linea antisuicidio \n 4. Contacto de ayuda \n 5. Regresar a menu \n Ingrese el numero de opcion: ");
    String cons = scan.nextLine();
    int opcConsejos = ValideNum(cons);
    if (opcConsejos != -1) {
      Validar = false;
    }
    else{ }
    
    return opcConsejos;
  }
/* @author Alejandro Gomez */
  public void ConsejosCrisis(){ 
      //Opcion 1: Manejo de Crisis
      System.out.println("\n1. Manejo de Crisis");
      System.out.println("Los siguientes links le serán de mucha ayuda:");
      System.out.println("https://www.elempleo.com/co/noticias/consejos-profesionales/claves-para-el-manejo-de-crisis-en-las-organizaciones-5608");
      System.out.println("https://emprendedoresynegocios.com/manejo-de-crisis-empresarial/");
    }
/* @author Alejandro Gomez */
 public void ConsejosRestruc(){ 
      //Opcion 2: Reestructuracion de negocios
      System.out.println("\n2. Reestructuracion de negocios");
      System.out.println("Los siguientes links le serán de mucha ayuda:");
      System.out.println("https://www.emprendepyme.net/como-reestructurar-una-empresa-de-forma-exitosa.html");
      System.out.println("https://www.emprendepyme.net/reestructuracion-empresarial");
    }
/* @author Alejandro Gomez */
  public void ConsejosAntiS(){ 
      //Opcion 3: Linea antisuicidio
      System.out.println("\n3. Linea antisuicidio");
      System.out.println("En caso necesite ayuda, recuerde que siempre hay alguien dispuesto a escucharlo");
      System.out.println("Linea de apoyo para Guatemala: 2232-6269 o 2238-3739");
      System.out.println("Direccion de linea de apoyo:  12 calle A 0-27, zona 1");
    }
/* @author Alejandro Gomez */
  public void ConsejosAyuda(){ 
      //Opcion 4: Contacto de ayuda
      System.out.println("\n4. Contacto de ayuda");
      System.out.println("Hemos habilitado una pagina para que pueda acudir en caso tenga cualquier duda");
      System.out.println("https://www.facebook.com/Samaj-2020-107001737815812");
    }

    public void MensajeErrorCorreo(){
      System.out.println("Error! Por favor asegurese de ingresar un correo valido. \nUtilice el carácter -@-.\n \nIntente Nuevamente...\n");
    }

    public void CrearTemp(){
      System.out.println("Crear trabajo temporal:\n");
    }
    public void CrearCon(){
      System.out.println("Crear trabajo bajo contrato:\n");
    }
    
  public void PerfilExito(){
    System.out.println("\nChilerisimo. Ha creado un perfil con exito\n");
  }
    public void IngresoInfo(){
      System.out.println("\n\nIngrese los datos que se le solicitan");
    }

  public void MensajeTrabajadorFormalExito(){
    System.out.println("\n \nSu perfil se ha añadido a la base de datos. \n¡Esperamos lo contacten pronto!\n \n");
  }
    
  }

