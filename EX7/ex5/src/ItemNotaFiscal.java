package ex5.src;

class ItemNotaFiscal {
    private String descricao;
    private double precoUnitario;
    private int quantidade;
    private double aliquotaICMS;

    public ItemNotaFiscal(String descricao, double precoUnitario, int quantidade, double aliquotaICMS) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.aliquotaICMS = aliquotaICMS;
    }

    public double calcularValorTotal() {
        return precoUnitario * quantidade;
    }

    public double calcularValorICMS() {
        return calcularValorTotal() * aliquotaICMS / 100;
    }

    public void mostrarItem(int numeroItem) {
        System.out.println("Item " + numeroItem + ":");
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço Unitário: " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: " + calcularValorTotal());
        System.out.println("Valor ICMS: " + calcularValorICMS());
        System.out.println();
    }
}