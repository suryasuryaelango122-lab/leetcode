// Last updated: 2/13/2026, 9:44:28 AM
import java.util.*;
import java.util.stream.*;

class Solution {
    public List<String> validateCoupons(String[] c, String[] b, boolean[] a) {
        return IntStream.range(0, c.length)
            .filter(i -> a[i]
                    && "electronics grocery pharmacy restaurant".contains(b[i])
                    && c[i].matches("\\w+"))
            .boxed()
            .sorted((i, j) -> {
                int d = "electronics grocery pharmacy restaurant".indexOf(b[i])
                      - "electronics grocery pharmacy restaurant".indexOf(b[j]);
                return d != 0 ? d : c[i].compareTo(c[j]);
            })
            .map(i -> c[i])
            .toList();
    }
}
