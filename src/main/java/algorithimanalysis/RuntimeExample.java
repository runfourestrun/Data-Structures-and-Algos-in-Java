package algorithimanalysis;

//Could I create an interface here for algo execution? ... describes what not how...
public class RuntimeExample {
    //There is an error thrown with String formatting.
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        repeat1('c',50);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Algo execution time was:%f", endTime-startTime));


    }

    public static String repeat1(char c, int n){
        String answer = "";
        for (int j = 0; j < n; j++){
            answer += c;
        }
        return answer;

    }


    public static String repeat2(char c, int n){
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n ; j++){
            sb.append(c);
        }

        return sb.toString();
    }

}
