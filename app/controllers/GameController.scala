package controllers

import de.htwg.sa.tankcommander.TankCommander
import javax.inject._
import play.api.mvc._

@Singleton
class GameController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.initGame()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def move(direction: String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.move(direction)
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def turn(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.endTurnChangeActivePlayer()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def shoot(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.shoot()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def undo(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.undo()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def redo(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.redo()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def save(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.save()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }

  def load(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    TankCommander.controller.load()
    Ok(views.html.game(TankCommander.controller.printEverything))
  }
}
