package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        // Es importante que empiece el camarero ya que se queda esperando.
        try {
            while (true) {
                Cliente cliente = new Cliente();
                Camarero camarero = new Camarero();
                camarero.start();
                camarero.join();
                cliente.start();
                cliente.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
