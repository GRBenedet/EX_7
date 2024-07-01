package ex4.src;

class Proprietario {
    private String nome;
    private String endereco;
    private String sexo;
    private String cpf;
    private String cnh;

    public Proprietario(String nome, String endereco, String sexo, String cpf, String cnh) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnh() {
        return cnh;
    }
}