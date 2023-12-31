//Leandro Henrique Oliveira Neves - RA: 2503514

package com.mycompany.projetopessoalfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class cadAp extends javax.swing.JFrame {

    private static cadAp cadApUnico;
    
    Aparelhos ap = new Aparelhos();
    
    public cadAp() {
        initComponents();
        setLocationRelativeTo( null );
    }
    
    /**
     *
     * @return
     */
    public static cadAp getCadAp(){
        if(cadApUnico == null){
            cadApUnico = new cadAp();
        }
        return cadApUnico;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGpModo = new javax.swing.ButtonGroup();
        msgNomeAp = new javax.swing.JLabel();
        msgMusculoFocado = new javax.swing.JLabel();
        msgParteCorpo = new javax.swing.JLabel();
        msgModoAp = new javax.swing.JLabel();
        msgCargaMin = new javax.swing.JLabel();
        msgCargaMax = new javax.swing.JLabel();
        entNomeAp = new javax.swing.JTextField();
        entMuscAp = new javax.swing.JTextField();
        entPartCorpAp = new javax.swing.JTextField();
        entCargaMinAp = new javax.swing.JTextField();
        entCargaMaxAp = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btEdit = new javax.swing.JToggleButton();
        btConsul = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        btListAp = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        btExc = new javax.swing.JToggleButton();
        btLivre = new javax.swing.JRadioButton();
        btApoio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        msgNomeAp.setText("Nome do Aparelho");

        msgMusculoFocado.setText("Musculo Focado");

        msgParteCorpo.setText("Parte do corpo trabalhada");

        msgModoAp.setText("Modo ");

        msgCargaMin.setText("Carga Minima Suportada (em kg)");

        msgCargaMax.setText("Carga Maxima Suportada (em kg)");

        entMuscAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entMuscApActionPerformed(evt);
            }
        });

        btCad.setText("Cadastro");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btEdit.setText("Editar");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btConsul.setText("Consultar");
        btConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsulActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btListAp.setText("Lista de Aparelhos cadastrados");
        btListAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListApActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExc.setText("Excluir");
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });

        btGpModo.add(btLivre);
        btLivre.setText("Livre");

        btGpModo.add(btApoio);
        btApoio.setText("Apoio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msgNomeAp)
                            .addComponent(msgCargaMax)
                            .addComponent(msgCargaMin)
                            .addComponent(msgModoAp)
                            .addComponent(msgMusculoFocado)
                            .addComponent(msgParteCorpo))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(entNomeAp, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(entMuscAp)
                                .addComponent(entPartCorpAp)
                                .addComponent(entCargaMinAp)
                                .addComponent(entCargaMaxAp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLivre)
                                .addGap(18, 18, 18)
                                .addComponent(btApoio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSair)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCad)
                                .addGap(18, 18, 18)
                                .addComponent(btEdit)))
                        .addGap(18, 18, 18)
                        .addComponent(btConsul)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btListAp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btExc)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgNomeAp)
                    .addComponent(entNomeAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgMusculoFocado)
                    .addComponent(entMuscAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgParteCorpo)
                    .addComponent(entPartCorpAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgModoAp)
                    .addComponent(btLivre)
                    .addComponent(btApoio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgCargaMin)
                    .addComponent(entCargaMinAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgCargaMax)
                    .addComponent(entCargaMaxAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCad)
                    .addComponent(btEdit)
                    .addComponent(btConsul)
                    .addComponent(btLimpar)
                    .addComponent(btExc))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btListAp))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entMuscApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entMuscApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entMuscApActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        btCad();
        limpTudo();
    }//GEN-LAST:event_btCadActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        btEdit();
        limpTudo();
    }//GEN-LAST:event_btEditActionPerformed

    private void btConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulActionPerformed
        btConsul();
    }//GEN-LAST:event_btConsulActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
       limpTudo();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btListApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListApActionPerformed
        listCadAp.getListCadAp().setVisible(true);
    }//GEN-LAST:event_btListApActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        btExc();
        limpTudo();
    }//GEN-LAST:event_btExcActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        fechar();
    }//GEN-LAST:event_btSairActionPerformed
    public void fechar(){
        int close = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja realmente sair?",
                        "Sair",
                        JOptionPane.YES_NO_OPTION
                );
        if(close == 0){
                dispose();
        }
    }
    public void limpTudo(){
        entNomeAp.setText("");
        entMuscAp.setText("");
        btGpModo.clearSelection();
        entPartCorpAp.setText("");
        entCargaMaxAp.setText("");
        entCargaMinAp.setText("");
    }
    public void btExc(){
        ap = new Aparelhos();
        ap.setNomeAparelho(entNomeAp.getText());
        
        ap = BancoArray.getBanco().delApNome(ap);
        
        if(ap != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Aparelho nao encontrado",
                    "Exclusao de aparelho",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Aparelho excluido com sucesso",
                    "Exclusao de aparelho",
                    1
            );
        }
        
    }
    public void btConsul(){
        ap = new Aparelhos();
        ap.setNomeAparelho(entNomeAp.getText());
        
        ap = BancoArray.getBanco().consApName(ap);
        
        if(ap != null){
            entNomeAp.setText(ap.getNomeAparelho());
            entMuscAp.setText(ap.getMusculo());
            entPartCorpAp.setText(ap.getParteCorpo());
            entCargaMaxAp.setText(Integer.toString(ap.getCargaMax()));
            entCargaMinAp.setText(Integer.toString(ap.getCargaMin()));
            if(ap.getModo().equalsIgnoreCase("livre")){
                btLivre.setSelected(true);
            }
            else if(ap.getModo().equalsIgnoreCase("apoio")){
                btApoio.setSelected(true);
            }
            
            JOptionPane.showMessageDialog(
                    null,
                    "Aparelho encontrado com sucesso!",
                    "Consulta aparelho",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Veículo não encontrado!",
                    "Consulta veiculo",
                    1
            );
        }
    }
    public void btEdit(){
        ap = new Aparelhos();
        ap.setNomeAparelho(entNomeAp.getText());
        
        ap = BancoArray.getBanco().editApNome(ap);
        
        if(ap != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Aparelho alterado!",
                    "Alteração de aparelho",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Aparelho não encontrado",
                    "Alteração de aparelho",
                    1
            );
        }
    }
    public void btCad(){
        ap = new Aparelhos();
        
        ap.setNomeAparelho(entNomeAp.getText());
        ap.setMusculo(entMuscAp.getText());
        ap.setParteCorpo(entPartCorpAp.getText());
        try{
            ap.setCargaMax(Integer.parseInt(entCargaMaxAp.getText()));
        } catch(NumberFormatException nfe){
            ap.setCargaMax(Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Carga Inválida! Digite numeros para a Carga",
                     "Carga invalida",
                    1
            )));
        }
        try{
            ap.setCargaMin(Integer.parseInt(entCargaMinAp.getText()));
        } catch(NumberFormatException nfe){
            ap.setCargaMin(Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Carga Inválida! Digite numeros para a Carga",
                     "Carga invalida",
                    1
            )));
        }
        if(btLivre.isSelected() == true){
            ap.setModo("Livre");
        }
        else if(btApoio.isSelected() == true){
            ap.setModo("Apoio");
        }
        ap = BancoArray.getBanco().cadAp(ap);
        
        if(ap != null){
            JOptionPane.showMessageDialog(
                null,
                "Aparelho cadastrado com sucesso!",
                "Cadastro de aparelho",
                1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Aparelho ja cadastrado!",
                "Cadastro de aparelho",
                1
            );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btApoio;
    private javax.swing.JButton btCad;
    private javax.swing.JToggleButton btConsul;
    private javax.swing.JToggleButton btEdit;
    private javax.swing.JToggleButton btExc;
    private javax.swing.ButtonGroup btGpModo;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btListAp;
    private javax.swing.JRadioButton btLivre;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JTextField entCargaMaxAp;
    private javax.swing.JTextField entCargaMinAp;
    private javax.swing.JTextField entMuscAp;
    private javax.swing.JTextField entNomeAp;
    private javax.swing.JTextField entPartCorpAp;
    private javax.swing.JLabel msgCargaMax;
    private javax.swing.JLabel msgCargaMin;
    private javax.swing.JLabel msgModoAp;
    private javax.swing.JLabel msgMusculoFocado;
    private javax.swing.JLabel msgNomeAp;
    private javax.swing.JLabel msgParteCorpo;
    // End of variables declaration//GEN-END:variables
    public String getEntNomeAp(){
        return entNomeAp.getText();
    }
    public String getEntMuscAp(){
        return entMuscAp.getText();
    }
    public String getEntModoAp(){
        if(btLivre.isSelected() == true){
            return "Livre";
        }
        else if(btApoio.isSelected() == true){
            return "Apoio";
        }
        return null;
    }
    public String getPartCorpAp(){
        return entPartCorpAp.getText();
    }
    public String getEntCargaMaxAp(){
        return entCargaMaxAp.getText();
    }
    public String getEntCargaMinAp(){
        return entCargaMinAp.getText();
    }
}
