package one.digitalinnovation.personalapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME("Nome"),
    MOBILE("Mobile"),
    COMMERCIAL("Comercial");

    private final String description;

}
