import java.util.Scanner;

public class Suma2Numeros {
    public static void main(String[] args){
        Scanner readln = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = readln.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2 = readln.nextInt();
        int num3 = num1 + num2;
        System.out.println ("La suma de ambos numeros enteros es " + num3);
    }
}