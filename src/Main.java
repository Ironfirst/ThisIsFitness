public class Main
{
    public static void main(String[] args){

        Administration Bosslady = new Administration("hanse","04040404",12,12000,1);
        System.out.println(Bosslady);

        Member noobie = new Member(true);
        System.out.println(noobie);

      Instructor ivan = new Instructor("ivanThegrusome","060606",20, 12000);
        System.out.println(ivan);
    }



    // lav en tom constructor i person som arves med i de forskellige classes.
    // eller find en anden lidt smart måde at lave en  constructor i de forskellige classes
    // som feks. administration eller instructor evt member som så kan oprette
    // brugere med de forskellige relavandte attributer samt nedarvede metoder.

}
