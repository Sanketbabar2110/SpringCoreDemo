package com.prowings;

public class Hello {
	
	String massage;

	public Hello() {
		super();
	}

	public Hello(String massage) {
		super();
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "Hello [massage=" + massage + "]";
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}
}
