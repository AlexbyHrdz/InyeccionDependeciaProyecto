package main;

import controlador.Notificacion;
import dominios.ServicioMensaje;
import servicios.ServicioSms;
import servicios.ServicioWhatsApp;
import servicios.ServiciosEmail;

public class Main {
    public static void main(String[] args) {

        ServicioMensaje serviciosEmail  = new  ServiciosEmail();
        Notificacion notificacionEmail= new Notificacion(serviciosEmail);
        notificacionEmail.notificar("Esto es un Email");

        ServicioMensaje servicioSms = new ServicioSms();
        Notificacion notificacionSMS = new Notificacion(servicioSms);
        notificacionSMS.notificar("Esto es un sms");

        ServicioMensaje servicioWhatsApp = new ServicioWhatsApp();
        Notificacion notificacionWhatsApp = new Notificacion(servicioWhatsApp);
        notificacionWhatsApp.notificar("Esto es un WhatsApp");


    }
}
