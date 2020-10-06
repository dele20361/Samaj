/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Driver program que desarrolla el simulador de 
Samaj-20
***************1**/

import java.util.Scanner;

public class Vista {
    
  // Propiedades
  Scanner scan = new Scanner(System.in);
  String opc;

  /**
  * Método para mostrar el menú para generar perfil y seleccionar una opción.
   * @param n/a
   * @return Número de opción del menú ingresado por el usuario.
   * @author Alejandro y Pao
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
    "3) Modificar perfil de tarabjador bajo contrato\n" +
    "4) Modificar perfil de trabajador temporal\n"+
    "5) Salir a menú principal\n"
    );
      
    while ( Valide == true ) {
      System.out.println ( "Ingrese el número de opción: " );
      opcS = scan.nextLine ();
      scan.nextLine ();
      opc = ValideNum( opcS );
      if ( opc != -1 ) {
          Valide = false;
      }
      else { }
    }
    
    return opc;
  }

  /**
   * Método para validar cualquier número ingresado.
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Paola de Leon
  */  
  public int ValideNum ( String Num ) {
    int newNum = -1;
    try {
       newNum = Integer.parseInt( Num );
    }
    catch ( NumberFormatException e )
    {
       System.out.println( "\nError! Ingrese un número válido por favor" );
    }
    
    return newNum;
  }

  /**
  * Método para mostrar mensaje que ha ocurrido un error.
  * @author Paola de Leon
  */
  public void ErrorMns ( ) {
    System.out.println ( "Error! Vuelva a intentarlo..." );
  }

  /**
  *Mensaje de Bienvenida a Programa
  * @author Marco Jurado
   */
   public void MensajeBienvenida(){
     System.out.println( "Bienvenido a Samaj-20 " +
     "\nEmpleo fácil, rápido y seguro");
   }

  /**
  Método para preguntar existencia de usuario en red de Samaj
   */
   public String PreguntarUsuario(){
     String ingreso = scan.nextLine();
     
   }

    // Métodos que se utilizan para crear un perfil de trabajadorFormal.
  
  /**
  *Mensaje de Bienvenida a Programa
  * @author Ale 
   */

   public String ingresarNombre(){
     System.out.println("Ingrese su nombre: ");
     String nombre = scan.nextLine();
     return nombre;
   }


   public String ingresarApellido(){
     System.out.println("Ingrese su apellido: ");
     String apellido = scan.nextLine();
     return apellido;
   }


   public int ingresarEdad(){
     System.out.println("Ingrese su edad: ");
     int iEdad = scan.nextInt();
     return iEdad;
   }


    public int ingresarEducacion(){
      System.out.println("Ingrese su nivel de educacion");
      System.out.println("1. Primaria \n 2. Secundaria \n 3. Universitaria \n 4. 4. Posgrado");
      int iEdu = scan.nextInt();
      return iEdu;
    }

    public boolean ingresarExperienciaLaboral(){
      System.out.println("Experiencia laboral (SI/NO): ");
      String opc = scan.nextLine();
      boolean expLab;
      if(opc.equals("SI") || opc.equals("Si") || opc.equals("si") || opc.equals("sI")){
        expLab = true;
      }else if(opc.equals("NO") || opc.equals("No") || opc.equals("no") || opc.equals("nO")){
        expLab = false;
      }
      return expLab;
    }

    public 
    

