package javaapplication16;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class JavaApplication16 {

    public static void main(String[] args) {
        /*Escribir un programa en Java que solicite al usuario las calificaciones de los estudiantes
          de un curso.
          El programa termina cuando el usuario ya no desea ingresar más notas o cuando
          ingresa una nota igual a -1.
          Al terminar, deberá mostrar el promedio global, así como el número de estudiantes
          aprobados y desaprobados.*/
        Scanner lector = new Scanner(System.in);
        int i=0, total=0, desaprobados=0, aprobados=0;
        double promedio, nota;
        String opcion;
        boolean retorno=true;
        
        Pattern patronSi=Pattern.compile("s[ií]",Pattern.CASE_INSENSITIVE);
        Pattern patronNo=Pattern.compile("(no|-1)",Pattern.CASE_INSENSITIVE);
        
        do{
        System.out.println("Ingresar la nota del estuiante "+(i+1)+":");
        nota=lector.nextDouble();
        lector.nextLine();
        if(nota==-1){
        retorno=false;
        }else if(nota<=20 && nota>=0){
            i++;
            total+=nota;
            if (nota<=11){
                desaprobados++;
            }else{
                aprobados++;
            }
        boolean continuar=true;
        while(continuar==true){
            
                System.out.println("Desea continuar");
                opcion=lector.nextLine();
                Matcher evaluadorSi=patronSi.matcher(opcion);
                Matcher evaluadorNo=patronNo.matcher(opcion);
                
                if(evaluadorSi.matches()){
                    System.out.println("Ha decidido continuar.");
                    continuar=false;
                }else if(evaluadorNo.matches()){
                    System.out.println("Ha decidido no continuar.");
                    continuar=false;
                    retorno=false;
                }else{
                    System.out.println("Ingrese una opcion valida!");
                }
               
                }
        }else{
                System.out.println("Ingrese una nota valida!");
                }
        
    }
       while(retorno==true); 
       promedio=total/i;
       System.out.println("El promedio global es igual a: "+promedio);
       System.out.println("La cantidad de alumnos aprobados es de: "+aprobados);
       System.out.println("La cantidad de alumnos desaprobados es de: "+desaprobados);
    }
    
        
}
    

    
