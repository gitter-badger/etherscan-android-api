package jfyg.network.response.account

import jfyg.data.ERC20Token
import jfyg.network.response.BaseResponse

/**
 * ERC20 Transactions recorded by an account
 */
internal class ERC20Response(val result: List<ERC20Token>? = null) : BaseResponse()