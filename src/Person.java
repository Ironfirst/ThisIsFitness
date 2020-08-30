public class Person
{
    String name;
    String cpr;

    public Person(String name, String cpr){
        this.name = name;
        this.cpr = cpr;
    }

    public Person(){
        
    }


    public String getName(){

        return this.name;
    }

    public String getCpr(){

        return this.cpr;
    }

    @Override
    public String toString() {
        return    name + " " +
                ", " + cpr + " " ;
    }
}
