package bytebank;

public class CriaConta {
    public static void main(String[] args) {
        // new Conta() - instância um objeto do tipo conta e coloca na memória, new devolve uma referência
        // Conta primeiraConta - referencia a conta que eu criei
        Conta primeiraConta = new Conta();
        //Conseguimos referenciar uma conta específica. É comum ter a impressão de que a palavra-chave new nos devolve o objeto em si, e de que a variável primeiraConta contém o objeto, mas isso nunca ocorre. No Java, assim como em outras linguagens, um objeto nunca está dentro de uma variável. O que tem dentro de uma variável é somente uma indicação a um objeto específico, uma referência a um objeto específico.

        // Atribuindo valores aos atributos do objeto do tipo Conta
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 001;
        primeiraConta.numero= 798516;
        primeiraConta.titular = "Gedielson";
        System.out.println("Titular: " + primeiraConta.titular + " Agência: " + primeiraConta.agencia + " de Número: " + primeiraConta.numero + " Tem um saldo de R$" + primeiraConta.saldo);
    }
}


