import generators.FibGenerator;
import generators.PrimeGenerator;

public class Run {

	public static void main (String[] args) {
		int depth = Integer.parseInt(args[0]);
		int addon = Integer.parseInt(args[1]);
		
		PrimeGenerator pg = new PrimeGenerator();
		FibGenerator fg = new FibGenerator();
		
		System.out.println("Prime Sequence");
		
		System.out.print("Init " + depth + "\t\t: ");
		for (int i = 0; i < depth; i ++) {
			System.out.print(pg.next()+" ");
		}
		
		pg.reset();
		
		System.out.print("\nReset + "+ addon +" new\t: ");
		for (int i = 0; i < depth + addon; i ++) {
			System.out.print(pg.next()+" ");
		}

		System.out.println("\n\nFibonacci Sequence");
		
		System.out.print("Init " + depth + "\t\t: ");
		for (int i = 0; i < depth; i ++) {
			System.out.print(fg.next()+" ");
		}
		
		fg.reset();
		
		System.out.print("\nReset + "+ addon +" new\t: ");
		for (int i = 0; i < depth + addon; i ++) {
			System.out.print(fg.next()+" ");
		}
	}
	
}