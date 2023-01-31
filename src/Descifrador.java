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
        String mensaje= instrucciones[3];
        for (ii=0; ii<mensaje.length()-1;ii++){
            int dos =2;
            if (ii+2>mensaje.length()){
                dos=1;
            }
            if (ii + 1 > mensaje.length()) {
                dos=0;
            }
            if (mensaje.charAt(ii)==mensaje.charAt(ii+1)){
                mensaje = mensaje.substring(0,ii+1) + mensaje.substring(ii+dos);
                ii--;
            }
        }
        instrucciones[3]=mensaje;
        return instrucciones;
    }

    public void verificador(String[] array){
        String mensaje=array[3];
        String Instruccion1 = array[1];
        String Instruccion2 = array[2];
        if (mensaje.contains(Instruccion1) && mensaje.contains(Instruccion2)){
            System.out.println("SI");
            System.out.println("SI");
        }else if (mensaje.contains(Instruccion1) && !mensaje.contains(Instruccion2)){
            System.out.println("SI");
            System.out.println("NO");
        }else{
            System.out.println("NO");
            System.out.println("SI");
        }

    }

}
