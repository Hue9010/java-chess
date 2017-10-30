package chess.model.piece;

import java.util.List;

public class Pawn extends Piece {

	private Pawn(Position pos, Color color, List<Direction> directions) {
		super(pos, color, 'p', 1, directions);
	}
	
	public static Pawn createBlack(Position pos) {
		return new Pawn(pos, Color.BLACK, Direction.blackPawnDirections());
	}
	
	public static Pawn createWhite(Position pos) {
		return new Pawn(pos, Color.WHITE, Direction.whitePawnDirections());
	}

}
