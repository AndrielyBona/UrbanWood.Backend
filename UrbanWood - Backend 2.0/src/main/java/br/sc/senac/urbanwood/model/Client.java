package br.sc.senac.urbanwood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="client")
public class Client extends User{

	@Column(name="cpf_client")
	private String cpf;
	
	@Column(name="first_name_client")
	private String firstName;
	
	@Column(name="last_name_client")
	private String lastName;
	
	@OneToMany(mappedBy = "client")
	private List<Order> order = new ArrayList<Order>();


	public Client(Long idClient, String login, String password, String cpfClient, String firstName, String lastName, Long id, Long id1) {
	}



	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
}

