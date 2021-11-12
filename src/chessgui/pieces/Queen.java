package chessgui.pieces;

import chessgui.Board;

public class Queen extends Piece {

    public Queen(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        int sx = this.getX();
    	int sy = this.getY();
    	
    	int ly = Math.abs(destination_y - sy);
    	int lx = Math.abs(destination_x - sx);
    	
        Piece pPiece = board.getPiece(destination_x, destination_y);
        if( pPiece != null) {
        	if(pPiece.isWhite() && this.isWhite()) {
        		return false;
        	}
        	else if(pPiece.isBlack() && this.isBlack()) {
        		return false;
        	}
        }
        
        if(((lx == 2 && ly == 1)||(ly == 2 && lx == 1))) {
        	return true;
        }
        return false;

        
        
    }
}
