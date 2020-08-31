import javax.swing.text.AsyncBoxView;

public class Employee extends Person
{
    int hours;
    int salary;

// måske protected istedet for public så der kan ændres i attributer ?
    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours(){

        return this.hours;
    }

    public int getSalary(){

        return salary;


    }

    @Override
    public String toString() {
        return   super.toString() +
                ", hours= " + hours + " " +
                ", salary= " + getSalary() +" ";
    }
}
