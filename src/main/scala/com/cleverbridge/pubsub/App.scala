package com.cleverbridge.pubsub

import akka.actor.ActorSystem

object PubSub extends App {

  val system = ActorSystem("pub-sub-mediator-spec-system")
  val pubSubMediatorRef = system.actorOf(PubSubMediator.props)
  val subscriberRef = system.actorOf(Subscriber.props)
}
