
public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() {
		if (low >= high) {
			throw new IllegalStateException("Your guess was not inside the given guessing range");
		}

		low = getCurrentGuess() + 1;
	}
	
	public void lower() {
		if (high <= low) {
			throw new IllegalStateException("Your guess was not inside the given guessing range");
		}

		high = getCurrentGuess() - 1;
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}