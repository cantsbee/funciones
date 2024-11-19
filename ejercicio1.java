import java.util.Scanner;

public class MenuConFunciones {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println(); // Salto de línea para mejor formato
        } while (opcion != 0);

        scanner.close();
    }

    // Función para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Mostrar un mensaje de bienvenida");
        System.out.println("2. Calcular la suma de dos números");
        System.out.println("3. Mostrar los números del 1 al 10");
        System.out.println("0. Salir");
        System.out.println("==========================");
    }

    // Función para la opción 1
    public static void opcion1() {
        System.out.println("¡Bienvenido al programa de menú interactivo!");
    }

    // Función para la opción 2
    public static void opcion2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }

    // Función para la opción 3
    public static void opcion3() {
        System.out.println("Números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea al final
    }
}

contar vocales
import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        int cantidadVocales = contarVocales(texto);
        System.out.println("La cadena tiene " + cantidadVocales + " vocales.");
    }

    // Función para contar vocales
    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}

el mayor de 3 números

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.println("El mayor de los tres números es: " + mayor(num1, num2, num3));
    }

    // Función para encontrar el mayor de tres números
    public static int mayor(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

encontrar un número primo 
    
    import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
