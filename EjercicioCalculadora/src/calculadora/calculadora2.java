/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class calculadora2 {
    
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String []args){
        
        menuCalc();
   
    }
    
    public static void menuCalc(){
        
        double num1, num2, operacion;
        int isOn;
        System.out.println("Oprima 1 para encesde la calculadora: ");
        isOn = sc.nextInt();
        while(isOn!=0){
        
        System.out.println("-----------------------------");
        System.out.println("Calculadora Personal");
        System.out.println("-----------------------------");
        System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Módulo\n6.Salir");        
        System.out.println("-----------------------------");
        
            System.out.println("Ingrese una opción");
            int opc= sc.nextInt();
            
            System.out.println("Ingrese numero 1");
            num1 = sc.nextDouble();
            
            System.out.println("Ingrese numero 2");
            num2 = sc.nextDouble();
                  
            
        switch(opc){
            case 1:

                sumar(num1, num2);
                
                
                break;
            case 2:
            
                restar(num1, num2);
                
                break;
            case 3:

                multiplicar(num1, num2);
                
                break;
            case 4:
                
                dividir(num1, num2);
                
                break;
            case 5:
                
                modulo(num1, num2);
                
                break;
            case 6:
                System.out.println("6.salir");
                isOn= 0;
                break;
            default:
                System.out.println("Ingrese una opción valida");
            
        }
        
        
        }
       
    }
    
    public static double capturarDatos(String cadena){
        
        System.out.println(cadena);
                double num= sc.nextDouble();
               /* System.out.println("Ingrese el numero 2: ");
                double num2= sc.nextDouble();*/
                return num;           
    }
    
    
    
    public static void sumar(double num1, double num2){
        
        double suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        
    }
    
    public static void restar( double num1, double num2){
        
        double resta = num1- num2;
        
        System.out.println("El resultado de la resta es: " + resta);
    
    }
    
    public static void multiplicar( double num1, double num2){
        
        double multi = num1 * num2;
        
        System.out.println("El resultado de la multiplicacion es: " + multi);
    
    }
    
    public static void dividir ( double num1, double num2){
        
        double div = num1 / num2;
        
        System.out.println("El resultado de la division es: " + div);
    
    }
    
     public static void modulo ( double num1, double num2){
        
        double mod = num1 % num2;
        
        System.out.println("El resultado del modulo es: " + mod);
    
    }
     
     
     
    
    
}
