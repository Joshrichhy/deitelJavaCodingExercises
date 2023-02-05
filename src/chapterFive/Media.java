package chapterFive;

public class Media {
    public static void main(String[] args) {
        FairnessOfTheMedia fair = new FairnessOfTheMedia();
        String answers = fair.administerQuestions();
        fair.resultAnalysis(answers);
    }
}
