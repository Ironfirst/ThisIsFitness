public class Member extends Person
{

    boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name,cpr);
        this.isBasic = isBasic;
    }


    public String getMemberType(){
        if(isBasic){
            return "Basic member";
        }

        else{
            return "Full member";
        }
    }

    public int monthlyFee(){
        if(getMemberType()=="Basic member"){
            return 199;
        }
     else{
         return 299;
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", " + getMemberType() +
                ", " + monthlyFee();
    }

}
