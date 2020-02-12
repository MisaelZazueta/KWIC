import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Observador implements IObservador {
    // ---------------------------------
    public Observador(Linea lineaObservada) {
        lineaObservada.setObservador(this);
    }
    @Override
    public void lineaActualizada(String linea) {
        if (linea != null) {
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
                    if(i != (palabras1.size() - 1))
                        lineaAux += palabras1.get(i) + " ";
                    else
                        lineaAux += palabras1.get(i);
                }
                lineasImp.add(lineaAux);
                x++;
            }
            imprimir(lineasImp);
        }
    }
    private static void imprimir(ArrayList<String> lineas){
        Collections.sort(lineas);
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println(lineas.get(i));
        }
        System.out.println();
    }
}
