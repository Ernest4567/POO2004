/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Alumno
 */
public class producto {
    private double precio;         //
    private String Nombre;      //
    private int peso;        //
    private int Existencia;  //
    private String  Marca;//
    private String Caducidad;
    private Long CodigoBarras;    //cuando hay mas de 12 palabra

    public double getPrecio() { //insetar
        return precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getExistencia() {
        return Existencia;
    }

    public String getMarca() {
        return Marca;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public Long getCodigoBarras() {
        return CodigoBarras;
    }

    public void setPrecio(double precio) { //insetar
        this.precio = precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }

    public void setCodigoBarras(Long CodigaBarrls) {
        this.CodigoBarras = CodigaBarrls;
    }

    @Override
    public String toString() {   //insetar
        return "producto{" + "precio=" + precio + ", Nombre=" + Nombre + ", peso=" + peso + ", Existencia=" + Existencia + ", Marca=" + Marca + ", Caducidad=" + Caducidad + ", CodigoBarras=" + CodigoBarras + '}';
    }

    public producto(double precio, String Nombre, int Existencia, Long CodigoBarras) { //insetar constructor
        this.precio = precio;
        this.Nombre = Nombre;
        this.Existencia = Existencia;
        this.CodigoBarras = CodigoBarras;
    }

    public producto(double precio, String Nombre, int peso, int Existencia, String Marca, String Caducidad, Long CodigoBarras) {
        this.precio = precio;
        this.Nombre = Nombre;
        this.peso = peso;
        this.Existencia = Existencia;
        this.Marca = Marca;
        this.Caducidad = Caducidad;
        this.CodigoBarras = CodigoBarras;
    }
    
    
}
