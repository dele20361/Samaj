/*****************
Proyecto Semestral
Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon, Andres Osorio, Alejandra Guzman 20262
Fecha: 01/09/2020
Ultima modificacion: 11/09/2020 
					
Clase que se encarga de tener todo lo relacionado
con los metodos para documentos
*****************/

import java.util.ArrayList;
import java.util.Random;

public class Documentos {

	//Propiedades de clase
	public static ArrayList<TrabajadorFormal> BaseTF; // ArrayList de trabajadores formales
	public static ArrayList<TrabajadorInformal> BaseTT; // ArrayList de trabajadores informales
	public static ArrayList<Empleador> BaseEF; // ArrayList de trabajos formales
  public static ArrayList<Empleador> BaseET; // ArrayList de trabajos temporales
	
	// Constructor que instancia las listas en las que se almacenará la infromación.
  public Documentos ( ) {
    BaseTF = new ArrayList<TrabajadorFormal>();
    BaseTT = new ArrayList<TrabajadorInformal>();
    BaseEF = new ArrayList<Empleador>();
    BaseET = new ArrayList<Empleador>();
  }

  // Getters
  public static ArrayList<Empleador> getET ( ) { return BaseET; }
  public static ArrayList<Empleador> getEF ( ) { return BaseEF; }
  public static ArrayList<TrabajadorInformal> getTT ( ) { return BaseTT; }
  public static ArrayList<TrabajadorFormal> getTF ( ) { return BaseTF; }

  /**
   * Método para buscar un trabajador formal en ArrayList.
   * @param codigo Código el trabajador formal.
   * @return int Será 0 cuando no se encontró el objeto y 1 si se encontró.
   * @author 
   */
	public int BuscarTrabajadorFormal(int codigo){ 
    int Cod = 0;
    //Se recorre el listado y se busca el código igual.
		for ( int i = 0; i< BaseTF.size(); i++ ) {
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if (codigo == entacuchado.getCodigo()) {
				Cod = 1;
      } 
      else {}
    }
    
    return Cod;
	}

  /** 
   * Método para buscar un trabajador temporal en ArrayList.
   * @param Codigo Código del trabajador temporal.
   * @return int Será 0 cuando no se encontró el objeto y 1 si se encontró.
   */
	public int BuscarTrabajadorTemporal( int Codigo ) {

    //Se recorre el listado y se busca el código igual.
    int Cod = 0;
		for ( int i = 0; i< BaseTT.size(); i++ ) {
			TrabajadorInformal TInformal = BaseTT.get ( i );
			if ( Codigo == TInformal.getCodigoID() ) {
        Cod = 1;
      }
      else {}
    }
    
    return Cod;
	}


  /**
   * Método para buscar un Empleador Formal en ArrayList.
   * @param Codigo Código del empleador formal.
   * @return int Será 0 cuando no se encontró el objeto y 1 si se encontró.
   * @author 
   */
	public int BuscarEmpleadorFormal ( int Codigo ) {
    int Cod = 0;
    //Se recorre el listado y se busca el código igual. 
		for ( int i = 0; i< BaseEF.size(); i++ ) {
			Empleador Jefe = BaseEF.get(i);
			if (Codigo == Jefe.getCodigo()){
				Cod = 1;
      }
      else{}
    }
    
    return Cod;
  }
  

  /**
   * Método para buscar un Empleador Temporal en ArrayList.
   * @param Codigo Código del empleador temporal.
   * @return int Será 0 cuando no se encontró el objeto y 1 si se encontró.
   * @author 
   */
	public int BuscarEmpleadorTemporal ( int Codigo ) {
    int Cod = 0;
		for ( int i = 0; i< BaseET.size(); i++ ) {
			Empleador Senito = BaseET.get(i);
			if ( Codigo == Senito.getCodigo() ) {
				Cod = 1;
      } 
      else {}
    }
    
    return Cod;
	}
	

  /**
   * Método para devolver el objeto que tenga el mismo código.
   * Se debe validar el codigo para usar este método.
   * @param Codigo Código del empleador formal.
   * @return TrabajadorFormal El trabajador formal que corresponde al código ingresado.
   * @author 
   */
	public TrabajadorFormal ObtenerTF ( int Codigo ) {
    TrabajadorFormal Worker = null;
		for ( int i = 0; i< BaseTF.size(); i++ ) {
			TrabajadorFormal entacuchado = BaseTF.get(i);
			if ( Codigo == entacuchado.getCodigo( ) ) {
				Worker = entacuchado;
			}
		}

    return Worker;
	}
  

  /**
   * Método para devolver el objeto que tenga el mismo código.
   * Se debe validar el codigo para usar este método.
   * @param Codigo Código del trabajador informal.
   * @return TrabajadorInformal Trabajador informal que corresponde al código ingresado.
   * @author 
   */
	public TrabajadorInformal ObtenerTT ( int Codigo ) {
    TrabajadorInformal Worker = null; 
		for ( int i = 0; i< BaseTT.size(); i++ ) {
			TrabajadorInformal don = BaseTT.get( i );
			if ( Codigo == don.getCodigoID() ) {
				Worker = don;//Devuelve el objeto si lo encontró
			}
		}
    
    return Worker;
	}


