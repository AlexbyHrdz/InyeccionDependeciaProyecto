package servicios;

import dominios.ServicioMensaje;

public class ServiciosEmail implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Esto es un Email"+mensaje);
    }
}
