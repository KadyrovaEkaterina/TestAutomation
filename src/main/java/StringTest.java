import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//valueOf
public class StringTest {

    @Test
    public void verifyTheValue() {
        short s = 218;
        String sString = String.valueOf(s);
        Assert.assertEquals(218, s);
    }

    @Test
    public void verifyTheValue1() {
        short s = 100;
        String sString = String.valueOf(s);
        Assert.assertNotEquals(100, s);
    }

    @Test

    public void myISuckAtJavaNPositive() {
        Assert.assertEquals(14, "Я не вкуриваю Джавку".indexOf("Джавку"));

    }

    @Test

    public void myISuckAtJavaNegative() {
        Assert.assertEquals(7, "Я не вкуриваю Джавку".indexOf("Джавку"));

    }

    @Test
    public void myContainsTrueTest() {
        Assert.assertTrue("Hey! Im from a different world".contains("from"));
    }

    @Test
    public void myContainsFalseTest() {
        Assert.assertFalse("Hey! Im from a different world".contains("jey"));
    }

    @Test
    public void MySubStrings() {
        String text = "20 First Measurements";
        String updatedText = text.substring(12, 16);
        String myText = "20 First Measurements";
        String myUpdatedText = text.substring(12, 16);
        String myExpectedResult = "sure";
        assertEquals(myExpectedResult, myUpdatedText);
        Assert.assertEquals("sure", "20 First Measurements".substring(12, 16));

    }

    @Test
    public void MySubStrings1() {
        String text = "20 First Measurements";
        String updatedText = text.substring(12, 16);
        String myText = "20 First Measurements";
        String myUpdatedText = text.substring(12, 16);
        String myExpectedResult = "sure";
        assertEquals(myExpectedResult, myUpdatedText);
        Assert.assertEquals("Ure", "20 First Measurements".substring(12, 16));
    }

    @Test

    public void myValueOfTest() {
        Assert.assertEquals(2, 22);
    }


    @Test

    public void myValueOfTest1() {
        Assert.assertEquals(22, 22);
    }

    @Test
    public void myStartWithTest() {
        Assert.assertFalse("Bubblegum".startsWith("B"));

    }

    @Test
    public void myEndWithTest() {
        Assert.assertTrue("Bubblegum".endsWith("m"));
    }

    @Test
    public void myLengthTest() {
        String myStr = "Bubblegum";
        Assert.assertEquals("5", myStr.length());
    }

    @Test
    public void myEmptyTest() {
        String myStr = "Bubblegum";
        Assert.assertEquals("", myStr.isEmpty());
    }

    @Test
    public void myEmptyTest1() {
        String myStr = "";
        Assert.assertEquals("", myStr.isEmpty());

    }

    @Test
    public void myLowerCaseTest() {

        String myStr = "Bubblegum";
        Assert.assertEquals("Bubblegum", myStr.toLowerCase());
    }

    @Test
    public void myUpperCaseTest() {

        String myStr = "Bubblegum";
        Assert.assertEquals("Bubblegum", myStr.toUpperCase());

    }

    @Test
    public void mySumTest () {
        assertEquals("aaabbb", "aaa" + "bbb");

    }
    @Test
    public void myConcatTest() {
        assertEquals("aaabbb", "aaa".concat("bbb"));

    }

    @Test

    public void myTest () {
        assertEquals("aaa", String.format("aaa%s", "bbb"));
    }

    @Test
    public  void myTest4 () {
        assertEquals("aaa", String.format("%s%s", "aaa", "bbb"));
    }
    @Test
    public  void myTest5() {
        assertEquals("aaa", String.format("%sbbb", "Aaa"));
    }
}




//isEmpty and length
//toLowerCase and toUpperCase
//String output = “Aaa” + “bbb”;
//String output = “Aaa”.concat(“bbb”);
//String output = String.format(“Aaa%s”, “bbb”);
//String output = String.format(“%s%s”, “Aaa”, “bbb”);
//String output = String.format(“%sbbb”, “Aaa”);