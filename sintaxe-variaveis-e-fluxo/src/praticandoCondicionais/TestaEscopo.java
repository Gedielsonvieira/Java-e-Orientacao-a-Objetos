package praticandoCondicionais;

public class TestaEscopo {
    public static void main(String[] args) {
        //variaveis dentro do main - temporárias, não tem valor padrão, ou seja, boolean não tem valor default como em outras linguagens
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        // Quando a variável será utilizada mais de uma vez e em contextos diferentes é melhor criar de maneira mais geral, e quando utilizamos em contextos específicos pode ser criada apenas dentro de um método
        
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}