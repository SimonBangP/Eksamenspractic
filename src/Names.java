public class Names {
    private String firstName;
    private String middleName;
    private String lastName;


    public Names (String fullName){
        String [] name = fullName.split(" ");

        if (name.length > 2){
            firstName = name [0];
            middleName = name [1];
            lastName = name [name.length-1];

        } else {
            firstName = name[0];
            middleName = "";
            lastName = name [name.length-1];

        }


    }

    public String toString (){
        if (middleName.equals("")){
            return
            "First name: " + firstName + "\n" +
            "Last name: " + lastName;

        }

        return "First name: " + firstName + "\n" +
                "Middle name: " + middleName + "\n" +
                "Last name: " + lastName;


    }



}
