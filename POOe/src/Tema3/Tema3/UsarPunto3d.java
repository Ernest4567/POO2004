/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Alumno
 */
public class UsarPunto3d {
    public static void main(String[] args) {
        Punto3d p3d = new Punto3d();

        System.out.println(p3d.toString());
        p3d.setX(10); //EN CASO de privasitar escriber set descpues el valor con mayuscula en la primera letra y los parentesis
        p3d.setY(-12);
        p3d.setZ(45);
        p3d.setGrosor(10);
        p3d.setColor("rojo");
        System.out.println(p3d.toString());
    }
}
