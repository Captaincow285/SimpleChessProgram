package com.Captaincow285;

public class Interpreter {
    public Interpreter(){}

    public static boolean interpret(String move, Board board)
    {
        if(move.charAt(0) != 'R' || move.charAt(0) != 'N' || move.charAt(0) != 'B' || move.charAt(0) != 'K' || move.charAt(0) != 'Q')
        {
            return false;
        }
        else
        {
            if(move.charAt(0) <= 122 && move.charAt(0) >= 97)
            {
                move = "j" + move;
            }
            else if(move.charAt(0) == 48)
            {
                move += "jj";
                if(move.charAt(4) == 48)
                {

                }
                else
                {

                }
            }
            else
            {
                if()
                {

                }
            }
        }

    }
}
