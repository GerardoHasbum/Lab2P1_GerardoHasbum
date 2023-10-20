/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_gerardohasbum;
import java.util.Scanner;
/**
 *
 * @author ghasb
 */
public class Lab2P1_GerardoHasbum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jhin = new Scanner(System.in);
        int opcion=1;
        while(opcion>0 && opcion<4){
            
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir de programa");
            System.out.print("Ingrese la opcion a la que desea ingresar: ");
            opcion = jhin.nextInt();
            
            //opcion 1
            if (opcion==1){
                
                System.out.println("Dibujando Triangulos - Ejercicio 1");
                System.out.print("Ingrese lado 1: ");
                int lado1 = jhin.nextInt();
                System.out.print("Ingrese lado 2: ");
                int lado2 = jhin.nextInt();
                System.out.print("Ingrese lado 3: ");
                int lado3 = jhin.nextInt();
                if(lado1<1 || lado2<1 || lado3<1){
                    System.out.println("No pueden ser negativos");
                }
                else{
                    if(lado1<lado3 && lado2<lado3){
                        int form_tri = lado1+lado2;
                        if (form_tri > lado3){
                            System.out.println("Si forman un triangulo");
                        }
                        else {
                            System.out.println("No Forman un triangulo");
                        }
                        
                    }
                    else{
                        if(lado1<lado2 && lado3<lado2){
                            int form_tri = lado1+lado3;
                            if (form_tri > lado2){
                                System.out.println("Si forman un triangulo");
                            }
                            else {
                                System.out.println("No Forman un triangulo");
                            }
                        }
                        else {
                            if(lado2<lado1 && lado3<lado1){
                                int form_tri = lado3+lado2;
                                if (form_tri > lado1){
                                    System.out.println("Si forman un triangulo");
                                }
                                else {
                                    System.out.println("No Forman un triangulo");
                                }
                            }
                        }
                    }
                }
            }
            //fin opcion 1
            //opcion 2
            if (opcion==2) {
                char resp = 's';
                int base, alt, radio, opcion2;
                System.out.println("Area de figuras");
                while(resp=='s' || resp=='S'){
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Circulo");
                    System.out.print("Ingrese la figura que desea calcular el area de: ");
                    opcion2 = jhin.nextInt();
                    if(opcion2==1){
                        System.out.println("Ingrese la base: ");
                        base = jhin.nextInt();
                        System.out.println("Ingrese la altura: ");
                        alt = jhin.nextInt();
                        if(base>0 && alt>0){
                            double form_a_tri = (base*alt)/2;
                            System.out.println("El area seria: "+ form_a_tri+ "u^2");
                        }
                        else{
                            System.out.println("Los valores no pueden ser negativos");
                        }
                    }
                    else{
                        if(opcion2==2){
                            System.out.println("Ingrese la base: ");
                            base = jhin.nextInt();
                            System.out.println("Ingrese la altura: ");
                            alt = jhin.nextInt();
                            if(base>0 && alt>0){
                                double form_a_rec = base*alt;
                                System.out.println("El area seria: "+ form_a_rec+ "u^2");
                            }
                            else{
                                System.out.println("Los valores no pueden ser negativos");
                            }
                        }
                        else{
                            if(opcion2==3){
                                System.out.println("Ingrese el radio: ");
                                radio = (int) jhin.nextDouble();
                                if(radio>0){
                                    double form_a_cir = Math.PI*Math.pow(radio, 2);
                                    System.out.println("El area seria: "+ form_a_cir+ "u^2");
                                }
                                else{
                                    System.out.println("Los valores no pueden ser negativos");  
                                }
                            }
                        }
                    }
                    System.out.println("Desea ingresar otro valor? [s/n]: ");
                    resp = jhin.next().charAt(0);
                }
            }//fin de opcion 2
            //opcion 3
            if(opcion==3){
                boolean par, primo;
                System.out.println("Ingrese un numero: ");
                int num = jhin.nextInt();
                int cont_divisor=0,cont_veri=1;
                while(cont_veri <= num){
                    if (num%cont_veri==0){
                        cont_divisor++;
                    }
                    cont_veri++;
                }                
                if(cont_divisor>2){
                    primo = false;
                }
                else{
                    primo = true;
                }
                if(num%2==0){
                    par=true;
                }
                else{
                    par=false;
                }
                if(par && primo){
                    System.out.println("El numero ingresado es par y primo");
                }
                else{
                    if(par && primo==false){
                        System.out.println("El numero ingresado es par");
                    }
                    else{
                        if(par==false && primo){
                            System.out.println("El numero ingresado es impar y primo");
                        }
                        else{
                            if(par==false && primo==false){
                                System.out.println("el numero ingresado es impar");
                            }
                        }
                    }
                }
            }//fin de opcion 3
        }
    }
    
}
