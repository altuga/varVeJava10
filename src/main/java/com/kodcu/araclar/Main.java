package com.kodcu.araclar;

public class Main {

    // var  myValue; // field olamaz

    public static void main(String[] args) {

        // var vasitax = null ;  // ilk degeri null  verilemez
        var vasita = new Vasita();
        vasita = new Vasita();
        vasita = new Bisiklet();

        /**
         * polimorfizim den dolayı derleme anında

         var araba = new Araba();
        araba = new Vasita();
        araba = new Bisiklet();

         **/

    }

    /**
     * method signature da kullanılamaz
     *
    private void trim(var value) {

    }
     **/
}
