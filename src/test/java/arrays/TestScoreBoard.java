package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestScoreBoard {

    @Test
    //helpful to name the test cases in given_when_then pattern
    public void givenGameEntry_WhenAdded_ThenReturnScoreBoard(){
        Scoreboard sb = new Scoreboard(4);
        GameEntry one = new GameEntry("Spencer",5);
        GameEntry two = new GameEntry("Ryan",6);
        GameEntry three = new GameEntry("Alex",8);
        GameEntry four = new GameEntry("Tom",11);
        sb.add(one);
        sb.add(two);
        sb.add(three);
        sb.add(four);
        sb.remove(2);


    }
}
