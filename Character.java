
public abstract class Character{
	protected int x;
	protected int y;
	protected int health;
	protected char icon;
	protected int attackPower;
	
	public Character(int x,int y,int health,int attackPower,char icon) {
		this.x=x;
		this.y=y;
		this.health=health;
		this.icon=icon;
		this.attackPower=attackPower;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHealth() {
		return health;
	}
	
	public char getIcon() {
		return icon;
	}
	
	public void attack(Character target) {
		target.health-=this.attackPower;
	}
	public void move(Map map,int dx,int dy) {
		int newX=x+dx;
		int newY=y+dy;
		
		if(newX>=0 && newX<map.getWidth() && newY>=0 && newY<map.getHeight() && map.getCharacter(newX,newY)==null) {
			x=newX;
			y=newY;

			map.clearOldCharacterPosition(this);//clear character's old position
			map.setCharacter(this);//set Character's new position
		}
	}
}
