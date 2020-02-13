import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException {

        Linea linea1 = new Linea(null);
        ObservadorNuevaLinea observadorLinea = new ObservadorNuevaLinea();
        linea1.setObservador(observadorLinea);
        FileReader var = new FileReader("texto.txt");
        BufferedReader leer = new BufferedReader(var);
        String linea;
        linea = leer.readLine();
        linea1.setLinea(linea);
        while (linea != null){
            linea = leer.readLine();
            linea1.setLinea(linea);
        }
    }
}
