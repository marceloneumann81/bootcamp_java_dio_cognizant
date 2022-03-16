package one.digitalinnovation.personalapi.utils;

import one.digitalinnovation.personalapi.dto.request.PhoneDTO;
import one.digitalinnovation.personalapi.entity.Phone;
import one.digitalinnovation.personalapi.enums.PhoneType;

public class PhoneUtils {
    private static final String PHONE_NUMBER = "4299919-9868";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

}
