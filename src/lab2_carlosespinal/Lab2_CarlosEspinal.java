package lab2_carlosespinal;

import java.util.Scanner;

public class Lab2_CarlosEspinal {

    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
    
    
    int opcion;
    do {
        
    
   
    System.out.println("---Menu---");
    System.out.println("Eliga una opcion");
    System.out.println(" ");
    System.out.println("Opcion #1 -> Maximo Comun Divisor");
    System.out.println("Opcion #2 -> Sumatoria");
    System.out.println("Opcion #3 -> Programa de Supermercado");
    System.out.println("Opcion #4 -> SALIDA");
    System.out.println(" ");
    System.out.print("Ingrese la opcion con la que desea trabajar: ");
    
    opcion = read.nextInt();
    
    if (opcion > 5 || opcion < 1) {
        System.out.println("Opcion ingresada no es valida");
        System.out.println("Favor escribir una opcion valida");
    }// fin validacion
    
    else if (opcion == 1) {
        int nume1, nume2;
        System.out.println("Ingrese el primer numero: ");
        nume1 = read.nextInt();
        System.out.println("Escriba el segundo numero: ");
        nume2 = read.nextInt();
        
        if (nume1 < 0 || nume2 < 0) {
            System.out.println("Numeros negativos detectados");
            System.out.println("Favor ingresar valores validos");
        }// fin validacion opcion 1
        
        int x = Math.min (nume1,nume2);
        int y = Math.max (nume1,nume2);
        
        int result;
        
        do {
            result = y;
            y = x%y;
            x = result;
            
        } while (y!=0);
        
        System.out.println("El MCD de "+ nume1 + " y "+ nume2 + " es: "+ result);
         
    }//fin opcion 1
    
    else if (opcion == 2) {
        int i = 1;
        double acu = 0;
        double x = 0;
        double n = 1;
        System.out.print("Ingrese el limite de la sumatoria: ");
        int limite = read.nextInt();
        
        while (n <= limite) {
            x = n/(n+1);
            acu += (double) Math.pow(x,n);            
            
            n++;
        }// fin while opcion 2
        
        System.out.println("El resultado es:"+ acu);
        
    }// fin opcion 2
    else if (opcion == 3) {
        int tipo,cantidad;
        double precio,subtotal,total;
        double descuento = 0;
        
        
        System.out.println("Ingrese el tipo de cliente: ");
        tipo = read.nextInt();
        System.out.println("Ingrese el precio de la unidad: ");
        precio = read.nextDouble();
        System.out.println("Ingrese la cantidad de productos:");
        cantidad = read.nextInt();
        
        subtotal = precio*cantidad;
        
        if (tipo > 2 || tipo < 0 ) {
            System.out.println("Favor ingresar un tipo valido de cliente" );
        }// fin if 1 opcion 3
        
        
        else if (tipo == 0) {
            if (cantidad > 10 && cantidad < 19) {
                cantidad = cantidad - 2;
            }//fin if cantidad 10 19
            else if (cantidad > 20) {
                cantidad = cantidad - 5;
            }//fin if cantidad 20
            
            descuento = subtotal*0;
            
        }//fin if 2 opcion 3
        
        
        else if (tipo == 1) {
            if (cantidad > 20 && cantidad < 29) {
                cantidad = cantidad - 2;
            }
            else if (cantidad > 30) {
                cantidad = cantidad - 5;
            }
                
            descuento = subtotal*0.10;
            
        }// fin if 2 opcion 3
        
        
        else if (tipo == 2) {
            if (cantidad > 30 && cantidad < 39) {
                cantidad = cantidad - 2;
            }
            else if (cantidad > 40) {
                cantidad = cantidad - 5;
            } 
            
            descuento = subtotal*0.30;
            
        }// fin if 3 opcion 3
        
        total = (precio * cantidad) - descuento;
        System.out.println("El total a pagar es: "+total);
        
    }// fin opcion 3
    } while (opcion!=4);       
    
    }
    
}
