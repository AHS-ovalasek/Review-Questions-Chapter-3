/**
 * Owen Valasek
 * CH3 PC3 Personal Information Class
 * Programming III - AP CS
 * 10/3/18
 */
public class PersonalInformationDemo {

    public static void main(String[] args) {
        PersonalInfo Owen = new PersonalInfo("Owen", "105 Chickadee Rd", 
                "7248592492");
        
        PersonalInfo Matt = new PersonalInfo("Matt", "184 Carpenter Rd", 
                "7248409348");
        
        PersonalInfo Kiersten = new PersonalInfo("Kiersten", "100 Church Hill "
                + "Lane", "7248593632");
        
        String n;
        String a;
        String pN;
        
        n = Owen.getName();
        a = Owen.getAddress();
        pN = Owen.getPhoneNumber();
        
        System.out.println("Name" + "\t" + "Address" + "\t"  
                + "              Phone Number");
        System.out.println("----------------------------------------");
        System.out.println(n + "\t" + a + "\t" + pN + "\n");
        
        n = Matt.getName();
        a = Matt.getAddress();
        pN = Matt.getPhoneNumber();
        
        System.out.println(n + "\t" + a + "\t" + pN + "\n");
        
        n = Kiersten.getName();
        a = Kiersten.getAddress();
        pN = Kiersten.getPhoneNumber();
        
        System.out.println(n + "\t" + a + "\t" + pN + "\n");
        
        

    }

}
