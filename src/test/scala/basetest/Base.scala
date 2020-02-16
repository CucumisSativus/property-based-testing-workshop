package basetest

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

trait Base extends AnyWordSpec with Matchers with ScalaCheckDrivenPropertyChecks {

}
