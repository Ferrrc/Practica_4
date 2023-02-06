package com.main;

import com.herencia.SmartDevice;
import com.herencia.SmartPhone;
import com.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {



        SmartPhone smartPhone = new SmartPhone(100, "Iphone", 4, false, "Tipo C", true, 3);
        System.out.println(smartPhone.bateria);
        System.out.println(smartPhone.modelo);
        System.out.println(smartPhone.apruebaDeAgua);

        SmartWatch smartWatch = new SmartWatch(100, "Samsung", 5, true, "Tipo C", 5,false);
        System.out.println(smartWatch.bateria);
        System.out.println(smartWatch.modelo);
        System.out.println(smartWatch.entradaCargador);



    }
}
