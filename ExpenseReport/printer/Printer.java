package expensereport.printer;

import expensereport.line.Line;

public interface Printer {
    void printLine(Line line);
}
