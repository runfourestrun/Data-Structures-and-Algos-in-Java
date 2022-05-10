package algorithimanalysis;

public class RepeatString {

    public RepeatString(){};

    private char c;
    private int i;


    public String repeat1(char c,int i){
        String answer="";
        for (int j=0; j<c; j++)
            answer+=c;
        return answer;

    }

    public String repeat2(char c,int i){
        StringBuilder answer = new StringBuilder();
        for(int j = 0; j<c; j++)
            answer.append(c);
        return answer.toString();
    }



}
