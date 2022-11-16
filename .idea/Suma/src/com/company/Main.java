package com.company;

public class Main {

    public static void main(String[] args) {
        // Aca se cargan los datos
        int naranjas = 3;
        int manzanas = 5;
        int frutas   = sumarEnteros(naranjas,manzanas);

        // Aca tirame un mensaje
        System.out.println("Hay " + naranjas + " Naranjas");
        System.out.println("Hay " + manzanas + " Manzanas");

        // Llamar una funcion
        System.out.println("Hay " + frutas + " Frutas");

        //--------------------------------------------------------------------------------------------
        // SEGUNDAR PARTE
        //--------------------------------------------------------------------------------------------
        if (frutas > 15){
            System.out.println("Las frutas alcanzan");
        } else {
            System.out.println("Las frutas no alcanzan");
        }
    }

    public static int sumarEnteros (int PrimerValor, int SegundoValor) {
        int myPrimerValor = PrimerValor;
        int mySegundoValor = SegundoValor;
        int myResultado = myPrimerValor + mySegundoValor;
        return myResultado;

        //System.out.println("El resultado es " + myResultado);
    }


}
