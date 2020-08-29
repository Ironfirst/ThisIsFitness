public class Administration extends Employee
{
    int vacation;

    public Administration(String name, String cpr, int hours, int salary, int vacation) {
        super(name, cpr, hours, salary);
        this.vacation = vacation;
    }

    public int getVacation(){
        return this.vacation;
    }



    @Override
    public String toString() {
        return
                super.toString();
    }
}
