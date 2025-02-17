## Questão 2
### Escreva o que será impresso com o código abaixo:

```
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[12];

        vetor[0] = 0;
        vetor[1] = 1;

        for (int i = 2; i <  vetor.length; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }

        System.out.println(Arrays.toString(vetor));
    }
}
```

Serão printados na tela todos os itens do objeto vetor, que correspondem a sequência de Fibonacci: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]