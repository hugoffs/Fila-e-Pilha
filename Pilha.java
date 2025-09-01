public class Pilha {
    private Nos pilha;

    public Pilha() {
        pilha = null;
    }

    public boolean vazia() {
        return pilha == null;
    }

    public void insere(int informacao)
    {
        Nos novoNo = new Nos();
        novoNo.setInformacao(informacao);
        if(vazia())
        {
            pilha = novoNo;
        }else{
            Nos atual = pilha;
            while(atual.getProximo() != null)
            {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        System.out.println("Elemento inserido: " + informacao);
        imprime();
    }

    public void remove()
    {
        if(!vazia())
        {
            if(pilha.getProximo() == null)
            {
                pilha = null;
            }else{
                Nos atual = pilha;
                Nos anterior = null;
                while(atual.getProximo() != null)
                {
                    anterior = atual;
                    atual = atual.getProximo();
                }
                anterior.setProximo(null);
            }
        }   
        System.out.println("Elemento removido");
        imprime();
    }

    public void imprime()
    {
        if(!vazia())
        {
            Nos atual = pilha;
            while(atual != null)
            {
                System.out.print(atual.getInformacao() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
        else System.out.println("Pilha vazia");
    }
}
