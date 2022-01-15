package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        //A referência é basicamente o endereço de memória onde o objeto está localizado, já o objeto é um espaço na memória que "reservamos" para colocarmos os dados referentes a esse objeto.
        // new Conta() - instância uma referencia do objeto do tipo conta e coloca no endereço de memória
        // Conta primeiraConta - referencia a conta que eu criei
        Conta primeiraConta = new Conta();
        //Conseguimos referenciar uma conta específica. É comum ter a impressão de que a palavra-chave new nos devolve o objeto em si, e de que a variável primeiraConta contém o objeto, mas isso nunca ocorre. No Java, um objeto nunca está dentro de uma variável. O que tem dentro de uma variável é somente uma indicação a um objeto específico, uma referência a um objeto específico.

        // Atribuindo valores aos atributos do objeto do tipo Conta
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 001;
        primeiraConta.numero= 798516;
        primeiraConta.titular = "Gedielson";
        System.out.println("Titular: " + primeiraConta.titular + " Agência: " + primeiraConta.agencia + " de Número: " + primeiraConta.numero + " Tem um saldo de R$" + primeiraConta.saldo);
        
        //segundaConta - É uma variavel do tipo referencia Conta
        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        //Não podemos simplesmente escrever no nosso código saldo = 50, pois o programa não achará a variável saldo no escopo, e ainda que achasse, existem múltiplos saldos devido a variedade de contas bancárias. Por isso, sempre devemos escrever a referência.atributo, ou seja, trabalhar de uma forma orientada ao objeto.
        System.out.println(segundaConta.saldo);

        //primeiraConta e segundaConta são instâncias diferentes.

        System.out.println("Agência:" + segundaConta.agencia);//agencia zerada por default, porque quando utilizamos a palavra chave new, o Java instancia o objeto e todos os seus atributos são zerados. 0 é o valor default de vários tipos numéricos, como int, double e long. No caso do tipo boolean o valor é false. -> isto na construção de objetos, acontece nos atributos (caracteristicas) do objeto.
    }
}


