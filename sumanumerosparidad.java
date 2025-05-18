import java.util.Scanner;

public class sumanumerosparidad {
    public static void main(String[] args){
        Scanner readln = new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = readln.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2 = readln.nextInt();
        int num3 = num1 + num2;
        if (num3%2 == 0){
            System.out.println("La suma de ambos numeros es " + num3 + " y es par");
            }
        else {
        System.out.println("La suma de ambos numeros es " + num3 + " y es impar");
        }
    }
}