public class flashcardsmain {
    public static void main(String[] args) {
        flashcards[] cards = {
            new flashcards("What is the largest city in America?", " New York"),
            new flashcards("What is the largest city in Asia?", " Shanghai"),
            new flashcards("What is the largest city in Europe?", " London")
        };
        for (int i=0; i<cards.length; i++) {
            System.out.println(cards[i].toString());
            System.out.println(cards[i].getAnwser());
        }
    }
}
