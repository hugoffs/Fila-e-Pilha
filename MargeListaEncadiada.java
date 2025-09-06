public class MargeListaEncadiada 
{
    private Fila fila_A;
    private Fila fila_B;
    private Fila fila_C;

    public MargeListaEncadiada(Fila fila_A,Fila fila_B)
    {
        this.fila_A = fila_A;
        this.fila_B = fila_B;
        this.fila_C = new Fila();
    }

    public void construirFila_C()
    {
        while(!fila_A.vazia() && !fila_B.vazia())
        {
            Nos elemento_A = fila_A.getprimorElemento();
            Nos elemento_B = fila_B.getprimorElemento();

            if(elemento_A.getInformacao() <= elemento_B.getInformacao())
            {
                fila_C.insere(elemento_A.getInformacao());
                fila_A.remove();
            }else{
                fila_C.insere(elemento_B.getInformacao());
                fila_B.remove();
            }
            
            while (!fila_A.vazia()) {
                fila_C.insere(fila_A.getprimorElemento().getInformacao());
                fila_A.remove();
                
            }
            while(!fila_B.vazia())
            {
                fila_C.insere(fila_B.getprimorElemento().getInformacao());
                fila_B.remove();
            }
            
        }
    }
    public void imprimir()
    {
        fila_C.imprime();
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
        fila_B.insere(05);
        fila_B.insere(15);
        fila_B.insere(23);
        fila_B.insere(55);
        fila_B.insere(75);

        MargeListaEncadiada marge = new MargeListaEncadiada(fila_A,fila_B);
        marge.construirFila_C();
        marge.imprimir();
    }
}
