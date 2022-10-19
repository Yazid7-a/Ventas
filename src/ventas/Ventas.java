/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

import Productos.Producto;
import Ordenes.Orden;
import java.util.Scanner;
import java. util. ArrayList;
import static ventas.Ventas.Lista;

/**
 *
 * @author Alumno Mañana
 */
public class Ventas {

    /**
     * 
     * @param args the command line arguments
     */
    
    static ArrayList<Producto> Lista = new ArrayList<>();
    static Scanner dato = new Scanner (System.in);
    static int var=-1;
    
    public static void main(String[] args) {
        // TODO code application logic here
   
          menu();
        
        }
        
    public static void menu(){
        
        boolean var2=false;
        int nuevo=0;
        
        int eliminar=-1;
     
        
        Orden o1 = new Orden ();
        Producto p1 = new Producto("Patata", 2);
        Producto p2 = new Producto("Cafe", 1.5);
        Producto p3 = new Producto("Soja", 0.6);
        Producto p4 = new Producto("Patata", 2);
        Producto p5 = new Producto("Cafe", 1.5);
        Producto p6 = new Producto("Soja", 0.6);
        Producto p7 = new Producto("Patata", 2);
        Producto p8 = new Producto("Cafe", 1.5);
        Producto pN = new Producto();
       
        
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);
        Lista.add(p4);
        Lista.add(p5);
        Lista.add(p6);
        Lista.add(p7);
        Lista.add(pN);
        
       
        
        
        
        while(var!=0){
        System.out.println("");
        System.out.println("¡Bienvenido a nuestro Supermarket Virtual!");
        System.out.println("=========================================\n");
        System.out.println("A continuacion, por favor seleccione la acción a realizar:");
        System.out.println("");
        System.out.println("1)Comprar");
        System.out.println("2)Agregar un Producto");
        System.out.println("3)Eliminar un Producto");
        System.out.println("0)Salir");
        var=dato.nextInt();
            int compra=-1;
            switch (var) {
            
            case 1:
                 
                 while(compra!=0){
                    System.out.println("Esta es nuestra lista de Productos, Seleccione el que desee:");
                    System.out.println("1)"+p1+"\n");
                    System.out.println("2)"+p2+"\n");
                    System.out.println("3)"+p3+"\n");
                    System.out.println("4)"+p4+"\n");
                    System.out.println("5)"+p5+"\n");
                    System.out.println("6)"+p6+"\n");
                    System.out.println("7)"+p7+"\n");
                    if (nuevo==1){
                        System.out.println("8)"+pN+"\n");
                    }
                    System.out.println("0) Para salir \n");
                    compra=dato.nextInt();
                    switch(compra){
                        
                        case 1:
                            System.out.println("Ha seleccionado el producto: "+p1);
                            o1.agregarProducto(p1);
                            break;
                    
                        case 2:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(2));
                            o1.agregarProducto(p2);
                            break;
                    
                        case 3:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(3));
                            o1.agregarProducto(p3);
                            break;
                    
                        case 4:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(4));
                            o1.agregarProducto(p4);
                            break;
                    
                        case 5:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(5));
                            o1.agregarProducto(p5);
                            break;
                    
                        case 6:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(6));
                            o1.agregarProducto(p6);
                            break;
                    
                        case 7:
                            System.out.println("Ha seleccionado el producto: "+Lista.get(7));
                            o1.agregarProducto(p7);
                            break;
                            
                        
                        case 8:
                            if (nuevo==1){
                            System.out.println("Ha seleccionado el producto: "+pN);
                            o1.agregarProducto(pN);}else{
                                System.out.println("Aún no se ha añadido un producto nuevo.");
                            }
                            break;
                        case 0:
                            System.out.println("\n\nGracias por usar la aplicación!\n");
                            break;
                    }
                 }
                 System.out.println("El total de la compra es: "+o1.calcularTotal()+"€");
                break;
            case 2:
                    nuevo=1;
                    System.out.println("Introduzca los datos del producto a Añadir:");
                    System.out.println("ID: ");
                    pN.setIdProducto(dato.nextInt());
                    dato.nextLine();
                    System.out.println("Nombre: ");
                    pN.setNombre(dato.nextLine());
                    System.out.println("Precio: ");
                    pN.setPrecio(dato.nextDouble());
                    System.out.println("El producto se ha añadido correctamente!");
                    
                break;
            case 3:
                    System.out.println("Seleccione el producto a eliminar:");
                    System.out.println("1)"+p1+"\n");
                    System.out.println("2)"+p2+"\n");
                    System.out.println("3)"+p3+"\n");
                    System.out.println("4)"+p4+"\n");
                    System.out.println("5)"+p5+"\n");
                    System.out.println("6)"+p6+"\n");
                    System.out.println("7)"+p7+"\n");
                    if (nuevo==1){
                        System.out.println("8)"+pN+"\n");
                    }
                    System.out.println("0) Para salir \n");
                    eliminar=dato.nextInt();
                    switch(eliminar){
                        
                        case 1:
                            p1=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p1);
                            break;
                    
                        case 2:
                            p2=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p2);
                            break;
                    
                        case 3:
                            p3=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p3);
                            break;
                    
                        case 4:
                            p4=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p4);
                            break;
                    
                        case 5:
                            p5=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p5);
                            break;
                    
                        case 6:
                            p6=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p6);
                            break;
                    
                        case 7:
                            p7=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(p7);
                            break;
                            
                        
                        case 8:
                            if (nuevo==1){
                            pN=null;
                            System.out.println("El producto ha sido eliminado con éxito!");
                            System.out.println(pN);;}else{
                                System.out.println("Aún no se ha añadido un producto nuevo.");
                            }
                            break;
                        case 0:
                            System.out.println("\n\nGracias por usar la aplicación!\n");
                            break;
                    }
                break;
           case 0:
                    System.out.println("\n\nGracias por usar la aplicación!\n");
                    break;
                default:
                    System.out.printf("\nElija entre 1 y 4\n\n");
                    break;
          }
            o1.setPrecio(0.0);
        }
    }
    
    
    }
    

