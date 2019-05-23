package generators;

public class FibGenerator extends Generator {
    public FibGenerator() {
    	init(0);
    	init(1);
    }

    public int getFirst() {
        return generatedValues.get(0);
    }

    public int getSecond() {
        return generatedValues.get(1);
    }

    public int next() {
    	// if this member of our sequence was already generated
        // return it from array
    	if (counter <= generatedValues.size() - 1) {
    		counter += 1;
    		return generatedValues.get(counter - 1);
    	} else { // else generate next value from current one
    		generatedValues.add(generatedValues.get(counter - 1) + generatedValues.get(counter - 2));
    		counter += 1;
    		return generatedValues.get(counter - 1);
    	}
    }
}