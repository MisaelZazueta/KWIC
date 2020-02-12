public class Linea{
    private String linea;
    private IObservador observador;
    public Linea (String linea){
        this.linea = linea;
    }
    public String getLinea() { return linea;  }

    public void setLinea(String linea) {
        this.linea = linea;
        notificarObservador();
    }
    public void setObservador(IObservador observador) { this.observador = observador; }
    private void notificarObservador() { observador.lineaActualizada(linea); }
}
