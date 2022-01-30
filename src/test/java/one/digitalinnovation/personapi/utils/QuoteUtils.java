package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.QuoteDTO;
import one.digitalinnovation.personapi.entities.Quote;
import one.digitalinnovation.personapi.enums.QuoteType;

public class QuoteUtils {

    private static final String QUOTE = "the @NotNull constraint won't allow null values for the constrained field(s). However, the field(s) can be empty.";
    private static final QuoteType TYPE = QuoteType.LINE;
    private static final long ID = 1L;

    public static QuoteDTO createFakeDTO() {
        return QuoteDTO.builder()
                .quote(QUOTE)
                .type(TYPE)
                .build();
    }

    public static Quote createFakeEntity() {
        return Quote.builder()
                .id(ID)
                .quote(QUOTE)
                .type(TYPE)
                .build();
    }
}
