package com.mycompany.projetopessoalfinal;

//Leandro Henrique Oliveira Neves - RA: 2503514

public class Aparelhos{

    private int cargaMin;
    private int cargaMax;
    private String nomeAparelho;
    private String parteCorpo;
    private String musculo;
    private String modo;

    public Aparelhos(){
        cargaMin = 0;
        cargaMax = 0;
        nomeAparelho = "";
        parteCorpo = "";
        musculo = "";
        modo = "";
    }
    public Aparelhos(int cargaMin, int cargaMax, String nomeAparelho, String parteCorpo, String musculo, String modo){
        this.cargaMin = cargaMin;
        this.cargaMax = cargaMax;
        this.nomeAparelho = nomeAparelho;
        this.parteCorpo = parteCorpo;
        this.musculo = musculo;
        this.modo = modo;
    }

    public int getCargaMin() {
        return cargaMin;
    }
    public void setCargaMin(int cargaMin) {
        this.cargaMin = cargaMin;
    }
    public int getCargaMax() {
        return cargaMax;
    }
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    public String getNomeAparelho() {
        return nomeAparelho;
    }
    public void setNomeAparelho(String nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }
    public String getParteCorpo() {
        return parteCorpo;
    }
    public void setParteCorpo(String parteCorpo) {
        this.parteCorpo = parteCorpo;
    }
    public String getMusculo() {
        return musculo;
    }
    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }
}