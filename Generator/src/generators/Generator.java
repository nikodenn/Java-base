package generators;

import java.util.ArrayList;

public abstract class Generator {
    protected int counter;
    protected ArrayList<Integer> generatedValues = new ArrayList<>();

    protected Generator(int _baseValue) {
        // baseValue = _baseValue;
        generatedValues.add(_baseValue);
        // currentValue = baseValue;
        counter = 0;
    }

    public int next() {
    	// if this member of our sequence was already generated
        // return it from array
    	if (counter <= generatedValues.size() - 1) {
    		counter += 1;
    		return generatedValues.get(counter - 1);
    	} else { // else generate next value from current one
    		int nextValue = GenerateNext();
    		generatedValues.add(nextValue);
    		counter += 1;
    		return nextValue;
    	}
    }

    public void reset() {
        // currentValue = baseValue;
        counter = 0;
    };
    
    public int getBaseValue() {
        return generatedValues.get(0);
    }
    
    public int getCurretnValue() {
        return generatedValues.get(counter - 1);
    }
    
    protected abstract int GenerateNext();
}