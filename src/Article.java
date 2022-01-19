public class Article {
    private String heading;
    private String body;
    private String author;

    public Article (){}

    public Article (String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;

    }

    public String longestWord (String text){
        String [] sentence = text.split(" ");
        String longestWord = "";
        for (int i = 0; i < sentence.length; i++){
            if (sentence[i].length() > longestWord.length()){

                longestWord = sentence[i];
            }

        }

        return  longestWord;
    }

    public String getWords (String text){
        String [] sentence = text.split(" ");
        String finalText = "";

        for (int i = 0; i < sentence.length; i++){
            if (!(finalText.contains(sentence[i]))){
                finalText += sentence[i] + " ";

            }

        }
        return finalText;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
