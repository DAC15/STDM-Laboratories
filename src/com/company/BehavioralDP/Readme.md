  STDM Laboratory work No.3
                                                                   Topic: Behavioral Design Patterns
                                                                   Prepared by : Rusu Dacian , FAF-181
                                                                   Evaluated by : Drumea Vasile 
                                                                        Main tasks :   
 1. By extending the project, implement as many behavioral design patterns as it is needed in the project;
 2. Keep the files grouped (into packages/directories) by their responsibilities (an example project structure);
 3. Finish the project by implementing a simple interface for the client of a whole system.
 4. Document the work in a separate markdown file according to the requirements presented below (the structure can be extended of course).
 ##                                                                           Theory :
   In software engineering, behavioral design patterns have the purpose of identifying common communication patterns between different software entities. By doing so, these patterns increase flexibility in carrying out this communication.

    Some examples from this category of design patterns are :

**1)Chain of Responsibility**-A way of passing a request between a chain of objects

**2)Command**-Encapsulate a command request as an object

**3)Interpreter**-A way to include language elements in a program

**4)Iterator**-Sequentially access the elements of a collection

**5)Mediator**-Defines simplified communication between classes

**6)Observer**-A way of notifying change to a number of classes

**7)Strategy**-Encapsulates an algorithm inside a class

## Implementation
I have chosen the **Strategy** Behavioral Design Patern which implies selecting an algorithm at runtime.
I adapted it to my project so that animals chose when to change their fur from a thick one in winter and a 
thin one in summer. I have an interface **IChangingFurBySeason** with a method that changes the fur. This specific
method is implemented in 2 concret classes **ChangeSummerFur** **ChangeWinterFur** depending on the season.

Here are some screenshots that show how it is implemented:

![image](https://user-images.githubusercontent.com/47426708/102144669-9316c600-3e6e-11eb-8b35-ac39b8e55900.png)
![image](https://user-images.githubusercontent.com/47426708/102144710-a4f86900-3e6e-11eb-97bb-fd0680fb006e.png)
![image](https://user-images.githubusercontent.com/47426708/102144723-aa55b380-3e6e-11eb-98f4-158cd4019116.png)
![image](https://user-images.githubusercontent.com/47426708/102144741-b04b9480-3e6e-11eb-8854-0f8db3aee915.png)

