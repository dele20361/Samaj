/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase que simulará un trabajo temporal en el proyecto semestral:
Samaj-20
*****************/

public class TrabajoTemp {

  //Propiedades
  private String Nombre; // Nombre del empleador que publicará el trabajo
  private int Telefono; // Contacto del empleador
  private String CategoriaTrabajo; // Palabra clave que representará el tipo de trabajo
  private String DescripcionTrabajo; // Breve descripción del trabajo
  private int Sueldo; // Pago que se ofrecerá por realizar el trabajo
  private static int CantTrabajosTemp = 0; // Variable que almacenará la cantidad de trabajos temporales realizados

  // Cosntructor general
  public TrabajoTemp ( ) { }

  // Constructor que creará objetos del Trabajo temporal
  public TrabajoTemp ( usuarioSamaj user, String CategoriaTrabajo, String DescripcionTrabajo, int Sueldo ) {
    this.Nombre = user.getNombre();
    this.Telefono = user.getTelefono();
    this.CategoriaTrabajo = CategoriaTrabajo;
    this.DescripcionTrabajo = DescripcionTrabajo;
    this.Sueldo = Sueldo;
    CantTrabajosTemp+=1; //Se sumará 1 a la cantidad de trabajos temporales realizados.
  }

  // Getters
  public String getNombre () { return Nombre; }
  public String getCategoriaTrabajo () { return CategoriaTrabajo; }
  public String getDescripcionTrabajo () { return DescripcionTrabajo; }
  public int getTelefono () { return Telefono; }
  public int getSueldo () { return Sueldo; }
  public int getCantTrabajosTemp () { return CantTrabajosTemp; }
  
  // Setters
  public String setNombre ( String a ) { Nombre = a; return Nombre; }
  public String setCategoriaTrabajo ( String a ) { CategoriaTrabajo = a; return CategoriaTrabajo; }
  public String setDescripcionTrabajo ( String a ) { DescripcionTrabajo = a; return DescripcionTrabajo; }
  public int setTelefono ( int a ) { Telefono = a; return Telefono; }
  public int setSueldo ( int a ) { Sueldo = a; return Sueldo; }
  public int setCantTrabajosTemp ( int a ) { CantTrabajosTemp = a; return CantTrabajosTemp; }
  
  /**
   * Método para modificar un elemento del trabajado temporal de tipo int.
   * @param temp el trabajo temporal que se quiere cambiar.
   * @param opc el número de opción que se cambiará.
   * @param CambioN el cambio a realizar.
   * @return boolean Indicará si se realizó el cambio o no.
   * @author Paola De León
   */
  public boolean ModificarTrabajo( TrabajoTemp temp, int opc, int CambioN ) {
    boolean Exito = false;
    // Si la opción que eligió el usuario es 1: Se cambiará el contacto del trabajo.
    if ( opc == 1 ) {
        temp.setTelefono( CambioN );
        Exito = true;
    }
    // Si la opción que eligió el usuario es 2: Se cambiará el salario del trabajo.
    if ( opc == 2 ) {
        temp.setSueldo( CambioN );
        Exito = true;
    }
    // Si la opción que eligió el usuario es > 2: El booleano permanecerá false.
    else {}
    return Exito;
  }

  
  /**
   * Sobrecarga de método para modificar un elemento del trabajo temporal de tipo String.
   * @param temp Trabajo temporal a modificar.
   * @param opc Número de opción elegida.
   * @param CambioN String del cambio a realizar.
   * @return boolean Que indicará si se realizó el cambio.
   * @author Paola De León
   */
  public boolean ModificarTrabajo( TrabajoTemp temp, int opc, String CambioN ) {
    boolean Exito = false;
    // Si la opción que eligió el usuario es 1: Se cambiará el nombre del empleador que publicará el trabajo.
    if ( opc == 1 ) {
        temp.setNombre( CambioN );
        Exito = true;
    }
    // Si la opción que eligió el usuario es 2: Se cambiará la categoría del trabajo.
    if ( opc == 2 ) {
        temp.setCategoriaTrabajo( CambioN );
        Exito = true;
    }
    // Si la opción que eligió el usuario es 3: Se cambiará la descripción del trabajo.
    if ( opc == 3 ) {
        temp.setDescripcionTrabajo( CambioN );
        Exito = true;
    }
    // Si la opción que eligió el usuario es > 3: El booleano permanecerá false.
    else {}
    return Exito;
  }
  
  /**
   * Método para obtener la información de un trabajo temporal
   * @param a Trabajo temporal del cuál se quiere saber la info.
   * @return String De la info.
   * @author
   */
  public String toString( ) {
    String mensaje = "";
    mensaje += "- Nombre del empleador: " + this.Nombre + "\n";
    mensaje += "- Telefono del empleador: " + this.Telefono+ "\n";
    mensaje += "- Categoría del trabajo temporal: " + this.CategoriaTrabajo+ "\n";
    mensaje += "- Descripción del trabajo temporal: " + this.DescripcionTrabajo+ "\n";
    mensaje += "- Sueldo del trabajo temporal: " + this.Sueldo+ "\n";
    mensaje += "- Cantidad de trabajos temporales total: " + this.CantTrabajosTemp+ "\n";
    
    return mensaje;
  }

  /**
   * Método para mostrar la cantidad de trabajos temporales realizados
   * @param a Trabajo temporal realizados en total.
   * @return String De la info.
   * @author 
   */
  public String CantTrabajosTemptoString ( TrabajoTemp a ) {
    String mensaje = "";
    mensaje += "La cantidad total de trabajos temporales es: " + CantTrabajosTemp;

    return mensaje;
  }

}