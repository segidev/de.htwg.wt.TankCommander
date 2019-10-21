package controllers

import de.htwg.sa.tankcommander.TankCommander
import de.htwg.sa.tankcommander.controller.controllerComponent.controllerImpl
import javax.inject._
import play.api.mvc._

@Singleton
class GameController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val controller: controllerImpl.Controller = TankCommander.controller

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    controller.initGame()
    Ok(views.html.game(controller))
  }

  def move(direction: String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.move(direction)
    Ok(views.html.game(controller))
  }

  def turn(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.endTurnChangeActivePlayer()
    Ok(views.html.game(controller))
  }

  def shoot(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.shoot()
    Ok(views.html.game(controller))
  }

  def undo(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.undo()
    Ok(views.html.game(controller))
  }

  def redo(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.redo()
    Ok(views.html.game(controller))
  }

  def save(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.save()
    Ok(views.html.game(controller))
  }

  def load(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.load()
    Ok(views.html.game(controller))
  }
}
