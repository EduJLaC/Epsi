
package Sintactico;


public class TAS_Accion {
    
    private final String ACCION[][] = new String[282][48];
    private final String R[] = new String[113];
    
    TAS_Accion(){
        
        R[1] = "R1 PRINCIPAL -> class id { INSTRUCCION";
        R[2] = "R2 CONSTRUCTOR -> id ARGS { INSTRUCCION";
        R[3] = "R3 LLAMAMET -> id . LLAMAMET";
        R[4] = "R4 LLAMAMET -> id PARAM";
        R[5] = "R5 DECMET -> LLAMAMET ;";
        R[6] = "R6 METODO -> TIPOP TIPO id ARGS { INSTRUCCION";
        R[7] = "R7 METODO -> TIPOP id ARGS { INSTRUCCION";
        R[8] = "R8 RETORNA -> return id ;";
        R[9] = "R9 RETORNA -> return NUM ;";
        R[10] = "R10 BUCLE -> while ( OPERACION ) { INSTRUCCION";
        R[11] = "R11 CONDICION -> if ( OPERACION ) { INSTRUCCION ";
        R[12] = "R12 CONDICION -> if ( OPERACION ) { INSTRUCCION else { INSTRUCCION";
        R[13] = "R13 DECMAIN -> FIRP ( ) { INSTRUCCION";
        R[14] = "R14 VAR -> TIPOP TIPO id MASVAR";
        R[15] = "R15 VAR -> TIPO id MASVAR";
        R[16] = "R16 VAR -> TIPO id MAS";
        R[17] = "R17 VAR -> id MAS";
        R[18] = "R18 VAR -> id MASVAR";
        R[19] = "R19 MASVAR -> = NUM MAS";
        R[20] = "R20 MASVAR -> = - NUM MAS";
        R[21] = "R21 MASVAR -> = ' id ' MAS";
        R[22] = "R22 MASVAR -> = \" MAST MAS";
        R[23] = "R23 MASVAR -> = BO MAS";
        R[24] = "R24 MASVAR -> = LLAMAMET MAS";
        R[25] = "R25 MASVAR -> = OPERACION MAS";
        R[26] = "R26 MASVAR -> VECTOR";
        R[27] = "R27 MAS -> , id MAS";
        R[28] = "R28 MAS -> , id MASVAR";
        R[29] = "R29 MAS -> ;";
        R[30] = "R30 VECTOR -> [ 300 ] DECV";
        R[31] = "R31 DECV -> = { NUM MASV ;";
        R[32] = "R32 DECV -> = { ' id ' MASV ;";
        R[33] = "R33 DECV -> = { \" MAST MASV ;";
        R[34] = "R34 MASV -> , NUM MASV";
        R[35] = "R35 MASV -> , ' id ' MASV";
        R[36] = "R36 MASV -> , \" MAST MASV";
        R[37] = "R37 MASV -> }";
        R[38] = "R38 OPERACION -> ( OPERACION ) SIMBOLO MASOP";
        R[39] = "R39 OPERACION -> NUM SIMBOLO MASOP";
        R[40] = "R40 OPERACION -> id SIMBOLO MASOP";
        R[41] = "R41 OPERACION -> LLAMAMET SIMBOLO MASOP";
        R[42] = "R42 MASOP -> NUM SIMBOLO MASOP";
        R[43] = "R43 MASOP -> id SIMBOLO MASOP";
        R[44] = "R44 MASOP -> LLAMAMET SIMBOLO MASOP";
        R[45] = "R45 MASOP -> NUM";
        R[46] = "R46 MASOP -> id";
        R[47] = "R47 MASOP -> LLAMAMET";
        R[48] = "R48 SALIDA -> out : \" MAST CONCATENA";
        R[49] = "R49 CONCATENA -> + id CONCATENA";
        R[50] = "R50 CONCATENA -> + \" MAST CONCATENA";
        R[51] = "R51 CONCATENA -> ;";
        R[52] = "R52 ENTRADA -> in : id ;";
        R[53] = "R53 ENTRADA -> in : id [ id ] ;";
        R[54] = "R54 ENTRADA -> in : id [ 300 ] ;";
        R[55] = "R55 DECLARAV -> id [ id ] = MASD";
        R[56] = "R56 DECLARAV -> id [ 300 ] = MASD";
        R[57] = "R57 MASD -> NUM ;";
        R[58] = "R58 MASD -> - NUM ;";
        R[59] = "R59 MASD -> ' id ' ;";
        R[60] = "R60 MASD -> id ;";
        R[61] = "R61 MASD -> LLAMAMET";
        R[62] = "R62 INSTRUCCION -> CONSTRUCTOR INSTRUCCION";
        R[63] = "R63 INSTRUCCION -> LLAMAMET INSTRUCCION";
        R[64] = "R64 INSTRUCCION -> DECMET INSTRUCCION";
        R[65] = "R65 INSTRUCCION -> RETORNA INSTRUCCION";
        R[66] = "R66 INSTRUCCION -> METODO INSTRUCCION";
        R[67] = "R67 INSTRUCCION -> BUCLE INSTRUCCION";
        R[68] = "R68 INSTRUCCION -> CONDICION INSTRUCCION";
        R[69] = "R69 INSTRUCCION -> VAR INSTRUCCION";
        R[70] = "R70 INSTRUCCION -> DECLARAV INSTRUCCION";
        R[71] = "R71 INSTRUCCION -> ENTRADA INSTRUCCION";
        R[72] = "R72 INSTRUCCION -> SALIDA INSTRUCCION";
        R[73] = "R73 INSTRUCCION -> DECMAIN INSTRUCCION";
        R[74] = "R74 INSTRUCCION -> }";
        R[75] = "R75 ARGS -> ( TIPO id MASAR";
        R[76] = "R76 ARGS -> ( MASAR";
        R[77] = "R77 MASAR -> , TIPO id MASAR";
        R[78] = "R78 MASAR -> )";
        R[79] = "R79 PARAM -> ( 300 MASP";
        R[80] = "R80 PARAM -> ( 301 MASP";
        R[81] = "R81 PARAM -> ( ' id ' MASP";
        R[82] = "R82 PARAM -> ( \" MAST MASP";
        R[83] = "R83 PARAM -> ( LLAMAMET MASP";
        R[84] = "R84 PARAM -> ( VACIO";
        R[85] = "R85 PARAM -> ( id MASP";
        R[86] = "R86 VACIO -> )";
        R[87] = "R87 MASP -> , 300 MASP";
        R[88] = "R88 MASP -> , 301 MASP";
        R[89] = "R89 MASP -> , ' id ' MASP";
        R[90] = "R90 MASP -> , \" MAST MASP";
        R[91] = "R91 MASP -> , BO MASP";
        R[92] = "R92 MASP -> , LLAMAMET MASP";
        R[93] = "R93 MASP -> , id MASP";
        R[94] = "R94 MASP -> )";
        R[95] = "R95 MAST -> id MAST";
        R[96] = "R96 MAST -> \"";
        R[97] = "R97 TIPOP -> pub";
        R[98] = "R98 TIPOP -> pri";
        R[99] = "R99 TIPO -> int";
        R[100] = "R100 TIPO -> real";
        R[101] = "R101 TIPO -> ctr";
        R[102] = "R102 TIPO -> str";
        R[103] = "R103 TIPO -> bool";
        R[104] = "R104 TIPO -> id";
        R[105] = "R105 SIMBOLO -> +";
        R[106] = "R106 SIMBOLO -> -";
        R[107] = "R107 SIMBOLO -> *";
        R[108] = "R108 SIMBOLO -> /";
        R[109] = "R109 SIMBOLO -> mod";
        R[110] = "R110 SIMBOLO -> >";
        R[111] = "R111 SIMBOLO -> <";
        R[112] = "R112 SIMBOLO -> <=";
        R[113] = "R113 SIMBOLO -> >=";
        R[114] = "R114 SIMBOLO -> ==";
        R[115] = "R115 SIMBOLO -> and";
        R[116] = "R116 SIMBOLO -> or";
        R[117] = "R117 SIMBOLO -> not";
        R[118] = "R118 BO -> true";
        R[119] = "R119 BO -> false";
        R[120] = "R120 NUM -> 300";
        R[121] = "R121 NUM -> 301";
       
                 
        
        
                
        
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
    
}
