package com.nhannkl.supperapp.myfirstuml.classes;

import com.nhannkl.supperapp.myfirstuml.classes.interfaces.DrinkAble;
import com.nhannkl.supperapp.myfirstuml.classes.interfaces.SmokeAble;

public class Smoker extends Person implements DrinkAble, SmokeAble{
    private int numberOfCigarettes;

    public Smoker(String id, String name, 
            int age, int numberOfCigarettes) {
        super(id, name, age);
        this.numberOfCigarettes = numberOfCigarettes;
    }
    
    //--- Overriding the Parent class's methods.
    @Override
    public void doSleep(int hours) {
        System.out.println("I slept " + hours + " hours ago.");
    }

    @Override
    public void doTalk(String message) {
        System.out.println(this.getName() + " (Smoker) say: " + message);
    }
    
    //--- The class's own Getters & Setters.
    public int getNumberOfCigarettes() {
        return numberOfCigarettes;
    }

    public void setNumberOfCigarettes(int numberOfCigarettes) {
        this.numberOfCigarettes = numberOfCigarettes;
    }
    
    //--- Implementing the Functional Interface's methods.
    @Override
    public int buyBeers() {
        return 6;
    }

    @Override
    public void kanpai() {
        System.out.println("Cheers, long time no see.");
    }

    @Override
    public void smoke(Cigarette cigarette) {
        System.out.println("Smoking " + cigarette.getName() + " is so great!");
    }

    @Override
    public void deepTalk(int hours) {
        System.out.println("I've got something to tell you in " + hours + " hours!");
    }
    
}



