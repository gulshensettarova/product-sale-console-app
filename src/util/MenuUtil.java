package util;

import main.Product;

import java.util.Scanner;

public class MenuUtil {
    public static void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name : ");
        String name = scanner.next();
        System.out.println("price : ");
        double price = scanner.nextDouble();
        System.out.println("quantity : ");
        long quantity = scanner.nextLong();
        System.out.println("code : ");
        String code = scanner.next();
        System.out.println("createDate : ");
        String createDate = scanner.next();

        Product product = new Product();
        product.name = name;
        product.price = price;
        product.code = code;
        product.createDate = createDate;
        product.quantity = quantity;

        StoreUtil.addProduct(product);
    }


    public static void searchAndPrintProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the product code : ");
        String code = scanner.next();
        Product product = StoreUtil.searchProduct(code);
        String message = product == null ? "Element tapilmadi" : "product = " +product.name;
        System.out.println(message);
    }

    public static void printMenu(){
        String menu = "1. add new product \n" +
                "2. remove product \n" +
                "3. search any product \n" +
                "4. Print all products \n" +
                "5. Exit program \n";

        System.out.println(menu);
    }

    public static void printAllProducts(){
        StoreUtil.printProducts();
    }

    public static void removeProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the product code : ");
        String code = scanner.next();
        StoreUtil.removeProduct(code);
    }
}
