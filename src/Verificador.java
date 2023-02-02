import java.io.*;

public class Verificador {

    public File VerificaInstrucciones(String[] array, String rutaResultado){
        try {
            File resultado = new File(rutaResultado + "\\ResultadoInstruccionesEncriptadas.txt");
            resultado.createNewFile();
            FileWriter fw = new FileWriter(resultado);
            BufferedWriter bw = new BufferedWriter(fw);
            String mensaje = array[3];
            String Instruccion1 = array[1];
            String Instruccion2 = array[2];
            if (mensaje.contains(Instruccion1) && mensaje.contains(Instruccion2)) {
                bw.write("SI");
                bw.newLine();
                bw.write("SI");
                bw.close();
            } else if (mensaje.contains(Instruccion1) && !mensaje.contains(Instruccion2)) {
                bw.write("SI");
                bw.newLine();
                bw.write("NO");
                bw.close();
            } else if (!mensaje.contains(Instruccion1) && !mensaje.contains(Instruccion2)) {
                bw.write("NO");
                bw.newLine();
                bw.write("NO");
                bw.close();
            } else if (!mensaje.contains(Instruccion1) && mensaje.contains(Instruccion2)) {
                bw.write("NO");
                bw.newLine();
                bw.write("SI");
                bw.close();

            }
            return resultado;
        }catch (FileNotFoundException fileEx){

        }catch (IOException IOex){

        }
        return null;
    }
}
