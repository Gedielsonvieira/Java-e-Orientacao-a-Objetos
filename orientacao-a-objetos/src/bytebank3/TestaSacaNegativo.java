package bytebank3;

public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta contaDaLuana = new Conta();
        //Sem encapsulamento no atributo saldo 
        /*contaDaLuana.deposita(100);
        System.out.println("Saldo: " + contaDaLuana.saldo);

        // Requisição do chefe -  conta não pode ter saldo negativo

        //aqui o saldo não fica negativo pois existe uma verificação no método saca
        contaDaLuana.saca(200);
        
        // Truque acessando diretamente o atributo da classe conta estipulando que o seu valor é o saldo - 101
        // proibido
        contaDaLuana.saldo -= 201;
        System.out.println("Saldo: " + contaDaLuana.saldo);*/
        

        //O ideal é que sempre trabalhemos utilizando os métodos, nunca diretamente os atributos 
        contaDaLuana.deposita(100);
        System.out.println("Deposito R$: " + contaDaLuana.getSaldo());

        System.out.println("Saque efetuado: " + contaDaLuana.saca(200));
        System.out.println("Saldo: " + contaDaLuana.getSaldo());

    }
}
