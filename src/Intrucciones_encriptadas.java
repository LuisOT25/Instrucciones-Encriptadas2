import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Intrucciones_encriptadas {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingresa la ruta del archivo que contiene las instrucciones encriptadas:");
        Scanner scan = new Scanner(System.in);
        String ruta = scan.next();
        System.out.println("Ingresa la ruta donde se guardara archivo que contiene los Resultados:");
        String rutaResultado = scan.next();
        Descifrador obj1 = new Descifrador();
        obj1.verificador(obj1.lectorDeArchivo(ruta), rutaResultado);
    }
}
