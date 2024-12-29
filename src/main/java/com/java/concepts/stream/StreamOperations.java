package com.java.concepts.stream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {

    public void reduce_Without_Identity_And_Without_Combiner() {
        //OptionalInt result = IntStream.iterate(1, n -> n+1).limit(20).reduce((n1, n2) -> n1 + n2);
        OptionalInt result = IntStream.iterate(1, n -> n+1).limit(20).reduce(Integer::sum);
        System.out.println(result.orElseGet(() -> 0));
    }

    public void reduce_Without_Combiner() {
        int result = IntStream.iterate(1, n -> n <= 20, n -> n + 1).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(result);
    }

    public void reduce_With_Identity_And_with_Combiner() {
        List<Integer> list = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        //int result = list.parallelStream().reduce(0, Integer::sum, Integer::sum);
        int result = list.parallelStream().reduce(0, (n1, n2) -> n1 + n2, (r1, r2) -> r1 + r2);
        System.out.printf("%d", result);
    }


}
