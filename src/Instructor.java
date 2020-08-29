public class Instructor extends Employee
{

    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, salary);

    }

    // forestiller mig jeg gerne vil have en lignende constructor så jeg kan initialisere instructor objekter uden løn parameter

//    public Instructor(String name, String cpr, int hours) {
//
//        this.name = name;
//        this.cpr = cpr;
//        this.hours = hours;
//    }

    // super smart metode override som gør at hvis objektet bliver oprettet gennem instructor class
    // så sætter laver den automatisk en udregning af løn ud fra hours istedet for den faste løn/ sallary

    @Override
    public int getSalary() {
        return getHours()*456;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
