package jfyg.network.response.transaction

import jfyg.data.TxExecutionStatus
import jfyg.network.response.BaseResponse

/**
 * Check contract execution status
 */
internal data class TxContractExecutionResponse(val result: TxExecutionStatus) : BaseResponse()