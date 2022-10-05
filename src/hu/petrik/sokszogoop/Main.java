package hu.petrik.sokszogoop;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            double rndA = Math.random() * 15 + 5;
            double rndB = Math.random() * 15 + 5;
            Teglalap t = new Teglalap(rndA, rndB);
            System.out.println(t);
        }
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            Paralelogramma p = new Paralelogramma();
            System.out.println(p);
        }
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            Hatszog h = new Hatszog();
            System.out.println(h);
        }
        System.out.println("-------------------------------------------------------");
        Sokszogek sokszogek = new Sokszogek();
        System.out.println(sokszogek);
    }
}
