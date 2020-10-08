package io.turntabl;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.Result;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRule;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestStock {
    @Mock
    ProductPricingService productPricingService;

    @InjectMocks
    Stocks stocks=new Stocks();

    @Before
    public void setup(){

    }


    @Test
    public void stockTest_setexchange(){
        stocks.setExchange("Exchange");
        Assert.assertSame("Exchange","Failed");
    }

    public static void main(String[] args){
        Result result=org.junit.runner.JUnitCore.runClasses(TestStock.class);
        for (Failure f:result.getFailures()){
            System.out.println(f);
        }
        System.out.println(result.wasSuccessful());
    }

}
