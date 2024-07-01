package ex3.src;

public class ExeAluno {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, nota1, nota2);

        double media = aluno.media();
        boolean aprovado = aluno.aprovado();

        System.out.println("\nAluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);

        if (aprovado) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
            double quantoPrecisa = aluno.quantoPrecisa();
            System.out.println("O aluno precisa tirar " + quantoPrecisa + " no exame.");
        }
    }
}
