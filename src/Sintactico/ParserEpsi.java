
package Sintactico;


import java.util.ArrayDeque;
import java.util.Deque;


public class ParserEpsi {
    Deque<String> pila = new ArrayDeque<>();
    String cadena;
    private int apunta;
    private int pos;
    private final TAS t;
    private String UIpila;
    private String UIentrada;
    private String UIsalida;
    ;
    
    ParserEpsi(){
        /*
            IMPORTANTE MODIFICAAAAAAAAAAAAAR
        */
        pila.push("0");     // Primer estado en la pila
        apunta = 0;         // Apunto al primer elemento de la cadena ingesada
        pos = 0;            // Posicion actual
        UIpila = pila.toString() + "\n";  // String de la pila a mostrar
        UIsalida = "";      // String de la salida a mostrar
        t = new TAS();
    }
    
    public String getCadena(){
        return cadena;
    }
    
    // METODOS GETTER PARA USARLOS EN INTERFAZ GRÁFICA
    public String getPila(){
        return UIpila; 
    } 
    
    public String getEntrada(){
        return UIentrada;
    }
    
    public String getSalida(){
        return UIsalida;
    }
        
    public void Leer(String cadena){
        this.cadena = cadena + "$";
        UIentrada = this.cadena + "\n";
        Sintactico();
    }
    
    private String Lexico(){
        String a = "";
        
        for (int i = pos; i < cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                a += cadena.charAt(i);
                apunta++;
                break;
            }
        }
        
        return a;
    }
    
    private void Error(){
        System.out.println("Cadena no valida.");
        System.exit(1);
    }
    
    public void Sintactico(){
        String retEntrada = "";                 // Retiene la cadena de entrada al momento de reducir
        while(true){
            String s = pila.getFirst();         // Recibe el estado 
            String a = Lexico();                // Recibe simbolo de la cadena
            String accion = t.Accion(s, a);     // Retorna D o R
            
            if(accion.charAt(0) == 'D'){
                String estado = "";
                String entrada = cadena;
                estado += accion.charAt(1);
                pila.push(a);
                pila.push(estado);
                pos = apunta;
                UIpila += pila.toString() + "\n";   // Agregamos los estados de la pila para mostrar en pantalla
                
                retEntrada="";
                for(int i=apunta; i<entrada.length(); i++){
                    UIentrada += entrada.charAt(i);
                    retEntrada += entrada.charAt(i);
                }
                
                UIentrada += "\n";
                UIsalida += accion + "\n";
            }else if(accion.charAt(0) == 'R'){
                String reduce = "";
                String simbolo = "";
                String estado;
                reduce += accion.charAt(6); // MODIFICAAAAAAAAAAAAAR
                /* Ya que en cada iteracion "apunta" aumenta en 1 debido a la llamada de Lexico, 
                con este decremento nos aseguramos de apuntar al mismo simbolo que será 
                reemplazado cuando se llame a D */
                apunta--;                   
                
                int size = pila.size();
                for(int i = 0; i < size; i++){
                    if(!pila.getFirst().equals(reduce)){
                        pila.pop();     // Desapila hasta encontrar el simbolo del lado derecho
                    }else{
                        pila.pop();     // Desapila el simbolo a reducir
                        break;
                    }
                }
                    // PROBABLE BUCLE FOR PARA CAPTURAR UN NO TERMINAL COMPUESTO 
                simbolo += accion.charAt(3); //MODIFICAAAAAAAAAAAAAAAAAAR
                estado = t.Ir_A(pila.getFirst(), simbolo); 
                pila.push(simbolo);     // Apila el simbolo encontrar el simbolo del lado izquierdo 
                pila.push(estado);
                UIpila += pila.toString() + "\n";   // Agregamos los estados de la pila para mostrar en pantalla
                UIentrada += retEntrada + "\n";
                UIsalida += accion + "\n";
            }else if(accion.equals("ACEPTAR")){
                UIsalida += accion + "\n";
                break;
            }else{
                Error();
            }
        }// Fin del while
    }//Fin de Sintactico  
}
