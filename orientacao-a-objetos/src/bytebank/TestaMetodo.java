package bytebank;

public class TestaMetodo {
    public static void main(String[] args){
        Conta contaDaLuana = new Conta();
        //contaDaLuana.saldo = 100;
        //contaDaLuana.deposita(100);

        /* O metodo saca, retorna true ou false por isso atribui a uma varial esse retorno 
        para ver se o saque foi efetuado ou não*/
        //boolean conseguiuRetirar = contaDaLuana.saca(200);
        //System.out.println("Saldo: " + contaDaLuana.saldo);
        //System.out.println("Saque efetuado: " + conseguiuRetirar);

        Conta contaDoGedi = new Conta();
        contaDoGedi.deposita(300);
        boolean transferenciaOk = contaDoGedi.transfere(300, contaDaLuana);
        System.out.println("Transferencia efetuada: "+transferenciaOk);
        System.out.println(contaDoGedi.saldo);
        System.out.println(contaDaLuana.saldo);
    }
}
