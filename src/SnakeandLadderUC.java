
public class SnakeandLadderUC {
	public String name= "User";
	public int player =  0;
	
	public void snake() {
		int roll = (int) Math.floor(Math.random()*10) % 6 + 1;
        System.out.println(+ roll);
	}
}

class ladder{
	public static void main(String[] args) {
		SnakeandLadderUC ladd = new SnakeandLadderUC();
		ladd.snake();
	}
	
}