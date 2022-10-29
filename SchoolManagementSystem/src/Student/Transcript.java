package Student;

public class Transcript extends Attendance{
    private int participation;
    private int oralPresentation;
    private int quiz;
    private int finalTest;
    private int finalScore;

    // Default Constructor
    public Transcript(){
        participation = 0;
        oralPresentation = 0;
        quiz = 0;
        finalTest = 0;
        finalScore = 0;
    }

    // Parameterized Constructor
    public Transcript(int participation, int oralPresentation, int quiz, int finalTest, int finalScore,int present, int absent, int halfDayAbsent, int onBreak, int remote, int holiday, String subjetc, String status, int id, String name, String program){
        super(present, absent, halfDayAbsent, onBreak, remote, holiday, subjetc, status, id, name, program);
        this.participation = participation;
        this.oralPresentation = oralPresentation;
        this.quiz = quiz;
        this.finalTest = finalTest;
        this.finalScore = finalScore;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public int getOralPresentation() {
        return oralPresentation;
    }

    public void setOralPresentation(int oralPresentation) {
        this.oralPresentation = oralPresentation;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getFinalTest() {
        return finalTest;
    }

    public void setFinalTest(int finalTest) {
        this.finalTest = finalTest;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
}
