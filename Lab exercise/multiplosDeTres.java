//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto.

import java.util.Scanner;

public class multiplosDeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A seguir digite os números de intervalo que deseja saber");
        System.out.println("Digite o número inicial: ");
            int numInicial = input.nextInt();
        System.out.println("Digite o número final: ");
            int numFinal = input.nextInt();
        int soma = 0;
        int totalDosMultiplos = 0;
        for (int i = numInicial; i <= numFinal; i++) {

            if(i % 3 == 0){
                totalDosMultiplos++;
                soma += i;
                }


        }
        System.out.println("Intervalo de " + numInicial + " até " + numFinal);
        System.out.println("total da soma =" + soma);
        System.out.println("O total de multiplos é = " + totalDosMultiplos);
    }
}
