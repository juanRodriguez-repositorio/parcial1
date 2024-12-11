/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1poo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kamus
 */
public class Restaurante {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        //platos Fuertes.
        Platos platoFuerte1=new Platos("Pasta a la bolonesa           ",36000,"pasta,salsa,papas a la francesa,arroz   ");
        Platos platoFuerte2=new Platos("Filete de res en salsa        ",42000,"solomillo,salsa vino tinto,nugetts      ");
        Platos platoFuerte3=new Platos("Pollo con champinones         ",26000,"pollo.champiñones,papas,ensalada        ");
        Platos platoFuerte4=new Platos("Pescado al ajillo             ",34000,"pescado blanco,perejil,caldo de pescado ");
        //postres
        Platos postre1=new Platos("Flan de caramelo              ",12000,"vainilla,huevos,leche condensada,azucar ");
        Platos postre2=new Platos("Mousse de chocolate           ",14000,"vainilla,huevos,chocolate negro,crema   ");
        Platos postre3=new Platos("Arroz con leche               ",9000,"arroz blanco,leche,canela,limon         ");
        Platos postre4=new Platos("Pay delimon                   ",16000,"galletas maria,leche,jugo de limon      ");
        
        
        int opcion;
        ArrayList<Platos> lista=new ArrayList<>();
        int precio=0;
        int salir=2;
        Facturas factura=null;
        System.out.println("Bienvenido al Restaurante!!  ");
        System.out.println("Elige tus platos acorde al numero que le corresponde");
        while(salir==2){
            System.out.println("Menu de patos fuertes:");
        
            System.out.println(1+"->"+platoFuerte1.obtenerNombre());
            System.out.println(2+"->"+platoFuerte2.obtenerNombre());
            System.out.println(3+"->"+platoFuerte3.obtenerNombre());
            System.out.println(4+"->"+platoFuerte4.obtenerNombre());
        
            System.out.println("Menu de postres:");
        
            System.out.println(5+"->"+postre1.obtenerNombre());
            System.out.println(6+"->"+postre2.obtenerNombre());
            System.out.println(7+"->"+postre3.obtenerNombre());
            System.out.println(8+"->"+postre4.obtenerNombre());
            opcion=validarEntrada();
            switch(opcion){
                case 1:
                    precio+=platoFuerte1.obtenerPrecio();
                    mostrarListaParcial(lista,platoFuerte1,factura,precio);
                    break;
                case 2:
                    precio+=platoFuerte2.obtenerPrecio();
                    mostrarListaParcial(lista,platoFuerte2,factura,precio);
                    break;
                case 3:
                    precio+=platoFuerte3.obtenerPrecio();
                    mostrarListaParcial(lista,platoFuerte3,factura,precio);
                    break;
                case 4:
                    precio+=platoFuerte4.obtenerPrecio();
                    mostrarListaParcial(lista,platoFuerte4,factura,precio);
                    break;
                case 5:
                    precio+=postre1.obtenerPrecio();
                    mostrarListaParcial(lista,postre1,factura,precio);
                    break;
                case 6:
                    precio+=postre2.obtenerPrecio();
                    mostrarListaParcial(lista,postre2,factura,precio);
                    break;
                case 7:
                    precio+=postre3.obtenerPrecio();
                    mostrarListaParcial(lista,postre3,factura,precio);
                    break;
                case 8:
                    precio+=postre4.obtenerPrecio();
                    mostrarListaParcial(lista,postre4,factura,precio);
                    break;
                default:
                    System.out.println("Opcion invalida");
            
                    
            }
            System.out.println("Presiona 1 para finalizar la compra y 2 para seguir comprando");
            salir=validarEntrada();
            while(salir!=1 && salir!=2){
                System.out.println("opcion invalida");
                System.out.println("Presiona 1 para finalizar la compra y 2 para seguir comprando");
                salir=scan.nextInt();
            }
            if(salir==1){
                System.out.println("Compra exitosa! factura:");
                factura=new Facturas(lista);
                factura.crearFactura(precio);
            }
        }
        
        

        
        
    }
    public static int validarEntrada(){
        try{
            int resultado=scan.nextInt();
            return resultado;
        }catch(Exception e){
            System.out.println("entrada invalida, finalizando programa.Compra cancelada");
            System.exit(0);
            return 0;
        }
    }
    public static void mostrarListaParcial(ArrayList<Platos> lista,Platos plato,Facturas factura,int precio){
    
        lista.add(plato);
        factura=new Facturas(lista);
        factura.listaParcial(precio);
    }
}
