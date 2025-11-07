public interface Sujeto {
    void addObservador(Observador o);
    void removeObservador(Observador o);
    void notificar(String mensaje);
}
