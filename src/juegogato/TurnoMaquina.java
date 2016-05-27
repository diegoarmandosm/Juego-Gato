/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

/**
 *
 * @author Diego
 */
public class TurnoMaquina {
    
   public int maquinaT(int modo, GatoTabla ta){
    int mflocal = 0; int mclocal = 0;
    int valor = evaluar(ta);
    if (valor != 2) return valor;
    if (modo == 1) valor = -100; else
      valor = 100;
    for (int i = 1; i < 4; i++)
      for (int j = 1; j < 4; j++)
        if (ta.tabla[i][j].equals("-")) {
          if (modo == 1) {
            ta.tabla[i][j] = "O";
            int val = maquinaT(2, ta);
            if (valor < val) { valor = val; mflocal = i; mclocal = j; }
          }
          else {
            ta.tabla[i][j] = "X";
            int val = maquinaT(1, ta);
            if (valor > val) { valor = val; mflocal = i; mclocal = j;
            }
          }

          ta.tabla[i][j] = "-";
        }
    ta.fila = mflocal;
    ta.columna = mclocal;
    return valor;
  }
    
    public int evaluar(GatoTabla gato){
      
        int i, j;
        String ganador = "-";
    
        for (i = 1; i < 4; i++) {
        
            if ((!gato.tabla[i][1].equals("-")) && (gato.tabla[i][1].equals(gato.tabla[i][2])) && (gato.tabla[i][2].equals(gato.tabla[i][3])))
                ganador = gato.tabla[i][1];
           
        }
        
        for (j = 1; j < 4; j++) {
        
            if ((!gato.tabla[1][j].equals("-")) && (gato.tabla[1][j].equals(gato.tabla[2][j])) && (gato.tabla[2][j].equals(gato.tabla[3][j])))
            ganador = gato.tabla[1][j];
            
        }
    
        if ((!gato.tabla[1][1].equals("-")) && (gato.tabla[1][1].equals(gato.tabla[2][2])) && (gato.tabla[2][2].equals(gato.tabla[3][3]))) {
            
            ganador = gato.tabla[1][1];
   
        }
        
        if ((!gato.tabla[1][3].equals("-")) && (gato.tabla[1][3].equals(gato.tabla[2][2])) && (gato.tabla[2][2].equals(gato.tabla[3][1]))) {
      
            ganador = gato.tabla[1][3];
    
        }
    
        if ("X".equals(ganador)) return -1;
    
        if ("O".equals(ganador)) return 1;
    
        for (i = 1; i < 4; i++)
      
            for (j = 1; j < 4; j++)
        
                if (gato.tabla[i][j].equals("-")) return 2;
    
        return 0;
  
    }
    
}
