import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException {
        FileReader var = new FileReader("texto.txt");
        BufferedReader leer = new BufferedReader(var);
        String linea;
        Linea linea1 = new Linea(null);
        Observador observador = new Observador(linea1);
        linea = leer.readLine();
        linea1.setLinea(linea);
        while (linea != null){
            linea = leer.readLine();
            linea1.setLinea(linea);
        }
    }
}
