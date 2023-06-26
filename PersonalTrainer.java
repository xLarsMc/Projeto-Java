package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

public class PersonalTrainer extends Pessoas implements CalcMenSal {
    
    private String tipoPersonal; 
    private float horaAtuacao; 
    private float precoHora; 

    public PersonalTrainer(){
        tipoPersonal = "";
        horaAtuacao = 0f;
        precoHora = 0f;
    }
    //Polimorfismo por sobrecarga
    public PersonalTrainer(String tipoPersonal, float horaAtuacao, float precoHora, float qtdHoraAtua){
        this.tipoPersonal = tipoPersonal;
        this.horaAtuacao = horaAtuacao;
        this.precoHora = precoHora;
    }
    public String getTipoPersonal() {
        return tipoPersonal;
    }
    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
    public float getHoraAtuacao() {
        return horaAtuacao;
    }
    public void setHoraAtuacao(float horaAtuacao) {
        this.horaAtuacao = horaAtuacao;
    }
    public float getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(float precoHora) {
        this.precoHora = precoHora;
    }
    public float calc(){
        float soma = getPrecoHora() * getHoraAtuacao();
        return soma;
    }
    //Polimorfismo por sobrescrita
    public void apresentaDados(){
        System.out.println("Dados cadastrados:");
        System.out.println("Nome do personal: " + getNome());
        System.out.println("Idade do personal: " + getIdade());
        System.out.println("Cpf do personal: " + getCpf());
        System.out.println("Sexo do personal: " + getSexo());
        System.out.println("Data de cadastro do personal: " + getDataCadastro());
        System.out.println("Tipo do personal: " + getTipoPersonal());
        System.out.println("Quantidade de horas que o personal atua: " + getHoraAtuacao());
        System.out.println("Preço/hora do personal: " + getPrecoHora());
        System.out.println("Salario do personal: "+ calc());
    }
}
