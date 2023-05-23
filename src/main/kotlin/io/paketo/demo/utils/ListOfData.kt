package io.paketo.demo.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.random.Random

val listOfInbounds = arrayListOf(
  "Drogon",
  "Rhaegal",
  "Viserion",
  "Balerion",
  "Meraxes",
  "Vhagar",
  "Sunfyre",
  "Caraxes",
  "Vermithrax",
  "Morghul",
  "Shrykos",
  "Arrax",
  "Tyraxes",
  "Silverwing",
  "Dreamfyre",
)

val listOfDestination = arrayListOf(
  "King's Landing",
  "Winterfell",
  "Qarth",
  "Braavos",
  "Meereen",
  "Volantis",
  "Pentos",
  "Vaes",
  "Astapor",
  "Yunkai",
  "Casterly",
  "Highgarden",
  "Sunspear",
  "Oldtown",
  "Riverrun",
  "Pyke",
  "The",
  "Harrenhal",
  "White",
  "Gulltown",
)

fun generateRandomDate(startDate: Date? = null): Date {
  val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
  val startMillis = startDate?.time ?: dateFormat.parse("01-01-1900").time
  val endMillis = dateFormat.parse("31-12-2100").time
  val diff = endMillis - startMillis + 1
  return Date(startMillis + Random.nextLong(diff))
}