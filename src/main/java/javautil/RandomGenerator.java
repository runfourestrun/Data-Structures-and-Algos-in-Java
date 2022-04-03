package javautil;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomGenerator {

    public static void main(String[] args){

    }




    public static void blindtest(){
        int[] data = new int[10];

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        for(int i = 0; i < data.length; i++){
            data[i] = rand.nextInt();
            System.out.println("Array looks like this:" + Arrays.toString(data));
        }

    }




    public static void ArrayTest(){
        int data [] = new int[10];
        java.util.Random rand = new java.util.Random();
        rand.setSeed(System.currentTimeMillis());

        for(int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt();

        }

        int  datacopy[] = Arrays.copyOf(data,data.length);
        System.out.println("arrays equal before sort: " + Arrays.equals(data,datacopy));
        System.out.println("orig = " + Arrays.toString(data));
        System.out.println("copy of data" + Arrays.toString(datacopy));


    }
}
