package algorithimanalysis;

import org.junit.jupiter.api.Test;

public class TestRepeatString {

    /* output for this does not look right */
    @Test
    public void testRepeatString(){
        RepeatString rs = new RepeatString();
        long starttime  = System.currentTimeMillis();
        rs.repeat1('i',506600005);
        long endttime = System.currentTimeMillis();
        printOutcome(starttime,endttime);


        long starttime_two  = System.currentTimeMillis();
        rs.repeat2('i',600000000);
        long endtime_two = System.currentTimeMillis();
        printOutcome(starttime_two,endtime_two);


    }


    public void printOutcome(long startTime, long endTime){
        long totaltime = endTime - startTime;
        System.out.println(String.format("the total algorithim execution time was: %d",totaltime));
    }


}
