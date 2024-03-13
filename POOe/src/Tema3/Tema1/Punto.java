/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Alumno
 */
public class Punto {
    double x, y;
    private String nombre;
    public Punto(){
        this.x = 5.5;
        this.y =4.0;
    }
    
    Punto(String nombre) {
        this.nombre=nombre;
    }
    
    public Punto(double x, double y, String nombre){
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + ", nombre=" + nombre + '}';
    }

    
    public static void main(String[] args) {
        Punto puntoA=new Punto("A");
        puntoA.setX(23.5);
        puntoA.setY(-14.0);
        System.out.println("puntoA en x:"+puntoA.getX());
        System.out.println(puntoA.toString());
        
        Punto b = new Punto(-2.36, 3.67, "B");
        System.out.println(b.toString());
    }
    
}
