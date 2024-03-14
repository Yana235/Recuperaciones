package org.example;


import java.util.Set;

public class Pet {
    private String name;
    private String owner;
    private int age;
    private boolean alive;

    private Set<Color> colores;

    public Pet(String name, String owner, int age, boolean alive, Set<Color> colores) {
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.alive = alive;
        this.colores = colores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Set<Color> getColores() {
        return colores;
    }

    public void setColores(Set<Color> colores) {
        this.colores = colores;
    }

    public enum Color{
        BLACK,
        WHITE,
        ORANGE,RED,
        BROWN;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                ", colores=" + colores +
                '}';
    }
}
