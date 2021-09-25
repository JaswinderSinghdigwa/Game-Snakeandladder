
public class SnakeandLadderUC {

	public String name= "User";
    public int position=0;
    public int[] ladder = {4,24,48,67,86};
    public int[] ladderlength= {13,23,5,12,13};
    public int[] snake = {6,26,47,23,55,97};   
    public int[] lengthsnake = {4,6,7,5,8,9};
    
    
public void snake() {
  int  chances = 0;
    System.out.println("----------------LeTs StArT ThE GaMe----------------\n");
    	int roll = (int) Math.floor(Math.random()*10) % 6 + 1;
       System.out.println(+ roll);
        position = roll + position;
        if(position > 100) {
        	System.out.print("NOplay");
            position = position - roll;
        }
        for(int n = 0; n < ladder.length; n++) {
                if (position == ladder[n]) {
                    position = position + ladderlength[n];
                }
        }
        for (int n = 0; n < snake.length; n++) {
                if (position == snake[n]) {
                    position = position - lengthsnake[n];
                	}
        }
}

class Game{
public static void main(String[] args) {
	SnakeandLadderUC ladd = new SnakeandLadderUC();
	ladd.snake();	
	}
}
}

