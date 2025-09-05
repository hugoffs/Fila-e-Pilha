// Classe Merge
public class Merge {
    private Fila filaA;
    private Fila filaB;
    private Fila filaC;

    public Merge(Fila filaA, Fila filaB) {
        this.filaA = filaA;
        this.filaB = filaB;
        this.filaC = new Fila();
    }

    public Fila mergeFilas() {
        while (!filaA.vazia() && !filaB.vazia()) {
            if (filaA.primeiroItem() <= filaB.primeiroItem()) {
                filaC.insere(filaA.primeiroItem());
                filaA.remove();
            } else {
                filaC.insere(filaB.primeiroItem());
                filaB.remove();
            }
        }

        while (!filaA.vazia()) {
            filaC.insere(filaA.primeiroItem());
            filaA.remove();
        }

        while (!filaB.vazia()) {
            filaC.insere(filaB.primeiroItem());
            filaB.remove();
        }
        return filaC;
    }

    public static void main(String[] args) {
        Fila filaA = new Fila();
        Fila filaB = new Fila();

        filaA.insere(1);
        filaA.insere(3);
        filaA.insere(5);

        filaB.insere(2);
        filaB.insere(4);
        filaB.insere(6);   

        Merge merge = new Merge(filaA, filaB);
        Fila filaC = merge.mergeFilas();

        System.out.println("Fila C (resultado do merge):");
        filaC.imprime();
    }
}
