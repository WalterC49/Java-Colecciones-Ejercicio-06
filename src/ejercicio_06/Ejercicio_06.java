/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package ejercicio_06;

import Servicios.Servicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa administra productos en una tienda.");
        Servicio Serv = new Servicio();
        int respuesta;
        do{
            System.out.println("\nMENU"
                    + "\n1- Introducir un producto."
                    + "\n2- Modificar el precio de un producto."
                    + "\n3- Eliminar un producto."
                    + "\n4- Mostrar todos los productos."
                    + "\n5- Salir");
            System.out.print("Elija una opción: ");
            respuesta=Servicio.leer.nextInt();
            Servicio.leer.nextLine();
            switch(respuesta){
                case 1:
                    Serv.AgregarProductos();
                    break;
                case 2:
                    Serv.ModificarPrecio();
                    break;
                case 3:
                    Serv.EliminarProducto();
                    break;
                case 4:
                    Serv.MostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta prontos.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
            
        }while(respuesta!=5);
        
    }
    
}
