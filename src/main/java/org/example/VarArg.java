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

    public static void repeatString( String text ,int... number){
        for (int num : number) {
            for (int i = 0; i < num; i++) {
                System.out.println(text);
            }
        }
    }
}
