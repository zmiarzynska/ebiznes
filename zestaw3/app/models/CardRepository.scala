package models

import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CardRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CardTable(tag: Tag) extends Table[Card](tag, "card") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def number = column[Int]("number")
    def * = (id, number) <> ((Card.apply _).tupled, Card.unapply)
  }

  val card = TableQuery[CardTable]

  def create(number: Int): Future[Card] = db.run {
    (card.map(c => (c.number))
      returning card.map(_.id)
      into ((number, id) => Card(id, number))
      ) += (number)
  }

  def list(): Future[Seq[Card]] = db.run {
    card.result
  }

  def delete(id: Int): Future[Unit] = db.run(card.filter(_.id === id).delete).map(_ => ())

}