  /**
   * Método para obtener un empleador del ArrayList.
   * Se debe validar el codigo para usar este método.
   * @param Codigo Código del empleador formal.
   * @return Empleador Empleador que corresponde al código ingresado.
   * @author 
   */
	public Empleador ObtenerEF ( int Codigo ) {
    Empleador Boss = null;
		for ( int i = 0; i< BaseEF.size(); i++ ) {
			Empleador Jefe = BaseEF.get(i);
			if (Codigo == Jefe.getCodigo() ) {
				Boss = Jefe;
      }
      else {}
		}

    return Boss;
	}


  /**
   * Método para devolver el objeto que tenga el mismo código.
   * Se debe validar el codigo para usar este método.
   * @param Codigo Código del empleador temporal.
   * @return Empleador Empleador que corresponde al código ingresado.
   * @author 
   */
	public Empleador ObtenerET ( int Codigo ) {
    Empleador Mister = null;
		for ( int i = 0; i< BaseET.size(); i++ ) {
			Empleador Senito = BaseET.get(i);
			if ( Codigo == Senito.getCodigo() ) {
				Mister = Senito;
			}
		}

    return Mister;
	}

  
  /**
   * Método para generar un código aleatorio.
   * @param docs Objeto de documentos.
   * @return int Código generado.
   * @author 
   */
  public static int generarCod ( Documentos docs ) {
    boolean codCorrecto = false; 
    int Codigo = 0;
    //Verifica si este ya existe en las bases de datos.
    while ( codCorrecto == false ) { 
      Random rand = new Random();
      int cod = rand.nextInt(899) + 100;
      int contador = 0;
  
      //For que recorre la base de datos de trabajadores formales
      for ( int i = 0; i < BaseTF.size(); i++ ) {
        TrabajadorFormal entacuchado = BaseTF.get(i);
        int numerito = entacuchado.getCodigo();
        if( cod == numerito ) {
          contador += 1;
        }
      }
      //For para recorrer la base de datos de trabajadores temporales
      for ( int j = 0; j < BaseTT.size(); j++ ) {
        TrabajadorInformal don = BaseTT.get(j);
        int numerazo = don.getCodigoID();
        if( cod == numerazo ) {
          contador += 1;
        }
      }
      
      //For que recorre la base de datos de empleador
      for (int k = 0; k < BaseEF.size(); k++ ) {
        Empleador Jefe = BaseEF.get(k);
        int Num = Jefe.getCodigo();
        if ( cod == Num ) {
          contador += 1;
        }
      }
      
      //For que recorre base de datos de empleador de trabajadores formales
      for ( int l = 0; l < BaseTF.size(); l++ ) {
        TrabajadorFormal entacuchado = BaseTF.get(l);
        int numerito = entacuchado.getCodigo();
        if ( cod == numerito ) {
          contador += 1;
        }
      }
      
      if ( contador == 0 ) {
        Codigo = cod;
        codCorrecto = true;
      }
    }
    
    return Codigo;
    
  }

  /**
   * Método que verifica si el código ingresado existe en las bases de datos.
   * @param cod Código que se verificará.
   * @param docs ArrayLists.
   * @return boolean Indicará si existe el código.
   * @author 
   */

  public static boolean verificarEx(int cod, Documentos docs) {
    boolean Existe = false;
    for (int i = 0; i < BaseTF.size(); i++ ){
      TrabajadorFormal entacuchado = BaseTF.get(i);
      int numerito = entacuchado.getCodigo();
      if (cod == numerito) {
      Existe = true; //Torna true si encuentra una similitud.
      }
    }
    for (int j = 0; j < BaseTT.size(); j++ ){
      TrabajadorInformal don = BaseTT.get(j);
      int numerazo = don.getCodigoID();
      if(cod == numerazo) {
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    for (int k = 0; k < BaseEF.size(); k++ ){
      Empleador Jefe = BaseEF.get(k);
      int Num = Jefe.getCodigo();
      if(cod == Num){
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    for (int l = 0; l<BaseEF.size(); l++ ){
      Empleador Senito = BaseEF.get(l);
      int numerito = Senito.getCodigo();
      if(cod == numerito) {
        Existe = true;//Torna true si encuentra una similitud.
      }
    }
    
    return Existe;
  }
  

  /**
   * Método para agregar un perfil a la lista de trabajadores formales.
   * @param TI Trabajador formal por agregar.
   * @return void
   * @author 
   */
  public static void AddTrabajadorFormal( TrabajadorFormal TF ) {
    BaseTF.add(TF);
  }

  /**
   * Método para agregar un perfil a la lista de trabajadores informales.
   * @param TI Trabajador informal por agregar.
   * @return void
   * @author 
   */
  public static void AddTrabajadorInformal( TrabajadorInformal TI ) {
    BaseTT.add(TI);
  }

  /**
   * Método para agregar un perfil a la lista de trabajadores formales.
   * @param TF Trabajador formal por agregar.
   * @return void
   * @author alias "el avatar"
   */

  public static void AddTrabajadorFormal(TrabajadorFormal TF){
    BaseTF.add(TF);
  }

}