public class AlertaTelefono extends AlertaDecorator {

    public AlertaTelefono(Alerta alerta) {
        super(alerta);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("📞 Llamada telefónica: " + mensaje);
    }
}
