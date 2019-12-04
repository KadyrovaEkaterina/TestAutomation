import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValue {                       //While condition
    public int maxValueForWhile(int maxvalue) {
        int sum = 0;
        int i = 0;
        while (i <= maxvalue) {
            sum = sum + i;
            ++i;
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
    @Test
    public void maxValueForWhileZero() {
        assertEquals(0, new MaxValue().maxValueForWhile(0));
    }

    @Test
    public void maxValueForWhileOne() {
        assertEquals(1, new MaxValue().maxValueForWhile(1));
    }

    @Test
    public void maxValueForWhileTwo() {
        assertEquals(3, new MaxValue().maxValueForWhile(2));
    }

    @Test
    public void maxValueForWhileThree() {
        assertEquals(6, new MaxValue().maxValueForWhile(3));
    }

    @Test
    public void maxValueForWhileFour() {
        assertEquals(10, new MaxValue().maxValueForWhile(4));
    }

    @Test
    public void maxValueForWhileOneTwenty() {
        assertEquals(120, new MaxValue().maxValueForWhile(15)); }


    public int MaxValueForDoWhile(int maxValue) {      // Do While condition
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= maxValue);

        System.out.println("The sum is " + sum);
        return sum;
    }
    @Test
    public void MaxValueForDoWhileZero() {
        assertEquals(0, new MaxValue(). MaxValueForDoWhile(0));
    }

    @Test
    public void MaxValueForDoWhileOne() {
        assertEquals(1, new MaxValue (). MaxValueForDoWhile(1));
    }

    @Test
    public void MaxValueForDoWhileTwo() {
        assertEquals(3, new MaxValue (). MaxValueForDoWhile(2));
    }

    @Test
    public void MaxValueForDoWhileThree() {
        assertEquals(6, new MaxValue(). MaxValueForDoWhile(3));
    }

    @Test
    public void MaxValueForDoWhileFour() {
        assertEquals(10, new MaxValue(). MaxValueForDoWhile(4));
    }

    @Test
    public void MaxValueForDoWhileOneTwenty() {
        assertEquals(120, new MaxValue(). MaxValueForDoWhile(15));
    }

    public int MaxValueFor(int maxValue) {      // Condition For
        int sum = 0;
        for (int i = 0; i <= maxValue; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
    @Test
    public void testSumOfZero() {
        assertEquals(0, new MaxValue().MaxValueFor(0));
    }

    @Test
    public void testSumOfOne() {
        assertEquals(1, new MaxValue().MaxValueFor(1));
    }

    @Test
    public void testSumOfTwo() {
        assertEquals(3, new MaxValue().MaxValueFor(2));
    }

    @Test
    public void testSumOfThree() {
        assertEquals(6, new MaxValue().MaxValueFor(3));
    }

    @Test
    public void testSumOfFour() {
        assertEquals(10, new MaxValue().MaxValueFor(4));
    }

    @Test
    public void testSumOfOneTwenty() {
        assertEquals(120, new MaxValue().MaxValueFor(15));
    }
}