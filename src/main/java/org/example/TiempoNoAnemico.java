package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TiempoNoAnemico {
    private Date fecha;

    public TiempoNoAnemico() {
        this.fecha = new Date();
    }

    public void mostrarFechaLarga() {
        var formato = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        var format = formato.format(fecha);
        System.out.println(format);
    }

    public void mostrarFechaCorta() {
        var formato = new SimpleDateFormat("dd/MM/yyyy");
        var format = formato.format(fecha);
        System.out.println(format);
    }
}
