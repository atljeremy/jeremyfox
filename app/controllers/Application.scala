package controllers

import play.api._
import libs.concurrent.Akka
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Chose A Repo"))
  }

//  def index = Action {
//    val promiseOfIntent = Akka.future { intensiveComputation() }
//    Async {
//      promiseOfIntent.orTimeout("Oops", 1000).map { eitherIntentOrTimeout =>
//        eitherIntentOrTimeout.fold(
//          timeout => InternalServerError(timeout),
//          i => Ok("Got result: " + i)
//        )
//      }
//    }
//  }
}