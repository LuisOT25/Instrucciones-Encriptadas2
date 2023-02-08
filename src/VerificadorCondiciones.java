public class VerificadorCondiciones {

    public boolean VerificadorCondiciones(String[] archivo){
        try {
            Descifrador descifrador = new Descifrador();
            if (descifrador.validarInstruccion(archivo[1])==false || descifrador.validarInstruccion(archivo[2])==false ){
                throw new RuntimeException("Las instrucciones no deberian tener dos letras iguales seguidas");
            }
            String[] longitudes = archivo[0].split(" ");
            if (Integer.parseInt(longitudes[0]) != archivo[1].length()){throw new RuntimeException("La longitud de la instruccion 1 no coincide");}
            if (Integer.parseInt(longitudes[0])<2){throw new RuntimeException("La longitud de la instruccion 1 no puede ser menor a 2");}
            if (Integer.parseInt(longitudes[0])>50){throw new RuntimeException("La longitud de la instruccion 1 no puede ser mayor a 50");}

            if (Integer.parseInt(longitudes[1]) != archivo[2].length()){throw new RuntimeException("La longitud de la instruccion 2 no coincide");}
            if (Integer.parseInt(longitudes[1])<2){throw new RuntimeException("La longitud de la instruccion 2 no puede ser menor a 2");}
            if (Integer.parseInt(longitudes[1])>50){throw new RuntimeException("La longitud de la instruccion 2 no puede ser mayor a 50");}

            if (Integer.parseInt(longitudes[2]) != archivo[3].length()) {throw new RuntimeException("La longitud del mensaje no coincide");}
            if (Integer.parseInt(longitudes[2])<3){throw new RuntimeException("La longitud del mensaje no puede ser menor a 3");}
            if (Integer.parseInt(longitudes[2])>5000){throw new RuntimeException("La longitud del mensaje no puede ser mayor a 5000");}
            if (!archivo[3].matches("[a-zA-Z0-9]*")){
                throw new RuntimeException("El mensaje solo puede contener este tipo de caracteres [a-z A-Z 0-9]");
            }
            return true;
        }catch (RuntimeException runEx){
            System.out.println(runEx.getMessage());
            return false;
        }
    }
}
