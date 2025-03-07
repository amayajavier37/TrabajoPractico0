package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //La diferencia entre objtos anemicos y no anemicos es que los anemicos
        // solo funcionan como clases que almacenan datos y que solo tienen
        // como metodos los de acceso y modificacion de esos datos.
        // En cambio, los no anemicos tiene más funcionalidades y métodos que corresponden
        //  a la logica del negocio, como por ejemplo verificar, validar etc.

        System.out.println("Tiempo con clase no anemica");
        var hoy = new TiempoNoAnemico();
        hoy.mostrarFechaLarga();
        hoy.mostrarFechaCorta();

        System.out.println("Tiempo con clase anemica");
        var hoyAnemico = new TiempoAnemico();
        hoyAnemico.setFecha(new Date());
        Date fecha = hoyAnemico.getFecha();
        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        String formatLargo = formatoLargo.format(fecha);
        System.out.println(formatLargo);
        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        String formatCorto = formatoCorto.format(fecha);
        System.out.println(formatCorto);
    }
}