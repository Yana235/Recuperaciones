package org.example;

import java.util.Set;

public interface IPetRepository {

    void add(Pet pet);
    Pet get(Pet pet);
    Pet remove(int index);
    Set<Pet> getAll();
}
