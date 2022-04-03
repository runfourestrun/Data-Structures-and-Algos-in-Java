package algorithimanalysis;

//Could I create an interface here for algo execution? ... describes what not how...
public class RuntimeExample {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        repeat1();
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Algo execution time was:", startTime-endTime));


    }


    public static String repeat1(char c, int n){
        String answer = "";
        for (int j = 0; j < n; j++){
            answer += c;
        }
        return answer;

    }

}
