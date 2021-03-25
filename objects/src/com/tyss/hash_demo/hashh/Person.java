package com.tyss.hash_demo.hashh;

public class Person {
	int pid;
	String name;
	String email;

	public Person(int pid, String name, String email) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		return result;
	}

	@Override
	public String toString() {

		return pid + "==" + name + "==" + email;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid != other.pid)
			return false;
		return true;
	}

}
