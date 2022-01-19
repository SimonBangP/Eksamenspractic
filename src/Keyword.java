import java.security.Key;

public class Keyword {
    private String word;
    private String definition;
    private String seeAlso;

    public Keyword (String word, String definition){
        this.word = word;
        this.definition = definition;
    }
    public Keyword (){

    }

    public String getWord (){return word;}
    public void setWord (String word){this.word = word;}
    public String getDefinition (){return  definition;}
    public void setDefinition (String definition){this.definition = definition;}

    public boolean matches (){
        if (word.equals(definition)){
            return true;

        }
        return false;
    }
}
