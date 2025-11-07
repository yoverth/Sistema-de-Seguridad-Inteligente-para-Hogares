public class Sirena implements Alerta {
    @Override
    public void enviar(String mensaje) {
        System.out.println("🔊 Sirena activada: " + mensaje);
    }
}
