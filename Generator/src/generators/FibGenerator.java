package generators;

public class FibGenerator extends Generator {
    public FibGenerator() {
    	super(0);
    }

    protected int GenerateNext() {
    	if (counter == 1) {
    		return 1;
    	} else {
    		return generatedValues.get(counter - 1) + generatedValues.get(counter - 2);
    	}
    }
}