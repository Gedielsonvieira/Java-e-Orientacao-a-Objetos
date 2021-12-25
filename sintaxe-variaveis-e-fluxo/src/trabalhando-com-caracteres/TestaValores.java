public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;

        // quanto vale o segundo?
        /*Quando se faz uma atribuição no Java, não se diz que uma variável sempre segue a outra, 
        e sim que estamos copiando e colando valores. Deste modo, primeiro = 10; não surtirá efeito para segundo. 
        Confirmaremos isto rodando a aplicação, pois continuaremos recebendo 5.*/
        System.out.println(segundo);
    }
}
