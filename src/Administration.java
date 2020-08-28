public class Administration extends Employee
{
    int vacation;

    public int getVacation(){
        return this.vacation;
    }

    @Override
    public String toString()
    {
        return "Administration{" +
                "vacation=" + vacation +
                ", hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
