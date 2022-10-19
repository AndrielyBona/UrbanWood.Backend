package br.sc.senac.urbanwood.mapper;

import br.sc.senac.urbanwood.dto.woodwork.WoodworkDTO;
import br.sc.senac.urbanwood.model.Woodwork;
import org.springframework.stereotype.Service;

@Service
public class WoodworkMapper {

	public WoodworkDTO toDTO(Woodwork woodwork) {
        return new WoodworkDTO(woodwork.getId(), woodwork.getCompanyName(), woodwork.getCnpj(),
				woodwork.getDescription(), woodwork.getAddress().getStreetName(), woodwork.getAddress().getNumber(),
				woodwork.getAddress().getComplement(), woodwork.getAddress().getNeighborhood(),
				woodwork.getAddress().getCity(), woodwork.getAddress().getCep(), woodwork.getContact().getNetWork(),
				woodwork.getContact().getEmail(), woodwork.getContact().getPhoneNumber(), woodwork.getLogin(),
				woodwork.getPassword());
    }

  /*  public Woodwork toEntity(WoodworkDTO dto) {
        return new Woodwork(dto.id(), dto.companyName(), dto.description(), dto.environment(), dto.order());
    }*/

}
