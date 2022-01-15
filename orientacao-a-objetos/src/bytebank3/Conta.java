package bytebank3;
// Aqui não podemos iniciar a execução do programa. Para que um programa possa ser iniciado em Java, ele precisa ter o ponto de entrada public static void main(String[]) args), a classe que criamos não possui esse ponto de entrada, pois trata-se de um arquivo de suporte, pois a classe é um molde de algo.

// Especificação de uma conta
public class Conta {
    //Atributo privado da classe -> Escondendo atributo saldo -> não pode ser lido e nem modificado por outra classe
    //Para o atributo saldo, não precisamos utilizar um setter, porque os métodos como deposita() e saca() já servem para modificar o atributo.
    private double saldo; 
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total; //Criar um atributo total sem o static nós dizemos que o atributo total será do objeto por isso sempre aparecerá o valor 1 e colocando o static falamos que o atributo total é da classe

    // total deve ser static para que seja uma varável da classe e não de cada objeto

    //Criando construtor padrão
    public Conta(){ 
        
        //construtor padrão quase faz nada
        System.out.println("Demonstrando que ao executar new Conta() estamos executando esse construtor padrão");

        //Criar a variavel total aqui tem um problema pois não conseguiremos acessar ela fora da classe

        /*this.total++;
        System.out.println(total);
        Aparecerá sempre 1 se não utilizarmos o static porque estamos referenciando que o atributo total é do objeto, então cada  objeto terá o atributo total quando instanciamos uma referciancia de um objeto sabemos que o Java zera por default e com isso total++ é igual a 1.
        */

        Conta.total++;
        //System.out.println(Conta.total);
    }

    //Criando construtor
    public Conta(int agencia, int numero) throws Exception{
        //não devemos chamar um método público e não final no construtor pois eles podem ser sobrescritos acarretando problemas
        //setAgencia(agencia);
        //setNumero(nuemrollers);

        if (agencia <= 0 || numero <= 0) {
            throw new Exception("Só podem ser inseridos valores maiores que 0");
        }
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public void deposita(double saldo){
        this.saldo = this.saldo + saldo;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor ){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            System.out.println("Dinheiro insuficiente");
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

    public double getSaldo(){//Get significa que quero pegar uma informação
        return this.saldo;    
    }

    public void setAgencia(int novaAgencia){//normalmente métodos que alteram atributos são void
        if ( novaAgencia <= 0 ){
            System.out.println("Número não aceito");
            return;
        }else{
            this.agencia = novaAgencia;  
        }
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if ( numero <= 0 ){
            System.out.println("Número não aceito");
            return;
        }else{
            this.numero = numero;
        }
        
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}
