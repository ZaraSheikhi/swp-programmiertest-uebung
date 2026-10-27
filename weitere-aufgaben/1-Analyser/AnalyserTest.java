import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnalyserTest {

    @Test
    public void testExample() {
        final List<Integer> list = List.of(15, 21, 3, 1, 1, 4, 2, 4, 6, 8, 12, 1, 10);
        
        assertSame(1, Analyser.getNumberWithExactFrequency(list, 3));
    }

}
