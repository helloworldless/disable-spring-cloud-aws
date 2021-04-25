# How to Disable Spring Cloud AWS

This project contains two modules which do exactly the same thing with 
different versions of the Spring Cloud AWS library.

1. spring-cloud-aws
1. spring-cloud-aws-legacy

Use the one that is appropriate for the version you're using. The difference 
between the two Spring Cloud AWS libraries is explained really well
[here](https://awspring.io/learn/introduction/#versions).

## Scenario 1: Disable Spring Cloud AWS Messaging (SQS)

1. Set `spring.profiles.active=local` 
1. Run `App` or `AppLegacy`
1. App should start successfully and do nothing

## Scenario 2: Enable Spring Cloud AWS Messaging (SQS)

### Pre-Requisites

- AWS Region and Credentials configured
- Create an AWS SQS queue with the name `test-queue`, or use whatever name you want and 
  update the queue name in `app.sqs-queue-name` in `src/main/resources/application.yml`

### Steps to Run

1. Run with empty `spring.profiles.active`
1. Run `App` or `AppLegacy`
1. App should start successfully
1. Should send a message to the queue; See `SendMessageOnStartup`
1. Should receive the message from the queue; See `` 

### Example Logs

```text
c.d.s.SendMessageOnStartup               : Sending message to queueName=test-queue: Message: Message(city=Anchorage, state=AK)
o.s.c.a.m.listener.QueueMessageHandler   : Searching methods to handle headers={LogicalResourceId=test-queue, ApproximateReceiveCount=1, SentTimestamp=1619297491071, ReceiptHandle=...
o.s.c.a.m.listener.QueueMessageHandler   : Invoking App#handleMessage[1 args]
App  : Received message: Message(city=Anchorage, state=AK)

```

## Disabling for Testing with @SpringBootTest

See `@SpringBootTest`s in the `src/test/java` directory of each module.
