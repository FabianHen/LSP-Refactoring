package expensereport.printer;

import expensereport.line.Line;

public class ConsolePinter implements Printer{

    @Override
    public void printLine(Line line) {
        System.out.println(line.format());
    }
}
