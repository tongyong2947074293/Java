public class Map{
	private int width;
	private int height;
	private Character[][] grid;
	
	public Map(int width,int height) {
		this.width=width;
		this.height=height;
		this.grid=new Character[height][width];
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setCharacter(Character character) {
		grid[character.getY()][character.getX()]=character;
	}
	
	public void printMap() {
		for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				if(grid[y][x]==null) {
					System.out.print("_");
				}else {
					System.out.print(grid[y][x].getIcon());
				}
			}
			System.out.println();
		}
	}
	
	public Character getCharacter(int x,int y) {
		return grid[x][y];
	}
	public void clearOldCharacterPosition(Character character) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				if(grid[i][j]==character) {
					grid[i][j]=null;
				}
			}
		}
	}
}


   

