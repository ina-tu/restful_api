package controllers

import org.scalatest.mockito.MockitoSugar
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.mvc.ControllerComponents
import uk.gov.hmrc.play.test.UnitSpec

class ApplicationControllerSpec extends UnitSpec with GuiceOneAppPerSuite with MockitoSugar {

  val controllerComponents: ControllerComponents = app.injector.instanceOf[ControllerComponents]

  object TestApplicationController extends ApplicationController(
    controllerComponents
  )

  "ApplicationController .index()" should {

  }

  "ApplicationController .create()" should {

  }

  "ApplicationController .read()" should {

  }

  "ApplicationController .update()" should {

  }

  "ApplicationController .delete()" should {

  }

}
