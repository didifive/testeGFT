package Teste04.modelo;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calculaIMC(){
        return peso / Math.pow(altura,2);
    }
}
