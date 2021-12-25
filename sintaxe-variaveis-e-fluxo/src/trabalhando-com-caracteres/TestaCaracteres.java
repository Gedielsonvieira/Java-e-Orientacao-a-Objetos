public class TestaCaracteres {
    
    public static void main(String[] args){

        char letra = 'a'; //Guarda um único caractere
        System.out.println(letra);

        //O char guarda em si um único código, um número da tabela de Unicode, ou seja, é um número que é convertido em uma letra
        char valor = 65;
        System.out.println(valor);
        //Na tabela Unicode o 65 corresponde à letra a, portanto 66 refere-se a b

        valor = (char) (valor + 1);//precisamos fazer o casting pq o char é 16bits e int é 32bits portanto o int não cabe em um char
        System.out.println(valor);

        //o operador += faz um cast por baixo dos panos!
        char valor1 = 65;
        valor1 += 1;
        System.out.println("valor1: " + valor1);

        String frase = "alura cursos online ";
        System.out.println(frase);
        
        frase = frase + 2021;
        System.out.println(frase);//aqui ocorre uma concatenação

        /* 
        Uma String é declarada com aspas duplas " e pode ter zero ou mais caracteres. 
        Um char é declarado com aspas simples ' e pode usar apenas um caractere! 
        */
    }
}
