package ex2.src;

public class CD {
    private int numMusicas;
    private int faixaAtual;
    private boolean tocando;

    public CD(int numMusicas) {
        this.numMusicas = numMusicas;
        this.faixaAtual = 1;
        this.tocando = false;
    }

    public void play() {
        if (!tocando) {
            tocando = true;
            System.out.println("Tocando a faixa " + faixaAtual);
        } else {
            System.out.println("Já está tocando a faixa " + faixaAtual);
        }
        imprimirEstado();
    }

    public void pause() {
        if (tocando) {
            tocando = false;
            System.out.println("Pausado na faixa " + faixaAtual);
        } else {
            System.out.println("O CD já está pausado.");
        }
        imprimirEstado();
    }

    public void stop() {
        tocando = false;
        faixaAtual = 1;
        System.out.println("Parado. Volta para a faixa 1.");
        imprimirEstado();
    }

    public void proximaFaixa() {
        if (faixaAtual < numMusicas) {
            faixaAtual++;
        } else {
            faixaAtual = 1;
        }
        System.out.println("Avançou para a faixa " + faixaAtual);
        imprimirEstado();
    }

    public void faixaAnterior() {
        if (faixaAtual > 1) {
            faixaAtual--;
        } else {
            faixaAtual = numMusicas;
        }
        System.out.println("Retrocedeu para a faixa " + faixaAtual);
        imprimirEstado();
    }

    public void imprimirEstado() {
        String estado = tocando ? "Tocando" : "Parado";
        System.out.println("Faixa atual: " + faixaAtual + " | Estado: " + estado);
    }

}