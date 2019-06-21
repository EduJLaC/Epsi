
package Sintactico;


public class TAS_IrA {
    
    private final String Ir_A[][] = new String[282][48];
    
    TAS_IrA(){
        
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
