import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
	
	public static ArrayList<Integer> Sequence = new ArrayList<Integer>(
			Arrays.asList(1,2,4,4,4,1,5));
	
	public static void main(String[] args) {
			
		System.out.println(Sequence);
		unique();
		System.out.println(Sequence);
	}
	
	public static void unique() {
		Sequence.removeIf(i -> (Sequence.indexOf(i)!=Sequence.lastIndexOf(i)));
	}
} 