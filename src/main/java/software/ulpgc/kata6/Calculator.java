package software.ulpgc.kata6;

public class Calculator {
    public static boolean isPrime(int number){
        if (number <=1){return false;}
        for (int i=2;i<number;i++){
            if (number % i == 0) {return false;}
        }
        return true;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static int factorial(int number){
        if (number == 0 || number == 1){ return 1;}
        return number * factorial(number-1);
    }

    public static int[] fibonacciUntil(int number){
        int[] result = new int[number];
        for (int i=0;i<number;i++){
            if (i==0){result[i]=0;continue;}
            if (i==1){result[i]=1;continue;}
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }
}
