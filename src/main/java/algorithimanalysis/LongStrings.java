package algorithimanalysis;


/*
*
* The problem with repeat1 is that strings are immutable
*
 */

public class LongStrings {

    private char c;
    private int n;

    public LongStrings(char c, int n) {
        this.c = c;
        this.n = n;
    }

    /**
     * The problem with repeat1 is that Strings are immutable. So this is essentially answer = (answer + c) ----- creates a new object each iteration
     *
     * @param c
     * @param n
     * @return
     */
    public String repeat1(char c, int n) {
        String anwser = "";
        for (int j=0; j < n; j++)
            anwser += c;
        return anwser;
    }

    public String repeat2(char c, int n) {
        var answer = new StringBuilder();

        for (int j = 0; j < n; j++)
            answer.append(c);

        String realAnswer = answer.toString();

        return realAnswer;
    }

}

