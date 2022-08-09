/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author marco.chaparro
 */
public class Productos extends Base{

    private String nombreProducto;
    private int cantidadProductos;
    private double valorProducto;

    public Productos() {
    }

    public Productos(String nombreProducto, int cantidadProductos, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProductos = cantidadProductos;
        this.valorProducto = valorProducto;
    }
    

    /**
     * Get the value of valorProducto
     *
     * @return the value of valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Set the value of valorProducto
     *
     * @param valorProducto new value of valorProducto
     */
    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }


    /**
     * Get the value of cantidadProductos
     *
     * @return the value of cantidadProductos
     */
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    /**
     * Set the value of cantidadProductos
     *
     * @param cantidadProductos new value of cantidadProductos
     */
    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    
    //@Override es un metodo de sobreescritura
    @Override
    public Base copy() {
        
        return new Productos(nombreProducto, cantidadProductos, valorProducto);
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreProducto=" + nombreProducto + ", cantidadProductos=" + cantidadProductos + ", valorProducto=" + valorProducto + '}';
    }
    
    
    
}
