package controllers

import play.api.mvc._

import javax.inject._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


@Singleton
class CardController @Inject()(cc: ControllerComponents
                               //, card: Card
                              ) extends AbstractController(cc) {


  def createCard(): Action[AnyContent] = Action {
    NoContent
  }


  def readCard(id: Int) = {
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def readAllCards() ={
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def updateCard(id: Int): Action[AnyContent] = {
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def deleteCard(id: Int): Action[AnyContent] = Action {
    NoContent
  }

}