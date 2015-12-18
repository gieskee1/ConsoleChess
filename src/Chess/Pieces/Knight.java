package Chess.Pieces;

import Chess.ChessPiece;
import Chess.Move;

public class Knight extends ChessPiece{

	public Knight(ChessPiece.PieceColor color){
		super(PieceType.Knight, color, validMoves());
	}


	private static Move[] validMoves(){
		return new Move[]{	new Move(2, 1, false), new Move(1, 2, false),
	                    	new Move(2, -1, false), new Move(-1, 2, false),
	                        new Move(2, -1, false), new Move(-1, 2, false),
	                        new Move(-2, 1, false), new Move(1, -2, false),
	                        new Move(-2, -1, false), new Move(-1, -2, false),
	                        new Move(-2, -1, false), new Move(-1, -2, false)};
	}
}