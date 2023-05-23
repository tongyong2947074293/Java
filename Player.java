import java.util.Random;

public class Player extends Character{
	public Player(int x,int y,int health,int attackPower,char icon,Map map) {
		super(x,y,health,attackPower,icon,map);
	}
	public void act(Map map, Enemy enemy) {
        int dx = enemy.getX() - this.getX();
        int dy = enemy.getY() - this.getY();

        // 如果玩家在敌人的相邻格（包括对角），敌人进行攻击
        if (Math.abs(dx) <= 1 && Math.abs(dy) <= 1) {
            this.attack(enemy);
        }
    }
}