//Leandro Henrique Oliveira Neves - RA: 2503514

package com.mycompany.projetopessoalfinal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class listCadFuncionario extends javax.swing.JFrame {

    private static listCadFuncionario listCadFuncionarioUnic;
    
    Funcionarios f = new Funcionarios();
    
    public listCadFuncionario() {
        initComponents();
        setLocationRelativeTo( null );
    }

    public static listCadFuncionario getListCadFuncionario(){
        if(listCadFuncionarioUnic == null){
            listCadFuncionarioUnic = new listCadFuncionario();
        }
        return listCadFuncionarioUnic;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabAp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cpf", "Idade", "Sexo", "Data Cad.", "Turno Serv.", "Salario", "Funcao"
            }
        ));
        jScrollPane1.setViewportView(tabAp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        attLista();
    }//GEN-LAST:event_formWindowActivated
    public void attLista(){
        DefaultTableModel tabApMod = (DefaultTableModel)tabAp.getModel();
        
        int lin = 0;
        tabApMod.setRowCount(lin);
        
        for(Funcionarios f : BancoArray.getBanco().getBdFn()){
            tabApMod.insertRow(lin, new Object[]{f.getNome(), f.getCpf(), f.getIdade(), f.getSexo(), f.getDataCadastro(), f.getTurnoServico(), f.getSalario(), f.getFuncao()});
            lin++;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAp;
    // End of variables declaration//GEN-END:variables
}
