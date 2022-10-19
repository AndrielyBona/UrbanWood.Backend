package br.sc.senac.urbanwood.service.client;

import br.sc.senac.urbanwood.dto.adress.AddressDTO;
import br.sc.senac.urbanwood.dto.client.ClientDTO;
import br.sc.senac.urbanwood.dto.contact.ContactDTO;
import br.sc.senac.urbanwood.exception.client.ClientNotFoundException;
import br.sc.senac.urbanwood.mapper.AddressMapper;
import br.sc.senac.urbanwood.mapper.ClientMapper;
import br.sc.senac.urbanwood.mapper.ContactMapper;
import br.sc.senac.urbanwood.model.Client;
import br.sc.senac.urbanwood.model.Contact;
import br.sc.senac.urbanwood.repository.ClientRepository;
import br.sc.senac.urbanwood.service.address.AddressServiceImpl;
import br.sc.senac.urbanwood.service.contact.ContactServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

	private final ClientRepository clientRepository;
	private final ClientMapper clientMapper;
	private final ContactServiceImpl contactServiceImpl;
	private final AddressServiceImpl addressServiceImpl;
	private final ContactMapper contactMapper;
	private final AddressMapper addressMapper;

	public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper, ContactServiceImpl contactServiceImpl, AddressServiceImpl addressServiceImpl, ContactMapper contactMapper, AddressMapper addressMapper) {
		this.clientRepository = clientRepository;
		this.clientMapper = clientMapper;
		this.contactServiceImpl = contactServiceImpl;
		this.addressServiceImpl = addressServiceImpl;
		this.contactMapper = contactMapper;
		this.addressMapper = addressMapper;
	}


	public ClientDTO save(ClientDTO dto) {

		Contact contact =  contactServiceImpl.save(new ContactDTO(dto.idClient(), dto.email(), dto.phone(), dto.socialNetwork()));

		addressServiceImpl.save(new AddressDTO(dto.idClient(), dto.streetName(), dto.number(), dto.neighborhood(),
				dto.complement(), dto.city(), dto.cep()));

		Client clientSaved = clientRepository.(dto.idClient(),dto.login(), dto.password(), dto.cpfClient(),
				dto.firstName(), dto.lastName(),address.getId(),contact.getId());

		return dto;
	}

	public void update(ClientDTO dto, Long id) {

//		Client client = clientRepository.findById(id)
//				.orElseThrow(() -> new ClientNotFoundException("Client " + id + " was not found"));
//		Contact contact = contactServiceImpl.findContactById(id)
//				.orElseThrow(() -> new ContactNotFoundException("Contact " + id + " was not found"));
//		Address address = addressServiceImpl.findById(id)
//				.orElseThrow(() -> new AddressNotFoundException("Client " + id + " was not found"));



//		client.setCpf(dto.cpfClient());
//		client.setLastName(dto.lastName());
//		client.setFirstName(dto.firstName());
//		contact.setEmail(dto.email());
//		contact.setPhoneNumber(dto.phone());
//		contact.setNetWork(dto.socialNetwork());
//
//		clientRepository.save(client);
	}

	public void delete(Long id) {

		if (!clientRepository.existsById(id))
			throw new ClientNotFoundException("Client " + id + " was not found");

		clientRepository.deleteById(id);
	}

	public ClientDTO findById(Long id) {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ClientNotFoundException("Client " + id + " was not found"));
		return clientMapper.toDTO(client);
	}



}