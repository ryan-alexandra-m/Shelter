package com.company;
import java.util.HashMap;
import java.util.Map;

import java.util.Map;

public class Animal {
    String breed;
    String name;
    Map<String, String> identity= new HashMap<>();

    public Animal(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Map<String, String> identify(){
        identity.put(name, breed);
        return identity;
    }

    public void getBreed(){
        System.out.println(identity.get(name));
    }

    public void adopt(){
        System.out.println(name+ " has been adopted");
        identity.remove(name);
    }

}
