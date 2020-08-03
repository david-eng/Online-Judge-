import java.math.BigInteger;
import java.util.Scanner;

// Revisão de contrato.

public class URI11201 {
    private static Scanner input = new Scanner(System.in);

    public static void main(final String[] args) {
        String digito, sequencia, substituir;
        boolean fim = false;

        while (fim == false) {
            digito = input.next();
            sequencia = input.nextLine();
            try {
                substituir = sequencia.replace(digito, "").trim();
                if (digito.equals("0") && sequencia.trim().equals(digito))
                    fim = true;
                else {
                    if (substituir.equals("")) {
                        System.out.println("0");
                    } else {
                        BigInteger substituirInteiro = new BigInteger(substituir);
                        System.out.println(substituirInteiro);
                    }
                }
            } catch (final NumberFormatException e) {
                BigInteger substituirInt = new BigInteger(sequencia.trim());
                System.out.println(substituirInt);
            } finally {
            }
        }
    }
}
