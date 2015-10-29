package com.wakaleo.gameoflife.domain;

/***
 * Cell in Game of Life
 * @author marcel
 */
public enum Cell {
    //LIVE_CELL("*"), DEAD_CELL(".");
    // Introduction of a failure! '+' instead of '*'
    LIVE_CELL("+"), DEAD_CELL(".");
    // Extra comments!

    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
