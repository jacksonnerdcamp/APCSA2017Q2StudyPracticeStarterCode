/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice{
    private int firstInt;
    private int initialSecondInt;

    public MultPractice(int firstInt, int initialSecondInt)
    {
        this.firstInt = firstInt;
        this.initialSecondInt = initialSecondInt;
    }

    public String getProblem() {
        return this.firstInt + " TIMES " + this.initialSecondInt;
    }

    public void nextProblem() {
        this.initialSecondInt++;
    }
}
