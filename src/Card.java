public class Card {
    private String suit;
    private int value;

    public Card (String suit, int value){
        this.suit = suit;
        this.value = value;
    }
    //public Card (){}

    public void beats (int a, int b){

        if (a > 13 || b > 13){
            System.out.println("værdien er højere end 13 og kan derfor ikke bruges. ");

        } else {


            if (a > b) {
                System.out.println("Kort 1 vandt, da det har den største værdi. Værdien er: " + a);

            } else {
                System.out.println("Kort 2 vandt, da det har den størte værdi. Værdien er: " + b);

            }
        }

    }

    public int getValue() {
        return value;
    }
}
