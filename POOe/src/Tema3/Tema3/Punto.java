/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Alumno
 */
public class Punto {
    private int x;
    private int y;
    private int grosor;
    String color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getGrosor() {
        return grosor;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto() {
        x=0;
        y=0;
        grosor=1;
        color="negro";
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        grosor=1;
        color="negro";

    }

    public Punto(int x, int y, int grosor, String color) {
        this.x = x;
        this.y = y;
        this.grosor = grosor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + ", grosor=" + grosor + ", color=" + color + '}';
    }

}
