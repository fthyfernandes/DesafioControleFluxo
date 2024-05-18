import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner scanner= new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm= scanner.nextInt();
        
        System.out.println("Digite o segundo parametro: ");
        int parametroDois= scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        scanner.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        int diferencaContador= parametroDois - parametroUm;
        for(int contador =1; contador<=diferencaContador; contador++){
            System.out.println(contador);
        }
    }
}
