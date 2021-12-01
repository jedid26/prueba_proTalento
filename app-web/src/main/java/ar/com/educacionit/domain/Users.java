package ar.com.educacionit.domain;

public class Users {
	
	private Long id;
	private String username;
	private String passsword;
	
	private Socios socio;
	
	//CONSTRUCTOR
	public Users(Long id, String username, String passsword, Socios socio) {
		this.id = id;
		this.username = username;
		this.passsword = passsword;
		this.socio = socio;
	}
	
	public Users(String username, String passsword, Socios socio) {
		this.username = username;
		this.passsword = passsword;
		this.socio = socio;
	}
	
	//GETTERS, SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	public Socios getSocio() {
		return socio;
	}

	public void setSocio(Socios socio) {
		this.socio = socio;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", passsword=" + passsword + ", socio=" + socio + "]";
	}

	
	
	
	
}
