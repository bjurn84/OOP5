import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RationalNumber rn1, rn2, rnResult;
        ComplexNumber cn1, cn2, cnResult;

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.println("Введите первое число:");
            System.out.println("Введите числитель:");
            int numerator1 = scanner.nextInt();
            System.out.println("Введите знаменатель:");
            int denominator1 = scanner.nextInt();
            rn1 = new RationalNumber(numerator1, denominator1);
            System.out.println("Введите второе число:");
            System.out.println("Введите числитель:");
            int numerator2 = scanner.nextInt();
            System.out.println("Введите знаменатель:");
            int denominator2 = scanner.nextInt();
            rn2 = new RationalNumber(numerator2, denominator2);

            switch (choice) {
                case 1:
                    rnResult = rn1.add(rn2);
                    System.out.println("Результат: " + rnResult);
                    break;
                case 2:
                    rnResult = rn1.subtract(rn2);
                    System.out.println("Результат: " + rnResult);
                    break;
                case 3:
                    rnResult = rn1.multiply(rn2);
                    System.out.println("Результат: " + rnResult);
                    break;
                case 4:
                    rnResult = rn1.divide(rn2);
                    System.out.println("Результат: " + rnResult);
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }

            System.out.println("Введите первое комплексное число:");
            System.out.println("Введите действительную часть:");
            double real1 = scanner.nextDouble();
            System.out.println("Введите мнимую часть:");
            double imaginary1 = scanner.nextDouble();
            cn1 = new ComplexNumber(real1, imaginary1);
            System.out.println("Введите второе комплексное число:");
            System.out.println("Введите действительную часть:");
            double real2 = scanner.nextDouble();
            System.out.println("Введите мнимую часть:");
            double imaginary2 = scanner.nextDouble();
            cn2 = new ComplexNumber(real2, imaginary2);

            switch (choice) {
                case 1:
                    cnResult = cn1.add(cn2);
                    System.out.println("Результат: " + cnResult);
                    break;
                case 2:
                    cnResult = cn1.subtract(cn2);
                    System.out.println("Результат: " + cnResult);
                    break;
                case 3:
                    cnResult = cn1.multiply(cn2);
                    System.out.println("Результат: " + cnResult);
                    break;
                case 4:
                    cnResult = cn1.divide(cn2);
                    System.out.println("Результат: " + cnResult);
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }

        scanner.close();
    }
}