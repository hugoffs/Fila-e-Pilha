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
        if (vazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
            
        } else {
            Nos atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
            ultimo = novoNo;
        }
        System.out.println("Elemento inserido: " + informacao);
        imprime();
    }

    public void remove() {
        if (!vazia()) {
            if (primeiro.getProximo() == null) {
                primeiro = null;
                ultimo = null;
            } else {
                primeiro = primeiro.getProximo();
            }
        }
        System.out.println("Elemento removido");
        imprime();
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

    public Nos getprimorElemento(){
        if(vazia()){
            return null;
        }
        return primeiro;
    }
    public int retonarTamnho()
    {
        int tamnaho = 0 ;
        Nos atual = primeiro;
        while (atual != null) {
            tamnaho ++;
            atual = atual.getProximo();
        }
        return tamnaho;

    }
}
