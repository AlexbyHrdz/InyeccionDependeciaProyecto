package servicios;

import dominios.ServicioMensaje;

public class ServicioSms implements ServicioMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Esto es un sms"+ mensaje);
    }
}
