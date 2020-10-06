/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020
					
Clase derivada de EmpleadorFormal.
Samaj-20
*****************/

import java.util.ArrayList;

public class EmpleadorInformal extends EmpleadorFormal {
    
    // Propiedades
    private ArrayList<TrabajoTemp> TrabajoInformal; // Lista que almacenará los trabajos informales creados por el empleador.

    //Constructor
    public EmpleadorInformal( usuarioSamaj user ) {
        // Llamar a constructor de EmpleadorFormal
        super( user );
        TrabajoInformal = new ArrayList<TrabajoTemp>(); 
    }

    // Getters
    public ArrayList<TrabajoTemp> getTrabajoInformal() { return TrabajoInformal;}

    // Setters
    public ArrayList<TrabajoTemp> setTrabajoInformal ( ArrayList<TrabajoTemp> a ) { TrabajoInformal = a; return TrabajoInformal; }

    /**
     * Método para agregar un trabajo a la lista de trabajos temporales.
     * @param emp Empleador al que se le agregará.
     * @param a Trabajo temporal que se agregará.
     * @return void
     * @author
    */
    public void AddTrabajoTemp ( Empleador emp, TrabajoTemp a ) {
        ArrayList<TrabajoTemp> ListaTrabajos = emp.getTrabajoInformal();
        ListaTrabajos.add ( a );
    }


    /**
      * Método para mostrar la información de un empleador.
      * @param a Empleador del cual se mostrará la información.
      * @return String En el que se mostrará la infor.
      * @author
    */
    public String toString ( EmpleadorInformal a ) {
        Boolean IsFormal = a.getFormal ();
        String mensaje = "";    
        mensaje += "Informacion del empleador informal: ";  
        mensaje += "- Nombre: " + a.getNombre ();
        mensaje += "- Codigo: " + a.getCodigo ();
        mensaje += "- Contacto: " + a.getContacto ();   
        
        return mensaje;
    }

}
