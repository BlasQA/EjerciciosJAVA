import java.util.Scanner;

public class SumaNumDivisibles {
    public static void main(String[] ars){
        Scanner readln = new Scanner (System.in);
        System.out.println ("Ingrese el primer numero");
        int num1 = readln.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = readln.nextInt();
        int num3 = num1 + num2;
        if (num1 % num2 == 0) {
            System.out.println ("La suma de los numeros es " + num3 + " y " + num1 + " es divisible por " + num2);
        }
        else {
            System.out.println ("La suma de los numeros es " + num3 + " y " + num1 + " NO es divisible por " + num2);
        } 
    }
}