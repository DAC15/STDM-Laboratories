STDM Laboratory work No.2
                                                               Topic: Structural Design Patterns
                                                               Prepared by : Rusu Dacian , FAF-181
                                                               Evaluated by : Drumea Vasile 
                                                               
                                                                    Main tasks :      
By extending our project,to implement at least 3 structural design patterns;

Keep the files grouped (into packages/directories);

Document the work in a separate markdown file;

Theory :
In software engineering, structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.

Some examples of from this category of design patterns are :

1)Adapter-Allows the conversion of the interface of a class to another interface that clients expect. This allows classes with incompatible interfaces to work together.

2)Bridge - Allows the separation of an abstract interface from its implementation. This eliminates the dependency between the two, allowing them to be modified independently.

3)Composite -Composite pattern is used where we need to treat a group of objects in similar way as a single object.

4)Decorator -Extends the functionality of an object in a manner that is transparent to its clients without using inheritance.

5)Facade - Provides a higher-level interface to a subsystem of classes, making the subsystem easier to use.

6)Flyweight -Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

7)Proxy - Allows a separate object to be used as a substitute to provide controlled access to an object that is not accessible by normal means.

Implementation :

The project that I have build on top of Animal blue print was continued and I have added some new Structural design patterns.

1) Adapter
Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
We can measure the speed of an animal using MPH and KMH. In order to convert Miles per hour to Kilometers per hour I created an adaptor.
There are 2 interfaces IMovable and IMovableAdapter that represent 2 incompatible interfaces.
I have also created concrete classes like HuntingSpeed and WalkingSpeed that implement IMovable.
The needed conversion was implemented by using MovableAdapterImplementation.

2) Facade
Facade pattern is used to hide the complexities of the system. The motivation for usage of this pattern is the following:
this pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
I have an interface Animal that is implemented by Bird, Cat and Dog and an AnimalMaker class
that provides the needed functionality

3) Proxy
Proxy pattern is used when a class need to represent functionality of another class.
I made a IVaccine interface that is implemented by 2 classes AnimalVaccine and AnimalVaccineProxy.
In AnimalVaccine I have just one method that validates the reservation of the vaccine.
The functionality is implemented in AnimalVaccineProxy, in the method vaccinate

Conclusion and screenshots:

In conclusion, the main goal of this laboratory work was to continue the work from the previous lab and add some new functionalities to the system using 
the Structural Design Patterns . In order to achieve this , I implemented 3 StructuralDP (Facade , Proxy and Adapter) .
