package wig.api.users

/**
 * This package provides HTTP route constants for user-related operations in the wig.android.api.users module.
 */
object HttpRoutes {

    //private const val BASE_URL = "http://34.234.73.177:30001"
    private const val BASE_URL = "http://192.168.0.201:30001"
    const val SIGNUP = "$BASE_URL/user/signup"
    const val SALT = "$BASE_URL/user/salt"
    const val LOGIN = "$BASE_URL/user/login"
    const val LOGIN_CHECK = "$BASE_URL/app/validate"
}