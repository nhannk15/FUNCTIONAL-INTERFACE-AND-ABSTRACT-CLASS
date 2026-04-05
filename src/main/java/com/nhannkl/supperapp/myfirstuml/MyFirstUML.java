/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nhannkl.supperapp.myfirstuml;

import com.nhannkl.supperapp.myfirstuml.classes.Camel;
import com.nhannkl.supperapp.myfirstuml.classes.Cigarette;
import com.nhannkl.supperapp.myfirstuml.classes.Person;
import com.nhannkl.supperapp.myfirstuml.classes.Shishaer;
import com.nhannkl.supperapp.myfirstuml.classes.Smoker;
import com.nhannkl.supperapp.myfirstuml.classes.ThangLong;
import com.nhannkl.supperapp.myfirstuml.classes.Women;

/**
 *
 * @author nhann
 */
public class MyFirstUML {

    public static void main(String[] args) {
        Cigarette camel = new Camel("Camel", 100);
        Cigarette thangLong = new ThangLong("ThangLong", 300);
        Cigarette esse = new Camel("Esse", 200);
        
        Shishaer mixiGaming = new Shishaer("1", "Phung Thanh Do", 36, 300);
        Smoker khacNhan = new Smoker("2", "Nguyen Khac Le Nhan", 20, 20);
        Smoker thienBao = new Smoker("3", "Dang Nhat Thien Bao", 19, 10);
        
        Women thanhNha = new Women("4", "Nguyen Thi Thanh Nha", 19);
        
        System.out.println("========== Smoker Test =========");
        khacNhan.doSleep(10);
        khacNhan.doTalk("Hello, I am from Quang Tri");
        int numOfBeers = khacNhan.buyBeers();
        System.out.println("I have bought " + numOfBeers + " cans of beers.");
        khacNhan.kanpai();
        khacNhan.smoke(thangLong);
        khacNhan.deepTalk(1);
        System.out.println("");
        
        System.out.println("========== Shishaer Test =========");
        mixiGaming.doSleep(10);
        mixiGaming.doTalk("Hello, I am from Cao Bang");
        mixiGaming.sellChicken();
        mixiGaming.callVu();
        mixiGaming.smoke(camel);
        mixiGaming.deepTalk(5);
        System.out.println("");
        
        System.out.println("========== Women Test =========");
        thanhNha.doSleep(10);
        thanhNha.doTalk("We are so adourable!");
        thanhNha.doSnake();
        thanhNha.doBite();
                
    }
}
