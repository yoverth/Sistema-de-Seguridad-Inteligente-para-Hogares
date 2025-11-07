public abstract class AlertaDecorator implements Alerta {

    protected Alerta alerta;

    public AlertaDecorator(Alerta alerta) {
        this.alerta = alerta;
    }

    @Override
    public void enviar(String mensaje) {
        alerta.enviar(mensaje);
    }
}
