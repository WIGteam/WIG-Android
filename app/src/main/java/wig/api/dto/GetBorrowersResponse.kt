package wig.api.dto

import kotlinx.serialization.Serializable
import wig.models.Borrower

@Serializable
data class GetBorrowersResponse(
    val message: String,
    val success: Boolean,
    val borrowers: List<Borrower>
)