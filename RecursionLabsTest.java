import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class RecursionLabsTest extends junit.framework.TestCase
{

    public static void main(String args[]) {
        RecursionLabsTest test = new RecursionLabsTest();
        test.test_reverse();
        test.test_listPrint();
    }

   @Test
    public void test_reverse()
    {
        RecursionLabs r = new RecursionLabs();
        List list = new ArrayList();
        for (int i = 1; i <= 10; i++)
            list.add(i);

        List list2 = new ArrayList();
        for (int i = 10; i >= 1; i--)
            list2.add(i);

        List list3 = r.reverse(list);
        assertEquals(list2.toString(), list3.toString());
    }

    @Test
    public void test_listPrint() {
        RecursionLabs r = new RecursionLabs();
        ArrayList fruits = new ArrayList ();
        fruits.add ("apples"); 
        fruits.add ("bananas"); 

        ArrayList snacks = new ArrayList ();
        ArrayList unhealthy = new ArrayList();
        unhealthy.add ("chips"); 
        unhealthy.add("cheetos");
        ArrayList healthy = new ArrayList();
        healthy.add("fruities");
        healthy.add ("pretzels");
        snacks.add(healthy);
        snacks.add(unhealthy);

        ArrayList food = new ArrayList ();
        food.add ("Fruits");
        food.add (fruits);
        food.add ("Snacks");
        food.add (snacks);

        assertEquals(food.toString(), r.listPrint(food));
    }
}
