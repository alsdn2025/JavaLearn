package IO.ScannerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);

        System.out.print("정수 입력 : ");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);


        System.out.print("실수 입력 : ");
        double inputD = scanner.nextDouble();
        System.out.println(inputD);

    }
}
