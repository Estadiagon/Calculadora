package Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class UltraCalculadora extends javax.swing.JPanel {

    /**
     * Creates new form UltraCalculdaora
     */
   CalculadoraAritmetica aritmetica=new CalculadoraAritmetica();
   CalculadoraTrigonometrica trigonometrica=new CalculadoraTrigonometrica();
   CalculadoraConversora conversion=new CalculadoraConversora();
    int opcion;
    
    
    public UltraCalculadora() {
        initComponents();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        OperandoDivision = new javax.swing.JButton();
        OperadorSuma = new javax.swing.JButton();
        OperandoProducto = new javax.swing.JButton();
        OperadorResta = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        OperandoIgual = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        BSEN = new javax.swing.JButton();
        BCOS = new javax.swing.JButton();
        BTAN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BKG = new javax.swing.JButton();
        BG = new javax.swing.JButton();
        BGradosC = new javax.swing.JButton();
        BGradosF = new javax.swing.JButton();
        BCM = new javax.swing.JButton();
        BM = new javax.swing.JButton();
        Cuadrodetexto = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Titulo.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        Titulo.setText("MegaCalculadora");

        B1.setBackground(new java.awt.Color(102, 0, 0));
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("1");
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(102, 0, 0));
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("2");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        B3.setBackground(new java.awt.Color(102, 0, 0));
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("3");
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        B4.setBackground(new java.awt.Color(102, 0, 0));
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("4");
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        B5.setBackground(new java.awt.Color(102, 0, 0));
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("5");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        B7.setBackground(new java.awt.Color(102, 0, 0));
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("7");
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        OperandoDivision.setBackground(new java.awt.Color(102, 0, 0));
        OperandoDivision.setForeground(new java.awt.Color(255, 255, 255));
        OperandoDivision.setText("/");
        OperandoDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperandoDivisionMouseClicked(evt);
            }
        });

        OperadorSuma.setBackground(new java.awt.Color(102, 0, 0));
        OperadorSuma.setForeground(new java.awt.Color(255, 255, 255));
        OperadorSuma.setText("+");
        OperadorSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperadorSumaMouseClicked(evt);
            }
        });
        OperadorSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadorSumaActionPerformed(evt);
            }
        });

        OperandoProducto.setBackground(new java.awt.Color(102, 0, 0));
        OperandoProducto.setForeground(new java.awt.Color(255, 255, 255));
        OperandoProducto.setText("*");
        OperandoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperandoProductoMouseClicked(evt);
            }
        });

        OperadorResta.setBackground(new java.awt.Color(102, 0, 0));
        OperadorResta.setForeground(new java.awt.Color(255, 255, 255));
        OperadorResta.setText("-");
        OperadorResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperadorRestaMouseClicked(evt);
            }
        });

        B6.setBackground(new java.awt.Color(102, 0, 0));
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("6");
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        B8.setBackground(new java.awt.Color(102, 0, 0));
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("8");
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        B9.setBackground(new java.awt.Color(102, 0, 0));
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("9");
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        B0.setBackground(new java.awt.Color(102, 0, 0));
        B0.setForeground(new java.awt.Color(255, 255, 255));
        B0.setText("0");
        B0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B0MouseClicked(evt);
            }
        });

        OperandoIgual.setBackground(new java.awt.Color(102, 0, 0));
        OperandoIgual.setForeground(new java.awt.Color(255, 255, 255));
        OperandoIgual.setText("=");
        OperandoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperandoIgualMouseClicked(evt);
            }
        });

        Borrar.setBackground(new java.awt.Color(102, 0, 0));
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setText("AC");
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
        });

        BSEN.setBackground(new java.awt.Color(102, 0, 0));
        BSEN.setForeground(new java.awt.Color(255, 255, 255));
        BSEN.setText("sen");
        BSEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSENMouseClicked(evt);
            }
        });

        BCOS.setBackground(new java.awt.Color(102, 0, 0));
        BCOS.setForeground(new java.awt.Color(255, 255, 255));
        BCOS.setText("cos");
        BCOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCOSMouseClicked(evt);
            }
        });

        BTAN.setBackground(new java.awt.Color(102, 0, 0));
        BTAN.setForeground(new java.awt.Color(255, 255, 255));
        BTAN.setText("tan");
        BTAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTANMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora de Conversiòn ");

        BKG.setBackground(new java.awt.Color(102, 0, 0));
        BKG.setForeground(new java.awt.Color(255, 255, 255));
        BKG.setText("kg");
        BKG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BKGMouseClicked(evt);
            }
        });

        BG.setBackground(new java.awt.Color(102, 0, 0));
        BG.setForeground(new java.awt.Color(255, 255, 255));
        BG.setText("g");
        BG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BGMouseClicked(evt);
            }
        });

        BGradosC.setBackground(new java.awt.Color(102, 0, 0));
        BGradosC.setForeground(new java.awt.Color(255, 255, 255));
        BGradosC.setText("ºC");
        BGradosC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BGradosCMouseClicked(evt);
            }
        });

        BGradosF.setBackground(new java.awt.Color(102, 0, 0));
        BGradosF.setForeground(new java.awt.Color(255, 255, 255));
        BGradosF.setText("ºF");
        BGradosF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BGradosFMouseClicked(evt);
            }
        });

        BCM.setBackground(new java.awt.Color(102, 0, 0));
        BCM.setForeground(new java.awt.Color(255, 255, 255));
        BCM.setText("cm");
        BCM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCMMouseClicked(evt);
            }
        });

        BM.setBackground(new java.awt.Color(102, 0, 0));
        BM.setForeground(new java.awt.Color(255, 255, 255));
        BM.setText("m");
        BM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                    .addComponent(OperandoDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(OperadorResta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(OperadorSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(Cuadrodetexto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BKG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BGradosC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BCM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BGradosF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BSEN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BCOS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OperandoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OperandoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cuadrodetexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(B2)
                    .addComponent(B3)
                    .addComponent(OperadorSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4)
                    .addComponent(B5)
                    .addComponent(OperadorResta)
                    .addComponent(B6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7)
                    .addComponent(OperandoDivision)
                    .addComponent(B8)
                    .addComponent(B9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OperandoProducto)
                    .addComponent(OperandoIgual)
                    .addComponent(B0)
                    .addComponent(Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSEN)
                    .addComponent(BCOS)
                    .addComponent(BTAN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BKG)
                    .addComponent(BG)
                    .addComponent(BGradosC)
                    .addComponent(BGradosF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCM)
                    .addComponent(BM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
Cuadrodetexto.setText(Cuadrodetexto.getText()+"1");       
 
 
    }//GEN-LAST:event_B1MouseClicked

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
Cuadrodetexto.setText(Cuadrodetexto.getText()+"2");        
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
     Cuadrodetexto.setText(Cuadrodetexto.getText()+"3"); 
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
     Cuadrodetexto.setText(Cuadrodetexto.getText()+"4"); 
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
       Cuadrodetexto.setText(Cuadrodetexto.getText()+"5"); 
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
     Cuadrodetexto.setText(Cuadrodetexto.getText()+"6"); 
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
       Cuadrodetexto.setText(Cuadrodetexto.getText()+"7");
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        Cuadrodetexto.setText(Cuadrodetexto.getText()+"8");
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
       Cuadrodetexto.setText(Cuadrodetexto.getText()+"9");
    }//GEN-LAST:event_B9MouseClicked

    private void B0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B0MouseClicked
       Cuadrodetexto.setText(Cuadrodetexto.getText()+"0");
    }//GEN-LAST:event_B0MouseClicked

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked
        Cuadrodetexto.setText("");
    }//GEN-LAST:event_BorrarMouseClicked

    private void OperadorSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadorSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OperadorSumaActionPerformed

    private void OperadorSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperadorSumaMouseClicked
    ingresar(1);
    
    }//GEN-LAST:event_OperadorSumaMouseClicked

    void ingresar(int a){
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        aritmetica.operando1 = (double)valor;
        Cuadrodetexto.setText(""); 
        opcion=a;
    }
    
     
    
    private void OperadorRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperadorRestaMouseClicked
       
        ingresar(2);        
        
    }//GEN-LAST:event_OperadorRestaMouseClicked

    private void OperandoDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperandoDivisionMouseClicked
     
        ingresar(4);
    }//GEN-LAST:event_OperandoDivisionMouseClicked

    private void OperandoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperandoProductoMouseClicked
       ingresar(3);
    }//GEN-LAST:event_OperandoProductoMouseClicked

    private void OperandoIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperandoIgualMouseClicked

        switch(opcion){
            case 1:
               double valor = Double.parseDouble(Cuadrodetexto.getText());
        aritmetica.operando2 = (int)valor;
        Cuadrodetexto.setText(String.valueOf(aritmetica.suma()));
                 break;
                
            case 2:
                double valor1 = Double.parseDouble(Cuadrodetexto.getText());
        aritmetica.operando2 = (int)valor1;
        Cuadrodetexto.setText(String.valueOf(aritmetica.resta()));
        break;
            case 3:
               double valor2 = Double.parseDouble(Cuadrodetexto.getText());
        aritmetica.operando2 = (int)valor2;
        Cuadrodetexto.setText(String.valueOf(aritmetica.multiplicacion()));
        break;
            case 4:
                double valor3 = Double.parseDouble(Cuadrodetexto.getText());
        aritmetica.operando2 = (int)valor3;
        Cuadrodetexto.setText(String.valueOf(aritmetica.division()));
        break;
                
                
                
            
        }

    }//GEN-LAST:event_OperandoIgualMouseClicked

    private void BSENMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSENMouseClicked
       double valor = Double.parseDouble(Cuadrodetexto.getText());
        trigonometrica.angulo = Math.toRadians(valor);
        Cuadrodetexto.setText(String.valueOf(trigonometrica.seno()));  
    }//GEN-LAST:event_BSENMouseClicked

    private void BCOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCOSMouseClicked
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        trigonometrica.angulo = Math.toRadians(valor);
        Cuadrodetexto.setText(String.valueOf(trigonometrica.coseno()));
    }//GEN-LAST:event_BCOSMouseClicked

    private void BTANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTANMouseClicked
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        trigonometrica.angulo = Math.toRadians(valor);
        Cuadrodetexto.setText(String.valueOf(trigonometrica.tangente()));
    }//GEN-LAST:event_BTANMouseClicked

    private void BKGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKGMouseClicked
        // TODO add your handling code here:
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Peso = valor;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirKilogramos(valor)));
    }//GEN-LAST:event_BKGMouseClicked

    private void BGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseClicked
        // TODO add your handling code here:
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Peso = valor;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirGramos()));
       
    }//GEN-LAST:event_BGMouseClicked

    private void BGradosCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGradosCMouseClicked
        // TODO add your handling code here:
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Temperatura = valor;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirGcentigrados(valor)));
    }//GEN-LAST:event_BGradosCMouseClicked

    private void BGradosFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGradosFMouseClicked
        // TODO add your handling code here:
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Temperatura = valor;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirGfarenheit(valor)));
    }//GEN-LAST:event_BGradosFMouseClicked

    private void BMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMMouseClicked
        // TODO add your handling code here:
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Longitud = valor ;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirM(valor)));
    }//GEN-LAST:event_BMMouseClicked

    private void BCMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCMMouseClicked
        double valor = Double.parseDouble(Cuadrodetexto.getText());
        conversion.Longitud = valor;
        Cuadrodetexto.setText(String.valueOf(conversion.ConvertirCm(valor)));
    }//GEN-LAST:event_BCMMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BCM;
    private javax.swing.JButton BCOS;
    private javax.swing.JButton BG;
    private javax.swing.JButton BGradosC;
    private javax.swing.JButton BGradosF;
    private javax.swing.JButton BKG;
    private javax.swing.JButton BM;
    private javax.swing.JButton BSEN;
    private javax.swing.JButton BTAN;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Cuadrodetexto;
    private javax.swing.JButton OperadorResta;
    private javax.swing.JButton OperadorSuma;
    private javax.swing.JButton OperandoDivision;
    private javax.swing.JButton OperandoIgual;
    private javax.swing.JButton OperandoProducto;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
