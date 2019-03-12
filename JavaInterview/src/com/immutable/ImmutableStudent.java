package com.immutable;

public final class ImmutableStudent {
	private final int rollNumber;
	private final String studentName;

	ImmutableStudent(int rollNumber, String studentName) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableStudent other = (ImmutableStudent) obj;
		if (rollNumber != other.rollNumber)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

}
