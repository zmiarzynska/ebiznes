package controllers

import play.api.mvc._

import javax.inject._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


@Singleton
class CategoryController @Inject()(cc: ControllerComponents
                                   //, category: Category
                               ) extends AbstractController(cc) {



  def createCategory():Action[AnyContent] = Action {
    NoContent
  }


  def readCategory(id: Int) ={
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def readAllCategories() ={
    Action.async { implicit request =>
      Future {
        Ok("")
      }
    }
  }

  def updateCategory(id: Int): Action[AnyContent] = {Action.async { implicit request =>
    Future {
      Ok("")
    }
  }
  }

  def deleteCategory(id: Int): Action[AnyContent] = Action {
    NoContent
  }

}