package main;

public class Capacity extends Number {

	private int capacity;

	public Capacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public double doubleValue() {
		return intValue();
	}

	@Override
	public float floatValue() {
		return intValue();
	}

	@Override
	public int intValue() {
		return capacity;
	}

	@Override
	public long longValue() {
		return intValue();
	}

}
