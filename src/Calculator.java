import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    void run() {
        int a = talInd();
        int b = talInd();
        char operator = operatorInd();
        double resultat = regnestykke(a, b, operator);
        printOut(a, b, operator, resultat);
    }

    double regnestykke(double a, double b, char operator) {
        double c = 0;
        switch (operator) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;

        }
        return c;
    }

    char operatorInd() {
        System.out.println("Indtast en operator: ");
        sc.nextLine();
        String operation = sc.nextLine();
        char regneoperator = operation.charAt(0);
        return regneoperator;
    }

    void printOut(int a, int b, char operator, double regnestykke) {
        System.out.println("Du har valgt " + operator);
        System.out.println("Dit regnestykke er derfor " + a + " " + operator + " " + b + " = " + regnestykke);
    }

    int talInd() {
        System.out.println("Indtast et tal: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        new Calculator().run();
    }
}