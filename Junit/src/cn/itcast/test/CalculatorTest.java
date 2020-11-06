package cn.itcast.test;


import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
    * 初始化方法：用于资源申请，所有的测试方法在执行前都会执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init...");
    }


    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        //System.out.println(result);
        //断言，断言结果是3
        Assert.assertEquals(3,result);
    }

    /*
    * 在所有测试方法执行完之后，都会自动执行该方法
    * */
    @After
    public void close(){
        System.out.println("close...");
    }
}
