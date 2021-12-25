package exercitando;
//Fazendo uma tabela 4 x 4
public class ExercitandoFor {
    public static void main(String[] args){
        for (int linha = 1; linha <= 5; linha++){
            if (linha == 1){
                for (int coluna = 1; coluna <= 4; coluna++){
                    System.out.print(coluna+" ");
                }
                System.out.println(" ");
            }
            else if (linha == 2){
                for (int coluna = 2; coluna <= 4; coluna++){
                    System.out.print(coluna+" ");
                }
                System.out.println("" + 1);
            }
            else if (linha == 3){
                for (int coluna = 3; coluna <= 4; coluna++){
                    System.out.print(coluna+" ");
                }
                System.out.print("" + 1);
                System.out.println(" " + 2);
            }
            else if (linha == 4){
                System.out.print(4 + " ");
                for(int coluna = 1; coluna < 4; coluna++){
                    System.out.print(coluna+" ");
                }
                System.out.println(" ");
            }
            else{
                System.out.println("---- FIM ----");
            }
        }
    }   
}
