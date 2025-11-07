import java.util.ArrayList;
import java.util.List;

public class SensorMovimiento implements Sujeto {

    private List<Observador> observadores = new ArrayList<>();

    public void detectarMovimiento() {
        notificar("⚠️ Movimiento detectado en la sala");
    }

    @Override
    public void addObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removeObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        for(Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}
