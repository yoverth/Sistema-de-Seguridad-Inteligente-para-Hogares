public class AlertaApp extends AlertaDecorator {

    public AlertaApp(Alerta alerta) {
        super(alerta);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("📱 Notificación App: " + mensaje);
    }
}
