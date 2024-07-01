package ex5.src;

class NotaFiscal {
    private ItemNotaFiscal item1;
    private ItemNotaFiscal item2;
    private ItemNotaFiscal item3;

    public NotaFiscal(ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public double calcularTotal() {
        return item1.calcularValorTotal() + item2.calcularValorTotal() + item3.calcularValorTotal();
    }

    public void mostrarNota() {
        System.out.println("Nota Fiscal:");
        item1.mostrarItem(1);
        item2.mostrarItem(2);
        item3.mostrarItem(3);
        System.out.println("Valor Total da Nota: " + calcularTotal());
    }
}