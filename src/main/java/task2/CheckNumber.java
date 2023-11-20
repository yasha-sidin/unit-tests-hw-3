package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckNumber {
    private static final List<Integer> list = IntStream.iterate(0, i -> i + 1)
            .skip(25)
            .limit(76)
            .boxed()
            .collect(Collectors.toList());

    public static boolean numberInInternal(int n) {
        return list.contains(n);
    }
}
