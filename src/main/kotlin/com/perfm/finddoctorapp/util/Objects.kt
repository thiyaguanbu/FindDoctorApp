package com.perfm.finddoctorapp.util

import java.time.format.DateTimeFormatter
/*Singleton*/
object Objects {
    val dateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
}