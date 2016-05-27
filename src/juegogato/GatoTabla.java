/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogato;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class GatoTabla extends javax.swing.JFrame {

    /**
     * Creates new form GatoTabla
     */
    
    public GatoTabla() {
        initComponents();
        nuevoJuego();
        llenadoTabla();
        this.turno.setVisible(false);
    }
    
    String [][] tabla= new String[4][4];
    int columna,fila;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        nueve = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego el Gato");

        uno.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        uno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoMouseClicked(evt);
            }
        });

        dos.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        dos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosMouseClicked(evt);
            }
        });

        tres.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });

        cuatro.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuatroMouseClicked(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });

        seis.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        seis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });

        siete.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        siete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sieteMouseClicked(evt);
            }
        });

        ocho.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ochoMouseClicked(evt);
            }
        });

        nueve.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        nueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nueveMouseClicked(evt);
            }
        });

        turno.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(turno)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(turno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenadoTabla(){
        
        tabla [1][1] = "-";
        tabla [1][2] = "-";
        tabla [1][3] = "-";
        tabla [2][1] = "-";
        tabla [2][2] = "-";
        tabla [2][3] = "-";
        tabla [3][1] = "-";
        tabla [3][2] = "-";
        tabla [3][3] = "-";
    }
    
    private void nuevoJuego(){
       
        uno.setText("");
        dos.setText("");
        tres.setText("");
        cuatro.setText("");
        cinco.setText("");
        seis.setText("");
        siete.setText("");
        ocho.setText("");
        nueve.setText("");
       
    }
    
    private void imprimeTablero(){
        
        if(!tabla[1][1].equals("-"))uno.setText(tabla[1][1]);
        if(!tabla[1][2].equals("-"))dos.setText(tabla[1][2]);
        if(!tabla[1][3].equals("-"))tres.setText(tabla[1][3]);
        if(!tabla[2][1].equals("-"))cuatro.setText(tabla[2][1]);
        if(!tabla[2][2].equals("-"))cinco.setText(tabla[2][2]);
        if(!tabla[2][3].equals("-"))seis.setText(tabla[2][3]);
        if(!tabla[3][1].equals("-"))siete.setText(tabla[3][1]);
        if(!tabla[3][2].equals("-"))ocho.setText(tabla[3][2]);
        if(!tabla[3][3].equals("-"))nueve.setText(tabla[3][3]);
        
    }
    
    public void verificar(TurnoMaquina maquina){
        
        if(maquina.evaluar(this)==-1){
            JOptionPane.showMessageDialog(this, "Felicidades usted ha ganado");
            nuevoJuego();
            llenadoTabla();
        }
        if(maquina.evaluar(this)==1){
            JOptionPane.showMessageDialog(this, "Ha sido un empate");
            nuevoJuego();
            llenadoTabla();
        }
        if(maquina.evaluar(this)==0){
            JOptionPane.showMessageDialog(this, "La maquina ha ganado");
            nuevoJuego();
            llenadoTabla();
        }
        
    }
    
    public void Evaluar(TurnoMaquina m){
        if(m.evaluar(this)==-1) {
                JOptionPane.showMessageDialog(this, "HAs Ganado"); 
                nuevoJuego();
                llenadoTabla();
            }
            else if(m.evaluar(this)==1) {
                JOptionPane.showMessageDialog(this, "La computadora gana"); 
                nuevoJuego();
                llenadoTabla();
            }
            else if(m.evaluar(this)==0) {
                JOptionPane.showMessageDialog(this, "Ha sido un empate"); 
                nuevoJuego();
                llenadoTabla();
            }
    }
    
    private void unoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMouseClicked
        
        if((this.uno.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[1][1]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
        
    }//GEN-LAST:event_unoMouseClicked

    private void dosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMouseClicked
        // TODO add your handling code here:
        if((this.dos.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[1][2]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_dosMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        // TODO add your handling code here:
        if((this.tres.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[1][3]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_tresMouseClicked

    private void cuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMouseClicked
        // TODO add your handling code here:
        if((this.cuatro.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[2][1]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_cuatroMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        // TODO add your handling code here:
        if((this.cinco.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[2][2]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        // TODO add your handling code here:
        if((this.seis.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[2][3]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_seisMouseClicked

    private void sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMouseClicked
        // TODO add your handling code here:
        if((this.siete.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[3][1]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_sieteMouseClicked

    private void ochoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMouseClicked
        // TODO add your handling code here:
        if((this.ocho.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[3][2]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_ochoMouseClicked

    private void nueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nueveMouseClicked
        // TODO add your handling code here:
        if((this.nueve.getText().equals("")) && (this.turno.getText().equals("Usuario"))){
            
            this.tabla[3][3]="X";
            imprimeTablero();
            TurnoMaquina maquina = new TurnoMaquina();
            this.turno.setText("Maquina");
            maquina.maquinaT(1, this);
            this.tabla[this.fila][this.columna]="O";
            imprimeTablero();
            this.turno.setText("Usuario");
            Evaluar(maquina);
            
        }
                
    }//GEN-LAST:event_nueveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GatoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatoTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatoTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
