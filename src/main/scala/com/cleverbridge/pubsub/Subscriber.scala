package com.cleverbridge.pubsub

import akka.actor.{Actor, Props}

object Subscriber {

  def props: Props = Props(new Subscriber)
}

class Subscriber extends Actor {

  override def receive: Receive = Actor.emptyBehavior
}
