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
		
		// generate @depth members of the Prime sequence and print them on console
		for (int i = 0; i < depth; i ++) { 
			System.out.print(pg.next()+" ");
		}
		
		pg.reset(); // Prime sequence reset
		
		System.out.print("\nReset + "+ addon +" new\t: ");
		
		// print out @depth members from Prime memo
		// (they should coincide with the previous @depth print) 
		// + generate @addon members of the Prime sequence and print them on console
		for (int i = 0; i < depth + addon; i ++) { 
			System.out.print(pg.next()+" ");
		}

		System.out.println("\n\nFibonacci Sequence");
		
		System.out.print("Init " + depth + "\t\t: ");
		
		// generate @depth members of the Fibonacci sequence and print them on console
		for (int i = 0; i < depth; i ++) {
			System.out.print(fg.next()+" ");
		}
		
		fg.reset(); // Fibonacci sequence reset
		
		System.out.print("\nReset + "+ addon +" new\t: ");
		
		// print out @depth members from Fibonacci memo 
		// (they should coincide with the previous @depth print)
		// + generate @addon members of the Fibonacci sequence and print them on console
		for (int i = 0; i < depth + addon; i ++) {
			System.out.print(fg.next()+" ");
		}
	}
	
}