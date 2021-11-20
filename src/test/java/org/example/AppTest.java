package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    //点击右边绿箭头，不用main方法也可以运行(方法旁边的绿箭头是单独运行)
    @Test
    public void shouldAnswerWithTrue01()
    {
        System.out.println("shouldAnswerWithTrue01");
        App a = new App();
        assertEquals(4, a.add(1, 3));
    }

    @Test
    public void shouldAnswerWithTrue02()
    {
        System.out.println("shouldAnswerWithTrue02");
        App a = new App();
        assertEquals(4, a.add(1, 3));
    }
}