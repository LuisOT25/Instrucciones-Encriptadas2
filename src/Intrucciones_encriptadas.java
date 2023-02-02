import org.w3c.dom.ranges.RangeException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Intrucciones_encriptadas {
    public static void main(String[] args) throws Exception {
        try {
            if (args.length != 2) {
                throw new Exception("El programa debe recibir dos argumentos: una ruta de entrada y una de salida");
            }
            String ruta = args[0];
            String rutaResultado = args[1];
            Analizador descifrador = new Analizador();
            Verificador verificador = new Verificador();
        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
    }
}
