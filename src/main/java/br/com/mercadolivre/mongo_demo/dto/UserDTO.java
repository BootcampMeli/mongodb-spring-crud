package br.com.mercadolivre.mongo_demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class UserDTO {

    @Id
    private String id;

    private String login;
    private String password;

    @DBRef
    private List<AddressDTO> addresses;
}
