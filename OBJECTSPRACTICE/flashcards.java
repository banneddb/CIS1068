public class flashcards {
    String question;
    String answer;
    public flashcards(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnwser() {
        return answer;
    }

    public String toString() {
        return getQuestion() + getAnwser();
    }

    public boolean equals(String studentAnswer) {
        if (studentAnswer.equals(getAnwser())) {
            return true;
        }
        else {
            return false;
        }
    }
}
