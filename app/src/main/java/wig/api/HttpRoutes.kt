package wig.api

/**
 * This package provides HTTP route constants.
 */
object HttpRoutes {

    private const val BASE_URL = "http://34.201.123.65:30001" // SERVER
    //private const val BASE_URL = "http://192.168.0.201:30001" // LOCAL

    const val SIGNUP = "$BASE_URL/user/signup"
    const val SALT = "$BASE_URL/user/salt"
    const val LOGIN = "$BASE_URL/user/login"
    const val LOGIN_CHECK = "$BASE_URL/app/validate"

    const val SCAN_BARCODE = "${BASE_URL}/app/scan/barcode"
    const val CHECK_QR = "${BASE_URL}/app/scan/check-qr"
    const val SCAN_QR_LOCATION = "${BASE_URL}/app/scan/qr/location"

    const val SET_OWNERSHIP_LOCATION = "${BASE_URL}/app/ownership/set-location"
    const val CHANGE_OWNERSHIP_QUANTITY = "${BASE_URL}/app/ownership/quantity/"
    const val CREATE_OWNERSHIP = "${BASE_URL}/app/ownership/create"

    const val CREATE_LOCATION = "${BASE_URL}/app/location/create"
    const val UNPACK_LOCATION = "${BASE_URL}/app/location/unpack"

    const val GET_BORROWERS = "${BASE_URL}/app/borrower/get"
    const val CREATE_BORROWER = "${BASE_URL}/app/borrower/create"
    const val CHECKOUT = "${BASE_URL}/app/borrower/checkout"
    const val CHECK_IN = "${BASE_URL}/app/borrower/check-in"
}