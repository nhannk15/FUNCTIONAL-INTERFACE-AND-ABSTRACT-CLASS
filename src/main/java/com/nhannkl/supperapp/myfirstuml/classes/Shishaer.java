package com.nhannkl.supperapp.myfirstuml.classes;

import com.nhannkl.supperapp.myfirstuml.classes.interfaces.SmokeAble;

public class Shishaer extends Person implements SmokeAble {
    private int numberOfDryChicken;

    public Shishaer(String id, String name, 
            int age, int numberOfDryChicken) {
        super(id, name, age);
        this.numberOfDryChicken = numberOfDryChicken;
    }
    
    //--- Overriding the Parent class's methods.
    @Override
    public void doSleep(int hours) {
        System.out.println("I slept walking " + hours + " hours ago.");
    }

    @Override
    public void doTalk(String message) {
        System.out.println(this.getName() + " (Shishaer) say: " + message);
    }
    
    //--- Creating the class's own methods.
    public void sellChicken() {
        System.out.println("Come and buy " + this.numberOfDryChicken + " dry chickens!");
    }
    
    public void callVu() {
        System.out.println("Alo Vu a Vu!");
    }
    
    //--- The class's own Getters & Setters.
    public int getNumberOfDryChicken() {
        return numberOfDryChicken;
    }

    public void setNumberOfDryChicken(int numberOfDryChicken) {
        this.numberOfDryChicken = numberOfDryChicken;
    }
    
    //--- Implementing the Functional Interface's methods.
    @Override
    public void smoke(Cigarette cigarette) {
        System.out.println("Smoking " + cigarette.getName() + " is so great!");
    }

    @Override
    public void deepTalk(int hours) {
        System.out.println("I've got something to tell you in " + hours + " hours!");
    }
}












