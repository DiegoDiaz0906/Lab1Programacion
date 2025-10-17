/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalaboratorio;
import java.util.Scanner ;

public class JavaLaboratorio { 

    
    public static void main(String[] args) 
    {
    
    Scanner leer = new Scanner(System.in);
    System.out.println("Hello World ");
    
    int opcion = 0;
        
    while(opcion !=2){    
    System.out.println("menu de ejercicios");
    System.out.println("1. Division Modificada");
    System.out.println("2. Secuencia");
    System.out.println("3. Salir");
    System.out.println("ingerese una opcion :");
    opcion = leer.nextInt();
    
    if (opcion==1) {
        System.out.println("Ingrese Dividiendo");
        int dividiendo = leer.nextInt();
        
        System.out.println("Ingrese Divisor");
        int divisor = leer.nextInt ();
        
        int cociente = 0;
        int residuo=dividiendo;
        
        while(residuo>=divisor){
            residuo = residuo - divisor;
            cociente = cociente +1;
        }
        
        if (residuo==0){
            System.out.println("El resultado de la division es " + cociente);
        }else{
            System.out.println("El resultado de la division es " + cociente + "con" + residuo);
        }
    }
        
    if (opcion == 2) {
        System.out.println("ingrese cantidad de numeros:");
        int n = leer.nextInt ();
        int a=0;
        int b=1;
        int c= 0;
        int contador = 0;
        if (contador == 0) {
            while (contador<n+2) {
                if (contador==0) {
                    System.out.println("0");
                }
                    
                if(contador ==1) {
                    System.out.println("1");
                }
                if(contador>1){
                    c=a+b+1;
                    System.out.println(c);
                    a=b;
                    b=c;
                    c=0;
                }
                contador= contador+1;
                
                            
                }
            }
        }
    }   
     if (opcion==3) {
        System.out.println("Salir de Programa") ;
     }
    }
  

    }