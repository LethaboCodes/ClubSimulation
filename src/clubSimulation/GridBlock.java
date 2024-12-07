package clubSimulation;

import java.util.concurrent.atomic.AtomicInteger;

// GridBlock class to represent a block in the club.
// only one thread at a time "owns" a GridBlock

public class GridBlock {
	private AtomicInteger isOccupied = new AtomicInteger(-1);
 
	private final boolean isExit;  //is this the exit door?
	private final boolean isBar; //is it a bar block?
	private final boolean isDance; //is it the dance area?
	private int [] coords; // the coordinate of the block.
	
	GridBlock(boolean exitBlock, boolean barBlock, boolean danceBlock) throws InterruptedException {
		isExit=exitBlock;
		isBar=barBlock;
		isDance=danceBlock;
		isOccupied.set(-1);
	}
	
	GridBlock(int x, int y, boolean exitBlock, boolean refreshBlock, boolean danceBlock) throws InterruptedException {
		this(exitBlock,refreshBlock,danceBlock);
		coords = new int [] {x,y};
	}
	
	public  int getX() {return coords[0];}  
	
	public  int getY() {return coords[1];}
	
	synchronized public boolean get(int threadID) throws InterruptedException{
			synchronized (this) {
					if (isOccupied.get() == threadID) return true;
					if (isOccupied.get() >= 0) return false;
					isOccupied.set(threadID);
					return true;
			}
	}
		
	synchronized public void release() {
			synchronized (this) {
					isOccupied.set(-1);
			}
	}
	
	public  boolean occupied() {
		if(isOccupied.get()==-1) return false;
		return true;
	}
	
	public boolean isExit() {
		return isExit;	
	}

	public   boolean isBar() {
		return isBar;
	}
	public   boolean isDanceFloor() {
		return isDance;
	}

}
