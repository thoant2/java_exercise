package Task;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

class Task5Test {
    Task5 task5 = new Task5();

    @Test
    public void Test_removeAllNumbersGreaterThan10()
    {
        Set<Integer> set = task5.createSet();
        Set<Integer> integerSet = task5.removeAllNumbersGreaterThan10(set);
        Assert.assertNotNull(integerSet);
        Assert.assertEquals(4,integerSet.size());

    }

}