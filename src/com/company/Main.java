package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static String srcText = "Two households, both alike in dignity "
            + "In fair Verona, where we lay our scene "
            + "From ancient grudge break to new mutiny "
            + "Where civil blood makes civil hands unclean.";

    public static void main(String[] args) {
        Function<String, Set<String>> dictFunc = s -> Arrays.stream(
                s.trim().toLowerCase().replaceAll("\\p{Punct}", "").split("\\s"))
                .collect(Collectors.toSet());// функция высшего порядка
        System.out.println("Словарь: ");
        dictFunc.apply(srcText).stream().sorted().forEach(System.out::println);
    }
}
