package com.Captaincow285.pieces;

public class Pawn extends Piece{
    private int xPos;
    private int yPos;
    private boolean side;
    private String name;
    private boolean firstMove;
    private boolean[][] possibleMoves = new boolean[8][8];

    public Pawn(int xPos, int yPos, boolean side) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.side = side;
        firstMove = true;
        if(side)
        {
            name = "W_Pawn";
        }
        else
        {
            name = "B_Pawn";
        }

        //populates entire array with false
        for(int i = 0; i < 8; i++)
        {
            for(int o = 0; o < 8; o++)
            {
                possibleMoves[i][o] = false;
            }
        }

        //generates initial starting moves
        if(side)
        {
            possibleMoves[yPos - 1][xPos] = true;
            possibleMoves[yPos - 2][xPos] = true;
        }
        else
        {
            possibleMoves[yPos + 1][xPos] = true;
            possibleMoves[yPos + 2][xPos] = true;
        }
    }

    public void generateMoves()
    {
        if(side)
        {
            possibleMoves[yPos - 1][xPos] = true;
        }
        else
        {
            possibleMoves[yPos + 1][xPos] = true;
        }
    }
}
