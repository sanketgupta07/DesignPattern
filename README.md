# Design Pattern
Java language based implementation of Design Pattern.

* <b>Creational Design Pattern</b>

	1. Singleton
	
		It will create only one object of the class.
		
	2. Factory
		
		In factory pattern we create object without exposing the instantiation logic. We use a common interface to refer dame type of objects.
		
	3. Abstract Factory
	
		Abstract factory is a factory of factories. It provides an interface for creating objects of related families or dependent object without declaring their concrete classes.
		
	4. Prototype
	
		When the creation of object is an expensive task like I/O or Database call. Prototype patter is more efficient way to create an object. This way we can cache the expensive operation and use the same data to create new objects whenever required. This will always give a new object (a prototype of object). 
		
	5. Builder
	
		Using Builder Pattern complex object creation can be separate from its representation and we can implement different implement of objects. 
		
	6. ObjectPool
	
		The Object Pool will allow us to reuse the existing object and it will maintain and clean up the invalid object from the pool. In this way a process does not need to wait for a object to be released from other.	

* <b>Structural Design Pattern</b>

	1. Facade
	
		Facade pattern simplifies the interface of a complex system. 
		
	2. Adapter
	
		Adapter pattern works as bridge between two incompatible interfaces.
		
	3. Proxy
	
		Proxy object is a placeholder until the real object is ready to use.
		
	4. Decorator
	
		This pattern allows a behavior to be added in a object without affecting the existing behaviors.  

* <b>Behavioral Design Pattern</b>

	1. Observer Design Pattern
	
		It define one-to-many dependency between objects so that when one object change its state, all other dependent object will be notified and updated automatically.
		
	2. Chain of responsibility 
	
		Objects linked to processing chain will get an opportunity to perform their task or pass the request to chain.

References:

* https://sourcemaking.com/design_patterns
* https://www.tutorialspoint.com/design_pattern

