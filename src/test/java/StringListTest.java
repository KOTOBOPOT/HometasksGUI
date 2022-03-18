//import org.junit.Assert;
//import org.junit.Test;
import org.junit.Assert.*;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringListTest {
    @Test
    public void pushTest(){
        StringList stringList = new StringList();
        stringList.push("smth1");
        assertEquals(new String[]{"smth1"},stringList.stringList);
        //stringList.display();

        stringList.push("smth12345");
        //stringList.display();
        assertEquals(new String[]{"smth1","smth12345"},stringList.stringList);

        stringList.push("smth12");
        //stringList.display();
        assertEquals(new String[]{"smth1","smth12", "smth12345"},stringList.stringList);
        assertEquals("smth12345",stringList.getStringMaxLength());
        assertEquals( (9.0+5.0+6.0)/3.0, stringList.getAverage(),0.00001);
    }
    @Test
    public void insertTest(){
        StringList stringList = new StringList();
        stringList.insert(0,"smth1");
        assertEquals(new String[]{"smth1"},stringList.stringList);
        stringList.insert(0,"smth2");
        assertEquals(new String[]{"smth2","smth1"},stringList.stringList);
        stringList.insert(1,"smth3");
        assertEquals(new String[]{"smth2","smth3","smth1"},stringList.stringList);

        stringList.insert(3,"smth4");
        assertEquals(new String[]{"smth2","smth3","smth1","smth4"},stringList.stringList);

        assertEquals(5.0, stringList.getAverage());
        stringList.display();

    }
}