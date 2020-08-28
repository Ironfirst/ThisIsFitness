public class Member extends Person
{

    boolean isBasic;

    public String getMemberType(){
        if(isBasic){
            return "Basic member";
        }

        else{
            return "Full member";
        }
    }

    public int monthlyFee(){
        if(isBasic){
            return 199;
        }
     else{
         return 299;
        }

    }
}
