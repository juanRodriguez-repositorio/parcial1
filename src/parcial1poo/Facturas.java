/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1poo;

import java.util.ArrayList;

/**
 *
 * @author kamus
 */
public class Facturas {
    private ArrayList<Platos> lista;
    
    Facturas(ArrayList<Platos> lista){
        this.lista=lista;
        
        
    }
    public void crearFactura(int precio){
        System.out.println("Nombre                        Contiene                                Precio");
        int tamañoLista=this.lista.size();
        for(int i=0;i<tamañoLista;i++){
            Platos plato=this.lista.get(i);
            System.out.println(plato.obtenerNombre()+plato.obtenerIngredientes()
                    +plato.obtenerPrecio()+"$");
        }
        System.out.println("total a pagar: "+precio+"$");
        
    }
    public void listaParcial(int precio){
        System.out.println("lista de platos seleccionados:");
        System.out.println("Nombre                        Precio");
        int tamañoLista=this.lista.size();
        for(int i=0;i<tamañoLista;i++){
            Platos plato=this.lista.get(i);
            System.out.println(plato.obtenerNombre()+plato.obtenerPrecio()+"$");
        }
        System.out.println("Total a pagar: "+precio+"$");
    }
}
