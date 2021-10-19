/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import genericos.ClaseGenerica;

/**
 *
 * @author milla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseGenerica <Integer> objInt = new ClaseGenerica(15);
        objInt.obtenerTipo();
        
        ClaseGenerica <String> objString = new ClaseGenerica("Yesenia");
        objString.obtenerTipo();
    }
    
}
