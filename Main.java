import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args) {
		Map map=new Map(10,10);
		Player player = new Player(0,0,100,10,'P',map);
		Enemy enemy=new Enemy(5,5,50,5,'E',map);
		Scanner scanner = new Scanner(System.in);
		boolean moved =false;
		
		
//		map.setCharacter(player);
//		map.setCharacter(enemy);
		
		System.out.println("Initial map:");
		map.printMap();

		
		System.out.println("Player is at ("+player.getX()+","+player.getY()+")");
		System.out.println("Enemy is at ("+enemy.getX()+","+enemy.getY()+")");
		
		while(true) {
            map.printMap();
            System.out.println("Enter your move: ");
            String move = scanner.nextLine();
            if (move.equals("w")) {
                player.move(map, 0, -1);
            } else if (move.equals("s")) {
                player.move(map, 0, 1);
            } else if (move.equals("a")) {
                player.move(map, -1, 0);
            } else if (move.equals("d")) {
                player.move(map, 1, 0);
            }
            player.act(map,enemy);
            enemy.act(map,player);//
         // check if enemy is defeated
            if (enemy.getHealth() <= 0) {
                System.out.println("You win!");
                break;
            }

            // If enemy moved into the player's position, enemy attacks the player
            if (enemy.getX() == player.getX() && enemy.getY() == player.getY()) {
                enemy.attack(player);
            }
            // check if player is defeated
            if (player.getHealth() <= 0) {
                System.out.println("You lose!");
                break;
            }

            System.out.println("Player is at (" + player.getX() + "," + player.getY() + "), health: " + player.getHealth());
            System.out.println("Enemy is at (" + enemy.getX() + "," + enemy.getY() + "), health: " + enemy.getHealth());
     
        }
		
		System.out.println("player is now at ("+player.getX()+","+player.getY()+")");
		
		map.printMap();
	}
}


