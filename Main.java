
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        for(;;)
        {
            Scanner teclado = new Scanner(System.in);
            System.out.println("1 = Pilha");
            System.out.println("2 = Fila");
            System.out.println("0 = Sair");
            System.out.print("Faça a escolha de qual vc quer testar: ");
            int escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    {
                        int sair = 1 ;
                        System.out.println("Você escolheu Pilha");
                        Pilha pilha = new Pilha();
                        while(sair != 0)
                        {
                            System.out.println("\n1 = insirir novos inteiros: ");
                            System.out.println("2 = remover inteiros: ");
                            System.out.println("3 = imprimir");
                            System.out.println("0 = Sair");
                            System.out.print("Faça a escolha: ");
                            sair = teclado.nextInt();
                            if(sair == 0)
                                break;
                            switch (sair) 
                            {
                                case 1:
                                    System.out.print("Digite um inteiro: ");
                                    int valor = teclado.nextInt();
                                    pilha.insere(valor);
                                    break;
                                case 2:
                                    pilha.remove();
                                    break;
                                case 3:
                                    pilha.imprime();
                                    break;
                            }
                        }
                        break;
                    }
                case 2:
                    {
                        int SairFila = 1 ;
                        System.out.println("Você escolheu Fila");
                        Fila fila = new Fila();
                        while(SairFila != 0)
                        {
                            System.out.println("\n1 = insirir novos inteiros: ");
                            System.out.println("2 = remover inteiros: ");
                            System.out.println("3 = imprimir");
                            System.out.println("0 = Sair");
                            System.out.print("Faça a escolha: ");
                            SairFila = teclado.nextInt();
                            if(SairFila == 0)
                                break;
                            switch (SairFila) 
                            {
                                case 1:
                                    System.out.print("Digite um inteiro: ");
                                    int valor = teclado.nextInt();
                                    fila.insere(valor);
                                    break;
                                case 2:
                                    fila.remove();
                                    break;
                                case 3:
                                    fila.imprime();
                                    break;
                            }
                        }
                        break;
                    }
                default:
                    System.out.println("Opção inválida");
                    return;
            }
        }
    }
}
