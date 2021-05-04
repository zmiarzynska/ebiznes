package models

import play.api.libs.json.Json

case class Card (id: Int, number: Int)

object Card {
  implicit val categoryFormat = Json.format[Card]
}
