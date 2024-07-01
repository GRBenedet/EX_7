package ex4.src;

public class Main {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("João Silva", "Rua A, 123", "Masculino", "123.456.789-00", "123456789");
        Proprietario proprietario2 = new Proprietario("Maria Souza", "Rua B, 456", "Feminino", "987.654.321-00", "987654321");

        Veiculo veiculo1 = new Veiculo("ABC-1234", "Preto", "Sedan", proprietario1);
        Veiculo veiculo2 = new Veiculo("DEF-5678", "Branco", "SUV", proprietario2);
        Veiculo veiculo3 = new Veiculo("GHI-9101", "Vermelho", "Hatch", proprietario1);
        Veiculo veiculo4 = new Veiculo("JKL-1213", "Azul", "Pickup", proprietario2);
        Veiculo veiculo5 = new Veiculo("MNO-1415", "Verde", "Coupé", proprietario1);

        Veiculo[] veiculos = {veiculo1, veiculo2, veiculo3, veiculo4, veiculo5};

        for (Veiculo veiculo : veiculos) {
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Proprietário: " + veiculo.getProprietario().getNome());
            System.out.println("Endereço: " + veiculo.getProprietario().getEndereco());
            System.out.println("Sexo: " + veiculo.getProprietario().getSexo());
            System.out.println("CPF: " + veiculo.getProprietario().getCpf());
            System.out.println("CNH: " + veiculo.getProprietario().getCnh());
            System.out.println();
        }
    }
}
