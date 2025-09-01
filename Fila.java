public class Fila {
    
    private Nos primeiro;
    private Nos ultimo;

    public Fila() {
        primeiro = null;
        ultimo = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void insere(int informacao) {
        Nos novoNo = new Nos();
        novoNo.setInformacao(informacao);
        Nos atual = primeiro;

        if (vazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
            
        } else {
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
            ultimo = novoNo;
        }
        System.out.println("Elemento inserido: " + informacao);
    }

    public void remove() {
        if (!vazia()) {
            primeiro = primeiro.getProximo();
            if (primeiro == null) {
                ultimo = null;
            }
        }
        System.out.println("Elemento removido");
    }

    public void imprime() {
        if (!vazia()) {
            Nos atual = primeiro;
            while (atual != null) {
                System.out.print(atual.getInformacao() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        } else {
            System.out.println("Fila vazia");
        }
    }
}
