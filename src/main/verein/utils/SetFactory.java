package verein.utils;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetFactory {

    public static <T> Set<T> asSet(T... a) {
        return Stream.of(a).collect(Collectors.toSet());
    }

    public static <T> Set<T> emptySet() {
        return Collections.emptySet();
    }

}
