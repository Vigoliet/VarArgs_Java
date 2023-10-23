package org.example;

public class VarArg {

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void averageNumbers(int... numbers){
        double sum = 0;
        for (int num : numbers){
            sum = sum + num;
        }
        double average = sum/ numbers.length;
        System.out.println(average);
    }

}
