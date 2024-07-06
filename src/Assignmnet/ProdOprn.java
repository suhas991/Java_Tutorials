package Assignmnet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProdOprn {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1,"Laptop",85000.0));
        products.add(new Product(3,"Phone",18000.0));
        products.add(new Product(2,"Charger",5000.0));
        products.add(new Product(6,"Mouse",1000.0));
        products.add(new Product(5,"Keyboard", 2500.0));
        products.add(new Product(4,"CPU",185000.0));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        double MaxP = sc.nextDouble();
        double MinP = sc.nextDouble();

        List<Product> productsInRange = products.stream()
                                        .filter(product -> product.getPrice() >= MaxP && product.getPrice() <= MinP)
                                        .toList();
        productsInRange.forEach((item -> System.out.println(item) ));

        System.out.println("\nProducts with increased price by 10%: ");
        List<Product> HikeProd = products.stream()
                                 .map(product -> {
                                     product.setPrice(product.getPrice() + product.getPrice() * 0.1);
                                     return product;
                                 }).collect(Collectors.toList());
        HikeProd.forEach((item -> System.out.println(item) ));

        System.out.println("\nProducts sorted by id:");
        List<Product> sorted = products.stream()
                                .sorted(new Comparator<Product>() {
                                    @Override
                                    public int compare(Product p1, Product p2) {
                                        return Integer.compare(p1.getId(), p2.getId());
                                    }
                                })
                                .collect(Collectors.toList());
        sorted.forEach((item -> System.out.println(item) ));

        System.out.println("\nProduct sorted by name :");
        List<Product> sortName = products.stream()
                                .sorted(new Comparator<Product>() {
                                    @Override
                                    public int compare(Product p1, Product p2) {
                                        return p1.getName().compareTo(p2.getName());
                                    }
                                })
                                .collect(Collectors.toList());
        sortName.forEach((item -> System.out.println(item) ));

        System.out.println("\nProduct sorted by price");
        List<Product> sortPrice = products.stream()
                                    .sorted(new Comparator<Product>() {
                                        @Override
                                        public int compare(Product p1, Product p2) {
                                            return Double.compare(p1.getPrice(), p2.getPrice());
                                        }
                                    })
                                    .collect(Collectors.toList());
        sortPrice.forEach((item -> System.out.println(item) ));





    }
}
