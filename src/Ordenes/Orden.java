/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenes;
import Productos.Producto;
import java. util. ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno Mañana
 */
public class Orden extends Producto {
    
    private int idOrden;
    private ArrayList<Producto> productos = new ArrayList<>();
    private static int contadorOrdenes;
    private static int maxProductos = 10;
    
//    private static int cont;
    
    public Orden() {
        this.idOrden = ++contadorOrdenes;
    }
    
    public void agregarProducto(Producto producto){
        if(maxProductos == 0){
            System.out.println("La lista de productos esta llena");
        }else{
            maxProductos--;
            this.productos.add(producto);
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for (Producto prod : productos) {
            total+=prod.getPrecio() ;
        }
        return total;
    }
    

    public void mostrarOrden() {
        for (Producto prod : productos) {
            System.out.println(idOrden +" "+prod); ;
        }
    }
    
}
