import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ObservadorNuevaLinea implements IObservador {
    // ---------------------------------
    @Override
    public void onShift(String linea) {
        if (linea != null) {
            ObservadorAlfabetizador alfabetizador = new ObservadorAlfabetizador();
            ArrayList<ArrayList<String>> lineas = new ArrayList<>();
            ArrayList<String> palabras = new ArrayList<>();
            ArrayList<String> lineasImp = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(linea);
            while (st.hasMoreTokens()) {
                palabras.add(st.nextToken());
            }
            lineas.add(palabras);
            int x = 0;
            while (x != (palabras.size() - 1)) {
                ArrayList<String> palabras1 = new ArrayList<>();
                palabras1.addAll(lineas.get(lineas.size() - 1));
                palabras1.add(palabras1.get(0));
                palabras1.remove(0);
                lineas.add(palabras1);
                String lineaAux = "";
                for (int i = 0; i < palabras1.size(); i++) {
                    if (i != (palabras1.size() - 1))
                        lineaAux += palabras1.get(i) + " ";
                    else
                        lineaAux += palabras1.get(i);
                }
                alfabetizador.alfabetizar(lineaAux);
                lineasImp.add(lineaAux);
                x++;
            }
            alfabetizador.finLinea();
        }
    }
    @Override
    public void alfabetizar(String linea) {}
    @Override
    public void finLinea() {}
}
