/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase que trabaja con el perfil del trabajador informal
Samaj-20
*****************/

public class TrabajadorInformal extends usuarioSamaj {

  //Variables de instancia
  private String AreaConocimiento;
  
  //Constructor
  public TrabajadorInformal ( usuarioSamaj user, String Area ) {
    super( user.getNombre(), user.getApellido(), user.getCorreo(), user.getTelefono(), user.getCodigo() );
    this.AreaConocimiento = Area;
  }

  // Getters
  public String getAreaConocimiento () { return AreaConocimiento; }

  // Setters
  public String setAreaConocimiento ( String a ) { AreaConocimiento =  a; return AreaConocimiento; }

  /**
   * Método para mostrar la infromación de un trabajador informal.
   * @param a Trabajador informal del cuál se mostrará la información.
   * @return String Con la info del trabajador.
   * @author 
  */
  public String toString( TrabajadorInformal a ) {
    String result = "";
    result = "\n Codigo ID:" + a.getCodigoID() + "\n Nombre: " + a.getNombre() + "\n Apellido: " + a.getApellido() + "\n Areadeconocimiento" + a.getAreaConocimiento() + "\n Telefono:" + a.getTelefono();
    
    return result;
  }

  /**
   * Método para agregar un perfil de trabajador informal al ArrayList general.
   * @param TI Trabajador informal por agregar.
   * @return void
   * @author 
   */
  public void SubirPerfil ( TrabajadorInformal TI ) {
  //Tipo Función
    Documentos.AddTrabajadorInformal(TI);
  } 


}