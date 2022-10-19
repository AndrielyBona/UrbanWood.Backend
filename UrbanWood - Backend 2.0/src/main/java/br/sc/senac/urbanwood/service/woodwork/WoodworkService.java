package br.sc.senac.urbanwood.service.woodwork;

import br.sc.senac.urbanwood.dto.woodwork.WoodworkDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WoodworkService {
//
//	WoodworkDTO save(WoodworkDTO dto);
//
//	void delete(Long id);
//
//	void update(WoodworkDTO allWoodworkDTO, Long id);
//
//	WoodworkDTO findById(Long id);
	
	List<WoodworkDTO> findAll();

	/*
	 * 
	 * 
	 * 
	 * ProfileWoodworkFullEditProjection findById(Long id);
	 * 
	 * List<WoodworkDTO> findByCompanyName(String companyName);
	 * 
	 * WoodworkDTO findByCnpj(String cnpj);
	 * 
	 * List<WoodworkDTO> findByPhoneNumber(String phoneNumber);
	 * 
	 * List<WoodworkDTO> findByNeighborhood(String
	 * neighborhood);
	 * 
	 */

}