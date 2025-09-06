Para fazer a execução do codigo vc devera rodar o arquivo Main.java neve poderemos escolher qual das instruturas: "fila e Pilha" e em seguidas as opições de teste: inserir ,remover e imprimir.

Nos:
*   A baze de todo o codigo possuindo dois atributos: valor e proximo, e quatro metos:
    getValor(): Retorna o valor.
    getProximo(): Retorna o proximo.
    setValor(): Insre um novo valor.
    setProximo(): Insere um novo proximo.

Pilha: 
*   Os ele cria um objeto chamado pilha do tipo "Nos" possui os metodos: 
    vazio(): onde ele conferir caso ele esteja vazio.
    insere(int): onde espera chegar um valor inteiro e adiciona no final.
    remove(): onde ele retira o ultimo elemento, para isso precisamos de duas (atual, anterior) variaves para encontrar e remover o ultimo elemento.
    imprimir(): imprime todos os elementos da Pilha. 

Fila: 
*   Os ele cria um objeto chamado fila do tipo "Nos" possui os metodos: 
    vazio(): onde ele conferir caso ele esteja vazio.
    insere(int): onde ele espera chegar um valor inteiro e adiciona no final.
    remove(): onde conferirmos se a o proximo elemento é vazio, pos ai teremos que alterar o valor do ulimo para ser igual o primeiro, caso contrario so retiramos o primeiro elemento da fila.
    imprimir(): imprime todos os elementos da Fila.
    getprimorElemento(): onde que ela retorna o primeiro elemento da fila.
    retonarTamnho(int): onde ele retorna o tamanho da fila.

MargeListaEncadiada:
*   Onde ele pega duas fila e cria uma terceiara contedo os elementos das daus de maneira ordenada, possui os metodos:
    construirFila_C(): Onde que ele insere ordenando os valores.
    imprimir(): onde ele retorna o valor da fila.
    main(): onde foi realizado o teste de conferencia.

MargeVetor:
*   mesma premissa do MargeListaEncadida porem agora com vetores, possui os seguntes metodos:
    vazio(): onde retonar que o primeiro valor e o ultimo são iguais.
    cheio(): confere se a vetor dados(que representa a fila )está cheio
    prencherVetor(): onde ele ordena os dados do vetor apartir dos valores da Fila A e Fila B
    ensere(): onde ele ensere os dados, sendo chamado por prencherVetor.
    main(): onde foi realizado os teste.




Resultado dos teste realizado: 

    1 = Pilha
    2 = Fila
    0 = Sair
    Faça a escolha de qual vc quer testar: 2
    Você escolheu Fila

    1 = insirir novos inteiros: 
    2 = remover inteiros: 
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 5
    Elemento inserido: 5
    5 

    1 = insirir novos inteiros: 
    2 = remover inteiros: 
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 3
    Elemento inserido: 3
    5 3

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 67
    Elemento inserido: 67
    5 3 67

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 2
    Elemento removido
    3 67

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 6
    Elemento inserido: 6
    3 67 6

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 3
    3 67 6 

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 0
    1 = Pilha
    2 = Fila
    0 = Sair
    Faça a escolha de qual vc quer testar: 1
    Você escolheu Pilha

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 5
    Elemento inserido: 5
    5

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 6
    Elemento inserido: 6
    5 6

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 1
    Digite um inteiro: 78
    Elemento inserido: 78
    5 6 78

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 3
    5 6 78 

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 2
    Elemento removido
    5 6

    1 = insirir novos inteiros:
    2 = remover inteiros:
    3 = imprimir
    0 = Sair
    Faça a escolha: 0
    1 = Pilha
    2 = Fila
    0 = Sair
    Faça a escolha de qual vc quer testar: 0
    Opção inválida