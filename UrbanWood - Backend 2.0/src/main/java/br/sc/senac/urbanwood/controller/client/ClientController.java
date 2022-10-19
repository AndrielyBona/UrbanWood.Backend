package br.sc.senac.urbanwood.controller.client;

import br.sc.senac.urbanwood.dto.client.ClientDTO;
import br.sc.senac.urbanwood.service.client.ClientServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/client")
public class ClientController {

    private final ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientService) {
        this.clientServiceImpl = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> addClient(@RequestBody ClientDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body( clientServiceImpl.save(dto));
    }

   /* @PutMapping("/{id}")
    public ResponseEntity<String> updateClient(@RequestBody ClientDTO dto, @PathVariable(value = "id") Long id) {
        clientServiceImpl.update(dto, id);
        return ResponseEntity.status(HttpStatus.OK).body("Client updated successfully");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable(value = "id") Long id) {
        clientServiceImpl.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Client deleted successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body( clientServiceImpl.findById(id));
    }*/

}