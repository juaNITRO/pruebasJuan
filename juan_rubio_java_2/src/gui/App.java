package gui;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Admin;
import model.Candidatos;
import model.Data;
import model.Votantes;
import model.VotosEnBlanco;
import model.VotosNulos;


public class App extends javax.swing.JFrame {

    private Data d;
    private Admin a;

    public App() {
        initComponents();
        setTitle("Votaciones");
        setLocationRelativeTo(null);
        estadoBotonesCandidatos(false);
        try {
            d = new Data();
            a = new Admin("111-1");
            cargarEstadisticas();
            estado();
            cargarListaComentarios();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFabiola = new javax.swing.JButton();
        btnLeonardo = new javax.swing.JButton();
        btnAntonio = new javax.swing.JButton();
        btnDiego = new javax.swing.JButton();
        btnVotoEnBlanco = new javax.swing.JButton();
        txtComentario = new javax.swing.JTextField();
        btnVotoNulo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        listaComentarios = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPorVotosFabiola = new javax.swing.JLabel();
        lblPorVotosLeonardo = new javax.swing.JLabel();
        lblPorVotosAntonio = new javax.swing.JLabel();
        lblPorVotosDiego = new javax.swing.JLabel();
        lblPorVotosNulos = new javax.swing.JLabel();
        lblPorVotosEnBlanco = new javax.swing.JLabel();
        lblVotosTotales = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        txtRutVotante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidatos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Ingrese su rut:");

        btnFabiola.setText("Fabiola Muñoz");
        btnFabiola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabiolaActionPerformed(evt);
            }
        });

        btnLeonardo.setText("Leonardo Barahona");
        btnLeonardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeonardoActionPerformed(evt);
            }
        });

        btnAntonio.setText("Antonio Rojas");
        btnAntonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntonioActionPerformed(evt);
            }
        });

        btnDiego.setText("Diego Páez");
        btnDiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiegoActionPerformed(evt);
            }
        });

        btnVotoEnBlanco.setText("Voto En Blanco");
        btnVotoEnBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoEnBlancoActionPerformed(evt);
            }
        });

        btnVotoNulo.setText("Voto Nulo");
        btnVotoNulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotoNuloActionPerformed(evt);
            }
        });

        listaComentarios.setModel(modelo);
        jScrollPane1.setViewportView(listaComentarios);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estadísticas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setText("Fabiola Muñoz:");

        jLabel3.setText("Leonardo Barahona:");

        jLabel4.setText("Antonio rojas:");

        jLabel5.setText("Diego Páez:");

        jLabel6.setText("NULOS:");

        jLabel7.setText("BLANCOS:");

        jLabel8.setText("VOTOS TOTALES:");

        lblPorVotosFabiola.setText("Valores");

        lblPorVotosLeonardo.setText("Valores");

        lblPorVotosAntonio.setText("Valores");

        lblPorVotosDiego.setText("Valores");

        lblPorVotosNulos.setText("Valores");

        lblPorVotosEnBlanco.setText("Valores");

        lblVotosTotales.setText("Valores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblPorVotosFabiola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPorVotosLeonardo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPorVotosAntonio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPorVotosDiego, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPorVotosEnBlanco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVotosTotales, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPorVotosNulos)))
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPorVotosFabiola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblPorVotosLeonardo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPorVotosAntonio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPorVotosDiego))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblPorVotosEnBlanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPorVotosNulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblVotosTotales))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel9.setText("Rut Admin:");

        txtAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdminKeyReleased(evt);
            }
        });

        btnCerrar.setText("Cerrar Votación");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtRutVotante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRutVotanteKeyPressed(evt);
            }
        });

        jLabel10.setText("Comentario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addComponent(btnVotoNulo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addComponent(btnVotoEnBlanco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAntonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFabiola, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnLeonardo, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(btnDiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(txtRutVotante, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRutVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLeonardo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnFabiola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAntonio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiego, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVotoEnBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVotoNulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrar)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnFabiolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabiolaActionPerformed
        String nombre = "Fabiola Muñoz";
        int voto = 1;
        try {
            votar(new Candidatos(nombre, voto));
            cargarEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFabiolaActionPerformed

    private void btnLeonardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeonardoActionPerformed
        String nombre = "Leonardo Barahona";
        int voto = 1;
        try {
            votar(new Candidatos(nombre, voto));
            cargarEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLeonardoActionPerformed

    private void btnAntonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntonioActionPerformed
        String nombre = "Antonio Rojas";
        int voto = 1;
        try {
            votar(new Candidatos(nombre, voto));
            cargarEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAntonioActionPerformed

    private void btnDiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiegoActionPerformed
        String nombre = "Diego Páez";
        int voto = 1;
        try {
            votar(new Candidatos(nombre, voto));
            cargarEstadisticas();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDiegoActionPerformed

    private void btnVotoEnBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoEnBlancoActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea votar en blanco?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                agregarVotos(null, new VotosEnBlanco(1), 2);
                cargarEstadisticas();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnVotoEnBlancoActionPerformed

    private void txtRutVotanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutVotanteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           String rut = txtRutVotante.getText();
            if ("".equals(txtRutVotante.getText())) {
                JOptionPane.showMessageDialog(this, "Este campo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    buscarRut(rut);
                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txtRutVotanteKeyPressed

    private void btnVotoNuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotoNuloActionPerformed
        String comentario = txtComentario.getText();
        int voto = 1;
        if ("".equals(txtComentario.getText())) {
            JOptionPane.showMessageDialog(this, "El campo comentario no puede estar vacio. REINTENTE", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "¿Desea votar nulo?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                try {
                    agregarVotos(new VotosNulos(comentario, voto), null, 1);
                    cargarEstadisticas();
                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    cargarListaComentarios();
                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnVotoNuloActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try {
            d.cerrarVotaciones();
            terminoVotaciones();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdminKeyReleased
        String rut = txtAdmin.getText();
        if (rut.equals(a.getRut())) {
            btnCerrar.setEnabled(true);
        }else{
           btnCerrar.setEnabled(false);
        }
    }//GEN-LAST:event_txtAdminKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntonio;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDiego;
    private javax.swing.JButton btnFabiola;
    private javax.swing.JButton btnLeonardo;
    private javax.swing.JButton btnVotoEnBlanco;
    private javax.swing.JButton btnVotoNulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPorVotosAntonio;
    private javax.swing.JLabel lblPorVotosDiego;
    private javax.swing.JLabel lblPorVotosEnBlanco;
    private javax.swing.JLabel lblPorVotosFabiola;
    private javax.swing.JLabel lblPorVotosLeonardo;
    private javax.swing.JLabel lblPorVotosNulos;
    private javax.swing.JLabel lblVotosTotales;
    private javax.swing.JList listaComentarios;
    private DefaultListModel modelo;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtRutVotante;
    // End of variables declaration//GEN-END:variables

    private void buscarRut(String txtRut) throws SQLException {
        if (validarRut(txtRut)) {
            if (d.getRut(txtRut)) {
                JOptionPane.showMessageDialog(this, "Este rut ya ha Votado", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else if (!d.getRut(txtRut)) {
                estadoBotonesCandidatos(true);
                d.agregarVotantes(new Votantes(txtRut));
            }
        }else{
            JOptionPane.showMessageDialog(this,"Rut invalido","Verificación",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void estadoBotonesCandidatos(boolean isActivo) {
        btnAntonio.setEnabled(isActivo);
        btnLeonardo.setEnabled(isActivo);
        btnFabiola.setEnabled(isActivo);
        btnDiego.setEnabled(isActivo);
        btnVotoEnBlanco.setEnabled(isActivo);
        btnVotoNulo.setEnabled(isActivo);
        btnCerrar.setEnabled(isActivo);
        txtComentario.setEnabled(isActivo);
    }

    private void votar(Candidatos can) throws SQLException {
        if (JOptionPane.showConfirmDialog(this, "¿Desea votar por " + can.getNombreCandidato() + "?", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            d.agregarVotosCandidatos(can);
            estadoBotonesCandidatos(false);
            JOptionPane.showMessageDialog(this, "\"Gracias por votar!\"", "Votación", JOptionPane.INFORMATION_MESSAGE);
            txtRutVotante.setText("");
            txtRutVotante.requestFocus();
        }
    }

    private void agregarVotos(VotosNulos vn, VotosEnBlanco vb, int opcion) throws SQLException {
        d.agregarVotos(vn, vb, opcion);
        estadoBotonesCandidatos(false);
        JOptionPane.showMessageDialog(this, "\"Gracias por votar!\"", "Votación", JOptionPane.INFORMATION_MESSAGE);
        txtRutVotante.setText("");
        txtRutVotante.requestFocus();
    }

    private void cargarListaComentarios() throws SQLException {
        for(int i = 0; i< d.getComentarios().size();i++){
            modelo.addElement(d.getComentarios().get(i));
        }
        listaComentarios.setSelectedIndex(0);
        txtComentario.setText("");
    }

    private void cargarEstadisticas() throws SQLException {
        lblPorVotosFabiola.setText(d.getPorcentajes("Fabiola Muñoz"));
        lblPorVotosLeonardo.setText(d.getPorcentajes("Leonardo Barahona"));
        lblPorVotosDiego.setText(d.getPorcentajes("Diego Páez"));
        lblPorVotosAntonio.setText(d.getPorcentajes("Antonio Rojas"));
        lblPorVotosNulos.setText(d.getPorcentajes("Nulos"));
        lblPorVotosEnBlanco.setText(d.getPorcentajes("Blanco"));
        lblVotosTotales.setText(String.valueOf(d.getCantidadTotalDeVotos()));
    }

    private void estado() throws SQLException {
        if ("si".equals(d.revisarEstadoVotaciones())) {
            terminoVotaciones();
        }
    }

    private void terminoVotaciones() throws SQLException {
        JOptionPane.showMessageDialog(this,"VOTACIÓN CERRADA."+"\n"+"Ha ganado "+d.getGanador().get(0).getNombre()+" con "+
                d.getGanador().get(0).getCantidadDeVotos()+" votos"+"("+
                d.getGanador().get(0).getCantidadDeVotos()*100/
                d.getCantidadTotalDeVotos()+"%)."+"\n"+"Devolución: $"+
                d.getGanador().get(0).getDevolucionServel(), "Votaciones cerradas", 
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    private boolean validarRut(String rut) {
        boolean isValido = false;
        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
        char digitoVerificador = rut.charAt(rut.length() - 1);
        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (digitoVerificador == (char) (s != 0 ? s + 47 : 75)) {
            isValido = true;
        }
        return isValido;
    }
        
}
