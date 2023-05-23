import java.util.Random;


public class Enemy extends Character{
	public Enemy(int x,int y,int health,int attackPower,char icon,Map map) {
		super(x,y,health,attackPower,icon,map);
	}
	public void act(Map map, Player player) {
        int dx = player.getX() - this.getX();
        int dy = player.getY() - this.getY();

        // 如果玩家在敌人的相邻格（包括对角），敌人进行攻击
        if (Math.abs(dx) <= 1 && Math.abs(dy) <= 1) {
            this.attack(player);
        }
    }
}