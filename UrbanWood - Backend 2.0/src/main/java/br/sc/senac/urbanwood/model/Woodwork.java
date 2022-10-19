package br.sc.senac.urbanwood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "woodwork")
public class Woodwork extends User {

	@Column(name = "company_name_woodwork")
	private String companyName;

	@Column(name = "description_woodwork")
	private String description;

	@Column(name = "cnpj_woodwork")
	private String cnpj;

	@OneToMany(mappedBy = "woodwork")
	private List<Furniture> furniture  = new ArrayList<>();

	@OneToMany(mappedBy = "woodwork")
	private List<Order> order = new ArrayList<>();

	public Woodwork(Long id_user, Image image, String login, String password, Address address, Contact contact) {
		super(id_user, image, login, password, address, contact);
	}

	public Woodwork() {
		super();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
