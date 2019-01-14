package me.interview.base.random;

import org.junit.Before;
import org.junit.Test;

public class InterviewTests {

    private Interview interview;

    @Before
    public void setup(){
        interview = new Interview();
    }

    @Test
    public void sanityCheckTest(){
        interview.sanityCheck();
    }
}
