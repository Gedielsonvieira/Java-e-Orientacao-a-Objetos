package controlandoFluxoComLacos;

public class TestaLacos2 {
    public static void main(String[] args){
        for(int linha = 1; linha <= 10; linha++){
            for(int coluna = 1; coluna <= linha; coluna++){
                //System.out.println(linha);
                //System.out.println(coluna);
                //if(coluna == linha){
                  //  break;
                //}
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
