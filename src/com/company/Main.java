package com.company;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        float prix = 10;
        float remise = 50;
        float remise2 = 30;
        prix_remise(prix, remise, remise2);

    }

    public static void prix_remise(float prix, float remise, float remise2) {
        float remise_1 = (int) Math.floor(prix * (1 - remise / 100.f));
        System.out.println("remise 1 = " + remise_1);
        float remise_2 = (int) Math.floor(remise_1 * (1 - remise2 / 100.f));
        System.out.println("remise 2 = " + remise_2);
    }
}



