package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

@Test

public void testGetScore(){

Student score = new Student("Sam", new Double[]{100.0});

Classroom classroom = new Classroom(new Student[]{score});
double expected = 100.0;
double actual = 100.0;
    Assert.assertEquals(expected,actual,0.00001);

}

@Test

    public void testGetStudnets(){


}

@Test

    public void testAddStudnet(){


}

@Test

    public void testRemoveStudent(){


}

}
