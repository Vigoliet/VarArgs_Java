package org.example;

public class VarArg {

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
