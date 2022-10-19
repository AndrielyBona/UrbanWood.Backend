package br.sc.senac.urbanwood.model;

import br.sc.senac.urbanwood.enumeration.Payment;
import br.sc.senac.urbanwood.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_order")
	private Long id;

	@Column(name = "price_order")
	private Double price;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status_order", nullable = false)
	private Status status;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "payment_order", nullable = false)
	private Payment payment;

	@Column(name = "start_date_order")
	private LocalDate startDate;

	@Column(name = "end_date_order")
	private LocalDate endDate;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "id_woodwork")
	private Woodwork woodwork;

	@ManyToMany
	@JoinTable(name = "furniture_order", joinColumns = @JoinColumn(name = "id_order"),
	inverseJoinColumns = @JoinColumn(name = "id_furniture"))
	private List<Furniture> furnitures;
}
