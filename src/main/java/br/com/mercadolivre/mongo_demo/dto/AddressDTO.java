package br.com.mercadolivre.mongo_demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "addresses")
public class AddressDTO {

    @Id
    private String id;

    //@Indexed(direction = IndexDirection.ASCENDING, unique = true)
    private String street;

    //@Transient
    private String zipcode;
}
