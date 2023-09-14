package com.mardelapps.oneapp

class LoginVerification {
    fun verify(Email: String, Contrasena: String): Boolean {
        return (Email == "ciroFF@mardelapps.com" &&
                Contrasena == "CC450") ||
                (Email == "pepe@gmail.com" &&
                        Contrasena == "PP3")
    }
}