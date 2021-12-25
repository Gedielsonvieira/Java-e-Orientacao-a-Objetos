public class TestaPontoFlutuante {
    
    public static void main(String[] args){
        
        double peso = 4.0;
        int quantidade = 10;
        System.out.println(peso * quantidade);

        /* inteiro com inteiro no java dá inteiro - aqui ele trunca o valor saindo somente 2*/
        int divisao = 5 / 2; 
        System.out.println("Divisão: " + divisao);

        /* Aqui o Java lê a parte da direita executando a parte da divisão
        vendo que os dois numeros são inteiros depois ele vê que o tipo da 
        variavel é um double colocando o zero*/
        double outraDivisao = 5 / 2; 
        System.out.println("Outra Divisão: " + outraDivisao);

        /* Aqui o Java vai fazer o calculo que queriamos, raciocinando com o ponto flutuante trazendo assim 2.5 */
        double novaTentativaDivisao = 5.0 / 2;
        System.out.println("Nova Tentativa Divisão: " + novaTentativaDivisao);
        
        
    }
}
