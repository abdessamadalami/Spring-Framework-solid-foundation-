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
