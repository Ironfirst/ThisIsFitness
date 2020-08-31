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
        System.out.printf("FITNESS EMPLOYEES  \n Name / Cpr / Hours / Salary / Vacation\n*************************************");
        for(Person ma: personer){
            if(ma instanceof Employee){
                System.out.println(ma);
            }
        }

        //System.out.println("\nFITNESS MEMBERS  \n Name / Cpr / Member type / Fee\n*************************************");

        for(Person ma: personer){
            if(ma instanceof Member){
                System.out.println(ma);
            }
        }

        System.out.printf("%-10s%n%-16s%-16s%n%1s%n", "EMPLOYEE & MEMBERS name and cpr","Name","cpr","*************************************");
        for(Person ma: personer){
            System.out.printf("%-16s%-16s%n",ma.getName(),ma.getCpr());
        }
    }


    // lav en tom constructor i person som arves med i de forskellige classes.
    // eller find en anden lidt smart måde at lave en  constructor i de forskellige classes
    // som feks. administration eller instructor evt member som så kan oprette
    // brugere med de forskellige relavandte attributer samt nedarvede metoder.

}
