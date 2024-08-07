# ADVANCE JAVA ROADMAP

## TABLE OF CONTENT

1. [REFLECTION](#reflection)
2. [PROXIES AND ANNOTATIONS](#proxies-and-annotations)
3. [EXECUTOR SERVICES](#executor-services)
    - [Future, Runnable and Callable](#future-runnable-and-callable)
4. [FORKJOIN FRAMEWORK](#forkjoin-framework)
5. [BLOCKING OBJECTS](#blocking-objects)
   - [SEMAPHORE](#semaphore)
   - [READWRITELOCK](#readwritelock)
6. [JAVA NIO](#java-nio)
7. [UTIL.FUNCTION](#utilfunction)
8. [STREAM API](#stream-api)
9. [COLLECTORS](#collectors)
10. [OPTIONAL](#optional)

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

## PROXIES AND ANNOTATIONS

> Proxy is an object that wraps another object and can add functionality to that object.
> Considering object A and B. Instead of `A` communicating directly with `B`, there is a 
> proxy covering `B` which will intercept the call and then delegate to `B` of perform
> other options.
> 
> So the proxy is just an interceptor.
> Proxies only works with interfaces.
> 
> To create proxy you use the `Proxy` class which is used to create a proxy over interfaces
> which accepts a classLoader, an array of the class instance and an invocationHandler
> 
> With proxy, you can argument the functionality of the method

## EXECUTOR SERVICES

> This is a high level framework of multithreading in java which inherits `Executor` interface
> There are two(2) types of executor services namely:
> 1. Direct Executor Service
> 2. Scheduler Executor Service
> 
> To create a Executor service, simple call the static method `newFixedThreadPool(int nThread)`
> of `Executors` class and provide the number of threads.
> 
> ```angular2html
 > int n = Runtime.getRuntime().availableProcessors();
>  ExecutorService service = Executors.newFixedThreadPool(n);
> ```
> 
> The main thing a ThreadPool does is containing threads that take task and execute those
> task.
> You can now call the `excute` method of the service which accepts a `Runnable` or use
> the `submit` method which returns a `Future`.
> 
> **NOTE: Always shutdown the executor service** with `service.shutdown();` on a finally block
### Future, Runnable and Callable
> **Future** : This is the return type you get back after submitting a task using `.submit()`
> method of the `ExecutorService`.
> You can now perform other actions with the future
> 
> **Runnable** : This is a void interface and hence returns nothing.
> **Callable**: This is the interface that returns always generic type as compared to 
> runnable that is a void. With callable, the type of the future correspond to the generic
> value supplied to the callable.

## FORKJOIN FRAMEWORK

> This framework is for managing recursive actions. There are two kinds of task which are
>  - recursive action : Returns no value, equivalent to Runnable
>  - recursive task: Returns a value, equivalent to Callable
> Note that this is used for a heavy task 

## BLOCKING OBJECTS

### SEMAPHORE

>  This is a blocking object used to make synchronization on multiple threads for a block 
> of code.
> 
> In synchronized block, only one active thread is allowed inside a block. To allow a max 
> amount of thread inside a block, semaphore can be used to achieve that.
> 
> Semaphore allows you to specify the limited number of threads to be allowed in a lock.
>
> In a semaphore you need to 
> -  specify the max number of threads i.e number of permits
> - `semaphore.acquire()` is used to acquire the lock
> - The threads will ran here.
> - `semaphore.release();` to release a lock
>
> Since semaphore throws a check exception, the best practice is to wrap it in a try catch.
> **Always make sure that `semaphore.release();` is placed in finally block.**
> 
> Semaphore has a second parameter to indicate a fair(order preserve) or unfair semaphore

### READWRITELOCK

> ReadWriteLock is also another type of object.
> We synchronize the write operation with itself and the read operation.

## JAVA NIO

> Non Blocking I/O
> Starting with Java 7, there have been changes to working with Input and Output
> 1. Path: Use the `Path` interface, and use the `get` factory method to create a path
> 2. Files: use the `Files` interface

## UTIL.FUNCTION

> This is a functional interface provided by JAVA that is part of the util package.
> They are borrowed form the functional style of programming.
> 
> _Functional Interface_: Lambda functions can only be written based on a functional interface
> The functional interface needs to have **only one abstract method**. 
> It can be annotated with `@FunctionalInterface`.
> A functional interface is then implementated via a lambda expression.
>
> 1. `Consumer and BiConsumer` : It consumes a value but doesn't return a value. 
> The consumer has an `.accept()` method which you provide the consumed value to.
> Consumers are mostly common with the `ForEach()` method of a collection whiles BiConsumers are
> used in the `forEach()` of a map
> 2. `Supplier` : It doesn't receive a parameter but rather only returns a value.
> It has a `get()` to retain the value it has to supply.
> A typical use case of a supplier is throwing an exception in the optional interface
> 3. `Function and BiFuntion`: It takes a value and transform and output it. It consumes and supplies at the same time.
> 4. `Predicate and BiPredicate`: It accepts a value(s) and returns only a boolean
> 5. `UniaryOperator and BinaryOperator`: The input and the output are always of the same type


## STREAM API

> The streams always have two parts, i.e., 
> 1. Source: where the value to be processed comes from
> 2. Operation (Terminal): A stream needs at least one operation
> 3. Intermediary Operations (This is optional): They can be as many as you want
> When you call a terminal operator, the stream closes, and hence you cannot reuse a stream.
> `source -> terminal`.
> 
> Between the source and the terminal.You can perform intermediary operations on the stream.
> 
> _Source_: 
> 1. Any `collection` can serve as a source and also `Stream.empty()` allows you to create a 
> source with no elements.
> 2. The factory method of the stream class can also be used to create a source. `Stream.of(...varags)`
> 3. You can also use a generator. which is a static method `generate(Supplier<? extends T> s)`.
> 
> ```angular2html
>   1. List<Integer> s0 = List.of(1,2,4,5);
>   2. Stream<Integer> s1 = Stream.empty();
>   3. Stream<String> s2 = Stream.of("one","two");
>   4. Supplier<Integer> sup = () -> new Random().nextInt()
>   5. Stream<Integer> s3 = Stream.generate(sup);
> ```

## COLLECTORS

> Collectors are mainly use to collect elements from streams into a collection. It is a 
> terminal operation of the streams api and hence it is used at the end of the stream.
> The terminal operation is `.collect()` which takes a collector as an argument.
> 
> You don't implement your own collectors but rather use predefined collectors in `Collectors` class.
> There is a possibility to collect to 
> 1. List
> 2. Sets
> 3. Maps
> 4. Any other collection
> 
> There is also a possibility to join the elements which applies concatenation to join all the elements
> 1. no parameter will just concatenate
> 2. specify a separator
> 3. using prefix or suffix
> 
> NB: Always try to avoid downstream a stream API

## OPTIONAL

> This class introduced as an alternative to using the `null` value.
> Which the optional class, instead of returning null, you return an object that can either be null or not.
> 
> To create an empty optional, you can always use the static method `.empty()`
> For optional containing a value, you can use the static `.of(val)`. 
> NB: `.of(null)` throws an exception.
> 
> using `.ofNUllable(val)` won't throw an exception if a null value is received.
> 1. `.isPresent()` returns a boolean depending on the state
> 2. `.get()` to get a value from an optional -> it only works if optional is not empty
> 3. `or(), orElse(), orElseGet(),orElseThrow(), ifPresentOrElse(), ifPresent()`: these allow us to specify an option
> to preform in case the optional is empty.
> 4. `or(val)` can be to chain methods


