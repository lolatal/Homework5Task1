package edu.tms.loginform;

import java.util.Scanner;

public class InputData {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        String inputData = scanner.nextLine();
        if(inputData.isBlank()){
            System.out.println("Вы ввели пустую строку, попробуйте еще раз");
            getString();
        }
        return inputData;
    }
    public static String getString(String message) {
        System.out.println(message);
        return getString();
    }
}
