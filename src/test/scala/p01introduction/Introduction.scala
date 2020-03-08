package p01introduction

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import Introduction.Calculator._

class Introduction extends AnyWordSpec with Matchers with ScalaCheckDrivenPropertyChecks {
  "Calculator" when {
    "adding" should {
      "be commutative" in {
        forAll { (a: Int, b: Int) =>
          add(a, b) shouldBe add(b, a)
        }
      }

      "treat neutral element properly" in {
        forAll { (a: Int) =>
          add(a, 0) shouldBe a
        }
      }
    }
  }
}

object Introduction {
  object Calculator {
    def add(a: Int, b: Int): Int = {
      a + b
    }
  }

}
