# spring Basics

## Lesson 4 & 5:
 autowiring by name and the @Primary annotation
 are features that provide control over dependency 
 injection resolution when multiple beans of the same type are available:
`
 @Component
 @Primary`
![alt-text](./imgs/primary.png "optional-title")

``@Autowired
 private Filter contentBasedFilter;``

![alt-text](./imgs/prioritybyname.png "optional-title")

## Lesson 6: @Qualifier @Qualifier

The @Qualifier annotation can be used in a scenario when we have multiple objects of the same type and autowiring by name cannot be used because the variable name doesn’t match any bean name

The @Qualifier annotation takes precedence over the @Primary annotation. To show this, let’s add the @Primary annotation to the ContentBasedFilter class and run the application

## Lesson 7: Constructor, setter, field injection 

![alt-text](./imgs/injectionType.png "optional-title")

### notes:

*   Using field injection keeps the code simple and readable, but it is unsafe
*   there are some differences between Constructor and setter injection. Setter injection is more readable as it specifies the name of the dependency as the method name but the number of setter methods increases with each increasing dependency increasing the boiler plate code. Setter injection is used to avoid the BeanCurrentlyInCreationException raised in case of a circular dependency

