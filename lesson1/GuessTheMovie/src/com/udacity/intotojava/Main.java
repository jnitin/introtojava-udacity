package com.udacity.intotojava;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int randomNo = (int)Math.abs(Math.random() * 100 + 1);
        System.out.println("Lets guess number b/w 1 - 100: ");
        for(int i = 0;i<10;i++){
            Scanner scanner = new Scanner(System.in);
            int numberEntered = scanner.nextInt();
            if(numberEntered > randomNo){
                System.out.println("Entered number is greater  ");
            }else if (numberEntered < randomNo){
                System.out.println("Entered number is smaller  ");
            }else {
                System.out.println(" You Won!");
                break;
            }
            System.out.println("Chance Taken : "+(i+1));
        }



    }
}
