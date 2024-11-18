package org.nzrvko;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "aaaaaabbbb", "bbbbbaaaa", "ccccccaaaa", "dddddaaccc",
                "aaaaaaaaaaddssdsdsd", "bbbbbaaaaaaaa", "ccccccaaaaaaaaaaaaaa",
                "ddddddaacccccaaaaaaaaaaa", "a", "b", "c", "d", "bb", "ccc", "bbb", "dddddddd"
        );

        TablePrinter tablePrinter = new TablePrinter();

        System.out.println("-------FOUR COLUMNS-------");
        tablePrinter.createTable(strings, 4);

        System.out.println("\n-------THREE COLUMNS-------");
        tablePrinter.createTable(strings, 3);

        System.out.println("\n-------TWO COLUMNS-------");
        tablePrinter.createTable(strings, 2);

        System.out.println("\n-------ONE COLUMN-------");
        tablePrinter.createTable(strings, 1);

    }


}