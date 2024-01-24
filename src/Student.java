public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    @Override
    public int compareTo(Person other) {
        if (other instanceof Student) {
            return Double.compare(this.gpa, ((Student) other).getGpa());
        } else {
            return super.compareTo(other);
        }
    }
}
