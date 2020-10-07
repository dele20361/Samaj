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

 public class Persistencia{
   PrintWriter pw, pw2;
   StringBuilder sb, sb2;
   String directorio;

   public Persistencia(String csvPath){
      //PEDIR AL USUARIO QUE INGRESE SU DIRECTORIO EN EL CONTROLADOR
      directorio = csvPath;
      try {
         pw = new PrintWriter(new File(directorio));
         sb = new StringBuilder();
         sb.append("Nombre");
         sb.append(",");
         sb.append("Apellido");
         sb.append(",");
         sb.append("Telefono");
         sb.append(",");
         sb.append("Correo");
         sb.append("\r\n");
         pw.write(sb.toString());
         pw.close();
         System.out.println("Archivo Perfiles.csv creado.");

         pw2 = new PrintWriter(new File(directorio));
         sb2 = new StringBuilder();
         sb2.append("Codigos");
         sb2.append("\r\n");
         pw2.write(sb2.toString());
         pw2.close();
         System.out.println("Archivo Codigos.csv creado.");
      } catch (Exception e) {
         System.out.println("Error.");
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

