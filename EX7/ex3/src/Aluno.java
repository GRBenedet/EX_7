package ex3.src;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(int matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return media() >= 7.0;
    }

    public double quantoPrecisa() {
        return (50 - media() * 6) / 4;
    }
    
}