package com.cleverbridge

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class PubSubMediatorSpec
  extends TestKit(ActorSystem("PubSubMediator"))
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
{
  override def afterAll: Unit = {
    shutdown(system)
  }

  "A PubSubMediator" when {

    "received Subscribe" should {
      "add subscriber to topic" in {

      }
      "create topic if not exists" in {

      }
    }

    "received Unsubscribe" should {
      "remove Subscriber from topic" in {

      }
    }

    "received Publish" should {
      "send message to each subscriber of topic" in {

      }
    }
  }
}
