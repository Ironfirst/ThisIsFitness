public class Instructor extends Employee
{
// den nedarvede konstructor kan ændres ved at lave regnstykket i selve super constructoren som så sætter argumentet
    public Instructor(String name, String cpr, int hours, int salary) {
        super(name, cpr, hours, hours*456);

    }


    // super smart metode override som gør at hvis objektet bliver oprettet gennem instructor class
    // så sætter laver den automatisk en udregning af løn ud fra hours istedet for den faste løn/ sallary

    @Override
    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
