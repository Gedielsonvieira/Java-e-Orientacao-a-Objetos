package bytebank3;

public class TestaGetSet {
    public static void main(String[] args) {
        Conta contaDaLuana = new Conta();
        System.out.println("Endereço de memória da conta: " + contaDaLuana);

        contaDaLuana.setAgencia(2);
        System.out.println(contaDaLuana.getAgencia());

        contaDaLuana.setNumero(111);
        System.out.println(contaDaLuana.getNumero());

        contaDaLuana.getTitular().setNome("luana");
        System.out.println("Nome: " + contaDaLuana.getTitular().getNome());

        contaDaLuana.getTitular().setCpf("999.999.999-99");
        System.out.println("CPF: " + contaDaLuana.getTitular().getCpf());

        contaDaLuana.getTitular().setProfissao("Tech");
        System.out.println("Profissão: " + contaDaLuana.getTitular().getProfissao());

        
        /*Verificar o porque ao imprimir a referencia contaDaLuana primeiro e por ultimo ficam com valores de referencia diferentes*/
        System.out.println("Endereço de memória da conta: " + contaDaLuana);
        System.out.println("Endereço de memória referencia: " + contaDaLuana.getTitular());
        

    }
}
