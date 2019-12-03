import org.junit.Assert;
import org.junit.Test;

public class Zoo {
    @Test

public void verifyConstructorOfRabbit () {
        Rabbit myRabbit= new Rabbit(10);
        System.out.println(myRabbit.getAge());
        Assert.assertEquals("Rabbit age",5, myRabbit.getAge());

        }
}

/*public class Zoo {
  public static void main(String[] args) {
        Rabbit a= new Rabbit();
       a. setName("Black");
       a. setAge(3);
       a. setWeight(5.5);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getWeight());


Rabbit myRabbit = new Rabbit ("Black");
        System.out.println("Name:\t"+ myRabbit.getName());

        Rabbit myRabbit1 = new Rabbit (3);
        System.out.println("Age:\t"+ myRabbit.getAge());

        Rabbit myRabbit2 = new Rabbit (5.5);
        System.out.println("Weight:\t" + myRabbit.getWeight());

        Rabbit myRabbit3= new Rabbit ("Black", 3);
        System.out.println("Name:\t"+ myRabbit. getName());
        System.out.println("Age:\t"+ myRabbit.getAge());

        Rabbit myRabbit4 = new Rabbit (3, 5.5);
        System.out.println("Age:\t" + myRabbit.getName());
        System.out.println("Weight:\t" + myRabbit. getWeight());

        Rabbit myRabbit5 = new Rabbit("Black", 5.5);
        System.out.println("Name:\t" + myRabbit. getName());
        System.out.println("Weight:\t" + myRabbit. getWeight());

        Rabbit myRabbit6 = new Rabbit ("Black",3,5.5);
        System.out.println("Name:\t" + myRabbit. getName());
        System.out.println("Age:\t" + myRabbit. getAge());
        System.out.println("Weight:\t" + myRabbit. getWeight());
        }
 */

