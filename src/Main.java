import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> I = new ArrayList<>();
        ArrayList<Double> U = new ArrayList<>();

        System.out.print("Введите количество измерений: ");
        int n = scanner.nextInt();

        System.out.println("Введите значения тока (в амперах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Ток I[" + (i+1) + "]: ");
            I.add(scanner.nextDouble());
        }

        System.out.println("Введите значения напряжения (в вольтах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Напряжение U[" + (i+1) + "]: ");
            U.add(scanner.nextDouble());
        }

        double sum_IU = 0.0;
        double sum_I2 = 0.0;

        for (int i = 0; i < n; i++) {
            sum_IU += I.get(i) * U.get(i);  // сумма I_i * U_i
            sum_I2 += I.get(i) * I.get(i);  // сумма I_i^2
        }

        double R = sum_IU / sum_I2;

        System.out.println("Приближенное значение сопротивления R: " + R + " Ом");
    }
}