package generators;

public class PrimeGenerator extends Generator {
    public PrimeGenerator() {
        init(2);
    }

    public int getBaseValue() {
        return generatedValues.get(0);
    }

    public int next() {
        // if this member of our sequence was already generated
        // return it from array
    	if (counter <= generatedValues.size() - 1) {
    		counter += 1;
    		return generatedValues.get(counter - 1);
    	} else { // else generate next value from current one
    		for (int i = generatedValues.get(counter - 1) + 1;; i++) {
    			if (isPrime(i)) {
    				generatedValues.add(i); // also add it to array
    				counter += 1;
    				return i;
    			}
    		}
    	}
    }

    private boolean isPrime(int n) {
    	for (int i = 2; i <= n / 2; i += 1) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }



}