public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator (int yourAge){
        this.yourAge = yourAge;
    }
    public DateAgeCalculator(){}
    public DateAgeCalculator (int yourAge, int dateAge){
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int lovestDateAge (){
        int lovestDateAge = yourAge / 2 + 7;


        return lovestDateAge;
    }

    public  void legalDate (int lovestDateAge){
        if (dateAge < lovestDateAge){
            System.out.println("You date is under legal date age");

        } else {
            System.out.println("Your dates age is above legal date age");
        }
    }

    public int getDateAge (){return dateAge;}
    public void setDateAge (int dateAge){this.dateAge = dateAge; }

    public int getYourAge() {
        return yourAge;
    }

    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }
}
