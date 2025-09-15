import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeriCasuali num = new NumeriCasuali();
        int nUtente, pUtente;

        num.stampaArray();

        do {
            System.out.print("Inserisci un numero (0 per terminare): ");
            nUtente = scanner.nextInt();
            if (nUtente != 0) {
                System.out.print("Inserisci che posizione, scegli tra 0 e 4: ");
                pUtente = scanner.nextInt();

                if (pUtente >= 0 && pUtente < num.getArray().length) {
                    num.getArray()[pUtente] = nUtente;
                } else {
                    System.out.println("Posizione non valida!");
                }
                num.stampaArray();
            }
        } while (nUtente != 0);

        System.out.println("Programma terminato. Array finale:");
        num.stampaArray();
    }
}