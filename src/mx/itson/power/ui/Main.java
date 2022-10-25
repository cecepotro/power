/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.power.ui;

import java.util.List;
import java.util.Scanner;
import mx.itson.power.entidades.Impuesto;
import mx.itson.power.entidades.Producto;

/**
 *
 * @author jesus
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduza el nombre:");
        String nombre = in.nextLine();
        
        System.out.println("Introduza la descripción:");
        String descripcion =  in.nextLine();
        
        System.out.println("Introduza el precio:");
        double precio = in.nextDouble();
        
        System.out.println("Introduzca 1 si está intentando calcular producto o 2 para servicio");
        int tipo = in.nextInt();
        
        if(tipo == 1){
            System.out.println("Introduza la cantidad:");
            int cantidad = in.nextInt();
            
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setDescripcion(descripcion);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            
            System.out.println("********RESULTADO***********");
            System.out.println(producto.toString());
            
            System.out.println("SUBTOTAL: " + producto.calcularTotal());
            
            
            List<Impuesto> impuestos = producto.calcularImpuestos();
            
            for(Impuesto i : impuestos){
                System.out.println(i.getNombre() + ": " + i.getMonto());
            }
            
            System.out.println("TOTAL: " + producto.calcularTotal(impuestos));
            
            
        } else if (tipo == 2) {
            
        }
        
        
    }
}
