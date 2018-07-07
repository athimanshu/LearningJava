package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List<String> list = Arrays.asList("Raam","Mohan","Ramesh","Sita","Laxman");
        boolean isExist = list.stream().anyMatch(element-> element.contains("am"));
        System.out.println(isExist);

        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> stream = uris.stream().map(uri -> Paths.get(uri));

    }
}
