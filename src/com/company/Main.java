package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean exit = true;
        int waterValue = 400;
        int milkValue = 540;
        int beansValue = 120;
        int cupsValue = 9;
        int moneyValue = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (exit){

            Scanner scannerOption = new Scanner(System.in);
            String option = scannerOption.next();
            switch (option){
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String option1 = scannerOption.next();
                    if(option1.equals("1")) {
                        if (waterValue >= 250 && beansValue >= 16) {
                            System.out.println("I have enough resources, making you a coffee! \n");
                            waterValue -= 250;
                            beansValue -= 16;
                            moneyValue += 4;
                            cupsValue -= 1;
                            System.out.println("Write action (buy, fill, take, remaining, exit):");}
                        else if (waterValue < 250 && beansValue < 16) {
                            System.out.println("Sorry, not enough water and coffee beans!\n");
                            System.out.println("Write action (buy, fill, take, remaining, exit):");
                        }
                        else if (waterValue < 250) {
                            System.out.println("Sorry, not enough water!\n");
                            System.out.println("Write action (buy, fill, take, remaining, exit):");
                        }
                        else if (beansValue < 16) {
                            System.out.println("Sorry, not enough water!\n");
                            System.out.println("Write action (buy, fill, take, remaining, exit):");
                        }
                    }
                    else if(option1.equalsIgnoreCase("2")) {
                        if (waterValue >= 350 && milkValue >= 75 && beansValue >= 20){
                            System.out.println("I have enough resources, making you a coffee! \n");
                            waterValue -= 350;
                            milkValue -= 75;
                            beansValue -= 20;
                            moneyValue += 7;
                            cupsValue -= 1;
                            System.out.println("Write action (buy, fill, take, remaining, exit):");}
                        else System.out.println("Sorry, not enough ingredients");
                    }
                    else if(option1.equalsIgnoreCase("3")) {
                        if (waterValue >= 200 && milkValue >= 100 && beansValue >= 12){
                            System.out.println("I have enough resources, making you a coffee! \n");
                            waterValue -= 200;
                            milkValue -= 100;
                            beansValue -= 12;
                            moneyValue += 6;
                            cupsValue -= 1;
                            System.out.println("Write action (buy, fill, take, remaining, exit):");}
                        else System.out.println("Sorry, not enough ingredients");

                    }
                    else{
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        break;
                    }
                    break;

                case "exit":
                    exit = false;
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    Scanner fill = new Scanner(System.in);
                    waterValue += fill.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milkValue += fill.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beansValue += fill.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cupsValue += fill.nextInt();
                    System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
                    break;
                case "remaining":
                    System.out.println("");
                    System.out.println("The coffee machine has:");
                    System.out.println(waterValue + " ml of water");
                    System.out.println(milkValue + " ml of milk");
                    System.out.println(beansValue + " g of coffee beans");
                    System.out.println(cupsValue + " disposable cups");
                    System.out.println("$" + moneyValue + " of money \n");
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    break;
                case "take":
                    System.out.println("I gave you $" + moneyValue + "\n");
                    moneyValue = 0;
                    break;




            }
        }

    }
}
