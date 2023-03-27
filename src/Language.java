public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String inputName,
             int inputNumSpeakers,
             String inputRegionsSpoken,
             String inputWordOrder) {

        name = inputName;
        numSpeakers = inputNumSpeakers;
        regionsSpoken = inputRegionsSpoken;
        wordOrder = inputWordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken +
                " The language follows the ord order: " + this.wordOrder);
    }

    public static void main(String[] args) {
        Language japanese = new Language("Japanese",
                126000000,
                "Japan",
                "subject - object - verb");

        Mayan ixil = new Mayan("Ixil", 83600);


        japanese.getInfo();
        ixil.getInfo();
    }
}
