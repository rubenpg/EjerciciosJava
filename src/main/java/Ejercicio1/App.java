package Ejercicio1;

public class App {
	public static void main(String args[]) {
    	Tree[] arboles = new Tree[4];
 		arboles[0] = new Tree(4);
  		arboles[1] = new Tree("Roble");
  		arboles[2] = new Tree();
  		arboles[3] = new Tree(5,"Pino");
  		//for (Tree t : arboles)
  			//System.out.println(t);
  			System.out.println(arboles[0]);
  			System.out.println(arboles[1]);
  			System.out.println(arboles[2]);
  			System.out.println(arboles[3]);
 	}
}

