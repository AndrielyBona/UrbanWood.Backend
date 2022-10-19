package br.sc.senac.urbanwood.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="image")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_image")
	private Long id;
	
	@Column(name="name_image")
	private String name;
	
	@Column(name="code")
	private byte[] code;
	
}
