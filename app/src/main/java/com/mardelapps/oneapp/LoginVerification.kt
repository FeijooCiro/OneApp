package com.mardelapps.oneapp

class LoginVerification {
    fun verify(Email: String, Contrasena: String): Boolean {
        return Email == "ciroFF@mardelapps.com" &&
                Contrasena == "CC450"
    }
}