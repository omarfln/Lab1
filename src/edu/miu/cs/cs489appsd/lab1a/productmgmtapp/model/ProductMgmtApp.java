package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;
import java.util.Arrays;
import java.util.Comparator;

public class ProductMgmtApp {

    public static void main(String[] args) {
        Product[] products = {
                new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55),
                new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09),
                new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99)
        };

        printProducts(products);
    }

    private static void printProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getName));

        System.out.println("Printed in JSON Format:");
        System.out.print("[");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i].toJson());
            if (i < products.length - 1) System.out.print(", ");
        }
        System.out.println("\n]");

        System.out.println("=================================");

        System.out.println("Printed in XML Format:");
        System.out.println("<products>");
        for (Product p : products) {
            System.out.println("    " + p.toXml());
        }
        System.out.println("</products>");

        System.out.println("=================================");

        System.out.println("Printed in Comma-Separated Value(CSV) Format:");
        for (Product p : products) {
            System.out.println(p.toCsv());
        }
    }
}
