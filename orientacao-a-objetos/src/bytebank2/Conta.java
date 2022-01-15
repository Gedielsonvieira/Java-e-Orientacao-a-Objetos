package bytebank2;
// Aqui não podemos iniciar a execução do programa. Para que um programa possa ser iniciado em Java, ele precisa ter o ponto de entrada public static void main(String[]) args), a classe que criamos não possui esse ponto de entrada, pois trata-se de um arquivo de suporte, pois a classe é um molde de algo.

// Especificação de uma conta
public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular; //Atributo que é referencia para outros objetos de outras classes
    Data abertura;

    public void deposita(double saldo){
        this.saldo = this.saldo + saldo;
    }

    public boolean saca(double valor){
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
            destino.deposita(valor);
            return true;
        }else{
            System.out.println("Sem dinheiro o suficiente para transferir");
            return false; 
        }
    }
}