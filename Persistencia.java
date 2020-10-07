/*****************
Proyecto Semestral POO 2020

Persistencia.java

Autor: Alejandro Gómez 20347, Marco Jurado 20308, Paola De Leon 20361, Andres Osorio, Alejandra Guzman 20262
Fecha: 05/10/2020
Ultima modificacion: 06/10/2020
					
Clase encargada de realizar procesos de persistencia para
programa de Samaj-20
*****************/


import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Character;
/*Autor: Alejandro Gomez */

 public class Persistencia{
   PrintWriter imp, imp2;
   StringBuilder escribir, escribir2;
   String directorio;
   ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
   ArrayList<String> fila = new ArrayList<String>();

   public Persistencia(String csvPath){
      //PEDIR AL USUARIO QUE INGRESE SU DIRECTORIO EN EL CONTROLADOR
      directorio = csvPath;
      try {
         imp = new PrintWriter(new File(directorio));
         escribir = new StringBuilder();
         escribir.append("Nombre");
         escribir.append(",");
         escribir.append("Apellido");
         escribir.append(",");
         escribir.append("Telefono");
         escribir.append(",");
         escribir.append("Correo");
         escribir.append("\r\n");
         imp.write(sb.toString());
         imp.close();
         System.out.println("Archivo Perfiles.csv creado.");

         imp2 = new PrintWriter(new File(directorio));
         escribir2 = new StringBuilder();
         escribir2.append("Codigos");
         escribir2.append("\r\n");
         imp2.write(sb2.toString());
         imp2.close();
         System.out.println("Archivo Codigos.csv creado.");
      } catch (Exception e) {
         System.out.println("Ha ocurrido un error.");
      }
   }

   //
   public static void nuevoRegistro(String nombre, String apellido, int telefono, String correo){
      sb.append(nombre);
      sb.append(",");
      sb.append(apellido);
      sb.append(",");
      sb.append(telefono);
      sb.append(",");
      sb.append(correo);
      sb.append("\r\n");
   }

   //Sobrecarga del metodo nuevoRegistro para guardar codigos en el archivo 
   public static void nuevoRegistro(int codigo){
      sb2.append(codigo);

	public void leerArchivo() {
		StringBuilder sb = new StringBuilder();
		Path filePath = Paths.get("data.csv");
		try {
			BufferedReader br = Files.newBufferedReader(filePath);
			String linea;
         String variable;
         char celda;

			while((linea = br.readLine()) != null) {
            for(int i = 0; linea.length(); i++){
               if(linea.charAt(i)==','){
                  fila.add(Character.toString(celda));
                  celda = '';
               }else{
                  celda += linea.charAt(i);
               }
            }
             datos.add(fila);
             fila.clear();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(sb);
	}



   public ArrayList<String> almacenarInfoArrayList(){
      
   }
}