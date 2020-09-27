package test.scala

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class CreateSession extends Simulation {
  //Protocol
  val httpProtocol = http
    .baseUrl("https://www.demoblaze.com")
    .acceptHeader("*/*")
    .contentTypeHeader("application/json")

  //Scenario
  val scn = scenario("Go to homepage")
    .exec(http("Homepage")
      .get("/")
    )

  //Simulation Setup
  setUp(scn.inject(atOnceUsers(2))).protocols(httpProtocol)
}
