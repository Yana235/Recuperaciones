package org.example;

import org.example.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Pet> animales=new ArrayList<>();
        animales.add(new Pet("a1","o1",12,true, Set.of(Pet.Color.BLACK)));
        animales.add(new Pet("a2","o1",12,true, Set.of(Pet.Color.BLACK)));
        animales.add(new Pet("a3","o1",12,true, Set.of(Pet.Color.BLACK)));
        animales.add(new Pet("a4","o1",12,true, Set.of(Pet.Color.BLACK)));
        animales.add(new Pet("a5","o1",12,true, Set.of(Pet.Color.BLACK)));
        System.out.println(animales);
    }
}