package lesson29;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 描述：     HashMap不是线程安全的。如果再while (true) 这里打断点等待一会儿，那么就不会抛异常。如果不打断点，就会抛异常，因为：
 */
public class HashMapNotSafe {

    public static void main(String[] args) {
        final Map<Integer, String> map = new HashMap<>();

        final Integer targetKey = 0b1111_1111_1111_1111; // 65 535
        final String targetValue = "v";
        map.put(targetKey, targetValue);

        new Thread(() -> {
            IntStream.range(0, targetKey).forEach(key -> map.put(key, "someValue"));
        }).start();

        while (true) {
//            if (!targetValue.equals(map.get(targetKey))) {
            if (null == map.get(targetKey)) {
                throw new RuntimeException("HashMap is not thread safe.");
            }
        }
    }
}
