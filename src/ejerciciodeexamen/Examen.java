/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeexamen;
import java.util.Scanner;
/**
 *
 * @author Anthony
 */
public class Examen {
    public static void main(String[] args){
        /*Escribir un programa en Java para crear una Calculadora de Áreas. Esta calculadora debe preguntar al
        usuario por la figura geométrica (cuadrado, rectángulo, triángulo o círculo) y una vez seleccionada ésta,
        deberá solicitar los datos pertinentes para el cálculo del área respectiva.
        La elección de la figura requiere que el usuario ingrese el nombre completo de la figura o las tres primeras
        letras (“cuadrado” o “cua”, por ejemplo). Hacer uso de los métodos equals y contains de la clase String para
        validar el ingreso del usuario.*/
        Scanner lector=new Scanner(System.in);
        int base, altura, lado, radio;
        double area;
        
        System.out.println("Ingresar una figura geometrica.(cuadrado, rectangulo, triangulo, circulo)");
        String figura = lector.nextLine().toLowerCase();
        
        if (figura.equals("cuadrado")||figura.contains("cua")){
        System.out.println("Ingresar el lado de la figura: ");
        lado=lector.nextInt();
        area=lado*lado;
        System.out.println("El area de la figura es: "+area);
        }else{ if (figura.equals("rectangulo")||figura.contains("rec")){
        System.out.print("Ingrese la base de la figura: ");
        base=lector.nextInt();
        System.out.print("Ingresar la altura de la figura: ");
        altura=lector.nextInt();
        area=base*altura;
        System.out.println("El area de la figura es: "+area);
        }else{ if (figura.equals("triangulo")||figura.contains("tri")){
        System.out.print("Ingrese la base de la figura: ");
        base=lector.nextInt();
        System.out.print("Ingresar la altura de la figura: ");
        altura=lector.nextInt();
        area=(base*altura)/2;
        System.out.println("El area de la figura es: "+area);
        }else{ if (figura.equals("circulo")||figura.contains("cir")){
        System.out.println("Ingresar el radio de la figura: ");
        radio=lector.nextInt();
        area=Math.PI*Math.pow(radio, 2);
        System.out.println("El area de la figura es: "+area);
        }else
        System.out.println("Ingrese una figura valida");
        }        
        
        }
        }
    }
}   
    

            
            
        
        

    

