import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Person, Employee и Student
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 2.5);
        Student student2 = new Student("Paul", "McCartney", 3.2);

        // Создаем ArrayList и добавляем объекты
        ArrayList<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        // Сортируем ArrayList
        Collections.sort(people);

        // Выводим информацию о каждом объекте
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
