# Design-Patterns-Demo-using-Java

<h3>Patterns Included</h3>

<h4>1). Singleton - Creational Design Pattern</h4>

- Purpose: Ensures that a class has only one instance and provides a global point of access to it.
- Implementation: The Singleton class restricts instantiation of itself and provides a getInstance() method to access the single instance. It also demonstrates state management by updating and retrieving a piece of data.
- Use Case: Singleton is commonly used in logging, database connections, or configuration settings where only one instance should exist.

```
Singleton singleton1 = Singleton.getInstance();
singleton1.setData("Updated data");
Singleton singleton2 = Singleton.getInstance();
System.out.println(singleton1.getData()); // Outputs "Updated data"
System.out.println(singleton2.getData()); // Outputs "Updated data"
```

<h4>2). Decorator - Structural Design Pattern</h4>

- Purpose: Adds functionality to an object dynamically without altering the structure of the class. This is achieved by wrapping the object with a series of decorators.
- Implementation: The example demonstrates a text formatting system where SimpleText can be dynamically "decorated" with additional features like bold formatting using BoldDecorator.
- Use Case: Ideal when you need to extend functionalities, such as adding visual styling to GUI elements, or processing data streams like encryption or compression.

```
Text text = new SimpleText("Hello World");
text = new BoldDecorator(text);
System.out.println(text.getText()); // Outputs **Hello World**
```

<h4>3). Observer - Behavioral Design Pattern</h4>

- Purpose: Defines a one-to-many dependency between objects, allowing multiple observers to listen for and react to changes in a subject.
- Implementation: The ObserverDemo demonstrates a news agency (Subject) notifying its readers (Observers) whenever news is updated.
- Use Case: Useful for implementing event-driven systems, such as a notification system where multiple observers need to be updated on changes, like news apps or stock updates.

```
Subject newsAgency = new Subject();
newsAgency.addObserver(new NewsReader());
newsAgency.changeState("Breaking news!");
// Outputs: "NewsReader: Breaking news!"
```
