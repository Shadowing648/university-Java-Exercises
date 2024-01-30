//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto

public class printError {
    public static String printerError(String s) {
        int contadorErros = 0;
        int length = s.length();

        for (int i = 0; i < length - 1; i++) {
            char caracterAtual = s.charAt(i);
            char proximoCaracter = s.charAt(i + 1);

            if ((caracterAtual < 'a' || caracterAtual > 'm') || caracterAtual > proximoCaracter) {
                contadorErros++;
            }
        }

        return contadorErros + "/" + length;
    }

    public static void main(String[] args) {
        String s1 = "aaabbbbhijjjm";
        String s2 = "aaacccbbbb";
        String s3 = "aaaxbbbbyyhwawiwjjjwwm";

        System.out.println("s1: " + printerError(s1));
        System.out.println("s2: " + printerError(s2));
        System.out.println("s3: " + printerError(s3));
    }
}
