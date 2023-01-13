import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US")); // 123.3 instead of 123,3

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Employee("John", "Lennon", "eSports player", 27045.78));
        persons.add(new Employee("George", "Harrison", "Politician", 50000));
        persons.add(new Student("Ringo", "Star", 2.4));
        persons.add(new Student("Paul", "McCartney", 4.0));

//        OUTPUT
//        Student: 3. Ringo Star earns 0.00 tenge
//        Employee: 1. John Lennon earns 27045.78 tenge
//        Student: 4. Paul McCartney earns 36600.00 tenge
//        Employee: 2. George Harrison earns 50000.00 tenge

        Collections.sort(persons);
        printData(persons);
    }

    public static void printData (Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.printf("%s earns %.2f tenge%n", person, person.getPaymentAmount());
        }
    }
}