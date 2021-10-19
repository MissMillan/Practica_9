/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import accesodatos.*;

/**
 *
 * @author milla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //estos accediento a los metodos abstractos de IAcceso a datos
        IAccesoDatos datos = new ImplementacionMysql();
        datos.eliminar();
        
    }
    
}
