package wig.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logging
import wig.api.dto.CheckoutResponse
import wig.api.dto.CheckoutRequest
import wig.api.dto.CreateBorrowerResponse
import wig.api.dto.GetBorrowersResponse

interface BorrowerService {

    suspend fun getBorrowers(): GetBorrowersResponse

    suspend fun createBorrower(name: String): CreateBorrowerResponse

    suspend fun checkout(borrowerUID: String, ownerships: CheckoutRequest): CheckoutResponse

    companion object {
        fun create(): BorrowerService {
            return BorrowerServiceImpl(
                client = HttpClient(Android) {
                    install(Logging) {
                        level = LogLevel.ALL
                    }
                    install(JsonFeature) {
                        serializer = KotlinxSerializer()
                    }
                }
            )
        }
    }


    suspend fun checkin(ownerships: CheckoutRequest): CheckoutResponse
}