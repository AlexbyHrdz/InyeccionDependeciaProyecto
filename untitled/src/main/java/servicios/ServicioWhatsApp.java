package servicios;

import dominios.ServicioMensaje;

public class ServicioWhatsApp implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Esto es un whatsApp");
    }
}
