package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entradas del problema
        String nombreUsuario="Manu";
        short edadUsuario=34;
        String telefonoUsuario="3225962363";
        String documentoIdentidad="1017187878";
        int cuotaEnero;
        int cuotaFebrero;
        int cuotaMarzo;
        int cuotaAbril;
        int cuotaMayo;
        int cuotaJunio;
        int cuotaJulio;
        int cuotaAgosto;
        int cuotaSeptiembre;
        int cuotaOctubre;
        int cuotaNoviembre;
        String direccionUsuario="Cll 50# 80-20";
        double costoInscripcion=150000.0;
        float tasaInteresNatillera=0.1F;
        double saldoFinalUsuario;

        //PROCESO

        //1. Asignar un valor específico a una variable
        //desde el TECLADO (Recibir datos)
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Hola soy una IA, cual es tu nombre?");
        nombreUsuario=leerDato.nextLine();
        System.out.println("Bienvenido " +nombreUsuario + " Ingresa tu telefono ");
        telefonoUsuario=leerDato.nextLine();
        System.out.println("Ingresa tu documento " );
        documentoIdentidad=leerDato.nextLine();
        System.out.println("Tu telefono es " +telefonoUsuario + " Tu documento es " +documentoIdentidad);





    }
}