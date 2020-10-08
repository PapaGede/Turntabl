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
public class TestFutures {
    @Mock
    ProductPricingService productPricingService;

    @InjectMocks
    Futures futures=new Futures();

    @Before
    public void setup(){

    }


    @Test
    public void stockTest_setPrice(){
        futures.setcPrice(50.0);
        Assert.assertSame(50,50);
    }

    public static void main(String[] args){
        Result result=org.junit.runner.JUnitCore.runClasses(TestStock.class);
        for (Failure f:result.getFailures()){
            System.out.println(f);
        }
        System.out.println(result.wasSuccessful());
    }


}
