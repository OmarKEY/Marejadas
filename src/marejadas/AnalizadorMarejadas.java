package marejadas;

import java.util.*;

public class AnalizadorMarejadas {
    private List<DatoOseano> datos;

    public AnalizadorMarejadas(List<Dato> lista) {
        this.datos = new ArrayList<>();
        for(Dato d: lista){
            if(d instanceof DatoOseano){
                this.datos.add((DatoOseano) d);
            }
        }
    }
    public void olaMasAlta(){
        if(datos)
    }
    
    
}
