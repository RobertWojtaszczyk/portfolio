package com.rw.sudoku;

public class BoardState {
    private final SudokuBoard sudokuBoard;
    private final int guessSudokuElementValue;
    private final int guessSudokuElementRow;
    private final int guessSudokuElementColumn;

    public BoardState(final SudokuBoard sudokuBoard, final int guessSudokuElementValue, final int guessSudokuElementRow, final int guessSudokuElementColumn) {
        this.sudokuBoard = sudokuBoard;
        this.guessSudokuElementValue = guessSudokuElementValue;
        this.guessSudokuElementRow = guessSudokuElementRow;
        this.guessSudokuElementColumn = guessSudokuElementColumn;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public int getGuessSudokuElementValue() {
        return guessSudokuElementValue;
    }

    public int getGuessSudokuElementRow() {
        return guessSudokuElementRow;
    }

    public int getGuessSudokuElementColumn() {
        return guessSudokuElementColumn;
    }
}