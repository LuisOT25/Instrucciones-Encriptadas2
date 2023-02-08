import java.io.*;
import java.util.Scanner;

public class ArchivosHandler {
    String rutaEntrada;
    String rutaSalida;

    public ArchivosHandler(String rutaEntrada, String rutaSalida) {
        this.rutaEntrada = rutaEntrada;
        this.rutaSalida = rutaSalida;
    }

    public String[] leerArchivo() {
        try {
            File doc = new File(rutaEntrada);
            Scanner scan = new Scanner(doc);
            String[] instrucciones = new String[4];
            int ii = 0;
            while (scan.hasNextLine()) {
                instrucciones[ii] = scan.nextLine();
                ii++;
            }
            return instrucciones;
        } catch (FileNotFoundException fileEx) {
            System.out.println("La ruta de entrada no ha sido encontrada");
            return null;
        }
    }

    public void crearArchivoResultados (){
        try {
            VerificadorCondiciones verificadorCondiciones = new VerificadorCondiciones();
            Descifrador descifrador = new Descifrador();
            if (verificadorCondiciones.VerificadorCondiciones(leerArchivo()) == true){
                File resultado = new File(rutaSalida);
                if (!resultado.exists()){
                    resultado.createNewFile();
                } else {
                    throw new RuntimeException("En la ruta ingresada ya existe un archivo con el mismo nombre");
                }
                FileWriter fw = new FileWriter(resultado);
                BufferedWriter bw = new BufferedWriter(fw);
                String mensaje=descifrador.limpiarMensaje(leerArchivo()[3]);
                if (descifrador.validarInstrucciones(leerArchivo()[1],mensaje) && descifrador.validarInstrucciones(leerArchivo()[2],mensaje)) {
                    throw new RuntimeException("Maximo puede existir una instruccion escondida por mensaje");
                }else if (descifrador.validarInstrucciones(leerArchivo()[1],mensaje )){
                    bw.write("SI");
                    bw.newLine();
                    bw.write("NO");
                    bw.close();
                } else if (descifrador.validarInstrucciones(leerArchivo()[2],mensaje )) {
                    bw.write("NO");
                    bw.newLine();
                    bw.write("SI");
                    bw.close();
                }else {
                    bw.write("NO");
                    bw.newLine();
                    bw.write("NO");
                    bw.close();
                }
            }
        } catch (RuntimeException runEx) {
            System.out.println(runEx.getMessage());
        }catch (IOException e) {
            System.out.println("Ocurrio un error al intentar escribir sobre el archivo");
        }
    }
}
