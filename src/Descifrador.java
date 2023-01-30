import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Descifrador {

    public String[] lectorDeArchivo(String ruta) throws FileNotFoundException {
        File doc = new File(ruta);
        Scanner scan = new Scanner(doc);
        String [] instrucciones = new String[4];
        int ii=0;
        while (scan.hasNextLine()){
            instrucciones[ii]= scan.nextLine();
            ii++;
        }

        return instrucciones;
    }
}
