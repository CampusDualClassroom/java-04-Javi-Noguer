package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5, 1, 0));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20, 2,0));
        System.out.println("Obtén el factorial del número 7 → (7!): " + sumFactorial(7));
    }


    public static int sumNum(int limite, int incremento, int inicio){
        int suma = 0;
        int numero;
        for (numero = inicio; numero <= limite; numero += incremento) {
           suma += numero;
        }
        return suma;
    }
    public static int sumEvenNum(int limite1, int incremento1, int inicio1) {
        int suma1 = 0;
        int numero1;
        for (numero1 = inicio1; numero1 <= 2*limite1; numero1 += incremento1) {
            suma1 += numero1;
        }
        return suma1;
    }
    public static int sumFactorial(int num) {
        int producto = 1;
        for (int i = 1; i < num+1; i++) {
            producto = producto * i;
        }
        return producto;
    }
    public static void recursiveFactorial(int num) {
        public static int factorial (int num) {
            if (num == 0) {
                return 1;
            } else
                return num * factorial(num - 1);
        }
    }
}
