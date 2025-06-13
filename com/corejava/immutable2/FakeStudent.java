package com.corejava.immutable2;

import java.util.Objects;

public class FakeStudent extends Student{
	
	private String fakeStudent;

	public FakeStudent(String name) {
		super(name);
		this.setFakeStudent(name);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fakeStudent);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FakeStudent other = (FakeStudent) obj;
		return Objects.equals(fakeStudent, other.fakeStudent);
	}

@Override
	public String getName() {
		return fakeStudent;
	}

	public void setFakeStudent(String fakeStudent) {
		this.fakeStudent = fakeStudent;
	}

}
