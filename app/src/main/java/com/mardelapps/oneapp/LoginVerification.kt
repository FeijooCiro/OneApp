package com.mardelapps.oneapp

class LoginVerification {
    fun verifyEmailAndPassword(Email: String, Contrasena: String): Boolean {
        return Email == "ciroFF@mardelapps.com" &&
                Contrasena == "CC450"
    }
}