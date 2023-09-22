package summarySession.friday220923;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyCustomArrayList implements Iterable<String> {
    private final String[] myStringArray;

    public MyCustomArrayList(String[] myStringArray) {
        this.myStringArray = myStringArray;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return myStringArray.length > currentIndex;
            }

            @Override
            public String next() {
                return myStringArray[currentIndex++];
            }
        };
    }
}
