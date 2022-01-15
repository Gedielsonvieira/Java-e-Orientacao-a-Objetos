package bytebank3;

public class TesteConstrutor {
    public static void main(String[] args) throws Exception {
        Conta contaDoPaulo = new Conta();
        System.out.println("Conta do paulo: " + contaDoPaulo);

        Conta contaDaLuana = new Conta(200, 30);
        contaDaLuana.setAgencia(-300);

        /*Regra de negócio nos diz que não devemos ter numero negativo e nem zero em agencia e numero. 
        Numero negativo não teremos mais pois já fizemos uma verificação, mas quando fizemos o new Conta() o java zerou os numeros por default, o que podemos fazer para solucionar isto é criar um construtor obrigando a inicialização de tal atributo e não atendendo os requisitos não criar o objeto.*/
        System.out.println(contaDaLuana.getAgencia());
        System.out.println("objeto criado:" + contaDaLuana);
    }
    
}
