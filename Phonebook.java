import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void exportContacts(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new File(filename));
            for (Contact contact : contacts) {
                writer.println(contact.getName());
                writer.println(contact.getPhone());
                writer.println();
            }
            writer.close();
            System.out.println("Экспорт успешно выполнен");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        }
    }

    public void importContacts(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String phone = scanner.nextLine();
                scanner.nextLine();
                Contact contact = new Contact(name, phone);
                contacts.add(contact);
            }
            scanner.close();
            System.out.println("Импорт успешно выполнен");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден");
        }
    }
}
