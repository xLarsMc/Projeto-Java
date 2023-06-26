//Leandro Henrique Oliveira Neves - RA: 2503514

package com.mycompany.projetopessoalfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class cadCliente extends javax.swing.JFrame {

    private static cadCliente cadClienteUnico;
    
    Cliente c = new Cliente();
    
    public cadCliente() {
        initComponents();
        setLocationRelativeTo( null );
    }
    
    /**
     *
     * @return
     */
    public static cadCliente getCadCliente(){
        if(cadClienteUnico == null){
            cadClienteUnico = new cadCliente();
        }
        return cadClienteUnico;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGpTipoCont = new javax.swing.ButtonGroup();
        btGpPersPart = new javax.swing.ButtonGroup();
        btGpSexo = new javax.swing.ButtonGroup();
        msgNomeAp = new javax.swing.JLabel();
        msgCpf = new javax.swing.JLabel();
        msgSexo = new javax.swing.JLabel();
        msgIdade = new javax.swing.JLabel();
        msgNumMatri = new javax.swing.JLabel();
        msgTipoContrato = new javax.swing.JLabel();
        msgFocoTreino = new javax.swing.JLabel();
        msgPersPart = new javax.swing.JLabel();
        entNomeAp = new javax.swing.JTextField();
        entCpf = new javax.swing.JTextField();
        entIdade = new javax.swing.JTextField();
        entNumMat = new javax.swing.JTextField();
        entFocoTreino = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();
        btEdit = new javax.swing.JToggleButton();
        btConsul = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        btListAp = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        btExc = new javax.swing.JToggleButton();
        msgDataCad = new javax.swing.JLabel();
        entDataCad = new javax.swing.JTextField();
        rdBtMensal = new javax.swing.JRadioButton();
        rdBtAnual = new javax.swing.JRadioButton();
        rdBtSim = new javax.swing.JRadioButton();
        rdBtNao = new javax.swing.JRadioButton();
        rdBtMasc = new javax.swing.JRadioButton();
        rdBtFem = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        msgNomeAp.setText("Nome");

        msgCpf.setText("CPF");

        msgSexo.setText("Sexo");

        msgIdade.setText("Idade");

        msgNumMatri.setText("Número da Matricula");

        msgTipoContrato.setText("Tipo do contrato ");

        msgFocoTreino.setText("Foco do treino");

        msgPersPart.setText("Personal Particular");

        entCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entCpfActionPerformed(evt);
            }
        });

        entFocoTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entFocoTreinoActionPerformed(evt);
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

        btListAp.setText("Lista de Cliente cadastrados");
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

        msgDataCad.setText("Data cadastro (apenas numeros)");

        btGpTipoCont.add(rdBtMensal);
        rdBtMensal.setText("Mensal");

        btGpTipoCont.add(rdBtAnual);
        rdBtAnual.setText("Anual");
        rdBtAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtAnualActionPerformed(evt);
            }
        });

        btGpPersPart.add(rdBtSim);
        rdBtSim.setText("Sim");

        btGpPersPart.add(rdBtNao);
        rdBtNao.setText("Não");

        btGpSexo.add(rdBtMasc);
        rdBtMasc.setText("Masculino");

        btGpSexo.add(rdBtFem);
        rdBtFem.setText("Feminino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btListAp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCad)
                                .addGap(18, 18, 18)
                                .addComponent(btEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btConsul)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btExc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(msgSexo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(msgNomeAp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(entNomeAp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(msgPersPart)
                                        .addGap(5, 5, 5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(msgIdade)
                                                    .addComponent(msgCpf)
                                                    .addComponent(msgDataCad))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(entDataCad, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                    .addComponent(entCpf)
                                                    .addComponent(entIdade)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(msgNumMatri)
                                                .addGap(95, 95, 95)
                                                .addComponent(entNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(msgTipoContrato)
                                            .addComponent(msgFocoTreino))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entFocoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(rdBtMensal))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(rdBtSim)))
                                                .addGap(30, 30, 30))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(rdBtMasc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdBtNao)
                                            .addComponent(rdBtAnual)
                                            .addComponent(rdBtFem))))))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msgFocoTreino)
                        .addComponent(entFocoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(msgNumMatri)
                    .addComponent(entNumMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgCpf)
                    .addComponent(entCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgTipoContrato)
                    .addComponent(rdBtMensal)
                    .addComponent(rdBtAnual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgPersPart)
                    .addComponent(rdBtSim)
                    .addComponent(rdBtNao)
                    .addComponent(msgNomeAp)
                    .addComponent(entNomeAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msgIdade)
                        .addComponent(entIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(msgSexo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdBtMasc)
                        .addComponent(rdBtFem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgDataCad))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCad)
                    .addComponent(btEdit)
                    .addComponent(btConsul)
                    .addComponent(btLimpar)
                    .addComponent(btExc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btListAp))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entCpfActionPerformed

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
        listCadCliente.getListCadCliente().setVisible(true);
    }//GEN-LAST:event_btListApActionPerformed

    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
        btExc();
        limpTudo();
    }//GEN-LAST:event_btExcActionPerformed

    private void entFocoTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entFocoTreinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entFocoTreinoActionPerformed

    private void rdBtAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtAnualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtAnualActionPerformed

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
        entCpf.setText("");
        entIdade.setText("");
        entNumMat.setText("");
        entFocoTreino.setText("");
        entDataCad.setText("");
        btGpPersPart.clearSelection();
        btGpSexo.clearSelection();
        btGpTipoCont.clearSelection();
    }
    public void btExc(){
        Cliente c = new Cliente();
        c.setNumMatricula(Integer.parseInt(entNumMat.getText()));
        
        c = BancoArray.getBanco().delClMat(c);
        
        if(c != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente nao encontrado",
                    "Exclusao de cliente",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente excluido com sucesso",
                    "Exclusao de cliente",
                    1
            );
        }
        
    }
    public void btConsul(){
        Cliente c = new Cliente();
        c.setNumMatricula(Integer.parseInt(entNumMat.getText()));
        
        c = BancoArray.getBanco().consClMat(c);
        
        if(c != null){
            entNomeAp.setText(c.getNome());
            entCpf.setText(Long.toString(c.getCpf()));
            try{
                entIdade.setText(Integer.toString(c.getIdade()));
            } catch(NumberFormatException nfe){
                entIdade.setText((JOptionPane.showInputDialog(
                        null,
                        "Idade invalida! Digite numeros para a idade",
                        "Idade invalida",
                        1
                )));
            }
            entNumMat.setText(Integer.toString(c.getNumMatricula()));
            try{
                entNumMat.setText(Integer.toString(c.getNumMatricula()));
            } catch(NumberFormatException nfe){
                entNumMat.setText((JOptionPane.showInputDialog(
                        null,
                        "Numero da Matricula invalida! Digite numeros para a Matricula",
                        "Numero da Matricula invalida",
                        1
                )));
            }
            entFocoTreino.setText(c.getFocoTreino());
            entDataCad.setText(c.getDataCadastro());
            if (c.getTipoContrato().equalsIgnoreCase("Mensal")){
                rdBtMensal.setSelected(true);
            }
            else if(c.getTipoContrato().equalsIgnoreCase("Anual")){
                rdBtAnual.setSelected(true);
            }
            if(c.getPersonalParticular().equalsIgnoreCase("Sim")){
                rdBtSim.setSelected(true);
            }
            else if(c.getPersonalParticular().equalsIgnoreCase("Nao")){
                rdBtNao.setSelected(true);
            }
            if(c.getSexo().equalsIgnoreCase("Masculino")){
                rdBtMasc.setSelected(true);
            }
            else if(c.getSexo().equalsIgnoreCase("Feminino")){
                rdBtFem.setSelected(true);
            }
            
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente encontrado com sucesso!",
                    "Consulta Cliente",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente não encontrado!",
                    "Consulta cliente",
                    1
            );
        }
    }
    public void btEdit(){
        Cliente c = new Cliente();
        c.setNumMatricula(Integer.parseInt(entNumMat.getText()));
        
        c = BancoArray.getBanco().altClMat(c);
        
        if(c != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente alterado!",
                    "Alteração de Cliente",
                    1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente não encontrado",
                    "Alteração de cliente",
                    1
            );
        }
    }
    public void btCad(){
        c = new Cliente();
        
        c.setNome(entNomeAp.getText());
        try{
            c.setCpf(Long.parseLong(entCpf.getText()));
        }
        catch(CpfInvException cie){
            cie.impCpfInv();
            cie.corCpfInv(c);
        }
        catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                null, 
                "Seu cpf e invalido (Deve ser digitado numeros)! Digite um cpf valido.",
                "Cpf Inválido",
                1
            );
            CpfInvException cie = new CpfInvException();
            cie.corCpfInv(c);
        }
        try{
            c.setIdade(Integer.parseInt(entIdade.getText()));
        }
        catch(NumberFormatException nfe){
            c.setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Digite uma nova idade",
                    "Idade inválida",
                    1
            )));
        }
        if(rdBtMasc.isSelected() == true){
            c.setSexo("Masculino");
        }
        else if(rdBtFem.isSelected() == true){
            c.setSexo("Feminino");
        }
        try{
            c.setNumMatricula(Integer.parseInt(entNumMat.getText()));
        } catch(NumberFormatException nfe){
            c.setNumMatricula(Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Numero da Matricula invalida! Digite numeros para a Matricula",
                    "Numero da Matricula invalida",
                    1
            )));
            
        }
        c.setFocoTreino(entFocoTreino.getText());
        if(rdBtAnual.isSelected() == true){
            c.setTipoContrato("Anual");
        }
        else if(rdBtMensal.isSelected() == true){
            c.setTipoContrato("Mensal");
        }
        if(rdBtSim.isSelected() == true){
            c.setPersonalParticular("Sim");
        }
        else if(rdBtNao.isSelected() == true){
            c.setPersonalParticular("Nao");
        }
        try{
            c.setDataCadastro(entDataCad.getText());            
        }
        catch(DataInvException die){
            die.impDataInv();
            die.corDataInv(c);
        }
        catch(NumberFormatException nfe){
            try{
                c.setDataCadastro(JOptionPane.showInputDialog(
                    null,
                    "Numero da Matricula invalida! Digite numeros para a Matricula",
                    "Numero da Matricula invalida",
                    1
                ));
            }catch(DataInvException die){
            die.impDataInv();
            die.corDataInv(c);
        }
            DataInvException die = new DataInvException();
            die.corDataInv(c);
        }
        c = BancoArray.getBanco().cadCl(c);
        
        if(c != null){
            JOptionPane.showMessageDialog(
                null,
                "Cliente cadastrado com sucesso!",
                "Cadastro de cliente",
                1
            );
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Cliente ja cadastrado!",
                "Cadastro de cliente",
                1
            );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JToggleButton btConsul;
    private javax.swing.JToggleButton btEdit;
    private javax.swing.JToggleButton btExc;
    private javax.swing.ButtonGroup btGpPersPart;
    private javax.swing.ButtonGroup btGpSexo;
    private javax.swing.ButtonGroup btGpTipoCont;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btListAp;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JTextField entCpf;
    private javax.swing.JTextField entDataCad;
    private javax.swing.JTextField entFocoTreino;
    private javax.swing.JTextField entIdade;
    private javax.swing.JTextField entNomeAp;
    private javax.swing.JTextField entNumMat;
    private javax.swing.JLabel msgCpf;
    private javax.swing.JLabel msgDataCad;
    private javax.swing.JLabel msgFocoTreino;
    private javax.swing.JLabel msgIdade;
    private javax.swing.JLabel msgNomeAp;
    private javax.swing.JLabel msgNumMatri;
    private javax.swing.JLabel msgPersPart;
    private javax.swing.JLabel msgSexo;
    private javax.swing.JLabel msgTipoContrato;
    private javax.swing.JRadioButton rdBtAnual;
    private javax.swing.JRadioButton rdBtFem;
    private javax.swing.JRadioButton rdBtMasc;
    private javax.swing.JRadioButton rdBtMensal;
    private javax.swing.JRadioButton rdBtNao;
    private javax.swing.JRadioButton rdBtSim;
    // End of variables declaration//GEN-END:variables
    public String getEntNomeAp(){
        return entNomeAp.getText();
    }
    public String getDataCad(){
        return entDataCad.getText();
    }
    public String getEntCpf(){
        return entCpf.getText();
    }
    public String getEntIdade(){
        return entIdade.getText();
    }
    public String getEntNumMat(){
        return entNumMat.getText();
    }
    public String getEntFocoTreino(){
        return entFocoTreino.getText();
    }
    public String getEntTipoCont(){
        if(rdBtAnual.isSelected() == true){
            return "Anual";
        }
        else if(rdBtMensal.isSelected() == true){
            return "Mensal";
        }
        return null;
    }
    public String getEntPersonalParticular(){
        if(rdBtSim.isSelected() == true){
            return "Sim";
        }
        else if(rdBtNao.isSelected() == true){
            return "Nao";
        }
        return null;
    }
    public String getEntSexo(){
        if(rdBtMasc.isSelected() == true){
            return "Masculino";
        }
        else if(rdBtFem.isSelected() == true){
            return "Feminino";
        }
        return null;
    }
}