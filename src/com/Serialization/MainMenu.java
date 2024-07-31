package com.Serialization;

import java.io.*;

public class MainMenu {
    public static void main(String[] args) {

        GameCharacter g1 = new GameCharacter(100,"Duelist",new String[]{"Sniper","Bomb"});
        GameCharacter g2 = new GameCharacter(80,"Controller",new String[]{"Smoke","Teleport"});
        GameCharacter g3 = new GameCharacter(120,"Initiator",new String[]{"FlashBomb","Kickstart"});

        try{
            FileOutputStream fs = new FileOutputStream("Game.ser");

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(g1);
            os.writeObject(g2);
            os.writeObject(g3);

            os.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

        //to detele from cache

        g1 = null;
        g2 = null;
        g3 = null;

        try{
            FileInputStream fi = new FileInputStream("Game.ser");

            ObjectInputStream oi = new ObjectInputStream(fi);

            GameCharacter g1Restore = (GameCharacter) oi.readObject();
            GameCharacter g2Restore = (GameCharacter) oi.readObject();
            GameCharacter g3Restore = (GameCharacter) oi.readObject();

            System.out.println(g1Restore);
            System.out.println(g2Restore);
            System.out.println(g3Restore);

            oi.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
