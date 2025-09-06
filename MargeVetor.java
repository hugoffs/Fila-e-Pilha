public class MargeVetor {
    private Fila fila_A;
    private Fila fila_B;
    private int[] dados;
    private int tamanho;
    private int primeiro;
    private int ultimo;

    private boolean vazia()
    {
        return primeiro == ultimo;
    }

    public MargeVetor(Fila fila_A, Fila fila_B)
    {
        this.fila_A = fila_A;
        this.fila_B = fila_B;
        this.dados = new int[fila_A.retonarTamnho() + fila_B.retonarTamnho()];
        this.tamanho = fila_A.retonarTamnho() + fila_B.retonarTamnho();

    }
    private boolean cheia()
    {
        return (ultimo + 1) % tamanho == primeiro;
    }


    public void prencherVetor()
    {
        while(!fila_A.vazia() && !fila_B.vazia())
        {
            Nos elemento_A = fila_A.getprimorElemento();
            Nos elemento_B = fila_B.getprimorElemento();

            if(elemento_A.getInformacao() <= elemento_B.getInformacao())
            {
                insere(elemento_A.getInformacao());
                fila_A.remove();
            }else{
                insere(elemento_B.getInformacao());
                fila_B.remove();
            }
            
            while (!fila_A.vazia()) {
                insere(fila_A.getprimorElemento().getInformacao());
                fila_A.remove();
            }

            while(!fila_B.vazia())
            {
                insere(fila_B.getprimorElemento().getInformacao());
                fila_B.remove();
            }

        }
    }

    private void insere(int valor)
    {
        if(vazia())
        {
            dados[0] = valor;
            primeiro = 0;
            ultimo = 1;
        }
        if(!cheia())
        {
            dados[ultimo] = valor;
            ultimo = (ultimo + 1) % tamanho;
            System.out.println("Elemento inserido: " +  valor);
        }
    }
    public void imprimir()
    {
        for(int i = primeiro; i < ultimo; i++)
        {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Fila fila_A = new Fila();
        Fila fila_B = new Fila();
        //12 35 52 64
        fila_A.insere(12);
        fila_A.insere(35);
        fila_A.insere(52);
        fila_A.insere(64);
        //05 15 23 55 75 
        fila_B.insere(5);
        fila_B.insere(15);
        fila_B.insere(23);
        fila_B.insere(55);
        fila_B.insere(75);

        MargeVetor marge = new MargeVetor(fila_A,fila_B);
        marge.prencherVetor();
        marge.imprimir();
    }

}
