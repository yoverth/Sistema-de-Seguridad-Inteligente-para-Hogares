public class Main {
    public static void main(String[] args) {

        // Decorador: Sirena + App + Llamada
        Alerta alerta = new AlertaTelefono(
                            new AlertaApp(
                                new Sirena()
                            )
                        );

        Usuario usuario = new Usuario("Carlos", alerta);
        SensorMovimiento sensor = new SensorMovimiento();

        sensor.addObservador(usuario);

        sensor.detectarMovimiento();
    }
}
