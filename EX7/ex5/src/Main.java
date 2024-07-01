package ex5.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do primeiro item: ");
        String descricao1 = scanner.nextLine();
        System.out.print("Digite o preço do primeiro item: ");
        double precoUnitario1 = scanner.nextDouble();
        System.out.print("Digite a quantidade do primeiro item: ");
        int quantidade1 = scanner.nextInt();
        System.out.print("Digite a alíquota do ICMS do primeiro item (%): ");
        double aliquotaICMS1 = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Digite a descrição do segundo item: ");
        String descricao2 = scanner.nextLine();
        System.out.print("Digite o preço unitário do segundo item: ");
        double precoUnitario2 = scanner.nextDouble();
        System.out.print("Digite a quantidade do segundo item: ");
        int quantidade2 = scanner.nextInt();
        System.out.print("Digite a alíquota do ICMS do segundo item (%): ");
        double aliquotaICMS2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Digite a descrição do terceiro item: ");
        String descricao3 = scanner.nextLine();
        System.out.print("Digite o preço do terceiro item: ");
        double precoUnitario3 = scanner.nextDouble();
        System.out.print("Digite a quantidade do terceiro item: ");
        int quantidade3 = scanner.nextInt();
        System.out.print("Digite a alíquota do ICMS do terceiro item (%): ");
        double aliquotaICMS3 = scanner.nextDouble();


        ItemNotaFiscal item1 = new ItemNotaFiscal(descricao1, precoUnitario1, quantidade1, aliquotaICMS1);
        ItemNotaFiscal item2 = new ItemNotaFiscal(descricao2, precoUnitario2, quantidade2, aliquotaICMS2);
        ItemNotaFiscal item3 = new ItemNotaFiscal(descricao3, precoUnitario3, quantidade3, aliquotaICMS3);
        NotaFiscal notaFiscal = new NotaFiscal(item1, item2, item3);

        notaFiscal.mostrarNota();

    }
}