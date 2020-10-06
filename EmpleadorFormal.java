/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase derivada de UsuarioSamaj.
Samaj-20
*****************/

public class EmpleadorFormal extends usuarioSamaj {
  
    // Constructor
    /**
     * Constructor de clase EmpleadorFormal.
     * @param user Usario existente de Empleador
     * @author
     */
    public Empleador( usuarioSamaj user) {
        super( user.getNombre(), user.getApellido(), user.getCorreo(), user.getTelefono(), user.getCodigo(), user.getContacto(), );
    }

    /**
     * Método para mostrar la información de un empleador.
     * @return String En el que se mostrará la información.
     * @author
     */
    public String toString( EstudianteFormal a ) {
      Boolean IsFormal = a.getFormal ();
      String mensaje = "";
      mensaje +=  "Informacion del empleador formal: ";
      mensaje += "- Nombre: " + a.getNombre ();
      mensaje += "- Codigo: " + a.getCodigo ();
      mensaje += "- Contacto: " + a.getContacto ();
    
      return mensaje;

    }

}
