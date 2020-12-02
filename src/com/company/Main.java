package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Katze moritz = new Katze("Moritz", 13, "Bengale");
        System.out.println(moritz);

        File katzen = new File("./katzen.dat");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(katzen));
            oos.writeObject(moritz);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(katzen));
            Object ztirom = ois.readObject();

            System.out.println((Katze)ztirom);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}