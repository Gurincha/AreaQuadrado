import java.util.stream.Stream;
import java.util.Scanner;

public class Mensagem{
   
    public static void main(String[] ags){
        int num;
        int idade=18;
        double media= 7.55;

        System.out.println("jose tem "+idade+ "anos");
        System.out.printf("media = %.2f", media);

       
        Scanner entrada=new Scanner(System.in);
        System.out.println("digite um valor inteniro.");
        num = entrada.nextInt();
        System.out.println("pra que isso?"+num);
    }
}