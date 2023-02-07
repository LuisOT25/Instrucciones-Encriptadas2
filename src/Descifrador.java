public class Descifrador {
    public String limpiarMensaje(String mensaje){
        for (int indice = 0; indice < mensaje.length() - 1; indice++) {
            int dos = 2;
            if (indice + 2 > mensaje.length()) {
                dos = 1;
            }
            if (indice + 1 > mensaje.length()) {
                dos = 0;
            }
            if (mensaje.charAt(indice) == mensaje.charAt(indice + 1)) {
                mensaje = mensaje.substring(0, indice + 1) + mensaje.substring(indice + dos);
                indice--;
            }
        }
        return mensaje;
    }
    public boolean validarInstrucciones(String instruccion, String mensaje){
        if (mensaje.contains(instruccion)){
            return true;
        }else{
            return false;
        }
    }
}
