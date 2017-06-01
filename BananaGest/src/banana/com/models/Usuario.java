package banana.com.models;

public class Usuario {
	int id;
	String name;
	private String email;
	String password;

	public Usuario(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.setEmail(email);
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
