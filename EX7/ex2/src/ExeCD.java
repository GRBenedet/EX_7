package ex2.src;

public class ExeCD {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o número de músicas do CD: ");
        int numMusicas = scanner.nextInt();
        CD cd = new CD(numMusicas);

        int comando = -1;
        while (comando != 0) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Play");
            System.out.println("2 - Pause");
            System.out.println("3 - Stop");
            System.out.println("4 - Próxima faixa");
            System.out.println("5 - Faixa anterior");
            System.out.println("0 - Sair");
            System.out.print("Digite um comando: ");
            comando = scanner.nextInt();

            switch (comando) {
                case 1:
                    cd.play();
                    break;
                case 2:
                    cd.pause();
                    break;
                case 3:
                    cd.stop();
                    break;
                case 4:
                    cd.proximaFaixa();
                    break;
                case 5:
                    cd.faixaAnterior();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido!");
            }
        }
    }
}
