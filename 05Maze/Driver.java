public class Driver{

    public static void main(String[]args){
	//System.out.println("plz");
	Maze f;
        f = new Maze("data3.dat",true);//true animates the maze.

	//System.out.println("ayo");
        f.clearTerminal();
        f.solve();

        f.clearTerminal();
        System.out.println(f);
    }
}