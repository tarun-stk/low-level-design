package com.stk.tictactoe;

public class Player {
    private String name;

    private PlayerPieceType playerPieceType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerPieceType getPlayerPieceType() {
        return playerPieceType;
    }

    public void setPlayerPieceType(PlayerPieceType playerPieceType) {
        this.playerPieceType = playerPieceType;
    }
}
