/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class UsarPunto {
    public static void main(String[] args) {
        Punto p[] = new Punto[100];
        int dato = -1, dato2 = -1, puntos = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("App Punto");
            System.out.println("1. Crear punto");
            System.out.println("2. Modificar punto");
            System.out.println("3. Mostrar punto");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            dato = sc.nextInt();
            switch (dato) {
                case 1://crear punto
                    do {
                        System.out.println("Creación de un punto");
                        System.out.println("1. Punto vacio");
                        System.out.println("2. Punto con coordenadas");
                        System.out.println("3. Punto con todos los datos");
                        System.out.println("4. Regresar");
                        System.out.println("Elige una opcion: ");
                        dato2 = sc.nextInt();
                        switch (dato2) {
                            case 1:
                                System.out.println("Creando el punto");
                                p[puntos] = new Punto();
                                puntos++;
                                System.out.println("El punto se ha creado");
                                System.out.println(p[puntos - 1].toString());
                                break;
                            case 2:
                                System.out.println("Creando el punto");
                                System.out.println("Ingresa las coordenadas del punto");
                                System.out.print("x: ");
                                int x = sc.nextInt();
                                System.out.print("y: ");
                                int y = sc.nextInt();
                                p[puntos] = new Punto(x, y);
                                puntos++;
                                System.out.println("El punto se ha creado");
                                System.out.println(p[puntos - 1].toString());
                                break;
                            case 3:
                                System.out.println("Creando el punto");
                                System.out.println("Ingresa las coordenadas del punto");
                                System.out.print("x: ");
                                int x1 = sc.nextInt();
                                System.out.print("y: ");
                                int y1 = sc.nextInt();
                                System.out.println("Agrega el grosor en px");
                                int pixel = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Registra el color del punto");
                                String color = sc.nextLine();
                                p[puntos] = new Punto(x1, y1, pixel, color);
                                puntos++;
                                System.out.println("El punto se ha creado");
                                System.out.println(p[puntos - 1].toString());
                                break;
                            case 4:
                                System.out.println("Regresando al menu principal");
                            default:
                                System.out.println("Ha seleccionado una opcion incorrecta");
                        }
                    } while (dato2 != 4);
                    break;
                case 2://modificar punto
                    int control = 0;
                    for (Punto punto : p) {
                        if (punto != null) {
                            System.out.println(control + ": " + punto.toString());
                            control++;
                        }
                    }
                    System.out.println("Elige el indice de un punto");
                    int i = sc.nextInt();
                    System.out.println("Modifica los datos del punto");
                    System.out.println("Ingresa las coordenadas del punto");
                    System.out.print("x: ");
                    p[i].setX(sc.nextInt());
                    System.out.print("y: ");
                    p[i].setY(sc.nextInt());
                    System.out.println("Agrega el grosor en px");
                    p[i].setGrosor(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Registra el color del punto");
                    p[i].setColor(sc.nextLine());
                    System.out.println("El punto se ha modificado");
                    System.out.println(p[i].toString());
                    break;
                case 3:
                    System.out.println("Lista de puntos registrados");
                    int control1 = 0;
                    for (Punto punto : p) {
                        if (punto != null) {
                            System.out.println(control1 + ": " + punto.toString());
                            control1++;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Ha decidido salir de la App Punto");
                    System.out.println("Regrese pronto!!!");
                    break;
                default:
                    System.out.println("La opcion elegida no esta en el menu principal");
            }
        } while (dato != 0);
    }
}