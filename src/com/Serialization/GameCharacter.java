package com.Serialization;

import java.io.Serializable;
import java.util.Arrays;

public class GameCharacter implements Serializable {
    int power;
    String type;

    String[] weapons;


    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }


    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", weapons=" + Arrays.toString(weapons) +
                '}';
    }







}
