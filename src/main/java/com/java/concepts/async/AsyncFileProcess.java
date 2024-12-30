package com.java.concepts.async;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AsyncFileProcess {

    public void upload(File... files) {
        Arrays.asList(files).parallelStream().filter(File::exists).forEach(f -> {
            System.out.println(f.isFile());
        });
    }
}
