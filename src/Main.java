import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args){

        // opretter de forskellige objecter
        Administration Bosslady = new Administration("hansine","04040404",37,23000,1);

        Member noobie = new Member("noobie", "0603" , true);
        Member nonoOOb = new Member("nonoob","0404" ,false);

        Instructor ivan = new Instructor("ivanThegrusome","060606",20);
        Instructor p1 = new Instructor("pederpader","0000",144);


        // opretter Arraylist med personer samt tilføjer personer på listen
        List<Person> personer = new ArrayList<>();
        personer.add(Bosslady);
        personer.add(noobie);
        personer.add(nonoOOb);
        personer.add(ivan);
        personer.add(p1);

        //loop igennem og udskriv med Print format
        String starSeperator ="***************************************************";
        String format1 ="%n%-10s%n%-16s%-16s%-16s%-16s%-16s%n%1s%n";
        String fitnessEmployeeFormat = "%-16s%-16s%-16s%-16s%-16s%n";
        System.out.printf(format1,"FITNESS EMPLOYEES ","Name ", "Cpr" , "Hours" , "Salary" , "Vacation",starSeperator);
        for(Person ma: personer){
            if(ma instanceof Employee){                         // vacation kan ikke konverteres til administrator så jeg kan få info
                                                                // meget doven løsning = next year ;/
                System.out.printf(fitnessEmployeeFormat,ma.name,ma.cpr,((Employee) ma).hours,((Employee) ma).salary,"next year");
            }
        }

        String format2 = "%n%-10s%n%-16s%-16s%-16s%-16s%n%1s%n";
        System.out.printf(format2,"FITNESS MEMBERS","Name","Cpr","Member type","Fee",starSeperator);

        String fitnessMemberFormat ="%-16s%-16s%-16s%-16s%n";
        for(Person ma: personer){
            if(ma instanceof Member){
                System.out.printf(fitnessMemberFormat,ma.name,ma.cpr,((Member) ma).getMemberType(),((Member) ma).monthlyFee());
            }
        }

        System.out.printf("%n%-10s%n%-16s%-16s%n%1s%n", "EMPLOYEE & MEMBERS name and cpr","Name","cpr",starSeperator);
        for(Person ma: personer){
            System.out.printf("%-16s%-16s%n",ma.getName(),ma.getCpr());
        }
    }


    // lav en tom constructor i person som arves med i de forskellige classes.
    // eller find en anden lidt smart måde at lave en  constructor i de forskellige classes
    // som feks. administration eller instructor evt member som så kan oprette
    // brugere med de forskellige relavandte attributer samt nedarvede metoder.

}
