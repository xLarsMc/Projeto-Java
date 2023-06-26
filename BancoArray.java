//Leandro Henrique Oliveira Neves - RA: 2503514

package com.mycompany.projetopessoalfinal;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoArray {
    static Aparelhos ap = new Aparelhos();
    static Cliente c = new Cliente();
    static Funcionarios f = new Funcionarios();
    static PersonalTrainer pt = new PersonalTrainer();
    
    static List<Aparelhos> bdAparelhos;
    static List<Cliente> bdCliente;
    static List<Funcionarios> bdFuncionarios;
    static List<PersonalTrainer> bdPt;
    
    private static BancoArray bancoUnico;
    
    private BancoArray(){
        bdAparelhos = new ArrayList<Aparelhos>();
        bdCliente = new ArrayList<Cliente>();
        bdFuncionarios = new ArrayList<Funcionarios>();
        bdPt = new ArrayList<PersonalTrainer>();
    }
    
    public static BancoArray getBanco(){
        if(bancoUnico == null){
            bancoUnico = new BancoArray(); 
        }
        return bancoUnico;
    }
    
    public List<Aparelhos> getBdAp(){
        return bdAparelhos;
    }
    public List<Cliente> getBdCl(){
        return bdCliente;
    }
    public List<Funcionarios> getBdFn(){
        return bdFuncionarios;
    }
    public List<PersonalTrainer> getBdPt(){
        return bdPt;
    }
    
    public static Aparelhos consApName(Aparelhos ap){
        for(int i = 0; i < bdAparelhos.size(); i++){
            if(ap.getNomeAparelho().equalsIgnoreCase(bdAparelhos.get(i).getNomeAparelho())){
                return bdAparelhos.get(i);
            }
        }
        return null;
    }
    public static Aparelhos cadAp(Aparelhos ap){
        if(consApName(ap) == null){
            bdAparelhos.add(ap);
            return ap;
        }
        return null;
    }
    public static Aparelhos delApNome(Aparelhos ap){
        for(int i = 0; i < bdAparelhos.size(); i++){
             if(ap.getNomeAparelho().equalsIgnoreCase(bdAparelhos.get(i).getNomeAparelho())){
                 bdAparelhos.remove(bdAparelhos.get(i));
                 return null;
             }
        }
        return ap;
    }
    public static Aparelhos editApNome(Aparelhos ap){
        for(int i = 0; i < bdAparelhos.size(); i++){
            if(bdAparelhos.get(i).getNomeAparelho().equalsIgnoreCase(ap.getNomeAparelho())){
                bdAparelhos.get(i).setNomeAparelho(cadAp.getCadAp().getEntNomeAp());
                try{
                    bdAparelhos.get(i).setCargaMax(Integer.parseInt(cadAp.getCadAp().getEntCargaMaxAp()));
                }
                catch(NumberFormatException nfe){
                    bdAparelhos.get(i).setCargaMax(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova Carga",
                            "Carga inválida",
                            1
                    )));
                }
                try{
                    bdAparelhos.get(i).setCargaMin(Integer.parseInt(cadAp.getCadAp().getEntCargaMinAp()));
                }
                catch(NumberFormatException nfe){
                    bdAparelhos.get(i).setCargaMin(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova Carga",
                            "Carga inválida",
                            1
                    )));
                }
                bdAparelhos.get(i).setModo(cadAp.getCadAp().getEntModoAp());
                bdAparelhos.get(i).setMusculo(cadAp.getCadAp().getEntMuscAp());
                bdAparelhos.get(i).setParteCorpo(cadAp.getCadAp().getPartCorpAp());
                return bdAparelhos.get(i);
            }
        }
        return null;
    }
    public static Cliente consClMat(Cliente c){
        for(int i = 0; i < bdCliente.size(); i++){
            if(c.getNumMatricula() == bdCliente.get(i).getNumMatricula()){
                return bdCliente.get(i);
            }
        }
        return null;
    }
    public static Cliente cadCl(Cliente c){
        if(consClMat(c) == null){
            bdCliente.add(c);
            return c;
        }
        return null;
    }
    public static Cliente delClMat(Cliente c){
        for(int i = 0; i < bdCliente.size(); i++){
            if(c.getNumMatricula() == bdCliente.get(i).getNumMatricula()){
                 bdCliente.remove(bdCliente.get(i));
                 return null;
             }
        }
        return c;
    }
    
    public static Cliente altClMat(Cliente c){
        for(int i = 0; i < bdCliente.size(); i++){
            if(c.getNumMatricula() == bdCliente.get(i).getNumMatricula()){
                try{
                    bdCliente.get(i).setCpf(Long.parseLong(cadCliente.getCadCliente().getEntCpf()));
                }catch(CpfInvException cie){
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
                bdCliente.get(i).setNome(cadCliente.getCadCliente().getEntNomeAp());
                try{
                    bdCliente.get(i).setIdade(Integer.parseInt(cadCliente.getCadCliente().getEntIdade()));
                }
                catch(NumberFormatException nfe){
                    bdCliente.get(i).setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova idade",
                            "Idade inválida",
                            1
                    )));
                }
                bdCliente.get(i).setSexo(cadCliente.getCadCliente().getEntSexo());
                bdCliente.get(i).setNumMatricula(Integer.parseInt(cadCliente.getCadCliente().getEntNumMat()));
                try{
                    bdCliente.get(i).setNumMatricula(Integer.parseInt(cadCliente.getCadCliente().getEntNumMat()));
                } catch(NumberFormatException nfe){
                    bdCliente.get(i).setNumMatricula(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Numero da Matricula invalida! Digite numeros para a Matricula",
                             "Numero da Matricula invalida",
                            1
                    )));
                }
                bdCliente.get(i).setFocoTreino(cadCliente.getCadCliente().getEntFocoTreino());
                bdCliente.get(i).setTipoContrato(cadCliente.getCadCliente().getEntTipoCont());
                bdCliente.get(i).setPersonalParticular(cadCliente.getCadCliente().getEntPersonalParticular());
                try{
                    bdCliente.get(i).setDataCadastro(cadCliente.getCadCliente().getDataCad());
                }
                catch(DataInvException die){
                    die.impDataInv();
                    die.corDataInv(c);
                }
                return bdCliente.get(i);
            }
        }
        return null;
    }
    
    public static Funcionarios consFunCpf(Funcionarios f){
        PersonalTrainer pt = new PersonalTrainer();
        try{
            pt.setCpf(pt.getCpf());
        }
        catch(CpfInvException | NumberFormatException cie){
        }
        for(int i = 0; i < bdFuncionarios.size(); i++){
                if(consPt(pt) == null){
                    if(f.getCpf() == bdFuncionarios.get(i).getCpf()){
                        return bdFuncionarios.get(i);
                }
            }
        }
        return null;
    }
    public static Funcionarios cadFunc(Funcionarios f){
        if(consFunCpf(f) == null){
            bdFuncionarios.add(f);
            return f;
        }
        return null;
    }
    public static Funcionarios delFuncCpf(Funcionarios f){
        for(int i = 0; i < bdFuncionarios.size(); i++){
            if(f.getCpf() == bdFuncionarios.get(i).getCpf()){
                 bdFuncionarios.remove(bdFuncionarios.get(i));
                 return null;
             }
        }
        return f;
    }

    public static Funcionarios altFunCpf(Funcionarios f){
        for(int i = 0; i < bdFuncionarios.size(); i++){
            if(f.getCpf() == bdFuncionarios.get(i).getCpf()){
                try{
                    bdFuncionarios.get(i).setCpf(Long.parseLong(cadFuncionarios.getCadFuncionarios().getEntCpf()));
                }catch(CpfInvException cie){
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
                bdFuncionarios.get(i).setNome(cadFuncionarios.getCadFuncionarios().getEntNomeAp());
                try{
                    bdFuncionarios.get(i).setIdade(Integer.parseInt(cadFuncionarios.getCadFuncionarios().getEntIdade()));
                }
                catch(NumberFormatException nfe){
                    bdFuncionarios.get(i).setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova idade",
                            "Idade inválida",
                            1
                    )));
                }
                bdFuncionarios.get(i).setSexo(cadFuncionarios.getCadFuncionarios().getEntSexo());
                try{
                    bdFuncionarios.get(i).setDataCadastro(cadFuncionarios.getCadFuncionarios().getDataCad());
                }
                catch(DataInvException die){
                    die.impDataInv();
                    die.corDataInv(c);
                }
                try{
                    bdFuncionarios.get(i).setSalario(Float.parseFloat(cadFuncionarios.getCadFuncionarios().getEntSal()));
                }
                catch(NumberFormatException nfe){
                    bdFuncionarios.get(i).setSalario(Float.parseFloat(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova idade",
                            "Idade inválida",
                            1
                    )));
                }
                bdFuncionarios.get(i).setTurnoServico(cadFuncionarios.getCadFuncionarios().getEntTurnServ());
                bdFuncionarios.get(i).setFuncao(cadFuncionarios.getCadFuncionarios().getEntFunc());
                return bdFuncionarios.get(i);
            }
        }
    return null;
}
    public static PersonalTrainer consPt(PersonalTrainer pt){
        Funcionarios f = new Funcionarios();
        try{
            f.setCpf(pt.getCpf());
        }
        catch(CpfInvException | NumberFormatException cie){
        }
        for(int i = 0; i < bdPt.size(); i++){
                if(consFunCpf(f) == null){
                    if(pt.getCpf() == bdPt.get(i).getCpf()){
                        return bdPt.get(i);
                }
            }
        }
        return null;
    }
    public static PersonalTrainer cadPt(PersonalTrainer pt){
        if(consPt(pt) == null){
            bdPt.add(pt);
            return pt;
        }
        return null;
    }
    public static PersonalTrainer delPtCpf(PersonalTrainer pt){
        for(int i = 0; i < bdPt.size(); i++){
            if(pt.getCpf() == bdPt.get(i).getCpf()){
                 bdPt.remove(bdPt.get(i));
                 return null;
            }
        }
        return pt;
    }

    public static PersonalTrainer altPtCpf(PersonalTrainer pt){
        for(int i = 0; i < bdPt.size(); i++){
            if(pt.getCpf() == bdPt.get(i).getCpf()){
                try{
                    bdPt.get(i).setCpf(Long.parseLong(cadPersonalTrainer.getCadPersonalTrainer().getEntCpf()));
                }catch(CpfInvException cie){
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
                   bdPt.get(i).setDataCadastro(cadPersonalTrainer.getCadPersonalTrainer().getDataCad());
                }
                catch(DataInvException die){
                    die.impDataInv();
                    die.corDataInv(c);
                }
                bdPt.get(i).setNome(cadPersonalTrainer.getCadPersonalTrainer().getEntNomeAp());
                bdPt.get(i).setIdade(Integer.parseInt(cadPersonalTrainer.getCadPersonalTrainer().getEntIdade()));
                try{
                    bdPt.get(i).setIdade(Integer.parseInt(cadPersonalTrainer.getCadPersonalTrainer().getEntIdade()));
                }
                catch(NumberFormatException nfe){
                    bdPt.get(i).setIdade(Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova idade",
                            "Idade inválida",
                            1
                    )));
                }
                try{
                    bdPt.get(i).setPrecoHora(Float.parseFloat(cadPersonalTrainer.getCadPersonalTrainer().getEntPrecoHora()));
                }
                catch(NumberFormatException nfe){
                    bdPt.get(i).setPrecoHora(Float.parseFloat(JOptionPane.showInputDialog(
                            null,
                            "Digite uma nova hora (numeros)",
                            "Hora inválida",
                            1
                    )));
                }
                try{
                    bdPt.get(i).setHoraAtuacao(Float.parseFloat(cadPersonalTrainer.getCadPersonalTrainer().getEntQtdHora()));
                }
                catch(NumberFormatException nfe){
                    bdPt.get(i).setHoraAtuacao(Float.parseFloat(JOptionPane.showInputDialog(
                            null,
                            "Digite um novo preco/hora (numeros)",
                            "Hora inválida",
                            1
                    )));
                }
                bdPt.get(i).setTipoPersonal(cadPersonalTrainer.getCadPersonalTrainer().getEntTipoPers());
                bdPt.get(i).setSexo(cadPersonalTrainer.getCadPersonalTrainer().getEntSexo());
                return bdPt.get(i);
            }
        }
        return null;
    }
}
