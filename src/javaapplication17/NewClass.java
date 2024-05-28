
package javaapplication17;

//IMPORTACIONES
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
       
public class NewClass {
    public static void main(String[] args){
        /*Escribir un programa en Java para pida una dirección de correo y una clave de acceso. Mostrar “Acceso
          denegado” mientras el correo no cumpla con el formato correcto (clases Pattern & Matching) o mientras la clave
          ingresada sea diferente de “P@55w0rd” usando el bucle while.
          Si se ingresan las credenciales correctas se mostrará “Bienvenido al sistema” y el programa termina.
          El número máximo de intentos es 5. Si el usuario excede el límite se mostrará “Cuenta suspendida” y el programa
          termina.*/
        Scanner lector=new Scanner(System.in);
        
        //Pattern para correo y contraseña
        Pattern patronCorreo=Pattern.compile("^[\\w+.-]+@[\\w+.-]+\\.\\w{2,6}$");
        Pattern patronContraseña=Pattern.compile("P@55w0rd");
    
        String contraseña, correo;
        int i=0;
        
        //Mientras que i no sea 5 el bucle sera infinito
        while(i!=5){
        System.out.println("Ingrese su correo electronico: ");
        correo=lector.nextLine();
        System.out.println("Ingrese la contraseña: ");
        contraseña=lector.nextLine();
        
        //Matcher para correo y contraseña
        Matcher evaluadorContraseña=patronContraseña.matcher(contraseña);
        Matcher evaluadorCorreo=patronCorreo.matcher(correo);
        if(evaluadorContraseña.matches() && evaluadorCorreo.matches()){
            System.out.println("Bienvenido al sistema!");
            break;
        }else{ 
            System.out.println("Acceso denegado");
            i++;
        }
        if (i==5){
            System.out.println("Cuenta suspendida");
        }
}
}
}