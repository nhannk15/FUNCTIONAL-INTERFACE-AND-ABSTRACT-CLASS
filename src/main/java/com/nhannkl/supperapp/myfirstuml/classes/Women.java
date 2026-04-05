package com.nhannkl.supperapp.myfirstuml.classes;

import com.nhannkl.supperapp.myfirstuml.classes.interfaces.WomenAble;

public class Women extends Person implements WomenAble {

    public Women() {
    }

    public Women(String id, String name, int age) {
        super(id, name, age);
    }
    //--- Overriding the Parent class's methods.
    @Override
    public void doSleep(int hours) {
        System.out.println(this.getName() + " (Woman) say: I haven't slept for " + hours + " hours");
    }

    @Override
    public void doTalk(String message) {
        System.out.println("OK I, a woman, admit that: " + message);
    }
    
    //--- Implementing the Functional Interface's methods.
    @Override
    public void doSnake() {
        System.out.println("OK fine, I get it, I don't care!");
    }

    @Override
    public void doBite() {
        System.out.println("Shhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
    }
}


















