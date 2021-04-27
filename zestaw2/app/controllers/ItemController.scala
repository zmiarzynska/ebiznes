package controllers

import javax.inject._
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future



@Singleton
class ItemController @Inject() (cc: ControllerComponents
                                //, item: Item
                               ) extends AbstractController(cc) {



  def createItem():Action[AnyContent] = Action {
    NoContent
  }


  def readItem(id: Int) ={
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def readAllItems() ={
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def updateItem(id: Int): Action[AnyContent] = {Action.async { implicit request =>
    Future {
      Ok("")
    }
  }
  }

  def deleteItem(id: Int): Action[AnyContent] = Action {
    NoContent
  }

}