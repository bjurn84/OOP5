import java.util.Scanner;

public class PhonebookMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        while (true) {
            System.out.println("Пожалуста выберите опцию:");
            System.out.println("1. Добавить новый контакт");
            System.out.println("2. Поиск контакта по имени");
            System.out.println("3. Поиск контакта по номеру");
            System.out.println("4. Вывести все контакты");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // TODO: Add code to add a new contact
                    break;
                case 2:
                    // TODO: Add code to search for a contact by name
                    break;
                case 3:
                    // TODO: Add code to search for a contact by phone number
                    break;
                case 4:
                    // TODO: Add code to display all contacts
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}