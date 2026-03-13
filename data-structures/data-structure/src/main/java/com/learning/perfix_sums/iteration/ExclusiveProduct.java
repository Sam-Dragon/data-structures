package com.learning.perfix_sums.iteration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExclusiveProduct {
    public static void main(String[] args) {

        System.out.println("Input Array");
        int[] array = {1, 3, 2, 1};
//        int[] array = {0, 1, 0};
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Exclusive Products");
        List<Integer> exclusiveProducts = getExclusiveProducts(array);
        System.out.println(exclusiveProducts);

        exclusiveProducts = getExclusiveProductsUsingPrefixPostfix(array);
        System.out.println(exclusiveProducts);
    }

    private static List<Integer> getExclusiveProducts(int[] array) {
        // Prepare all sums and put in array
        List<Integer> products = new LinkedList<>();

        int index = 0;
        while (index < array.length) {
            int product = 1;
            for (int i = 0; i < array.length; i++) {
                if (index != i)
                    product *= array[i];
            }
            products.add(product);
            index++;
        }

        return products;
    }

    private static List<Integer> getExclusiveProductsUsingPrefixPostfix(int[] array) {
        // Prepare all sums and put in array
        List<Integer> prefixProducts = new ArrayList<>();
        List<Integer> postfixProducts = new ArrayList<>(array.length);

        int prod = 1, reverseProd = 1;
        for (int j : array) {
            prod *= j;
            prefixProducts.add(prod);
        }

        for (int k = 0; k < array.length; k++) {
            reverseProd *= array[array.length - 1 - k];
            postfixProducts.set(array.length - 1 - k, reverseProd);
        }

        System.out.println(prefixProducts);
        System.out.println(postfixProducts);


        List<Integer> products = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            int prefixProd = prefixProducts.get(i);
            int postfixProd = postfixProducts.get(i);

            if (prefixProd == 0)
                products.add(postfixProd);
            else if (postfixProd == 0)
                products.add(prefixProd);
            else {
                if (prefixProd > postfixProd)
                    products.add(prefixProd / postfixProd);
                else
                    products.add(postfixProd / prefixProd);
            }

        }

        return products;
    }
}
