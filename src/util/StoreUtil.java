package util;

import main.Product;
import main.Store;

public class StoreUtil {
    public static void printProducts(){
        System.out.println("-----------------");
        for (int i = 0; i< Store.productsCount; i++){
            Product product = Store.products[i];
            System.out.println(i+1+"-ci product : " + product.name);
        }
        System.out.println("-----------------");
    }

    public static void addProduct(Product product){
        int percentage = (Store.productsCount/ Store.products.length)*100;
        if (percentage >= 80) {
            Product[] product1 = new Product[Store.products.length*2];
            for (int i = 0; i < Store.productsCount; i++) {
                product1[i] = Store.products[i];
            }
            Store.products = product1;
        }
        Store.products[Store.productsCount] = product;
        Store.productsCount++; // 2
    }

    public static Product searchProduct(String code){
        for (int i = 0; i< Store.productsCount; i++){
            Product product = Store.products[i];
            if(product.code.equals(code)){
                return product;
            }
        }
        return null;
    }

    public static void removeProduct(String code){
        boolean flag = false;
        for (int i=0; i<Store.productsCount; i++){
            Product product = Store.products[i];
                if(product.code.equals(code)){
                    Store.products[i] = null;
                    flag = true;
                }
        }

        if(flag){
            System.out.println("Product successfully deleted : "+code);
        }else{
            System.out.println("Product not found");
        }
    }
}
