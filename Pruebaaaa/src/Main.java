//1) Dentro de una coleccion ingresar 10 numeros enteros e imprimir el mayor y el menor

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa 10 números enteros:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }

        int mayor = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

        scanner.close();
    }
}