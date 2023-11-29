package wig.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userUID: Int,
    val username: String,
    val email: String,
    val salt: String,
    val hash: String,
    val emailConfirmed: String,
    val tier: String
)