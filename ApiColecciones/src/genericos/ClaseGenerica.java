/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericos;

/**
 *
 * @author milla
 */
public class ClaseGenerica <T>{

    
   private T objeto;
   
   public ClaseGenerica( T objeto){
       
       this.objeto = objeto;
   }
   
   //vamos a crear un metodo para comprobar la clase generica
   
   //definios un nuevo metodo que sera publico y vacio
   
   
   public void obtenerTipo(){
       
       System.out.println("El tipo es T: "+ objeto.getClass().getSimpleName());
   }
    
}
