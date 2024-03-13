/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author TECMM PROFESOR
 */
public class UsarProducto {

    public static void main(String[] args) {
        producto producto[] = new producto[100];
        int valor = 0, numProducto = 0;
        do {
            System.out.println("Menu para pv 2024");
            System.out.println("1.Agregar Productos");
            System.out.println("2.Modificar un Producto");
            System.out.println("3.Eliminar un producto");
            System.out.println("4.Mostrar productos");
            System.out.println("0.Salir");
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige una opción");
            valor = sc.nextInt();
            switch (valor) {
                case 1:
                    System.out.print("Ingrece el codigo de barras: ");
                    long codigoBarras = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Ingrece el nombre del producto: ");
                    String Nombre = sc.nextLine();
                    System.out.print("Ingrece el precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Ingrece la existencia: ");
                    int existencia = sc.nextInt();
                    producto[numProducto] = new producto(precio, Nombre, existencia, codigoBarras);
                    numProducto++;
                    break;
                case 2://modificar producto
                    System.out.println("producto registrado");
                    int i = 0;
                    if (producto[0] != null) {
                        for (; i < producto.length; i++) {
                            if (producto[i] != null) {
                                System.out.println(i + "-> " + producto[i].toString());
                                
                            }else{
                            break;
                            }
                    }
                    System.out.println("que producto quiere modificar? (0-" + (i - 1) + ") ");
                    System.out.println("indice:");
                    int indice = sc.nextInt();
                    System.out.println("modifique los datos que requiera ... ");
                    System.out.println("codigo de barra:");
                    producto[indice].setCodigoBarras(sc.nextLong());
                    sc.nextLine();
                    System.out.println("Nombre");
                    producto[indice].setNombre(sc.nextLine()); //coando ba un numero y despues la cadena poner el nextline 
                        System.out.println("Marca: ");
                        producto[indice].setMarca (sc.nextLine());
                        System.out.println("Existencia:");
                        producto[indice].setExistencia (sc.nextInt());
                        System.out.println("Precio: ");
                        producto[indice].setPrecio (sc.nextInt());
                        System.out.println("Peso");
                        producto[indice].setPeso(sc.nextInt());
                        System.out.println("Caducidad");
                        producto[indice].setCaducidad(sc.nextInt());
            }else{//CORREGIR
                        System.out.println("No ay  producto registrado");
                    }

            break;
          case 3:

                    break;
                case 4:

                    break;
                case 0:

                    break;
                default:
                    throw new AssertionError();
            }
        
    }
    while (valor 
!= 0);

    }
}