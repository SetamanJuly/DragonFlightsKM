package io.paketo.demo.utils

import io.paketo.demo.model.BoundModel
import io.paketo.demo.model.ResultsModel
import java.text.SimpleDateFormat
import java.util.Locale

fun generateRandomFlights(numberFlights: Int): List<ResultsModel> {
  val results = mutableListOf<ResultsModel>()
  repeat(numberFlights) {
    results.add(
      ResultsModel(
        inbound = obtainRandomBound(),
        outbound = obtainRandomBound(),
        price = (100..1000).random().toDouble(),
        currency = "EUR",
      )
    )
  }
  return results
}

fun obtainRandomBound() : BoundModel{
  val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
  val departureDate = generateRandomDate()

  return BoundModel (
      airline = listOfInbounds.random(),
      airlineImage = "",
      arrivalDate = dateFormat.format(generateRandomDate(departureDate)),
      arrivalTime = "11:00",
      departureDate = dateFormat.format(generateRandomDate()),
      departureTime = "12:00",
      destination = listOfDestination.random(),
      origin = listOfDestination.random(),
  )
}