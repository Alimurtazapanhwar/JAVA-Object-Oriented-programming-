
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employee {
    String name;
    int age;
    int salary;
    LocalDate doj; // Using LocalDate for Date of Joining

    public void initialize(int age, String name, int salary, String dojString) {
        this.age = age;
        this.name = name;
        this.salary = salary;

        // Parse the DOJ string into a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjust pattern as needed
        try {
            this.doj = LocalDate.parse(dojString, formatter);
        } catch (Exception e) {
            System.err.println("Error parsing DOJ: " + e.getMessage());
            this.doj = null; // Or handle the error differently
        }

        System.out.println("Age: " + this.age);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        if (this.doj != null) {
            System.out.println("DOJ: " + this.doj.format(formatter)); // Format DOJ for output
        }
    }


    public void info() {
    }
}

public class Classess_and_Objects {

    public static void main(String[] args) {
        Employee faraz = new Employee();
        Employee ali = new Employee();

        faraz.initialize(21, "Ahamad", 70000, "2023-10-26"); // Added DOJ string
        ali.initialize(20, "Murtaza", 60000, "2023-10-27"); // Added DOJ string
    }
}
