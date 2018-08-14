# Akka-Pub-Sub

`Publish-Subscribe is a messaging pattern where senders of messages (publishers) send their messages not directly to any
specific receiver. Similarly, subscribers express interest in any received messages without knowledge of any publishers.

Subscribers receive typically only a subset of the published messages. Two common forms of filtering of messages exist:

#### topic-based
Messages are published to topics or logical channels, any subscriber of a certain receives all messages of the topic.

#### content-based
Messages are delivered to a subscriber if attributes or content matches constraints which have been defined by subscriber.


## Tasks
Implement the Publish-Subscribe pattern with topic based filtering using Akka.

#### Create Actor System with following components
* PubSubMediator
* Subscriber

Implement behaviour of the components specified by Unit Tests.
* Proof proper behavior by implementing Unit Tests

#### Demo App
Demonstrate proper publishing of messages to a topic.

#### Http Service
Add a http Service with following routes
* POST `/topics/{topicName}` - with a message in post body to publish messages to subscribers on the 'topicName'
* GET `/topics/{topicName}` - return subscribers of certain topic
