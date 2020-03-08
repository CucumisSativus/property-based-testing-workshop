package basetest

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

trait Base extends AnyWordSpec with Matchers with ScalaCheckDrivenPropertyChecks {

}
