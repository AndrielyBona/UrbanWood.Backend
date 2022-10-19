package br.sc.senac.urbanwood.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long id_user;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_image")
	private Image image;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@OneToOne
    @JoinColumn(name = "id_address_user")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contact_user")
	private Contact contact;



	public Long getId() {
		return id_user;
	}

	public void setId(Long id) {
		this.id_user = id;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}


}
