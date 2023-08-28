import java.util.*;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Välkommen till Luffar Schack\nVälj Alternativ:\n1. Spela själv (mot ADVANCERAD Ai)\n2. Spela mot en vän\n3. Lämna spelet");
        meny();
    }

    public static void meny() {
        boolean meny = true;
        while (meny) {

            boolean avslutameny = false;
            while (!avslutameny) {
                try {
                    int val = scan.nextInt();
                    scan.nextLine();
                    if (val == 1) {
                        ai();
                        avslutameny = true;
                        meny = false;

                    } else if (val == 2) {
                        pvp();
                    } else if (val == 3) {
                        meny = false;
                        avslutameny = true;
                        System.out.println("Stänger ner");
                    } else {
                        System.out.println("Välj ett alternativ från 1-3");
                    }
                } catch (Exception e) {
                    System.out.println("Välj ett alternativ från 1-3");
                    scan.nextLine();
                }
            }
        }
    }

    public static void ai() {

        System.out.println("NUMMER 1");

    }

    public static void pvp() {
        System.out.println("NUMMER 2");

    }
}

