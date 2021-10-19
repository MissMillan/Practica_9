/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accesodatos;

/**
 *
 * @author milla
 */
public interface IAccesoDatos {
    
    int MAX_REGISTRO = 10;
    
    //que voy a dfinir en la capa de abstraccion
    void insertar();//todos estos metodos son abstractos son publicos
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
