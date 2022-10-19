package br.sc.senac.urbanwood.model;

import br.sc.senac.urbanwood.enumeration.Color;
import br.sc.senac.urbanwood.enumeration.Environment;
import br.sc.senac.urbanwood.enumeration.SizeFurniture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="furniture")
public class Furniture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_furniture")
	private Long id;
	
	@Column(name="name_furniture")
	private String name;
	
	@Column(name="price_furniture")
	private Double price;

	@Column(name="description_furniture")
	private String description;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="furniture_size_furniture")
	private SizeFurniture furnitureSize;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="environment_furniture")
	private Environment environment;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="color_furniture")
	private Color color;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_image")
	private Image image;
		
	@ManyToOne
	@JoinColumn(name = "woodwork")
	private Woodwork woodwork;
}
