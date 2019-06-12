
package Sintactico;


public class TAS {
    
    private final String ACCION[][] = new String[14][5];
    private final String Ir_A[][] = new String [14][2];
    
    TAS(){
        // Tabla donde guardo la accion a realizar D para desplazar R para reducir
        // R | nro. de la gramatica | produccion de la derecha | produccion de la izquierda
        
        /*
            AGREGAR LA TABLA CUANDO LA GRAMATICA ESTÉ LISTA
        */
    }
    
public String Accion(String estado, String terminal){
        int e = Integer.parseInt(estado) + 1;
        int t = 0;
        
        for(int i = 0;  i < 5; i++){
            if(ACCION[0][i].equals(terminal)){
                t = i;
            }
        }
        
        return ACCION[e][t];
    }
    
    public String Ir_A(String estado, String terminal){
        int e = Integer.parseInt(estado) + 1;
        int t = 0;
        
        for(int i = 0; i < 2; i++){
            if(Ir_A[0][i].equals(terminal)){
                t = i;
            }
        }
        
        return Ir_A[e][t];
    }
}
