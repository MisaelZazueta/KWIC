import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class KWICInputReader {

    private PropertyChangeSupport changeSupport;

    public KWICInputReader(){
        changeSupport = new PropertyChangeSupport(this);
    }

    public void agregadorEscuchador(PropertyChangeListener pcl){
        this.changeSupport.addPropertyChangeListener(pcl);
    }

    public void leerArchivo(File input) throws IOException {
        FileReader var = new FileReader(input);
        BufferedReader leer = new BufferedReader(var);
        String linea = "";
        List<String> lines = new ArrayList<>();
        while (linea != null){
            linea = leer.readLine();
            this.changeSupport.firePropertyChange("line",lines,linea);
            lines.add(linea);
        }
    }
}
