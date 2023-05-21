import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Map map=new Map(10,10);
		Player player = new Player(0,0,100,10,'P');
		Enemy enemy=new Enemy(5,5,50,5,'E');
		Scanner scanner = new Scanner(System.in);
		
		map.setCharacter(player);
		map.setCharacter(enemy);
		
		System.out.println("Initial map:");
		map.printMap();

		
		System.out.println("Player is at ("+player.getX()+","+player.getY()+")");
		System.out.println("Enemy is at ("+enemy.getX()+","+enemy.getY()+")");
		
		while(true) {
            map.printMap();
            System.out.println("Enter your move: ");
            String move = scanner.nextLine();
            if(move.equals("w")) {
                player.move(map,0, -1);
            } else if(move.equals("s")) {
                player.move(map,0, 1);
            } else if(move.equals("a")) {
                player.move(map,-1, 0);
            } else if(move.equals("d")) {
                player.move(map,1, 0);
            } else if(move.equals("attack")) {
                player.attack(enemy);
            }


            
            if(enemy.health <= 0) {
                System.out.println("You win!");
                break;
            } else if(player.health <= 0) {
                System.out.println("You lose!");
                break;
            }
        }
		
		System.out.println("player is now at ("+player.getX()+","+player.getY()+")");
		
		map.printMap();
	}
}


