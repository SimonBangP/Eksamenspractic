public class Main {


    public static void main (String [] args){

    //Keyword keyword1 = new Keyword("hej", "hej");
      //  System.out.println(keyword1.matches());

        /*Raflebærger raflebærger1 = new Raflebærger(3);
        int antalØjne = raflebærger1.ryst();
        System.out.println("Der er " + raflebærger1.ryst() + " øjne i alt ud fra et kast med " + raflebærger1.getTerninger() + " terninger");
        System.out.println("\n");
        raflebærger1.se(antalØjne);*/

        /*Card card1 = new Card("heart", 10);
        Card card2 = new Card("diamonds", 3);
        Card card = new Card();
        card.beats(card1.getValue(), card2.getValue());*/

        /*BMI bmi1 = new BMI(1.75, 75);
        double bmiAnswer = bmi1.bmiCalculate(bmi1.getHøjde(), bmi1.getVægt());
        System.out.println(bmiAnswer);
        System.out.println();
        System.out.printf("Din BMI er: %.2f",bmiAnswer);
        System.out.println("\n");
        if (bmiAnswer > 25){
            bmi1.isOverveight();
        } else if (bmiAnswer < 25 && bmiAnswer > 18.5){
            bmi1.isNormalWeight();
        }else {
            bmi1.isUnderWeight();
        }*/

    Article article1 = new Article();
    article1.setBody("Lav en klasse Article der har tre attributter heading, body og author. Lav test-kode der " +
            "sætter alle tre attributter, og sørg for at body er en lang tekst");
    String longestWord = article1.longestWord(article1.getBody());
        System.out.println("The longest word is: " + longestWord);
    String finalText = article1.getWords(article1.getBody());
        System.out.println();
        System.out.println(finalText);

    }
}
