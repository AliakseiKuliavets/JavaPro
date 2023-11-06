package lesson.lesson21.mockEx;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockNotCallMethods {
    @Mock
    List<String> list = new ArrayList<>();
    
    @Test
    public void mockTest(){
        String s = "Mock";
        list.add(s);
        Assertions.assertEquals(1,list.size());
    }
}
