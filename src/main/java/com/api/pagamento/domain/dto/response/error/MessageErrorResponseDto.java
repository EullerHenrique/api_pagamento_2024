package com.api.pagamento.domain.dto.response.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;

/**
 * Realiza um estorno
 *
 * @author Euller Henrique
 */
@Data
@AllArgsConstructor
public class MessageErrorResponseDto {
    private int status;
    private String error;
    private String message;

    /**
     * Realiza um estorno
     *
     * @author Euller Henrique
     */
    public static ResponseEntity<Object> obterResponseEntity(int status, String error, String message) {
        MessageErrorResponseDto errorMessageResponse = new MessageErrorResponseDto(status, error, message);
        return ResponseEntity.status(status).body(errorMessageResponse);
    }

}