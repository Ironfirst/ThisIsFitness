import javax.swing.text.AsyncBoxView;

public class Employee extends Person
{
    int hours;
    int salary;


    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours(){

        return this.hours;
    }

    public int getSalary(){

        return 23000;


    }

    @Override
    public String toString() {
        return   super.toString() +
                ", hours= " + hours + " " +
                ", salary= " + getSalary() +" ";
    }
}
