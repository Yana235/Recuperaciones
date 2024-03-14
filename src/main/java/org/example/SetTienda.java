package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTienda implements IPetRepository {
    private Set<Pet> animales=new HashSet<>();

    public void add(Pet pet){
        animales.add(pet);
    }

    public Pet get(Pet pet){
        return pet;
    }

    public Pet remove(int index){
        Pet pets;
        List<Pet> pet=new ArrayList<>(animales);

     pets=pet.get(index);
        pet.remove(index);
   //     animales.remove(index);
        for(Pet anima:animales){
            System.out.println("Animales:");
           if(animales.equals(pets)){
               System.out.println(anima);
           }
        }
        return pets;

    }
    public Set<Pet> getAll(){
        for(Pet anima:animales){
            System.out.println(anima);
        }
        return animales;
    }
}
