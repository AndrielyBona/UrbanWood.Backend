package br.sc.senac.urbanwood.mapper;

import br.sc.senac.urbanwood.dto.furniture.FurnitureDTO;
import br.sc.senac.urbanwood.model.Furniture;
import org.springframework.stereotype.Service;

@Service
public class FurnitureMapper {

	public FurnitureDTO toDTO(Furniture furnitureSaved) {
		// TODO Auto-generated method stub
		return null;
	}
/*
	 public FurnitureDTO toDTO(Furniture furniture) {
	        return new FurnitureDTO(furniture.getId(),furniture.getName(), furniture.getPrice(), furniture.getDescription(),
	        		furniture.getFurnitureSize(), furniture.getImage(), furniture.getColor());
	    		
	    }
	

	    public Furniture toEntity(FurnitureDTO dto) {
	        return new Furniture(dto.id(), dto.description(), dto.furnitureSize(), dto.name(), dto.price(), dto.image(), dto.color());
	    }*/
}
