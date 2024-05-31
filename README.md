# ADVANCE JAVA ROADMAP

## TABLE OF CONTENT

1. [REFLECTION](#reflection)

## REFLECTION

> This is a way to programmatically control the bytes(code already compiled) codes whiles the application
> is running.
>
> Considering a class that is part of the application i.e `ProductService`,
> The class has the implementation of a use case and with application framework you create
> those classes and then let the application somehow control the classes.
>
> In generally frameworks uses reflections to control the class which are added to it
> context (_**Inversion Of Control**_)
>
> The framework doesn't know how the application will be named from the beginning and hence it
> needs atleast one input which is the fullname of the class.
> This is composed of the package name followed by the classname.
> eg: `service.ProductService` where `service` is the package name.
>
> **NB: A `Class` can be viewed as object by Java**
>
> If the class is the classpath, then starting from the blueprint,
> You can call the constructor or other private members of the class.
>
> Whatever you can directly do through code can be indirectly done through reflection.
>
> ```angular2html
>   Constructor productServiceDeclaredConstructor = productService.getDeclaredConstructor();
>   productServiceDeclaredConstructor.newInstance();
> ```
> with this, you can create a new instance of the class.
>
> In case of reflection, you can even access a private constructor of a class using `.setAccessible(true)`
> of the constructor
> **NB: Reflections can't bypass the boundary of a module**
> 
> You can also invoke a method by 
> 1. Getting the declared method from the blueprint i.e class
>  `Method addProduct = productService.getDeclaredMethod("sepecificMethod");`
> 2. Invoke the method for that instance
> ` addProduct.invoke(o); //this is a static method`
>
>  To control a class method without knowing the method name,
>  You have to create an annotation.
> 
> By default, annotations cannot be seen by a reflections and to make annotation
> available to reflection, you should provide a retention time.
