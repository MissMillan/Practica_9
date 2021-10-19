/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author milla
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
         System.out.println("Insertando desde Oracle");
    }

    @Override
    public void listar() {
          System.out.println("Listando desde Oracle");
    }

    @Override
    public void actualizar() {
          System.out.println("Actualizando desde Oracle");
    }

    @Override
    public void eliminar() {
          System.out.println("IEliminando desde Oracle");
    }
    
}
