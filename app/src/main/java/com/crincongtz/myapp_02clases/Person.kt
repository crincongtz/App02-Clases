package com.crincongtz.myapp_02clases

class Person @JvmOverloads constructor (
    var nombre: String,
    var direccion: String,
    var telefono: String = "",
    var edad: Int = 18,
    var email: String = ""
)
