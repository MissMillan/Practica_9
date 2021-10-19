/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

/**
 *
 * @author milla
 */
public class ImplementacionMysql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde mySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listando  desde mySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde mySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminado desde mySQL");
    }
    
}
