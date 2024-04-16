package fk.examples.onlinecasino.model;

public class Player {
	private final String id;
	private String firstName;
	private String lastName;
	private String fullName;
	private int credit;
	private String email;
	private String password;

	// Constructor
	public Player(String id, String firstName, String lastName, int credit, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.credit = credit;
		this.email = email;
		this.password = password;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString() method for displaying player information
	@Override
	public String toString() {
		return "Player{" + "id='" + id + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", credit=" + credit + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Player)) {
			return false;
		}
		Player other = (Player) obj;
		return other.getId().equals(this.id);
	}
}