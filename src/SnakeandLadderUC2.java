
public class SnakeandLadderUC2 {
	public String name= "User";
	public int player =  0;
	
	public void snake() {
		int roll = (int) Math.floor(Math.random()*10) % 6 + 1;
        System.out.println(+ roll);
	}
}

class ladd1{
	public static void main(String[] args) {
		SnakeandLadderUC2 ladd = new SnakeandLadderUC2();
		ladd.snake();
	}
	
}