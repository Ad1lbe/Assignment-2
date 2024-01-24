public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee: " + super.toString();
    }

    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Person other) {
        if (other instanceof Employee) {
            return Double.compare(this.salary, ((Employee) other).getSalary());
        } else {
            return super.compareTo(other);
        }
    }
}
