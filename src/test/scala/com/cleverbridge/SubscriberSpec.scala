package com.cleverbridge

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class SubscriberSpec
  extends TestKit(ActorSystem("SubscriberSpec"))
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
{

  "A Subscriber" should {
    "print message" in {

    }
  }
}
