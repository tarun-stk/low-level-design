package com.stk.tictactoe;

public class Board {
    private Integer size;
    private PlayerPieceType[][] pieceTypes;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PlayerPieceType[][] getPieceTypes() {
        return pieceTypes;
    }

    public void setPieceTypes(PlayerPieceType[][] pieceTypes) {
        this.pieceTypes = pieceTypes;
    }
}
