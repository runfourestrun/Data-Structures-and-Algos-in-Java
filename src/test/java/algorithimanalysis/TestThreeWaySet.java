package algorithimanalysis;

import org.junit.jupiter.api.Test;

public class TestThreeWaySet {

    @Test
    public void testThreeWaySet(){
        int[] test = new int[]{1,2,3,4,5};
        ThreeWaySet threeway = new ThreeWaySet();
        threeway.elementUniqueness(test);

    }
}
