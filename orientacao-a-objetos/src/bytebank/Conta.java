package bytebank;
// Aqui não podemos iniciar a execução do programa. Para que um programa possa ser iniciado em Java, ele precisa ter o ponto de entrada public static void main(String[]) args), a classe que criamos não possui esse ponto de entrada, pois trata-se de um arquivo de suporte, pois a classe é um molde de algo.

// Especificação de uma conta
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double saldo){
        // this é a conta a qual eu estou invocando
        // this neste caso é obrigatório pois se não
        this.saldo = this.saldo + saldo;
        //System.out.println(saldo);
    }

    public boolean saca(double valor){
        // this é a conta a qual eu estou invocando
        // this neste caso é opcional se tornaria obrigatório se o nome do argumento do método fosse igual ao atributo do qual o método está contido
        if (this.saldo >= valor ){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            System.out.println("Sem dinheiro o suficiente");
            return false;
        }
        
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            //destino.saldo = valor;
            destino.deposita(valor);
            return true;
        }else{
            System.out.println("Sem dinheiro o suficiente para transferir");
            return false; 
        }
    }
}