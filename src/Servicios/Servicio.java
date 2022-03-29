/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicio {
    HashMap<String,Double> Productos = new HashMap();
    public static Scanner leer = new Scanner(System.in);
    
    public void AgregarProductos(){
        String nombre;
        double precio;
        System.out.print("\nIngrese el nombre del producto: ");
        nombre=leer.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        precio=leer.nextDouble();
        Productos.put(nombre,precio);
    }
    
    public void ModificarPrecio(){
        String buscar;
        double precioN;
        System.out.print("\nIngrese el nombre del producto a modificar:");
        buscar=leer.nextLine();
        System.out.print("Ingrese su nuevo precio: ");
        precioN=leer.nextDouble();
        for(String i:Productos.keySet()){
            if(i.equals(buscar)){
                Productos.put(i, precioN);
                System.out.println("El nuevo precio de "+i+" es "+precioN);
            }
        }
    }
    
    public void EliminarProducto(){
        String buscar;
        System.out.print("\nIngrese el nombre del producto a eliminar: ");
        buscar=leer.nextLine();
        Iterator<String> it = Productos.keySet().iterator();
        while(it.hasNext()){
            if(it.next().equals(buscar)){
                it.remove();
                System.out.println("Se ha removido el producto "+buscar);
            }
        }
    }
    
    public void MostrarProductos(){
        System.out.println("\nProductos:");
        for(Map.Entry<String,Double> entry:Productos.entrySet()){
            System.out.println("Nombre: "+entry.getKey()+" - Precio: "+entry.getValue());
        }
    }
}
