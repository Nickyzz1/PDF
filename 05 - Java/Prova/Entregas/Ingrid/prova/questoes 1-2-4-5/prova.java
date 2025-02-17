// Questão 1

//   Atribuição por valor: é como uma cópia da variável, representando seu valor/conteúdo.
//                         Ex: para aumentar o tamanho de uma array, é possível copiar o seu conteúdo para outro array maior, e depois escrever que arrayAntigo = arrayNovo.
//                             Caso arrayAntigo fosse alterado, o arrayNovo continuaria da mesma forma inicial. Outro exemplo pode ser observado abaixo:

//                           int numero = 1;
//                           int novoNumero = numero;

//                           print(numero)       ---------> 1
//                           print(novoNumero)   ---------> 1

//                           novoNumero = 3;
//                           print(numero)       ---------> 1
//                           print(novoNumero)   ---------> 3

//   Atribuição por referência: a variável é referenciada por um ponteiro, ou seja, recebe o endereço do objeto que ela quer acessar o valor. 
//                              Ex: para alterar o valor de um índice específico de um array, é possível passar um ponteiro com o endereço e alterá-lo, assim esse novo valor 
//                                  ficará salvo no mesmo local. Outro exemplo:

//                           int numero = 1; 
//                           int * novoNumero = &numero;       cria um ponteiro para a variável numero

//                           print(numero)       ---------> 1
//                           print(*novoNumero)   ---------> 1

//                           *novoNumero = 3;
//                           print(numero)       ---------> 3
//                           print(*novoNumero)   ---------> 3



// Questão 2

// Será impresso:
//                    0
//                    1 
//                    1
//                    2
//                    3
//                    5
//                    8
//                    13
//                    21
//                    34
//                    55


// Questão 4

// Encapsulamento: é a capacidade de "esconder objetos", ou seja, privá-los.
//                Ex: private int variavel = 2;



// Questão 5

// Herança: é a capacidade de uma classe herdar comportamentos e características de outra classe.
//          Ex: Há uma classe chamada Escola, contendo métodos gerais em relação as notas e frequência. A partir dessa classe são criadas classes para cada 
//          uma das turmas, pois os métodos serão os mesmos mas com valores diferentes. Portanto, a classe Escola é chamada de classe pai, enquanto as turmas 
//          são as classes filhas. 