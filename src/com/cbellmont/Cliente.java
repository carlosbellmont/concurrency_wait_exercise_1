package com.cbellmont;

public class Cliente extends Thread {


    @Override
    public void run() {
        try {
            while (!Main.list.isEmpty()){
                System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
                Main.list.remove(0);
                sleep(3000);
            }

            System.out.println("Cliente - Voy a esperar a que me traigan comida...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
