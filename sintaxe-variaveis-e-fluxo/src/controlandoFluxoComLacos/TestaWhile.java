package controlandoFluxoComLacos;

public class TestaWhile {
    public static void main(String[] args){
        int numero = 0; //a variavel precisa ser inicializada pois isso não acontece automaticamente em variaveis temporárias
        while ( numero <= 10 ){
            System.out.println("numero: " + numero);
            numero+= 1;//numero = numero + 1
            numero++;//numero = numero + 1

        }

    }
}
