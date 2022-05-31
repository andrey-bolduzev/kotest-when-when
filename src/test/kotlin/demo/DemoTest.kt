package demo

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class DemoTest : BehaviorSpec({

    Given("given") {
        When("top when") {
            When("bottom when") {
                Then("assertion") {
                    1 shouldBe 2
                }
            }
        }
    }
})