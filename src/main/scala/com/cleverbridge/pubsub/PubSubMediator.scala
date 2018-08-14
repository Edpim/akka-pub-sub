package com.cleverbridge.pubsub

import akka.actor.{Actor, ActorRef, Props}

object PubSubMediator {

  final val name: String = "Pub-Sub-Mediator"

  def props: Props = Props(new PubSubMediator)

  case class Subscribe(topic: String, subscriber: ActorRef)
  case class Unsubscribe(topic: String, subscriber: ActorRef)
  case class Publish(topic: String, message: String)
  case object GetSubscribers
}

class PubSubMediator extends Actor {

  override def receive: Receive = Actor.emptyBehavior
}
