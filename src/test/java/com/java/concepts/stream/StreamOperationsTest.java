package com.java.concepts.stream;

import com.java.concepts.stream.StreamOperations;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StreamOperationsTest {

    StreamOperations streamOperations;

    @BeforeAll
    public void setup() {
        streamOperations = new StreamOperations();
    }

    @Test
    public void test_reduce_Without_Identity_And_Without_Combiner() {
        streamOperations.reduce_Without_Identity_And_Without_Combiner();
    }

    @Test
    public void test_reduce_Without_Combiner() {
        streamOperations.reduce_Without_Combiner();
    }

    @Test
    public void test_reduce_With_Identity_And_with_Combiner() {
        streamOperations.reduce_With_Identity_And_with_Combiner();
    }
}