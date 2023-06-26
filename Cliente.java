package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

public class Cliente extends Pessoas implements CalcMenSal {
    
    private int numMatricula;
    private String tipoContrato; 
    private String personalParticular; 
    private String focoTreino; 

    public Cliente(){
        numMatricula = 0;
        tipoContrato = "";
        personalParticular = "";
        focoTreino = "";
    }
    //Polimorfismo por sobrecarga
    public Cliente(int numMatricula ,float mensalidade, String tipoContrato, String personalParticular, String focoTreino){
        this.numMatricula = numMatricula;
        this.tipoContrato = tipoContrato;
        this.personalParticular = personalParticular;
        this.focoTreino = focoTreino;
    }
    public int getNumMatricula(){
        return numMatricula;
    }
    public void setNumMatricula(int numMatricula){
        this.numMatricula = numMatricula;
    }
    public String getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public String getPersonalParticular() {
        return personalParticular;
    }
    public void setPersonalParticular(String personalParticular) {
        this.personalParticular = personalParticular;
    }
    public String getFocoTreino() {
        return focoTreino;
    }
    public void setFocoTreino(String focoTreino) {
        this.focoTreino = focoTreino;
    }
    public float calc(){
        float soma;
        if(getTipoContrato().equalsIgnoreCase("Mensal")){
            soma = 120 * 12;
        }
        else{
            soma = 95 * 12;
        }
        return soma;
    }
    //Polimorfismo por sobrescrita
    public void apresentaDados(){
        System.out.println("Dados cadastrados:");
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("Idade do cliente: " + getIdade());
        System.out.println("Cpf do cliente: " + getCpf());
        System.out.println("Sexo do cliente: " + getSexo());
        System.out.println("Data de cadastro do cliente: " + getDataCadastro());
            if(getTipoContrato().equalsIgnoreCase("Mensal")){
                System.out.println("Seu contrato é mensal.");
                System.out.println("O valor que voce pagara com o seu contrato (mensal) anualmente é de " + calc());
            }
            else{
                System.out.println("Seu contrato é anual");
                System.out.println("O valor que voce pagara com o seu contrato (anual) anualmente é de " + calc());
            }
        System.out.println("Turno em que o cliente atua: " + getPersonalParticular());
        System.out.println("Função do cliente: " + getFocoTreino());
    }
}
