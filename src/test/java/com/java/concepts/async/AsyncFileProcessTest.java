package com.java.concepts.async;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AsyncFileProcessTest {

    private AsyncFileProcess asyncFileProcess;

    @BeforeAll
    public void setup() {
        System.out.printf("Setup %s \n", "AsyncFileProcessTest");
        asyncFileProcess = new AsyncFileProcess();
    }

    @Test
    public void multipleFilesTest() {
        asyncFileProcess.upload(new File("/resources/FileOne.txt"), new File("/resources/FileTwo.txt"), new File("/resources/FileThree.txt"));
    }
}
