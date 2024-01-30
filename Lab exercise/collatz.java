//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
public class collatz {
    public static void main(String[] args) {
        int limiteMaximo = 10;

        int numeroMaximo = 0;
        int passosMaximos = 0;
        String sequenciaMaxima = "";

        for (int contador = 1; contador <= limiteMaximo; contador++) {
            int numero = contador;
            int passos = 0;
            StringBuilder sequencia = new StringBuilder();

            while (numero != 1) {
                sequencia.append(numero).append(" → ");
                if (numero % 2 == 0) {
                    numero = numero / 2;
                } else {
                    numero = 3 * numero + 1;
                }
                passos++;
            }
            sequencia.append(1);

            if (passos > passosMaximos) {
                numeroMaximo = contador;
                passosMaximos = passos;
                sequenciaMaxima = sequencia.toString();
            }
        }

        System.out.println("Limite: " + limiteMaximo);
        System.out.println("Número: " + numeroMaximo);
        System.out.println("Passos: " + passosMaximos);
        System.out.println("Sequência: " + sequenciaMaxima);
    }
}
