/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author Alumno
 */
public class Punto3d extends Punto{
    private int z;
    public Punto3d() {
        super();
        this.z =0;
    }
    public Punto3d(int z, int x, int y){
        super(x, y);
        this.z = z;
    }

    public Punto3d(int z, int x, int y, int grosor, String color) {
        super(x, y, grosor, color);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punto3d{"+super.toString() + "z=" + z + '}';
    }
    
    
}
