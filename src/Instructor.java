public class Instructor extends Employee
{

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);

    }

//    public Instructor(String name, String cpr, int hours) {
//
//        this.name = name;
//        this.cpr = cpr;
//        this.hours = hours;
//    }

    @Override
    public int getSalary() {
        return getHours()*456;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
