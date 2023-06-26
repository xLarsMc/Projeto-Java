package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

import javax.swing.JOptionPane;


public class DataInvException extends Exception {
    public void impDataInv(){
        JOptionPane.showMessageDialog(
                null, 
                "A sua data de cadastro e invalida.\nEla deve conter apenas numeros e um total de 8 numeros (2 para dias, 2 para meses, 4 para o ano)\nDa seguinte maneira: 18092020 = dezoito de setembro de dois mil e vinte.",
                "Data Invalida",
                1
            );
    }
    public Pessoas corDataInv (Pessoas p1){
        try{
            p1.setDataCadastro(JOptionPane.showInputDialog(
                    null,
                    "\"Digite a nova data do cadastro do cliente:",
                    "Data Invalida",
                    1
            ));
        }
        catch(DataInvException die){
            die.impDataInv();
            p1 = die.corDataInv(p1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                null, 
                "A sua data deve ser um numero!",
                "Data Invalida",
                1
            );
            DataInvException die = new DataInvException();
            p1 = die.corDataInv(p1);
        }
        return p1;
    }
}
