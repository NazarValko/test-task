package org.nzrvko;

import java.util.List;

public class TablePrinter {

    public void createTable(List<String> strings, int columnCount) {
        if (columnCount <= 0) throw new IllegalArgumentException("Column count must be greater than 0");

        int columnWidth = strings.stream().mapToInt(String::length).max().orElse(0) + 5;
        int totalCells = ((strings.size() + columnCount - 1) / columnCount) * columnCount;

        for (int i = 0; i < totalCells; i++) {
            String cellContent = i < strings.size() ? strings.get(i) : "";
            System.out.print(padString(cellContent, columnWidth));
            if ((i + 1) % columnCount == 0) System.out.println();
        }
    }

    private String padString(String s, int width) {
        return String.format("%-" + width + "s", s);
    }
}
