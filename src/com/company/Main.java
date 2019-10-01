package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int randomAge = generateRandomAge(0,107);
        System.out.println(randomAge);
    }

    public static int generateRandomAge (int min, int max){

        return new Random().nextInt((max - min) + 1) + min;
    }
}
