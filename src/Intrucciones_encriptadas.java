import java.io.FileNotFoundException;
import java.util.Scanner;

public class Intrucciones_encriptadas {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Ingresa la ruta del archivo que contiene las instrucciones encriptadas:");
        Scanner scan = new Scanner(System.in);
        String ruta = scan.next();
        Descifrador obj1 = new Descifrador();
        for (String ii:obj1.lectorDeArchivo(ruta)) {
            System.out.println(ii);
        }
    }
}
