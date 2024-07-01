package ex4.src;

class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    private Proprietario proprietario;

    public Veiculo(String placa, String cor, String modelo, Proprietario proprietario) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}