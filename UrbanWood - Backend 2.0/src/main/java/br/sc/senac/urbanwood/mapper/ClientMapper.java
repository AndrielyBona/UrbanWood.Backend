package br.sc.senac.urbanwood.mapper;

import br.sc.senac.urbanwood.dto.client.ClientDTO;
import br.sc.senac.urbanwood.model.Address;
import br.sc.senac.urbanwood.model.Client;
import br.sc.senac.urbanwood.model.Contact;
import br.sc.senac.urbanwood.model.Image;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {


    public ClientDTO toDTO(Client client) {

        return new ClientDTO(client.getId(), client.getFirstName(), client.getLastName(), client.getCpf(),
                client.getAddress().getStreetName(), client.getAddress().getNumber(),
                client.getAddress().getNeighborhood(), client.getAddress().getComplement(),
                client.getAddress().getCity(), client.getAddress().getCep(), client.getContact().getEmail(),
                client.getContact().getNetWork(), client.getContact().getPhoneNumber(), client.getLogin(),
                client.getPassword());
    }

    public Client toEntity(ClientDTO dto) {
        Contact contact = new Contact(dto.idClient(), dto.email(), dto.phone(), dto.socialNetwork());
        Address address = new Address(dto.idClient(), dto.streetName(), dto.number(), dto.neighborhood(),
                dto.complement(), dto.city(), dto.cep());

        Client client = new Client(dto.idClient(),dto.login(), dto.password(), dto.cpfClient(),
                dto.firstName(), dto.lastName(),address.getId(),contact.getId());
        return client;
    }


}
