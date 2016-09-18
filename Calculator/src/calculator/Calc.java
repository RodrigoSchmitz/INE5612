/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author rodrigo
 */
public class Calc extends javax.swing.JPanel implements java.beans.Customizer {
    
    private ModelCalculator modelCalculator;

    public ModelCalculator getModelCalculator() {
        return modelCalculator;
    }

    public void setModelCalculator(ModelCalculator modelCalculator) {
        this.modelCalculator = modelCalculator;
    }

    /**
     * Creates new customizer calc
     */
    public Calc() {
        initComponents();
        modelCalculator = new ModelCalculator();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoInputDados = new javax.swing.JTextField();
        campoResposta = new javax.swing.JTextField();
        botaoDigito7 = new javax.swing.JButton();
        botaoDigito8 = new javax.swing.JButton();
        botaoDigito9 = new javax.swing.JButton();
        botaoDigitoDivide = new javax.swing.JButton();
        botaoDigito4 = new javax.swing.JButton();
        botaoDigito6 = new javax.swing.JButton();
        botaoDigito5 = new javax.swing.JButton();
        botaoDigitoMultiplicacao = new javax.swing.JButton();
        botaoDigito3 = new javax.swing.JButton();
        botaoDigito2 = new javax.swing.JButton();
        botaoDigito1 = new javax.swing.JButton();
        botaoDigito0 = new javax.swing.JButton();
        botaoDigitoSeparador = new javax.swing.JButton();
        botaoDigitoIgual = new javax.swing.JButton();
        botaoDigitoDiminui = new javax.swing.JButton();
        botaoDigitoSoma = new javax.swing.JButton();
        mensagensErro = new javax.swing.JLabel();

        botaoDigito7.setText("7");
        botaoDigito7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito7ActionPerformed(evt);
            }
        });

        botaoDigito8.setText("8");
        botaoDigito8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito8ActionPerformed(evt);
            }
        });

        botaoDigito9.setText("9");
        botaoDigito9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito9ActionPerformed(evt);
            }
        });

        botaoDigitoDivide.setText("/");
        botaoDigitoDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoDivideActionPerformed(evt);
            }
        });

        botaoDigito4.setText("4");
        botaoDigito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito4ActionPerformed(evt);
            }
        });

        botaoDigito6.setText("6");
        botaoDigito6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito6ActionPerformed(evt);
            }
        });

        botaoDigito5.setText("5");
        botaoDigito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito5ActionPerformed(evt);
            }
        });

        botaoDigitoMultiplicacao.setText("*");
        botaoDigitoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoMultiplicacaoActionPerformed(evt);
            }
        });

        botaoDigito3.setText("3");
        botaoDigito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito3ActionPerformed(evt);
            }
        });

        botaoDigito2.setText("2");
        botaoDigito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito2ActionPerformed(evt);
            }
        });

        botaoDigito1.setText("1");
        botaoDigito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito1ActionPerformed(evt);
            }
        });

        botaoDigito0.setText("0");
        botaoDigito0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigito0ActionPerformed(evt);
            }
        });

        botaoDigitoSeparador.setText(".");
        botaoDigitoSeparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoSeparadorActionPerformed(evt);
            }
        });

        botaoDigitoIgual.setText("=");
        botaoDigitoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoIgualActionPerformed(evt);
            }
        });

        botaoDigitoDiminui.setText("-");
        botaoDigitoDiminui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoDiminuiActionPerformed(evt);
            }
        });

        botaoDigitoSoma.setText("+");
        botaoDigitoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDigitoSomaActionPerformed(evt);
            }
        });

        mensagensErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoResposta)
            .addComponent(campoInputDados)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoDigito1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(botaoDigito0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoDigitoSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoDigito2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoDigitoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoDigito3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoDigito4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(botaoDigito7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoDigito5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoDigito6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoDigito8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoDigito9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDigitoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDigitoDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDigitoDiminui, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDigitoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mensagensErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(campoInputDados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(campoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDigito7)
                    .addComponent(botaoDigito8)
                    .addComponent(botaoDigito9)
                    .addComponent(botaoDigitoDivide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDigitoMultiplicacao)
                    .addComponent(botaoDigito6)
                    .addComponent(botaoDigito5)
                    .addComponent(botaoDigito4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDigito2)
                    .addComponent(botaoDigito3)
                    .addComponent(botaoDigito1)
                    .addComponent(botaoDigitoDiminui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDigitoIgual)
                    .addComponent(botaoDigitoSeparador)
                    .addComponent(botaoDigito0)
                    .addComponent(botaoDigitoSoma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensagensErro, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDigito7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito7ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "7");
    }//GEN-LAST:event_botaoDigito7ActionPerformed

    private void botaoDigito8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito8ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "8");
    }//GEN-LAST:event_botaoDigito8ActionPerformed

    private void botaoDigito9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito9ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "9");
    }//GEN-LAST:event_botaoDigito9ActionPerformed

    private void botaoDigitoDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoDivideActionPerformed
        if(modelCalculator.getPrimeiroConjunto() == null){
            try{
                modelCalculator.setPrimeiroConjunto(Float.parseFloat(campoInputDados.getText()));
                campoInputDados.setText(campoInputDados.getText() + " / ");
                modelCalculator.setOperador("/");
            } catch(NumberFormatException nfe){
                mensagensErro.setText("Erro de sintaxe");
            }
        }else{
            mensagensErro.setText("Porfavor insira o primeiro conjunto");
        }
    }//GEN-LAST:event_botaoDigitoDivideActionPerformed

    private void botaoDigito4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito4ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "4");
    }//GEN-LAST:event_botaoDigito4ActionPerformed

    private void botaoDigito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito5ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "5");
    }//GEN-LAST:event_botaoDigito5ActionPerformed

    private void botaoDigito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito6ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "6");
    }//GEN-LAST:event_botaoDigito6ActionPerformed

    private void botaoDigitoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoMultiplicacaoActionPerformed
        if(modelCalculator.getPrimeiroConjunto() == null){
            try{
                modelCalculator.setPrimeiroConjunto(Float.parseFloat(campoInputDados.getText()));
                campoInputDados.setText(campoInputDados.getText() + " * ");
                modelCalculator.setOperador("*");
            } catch(NumberFormatException nfe){
                mensagensErro.setText("Erro de sintaxe");
            }
        }else{
            mensagensErro.setText("Porfavor insira o primeiro conjunto");
        }
    }//GEN-LAST:event_botaoDigitoMultiplicacaoActionPerformed

    private void botaoDigito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito1ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "1");
    }//GEN-LAST:event_botaoDigito1ActionPerformed

    private void botaoDigito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito2ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "2");
    }//GEN-LAST:event_botaoDigito2ActionPerformed

    private void botaoDigito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito3ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "3");
    }//GEN-LAST:event_botaoDigito3ActionPerformed

    private void botaoDigitoDiminuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoDiminuiActionPerformed
        if(modelCalculator.getPrimeiroConjunto() == null){
            try{
                modelCalculator.setPrimeiroConjunto(Float.parseFloat(campoInputDados.getText()));
                campoInputDados.setText(campoInputDados.getText() + " - ");
                modelCalculator.setOperador("-");
            } catch(NumberFormatException nfe){
                mensagensErro.setText("Erro de sintaxe");
            }
        }else{
            mensagensErro.setText("Porfavor insira o primeiro conjunto");
        }
    }//GEN-LAST:event_botaoDigitoDiminuiActionPerformed

    private void botaoDigito0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigito0ActionPerformed
        campoInputDados.setText(campoInputDados.getText() + "0");
    }//GEN-LAST:event_botaoDigito0ActionPerformed

    private void botaoDigitoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoIgualActionPerformed
        if(modelCalculator.getPrimeiroConjunto() != null){
            String segundoConjunto = "";
            try{
                segundoConjunto = 
                                campoInputDados.getText().replace(" ", "")
                                        .substring(
                                                campoInputDados.getText()
                                                        .replace(" ", "")
                                                        .indexOf(modelCalculator.getOperador())
                                        ).replaceAll("\\"+modelCalculator.getOperador(), " ")
                                        .replaceAll(" ", "");
            } catch(NumberFormatException nfe){
                mensagensErro.setText("Erro de sintaxe");
            }
            if(!segundoConjunto.equals("")){
                modelCalculator.setSegundoConjunto(Float.parseFloat(segundoConjunto));
                String resultado = modelCalculator.calcular();
                campoResposta.setText(campoInputDados.getText() + " = " + resultado);
                campoInputDados.setText("");
            } else{
                mensagensErro.setText("Erro de sintaxe");
            }
        }else{
            mensagensErro.setText("Porfavor insira o primeiro conjunto");
        }
    }//GEN-LAST:event_botaoDigitoIgualActionPerformed

    private void botaoDigitoSeparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoSeparadorActionPerformed
        campoInputDados.setText(campoInputDados.getText() + ".");
    }//GEN-LAST:event_botaoDigitoSeparadorActionPerformed

    private void botaoDigitoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDigitoSomaActionPerformed
        if(modelCalculator.getPrimeiroConjunto() == null){
            try{
                modelCalculator.setPrimeiroConjunto(Float.parseFloat(campoInputDados.getText()));
                campoInputDados.setText(campoInputDados.getText() + " + ");
                modelCalculator.setOperador("+");
            } catch(NumberFormatException nfe){
                mensagensErro.setText("Erro de sintaxe");
            }
        }else{
            mensagensErro.setText("Porfavor insira o primeiro conjunto");
        }
    }//GEN-LAST:event_botaoDigitoSomaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDigito0;
    private javax.swing.JButton botaoDigito1;
    private javax.swing.JButton botaoDigito2;
    private javax.swing.JButton botaoDigito3;
    private javax.swing.JButton botaoDigito4;
    private javax.swing.JButton botaoDigito5;
    private javax.swing.JButton botaoDigito6;
    private javax.swing.JButton botaoDigito7;
    private javax.swing.JButton botaoDigito8;
    private javax.swing.JButton botaoDigito9;
    private javax.swing.JButton botaoDigitoDiminui;
    private javax.swing.JButton botaoDigitoDivide;
    private javax.swing.JButton botaoDigitoIgual;
    private javax.swing.JButton botaoDigitoMultiplicacao;
    private javax.swing.JButton botaoDigitoSeparador;
    private javax.swing.JButton botaoDigitoSoma;
    private javax.swing.JTextField campoInputDados;
    private javax.swing.JTextField campoResposta;
    private javax.swing.JLabel mensagensErro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setObject(Object bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
