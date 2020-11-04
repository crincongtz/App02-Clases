package com.crincongtz.myapp_02clases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Person = Kotlin
        // Persona = Java

//        val person1: Person = Person("Christian", "Colima, colima")
        val person1: Person = Person("Christian", "Colima, colima")

        val person2: Person = Person("Christian", "Colima, colima", "1234567890")

        val person3: Person = Person("Christian", "Colima, colima", "1234567890", 32)

        val person4: Person = Person("Christian", "Colima, colima", "1234567890", 32, "john.doe@example.com")


        val persona1: Persona = Persona("Christian", "Colima, colima")
        val persona2: Persona = Persona("Christian", "Colima, colima", "1234556")
        val persona3: Persona = Persona("Christian", "Colima, colima", "1234556", 32)
        val persona4: Persona = Persona("Christian", "Colima, colima", "1234556", 32, "john.doe@example.com")


        Log.d("CursoKotlin", "El nombre de la Persona 1 es: ${person1.nombre}")
        person1.nombre = "Nuevo nombre"
        Log.d("CursoKotlin", "El nuevo nombre de la Persona 1 es: ${person1.nombre}")


    }



}