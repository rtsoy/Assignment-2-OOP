public class Student extends Person {
    double GPA;

    public Student(){
        super();
    }

    public Student(String name, String surname, double GPA){
        super(name, surname);
        setGPA(GPA);
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if (GPA > 2.67)
            return 36600;
        return 0;
    }
}
