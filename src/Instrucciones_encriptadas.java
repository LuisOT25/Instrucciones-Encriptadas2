public class Intrucciones_encriptadas {
    public static void main(String[] args) throws Exception {
        try {
            if (args.length != 2) {
                throw new Exception("El programa debe recibir dos argumentos: una ruta de entrada y una de salida");
            }
            Archivos_handler archivosHandler = new Archivos_handler(args[0],args[1]);
            archivosHandler.crearArchivoResultados();


        }catch (Exception ex1){
            System.out.println(ex1.getMessage());
        }
    }
}
