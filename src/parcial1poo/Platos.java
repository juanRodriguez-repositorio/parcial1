/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1poo;

/**
 *
 * @author kamus
 */
public class Platos {
    private String nombre;
    private int precio;
    private String ingredientes;
    
    Platos(String nombre,int precio, String ingredientes){
        this.nombre=nombre;
        this.precio=precio;
        this.ingredientes=ingredientes;
        
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public int obtenerPrecio(){
        return this.precio;
    }
    public String obtenerIngredientes(){
        return this.ingredientes;
    }
}

