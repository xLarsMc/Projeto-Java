package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

import javax.swing.JOptionPane;


public class CpfInvException extends Exception {

    public void impCpfInv(){
        JOptionPane.showMessageDialog(
                null, 
                "Seu cpf e invalido (deve conter 11 algarismos)! Digite um cpf valido.",
                "Cpf Inválido",
                1
            );
    }
    public Pessoas corCpfInv (Pessoas p1){
        
        try{
            
            p1.setCpf(Long.parseLong(JOptionPane.showInputDialog(
              null,
                    "Digite um novo cpf:",
                    "Cpf Inválido",
                    1
                )));
        }
        catch(CpfInvException cie){
            cie.impCpfInv();
            p1 = cie.corCpfInv(p1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
              null,
                    "O Cpf deve ser um numero!",
                    "Cpf Inválido",
                    1
                );
            CpfInvException cie = new CpfInvException();
            p1 = cie.corCpfInv(p1);
        }
        return p1;
    }
}
