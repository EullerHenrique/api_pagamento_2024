package com.api.pagamento.domain.dto.request.transacao.forma_pagamento;

import com.api.pagamento.domain.enumeration.transacao.forma_pagamento.TipoPagamentoEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.api.pagamento.domain.constant.sucess_error.error.word.WordErrorConstants.*;

/**
 * Realiza um estorno
 *
 * @author Euller Henrique
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormaPagamentoRequestDto {

	@NotNull(message = EH_OBRIGATORIO)
	private TipoPagamentoEnum tipo;

	@NotNull(message = EH_OBRIGATORIO)
	@Min(value = 1, message = DEVE_SER_MAIOR_QUE + 0)
	private Integer parcelas;
}