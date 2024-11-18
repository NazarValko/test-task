package org.nzrvko;

import java.util.List;

public class TablePrinter {
    public void createTable(List<String> strings, int columnCount) {
        if (columnCount <= 0) throw new IllegalArgumentException("Column count must be greater than 0");

        int columnWidth = strings.stream().mapToInt(String::length).max().orElse(0) + 5;
        printRow(strings, columnCount, columnWidth, 0);
    }

    private void printRow(List<String> strings, int columnCount, int columnWidth, int index) {
        if (index >= strings.size()) {
            return;
        }
        System.out.print(padString(strings.get(index), columnWidth));

        if ((index + 1) % columnCount == 0 || index == strings.size() - 1) {
            System.out.println();
        }

        printRow(strings, columnCount, columnWidth, index + 1);
    }

    private String padString(String s, int width) {
        return String.format("%-" + width + "s", s);
    }
}
