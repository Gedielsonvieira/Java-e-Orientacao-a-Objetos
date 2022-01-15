package bytebank2;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente luana = new Cliente();
        luana.nome = "Luana";
        luana.cpf = "999.999.999-99";
        luana.profissao = "tech recruiter";
        
        Conta contaDaLuana = new Conta();
        contaDaLuana.deposita(100);

        contaDaLuana.titular = luana;//Aqui ocorre a composição dos objetos 
        //titular agora é uma referencia de um objeto criado da classe Cliente, ou seja, a classe Conta possui a classe Cliente 
        System.out.println(contaDaLuana.titular);
        System.out.println(contaDaLuana.titular.cpf);

        //fazendo uma referencia de forma mais direta
        contaDaLuana.titular = new Cliente();//Aqui ocorre a composição dos objetos 
        contaDaLuana.titular.cpf = "123.456.789-88";
        System.out.println(contaDaLuana.titular);
        System.out.println(contaDaLuana.titular.cpf);

        Data aberturaDaConta = new Data();
        aberturaDaConta.dia = 21;
        aberturaDaConta.mes = 02;
        aberturaDaConta.ano = 2029;
        
        /*Na classe Conta é difinido que a abertura irá receber algo do tipo Data e se não fizermos essa associação não teremos a composição entre objetos e que por sua vez não existirá referencia entre a classe Conta e a classe Data gerando uma exeção porque a referencia irá ser null*/
        contaDaLuana.abertura = aberturaDaConta;

        contaDaLuana.abertura.dia = 5;
        System.out.println(contaDaLuana.abertura.dia);

        
        
        System.out.println( contaDaLuana );
        System.out.println(contaDaLuana.titular);
        
    }
}
