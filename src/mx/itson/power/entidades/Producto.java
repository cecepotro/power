/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.power.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class Producto extends Concepto {

    private int cantidad;
        
    @Override
    public List<Impuesto> calcularImpuestos(){
        List<Impuesto> impuestos = new ArrayList<>();
        
        Impuesto iva = new Impuesto();
        iva.setNombre("IVA");
        iva.setMonto(calcularTotal() * 0.16);
        
        impuestos.add(iva);
        
        return impuestos;
    }
    
    public double calcularTotal(){
        return cantidad * getPrecio();
    }
    
    public double calcularTotal(List<Impuesto> impuestos){
        double subtotal = calcularTotal();
        
        for(Impuesto i : impuestos){
            subtotal += i.getMonto();
        }
        
        return subtotal;
    }
    
    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    
}
