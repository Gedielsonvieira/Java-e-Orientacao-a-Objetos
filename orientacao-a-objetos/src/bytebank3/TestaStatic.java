package bytebank3;

public class TestaStatic {
    public static void main(String[] args) {
        //Nova regra de negócio: precisaremos saber quantas contas foram abertas no sistema, ou seja, saber quantas contas foram instanciadas

        //Criar uma variavel total aqui não faz muito sentido pois haverá complicações como: outros métodos não terão acesso a essa variavel... então construiremos na classe Conta
        
        Conta contaDaLuana = new Conta();

        Conta contaDaLu = new Conta();
        
        
        System.out.println("Quantidade de contas abertas: "+Conta.getTotal());//funciona porque o total é uma variavel única, mas n faz sentido porque total é um atributo da classe e n de uma instacia logo faz mais sentido pegar isto direto com a classe Conta, com isso colocamos o static no método getTotal não precisando mais no lado esquerdo de uma referencia e sim somente do nome da classe.
    }
}
