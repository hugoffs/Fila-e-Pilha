public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
        pilha.remove();
        pilha.imprime();
        pilha.remove();
        pilha.imprime();

        Fila fila = new Fila();
        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
    }
}
