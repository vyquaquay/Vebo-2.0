/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vb;

import java.io.Serializable;

/**
 *
 * @author GIGA
 */
public class Player implements Serializable {

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getCountry() {
        return country;
    }

    public int getPl_Number() {
        return pl_Number;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setPl_Number(int Pl_Number) {
        this.pl_Number = Pl_Number;
    }

    public Player(String age, String name, String country, int pl_Number) {
        this.age = age;
        this.name = name;

        this.country = country;
        this.pl_Number = pl_Number;
    }
    private String age;
    private String name;
    private String country;
    private int pl_Number;
}
