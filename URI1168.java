import java.util.Scanner;

/**
 * URI1168
 */
public class URI1168 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int leds = 0;
        int  casos = input.nextInt();

        while (casos > 0) {
            String numeros = input.next();
            for (int i = 0; i < numeros.length(); i++) {
                switch (numeros.charAt(i)) {
                    case '1':
                        leds += 2;
                        break;
                    case '2':
                        leds += 5;
                        break;
                    case '3':
                        leds += 5;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '5':
                        leds += 5;
                        break;
                    case '6':
                        leds += 6;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '8':
                        leds += 7;
                        break;
                    case '9':
                        leds += 6;
                        break;
                    case '0':
                        leds += 6;
                        break;
                    default:
                        break;

                }
            }
            
            System.out.println(leds + " leds");
            casos--;
            leds = 0;
        }
        input.close();
    }
}