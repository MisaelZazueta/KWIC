import java.util.ArrayList;
import java.util.Collections;

public class ObservadorAlfabetizador implements IObservador {
    private ArrayList<String> lineas = new ArrayList<>();
    @Override
    public void onShift(String linea) {}
    public void alfabetizar(String linea) {
        lineas.add(linea);
        Collections.sort(lineas, String.CASE_INSENSITIVE_ORDER);
    }

    @Override
    public void finLinea() {
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println(lineas.get(i));
        }
        System.out.println();
    }
}