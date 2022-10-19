package br.sc.senac.urbanwood.dto.client;

public record ClientDTO(Long idClient, String firstName, String lastName, String cpfClient, String streetName,
                        int number, String complement, String neighborhood, String city, String cep, String socialNetwork,
                        String email, String phone, String login, String password) {}
