package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

public abstract class Pessoas {
    private int idade;
    private long cpf;
    private String sexo;
    private String nome;
    private String dataCadastro;
    
    public Pessoas(){
        idade = 0;
        cpf = 0;
        nome = "";
        dataCadastro = "";
    }
    //Polimorfismo por sobrecarga
    public Pessoas(int idade, int cpf, String nome, String dataCadastro){
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) throws CpfInvException{
        if(String.valueOf(cpf).length() == 11 ){
                this.cpf = cpf;
        }
        else{
            throw new CpfInvException();
        }
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) throws DataInvException {
        if(dataCadastro.length() == 8){
            this.dataCadastro = dataCadastro;
        }
        else{
            throw new DataInvException();
        }
    }
    public abstract void apresentaDados();
    
}
