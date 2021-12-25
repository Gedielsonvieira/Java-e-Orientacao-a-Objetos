package controlandoFluxoComLacos;

public class TestaFor {

    public static void main(String[] args) {
        //variavel contador do laço for, não zera a cada iteração, por mais que esteja no escopo do for
        for(int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }

        //System.out.println(contador); Se quisermos imprimir o último valor que o contador estava lendo, não conseguiremos, por conta do escopo
    }
}
