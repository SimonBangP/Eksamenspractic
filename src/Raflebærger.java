import java.util.Random;

public class Raflebærger {
    private int terninger;


    public Raflebærger (int terninger){
        this.terninger = terninger;
    }

    public int ryst (){
        Random r = new Random();
        int antalØjne = 0;

        for (int i = 1; i <= terninger; i++){

          antalØjne += r.nextInt(6)+1;

        }
        return antalØjne;
    }

    public int getTerninger() {
        return terninger;
    }

    public void se (int antalØjne){
        System.out.println("Der er i alt " + antalØjne + " antal øjne fra sidste kast");
    }
}
