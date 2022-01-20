import java.util.Locale;
import java.util.Random;

public class User {
    private String fullName;
    private String userID;

    public User (String fullName, String userID){
        this.fullName = fullName;
        this.userID = userID;
    }
    public User (){}

    public User (String fullName){
        this.fullName = fullName;
    }

    public boolean validUserID (String userID){


return  true;

        }

        public String createUserID (){
            Random r = new Random();
        String [] name = fullName.split(" ");
        String firstName = "", lastName = "";

        if (name.length > 1){
            firstName = name [0];
            lastName = name [name.length-1];
        } /*else {
            firstName = name[0];
            lastName = name[];

        }*/
        int id1 = r.nextInt(10);
        int id2 = r.nextInt(10);
        int id3 = r.nextInt(10);
        int id4 = r.nextInt(10);

        fullName = firstName.substring(0,2) + lastName.substring(0,2) + id1 + id2 + id3 + id4;

        fullName = fullName.toLowerCase();
        return fullName;
        }

}
