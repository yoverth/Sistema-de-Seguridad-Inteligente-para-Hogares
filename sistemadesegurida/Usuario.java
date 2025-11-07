public class Usuario implements Observador {

    private String nombre;
    private Alerta alerta;

    public Usuario(String nombre, Alerta alerta) {
        this.nombre = nombre;
        this.alerta = alerta;
    }

    @Override
    public void actualizar(String mensaje) {
        alerta.enviar("Hola " + nombre + ": " + mensaje);
    }
}
