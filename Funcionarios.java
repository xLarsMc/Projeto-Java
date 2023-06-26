package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

public class Funcionarios extends Pessoas {
    
    private float salario;
    private String turnoServico;
    private String funcao;

    public Funcionarios(){
        salario = 0f;
        turnoServico = "";
        funcao = "";
    }
    //Polimorfismo por sobrecarga
    public Funcionarios(float salario, String turnoServico, String funcao){
        this.salario = salario;
        this.turnoServico = turnoServico;
        this.funcao = funcao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getTurnoServico() {
        return turnoServico;
    }
    public void setTurnoServico(String turnoServico) {
        this.turnoServico = turnoServico;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    //Polimorfismo por sobrescrita
    public void apresentaDados(){
        System.out.println("Dados cadastrados:");
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Idade do funcionário: " + getIdade());
        System.out.println("Cpf do funcionário: " + getCpf());
        System.out.println("Sexo do funcionário: " + getSexo());
        System.out.println("Data de cadastro do funcionário: " + getDataCadastro());
        System.out.println("Salário do funcionário: " + getSalario());
        System.out.println("Turno em que o funcionário atua: " + getTurnoServico());
        System.out.println("Função do funcionário: " + getFuncao());
    }
}
