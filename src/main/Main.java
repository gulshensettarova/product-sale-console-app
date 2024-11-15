package main;

import util.MenuUtil;
import util.StoreUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            MenuUtil.printMenu();
            System.out.print("Please select : ");
            int number = scanner.nextInt();

            switch (number){
                case 1 -> MenuUtil.addProduct();
                case 2 -> MenuUtil.removeProduct();
                case 3 -> MenuUtil.searchAndPrintProduct();
                case 4 -> MenuUtil.printAllProducts();
                case 5 -> System.exit(0);
            }
        }


    }
}