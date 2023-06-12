/*
JAVA ECOSYSTEM :-

There are different java platform, each targeting different application domains
Each platform provides a hardware/OS-specific JVM and an API to develop applications for that platform.

1) Java SE (Standard Edition) platform : designed for developing desktop and server environments.
    Provides the core functionality of the language.
2) Java EE (Enterprise Edition) : superset of java SE platform, most extensive of 3 platforms, targets
    enterprise application development.
3) Java ME (Micro Edition) : designed for embedded systems - mobile devices & set-top boxes.
4) Java card : designed for tiny memory footprint devices, like smart cards.

KEY FEATURES OF JAVA :-

1) Multi-paradigm Programming :  java supports object-oriented programming paradigm, in which properties
   of an object and its behavior are encapsulated in the object       \`
2) Bytecode Interpreted by the JVM : java programs are compiled to bytecode that is interpreted by the JVM.
3) Architecture-Neutral and Portable Bytecode : Write once, run everywhere,
   if a compatible JVM is available for the hardware and software platform.
4) Simplicity : java does not have a preprocessor, and it does not allow pointer handling.
   Automatic garbage collection, multiple class inheritance, etc.
5) Dynamic and Distributed : JVM can dynamically load class libraries from the local file system
   as well as from machines on the network, when those libraries are needed at runtime.
6) Robust and Secure : java promotes development of reliable, robust and secure systems.
   Exception handling, modular system enhances encapsulation and configuration. No direct memory access.
7) High Performance and Multithreaded : provide high level support for multithreading,
   allowing multiple threads of execution to perform different tasks concurrently in an application.
   Functional programming to meet challenges (lambda expressions and functional interfaces), API support.

CLASSES :-

A class denotes a category of objects, and acts as a blueprint for creating objects.
An important distinction is made between the contract and the implementation that a class provides for it objects.
The contract defines which services are provided,
The implementation defines how these services are provided by the class.
Clients(i.e other objects) need only know the contract of an object, and not its implementation,
to avail themselves of the object's services.

OBJECTS :-

The process of creating objects from a class is called instantiation.
An object is an instance of a class.
The object is constructed using the class as a blueprint and is concrete instance of the abstraction that the class represents.

A reference value is returned when an object is created.
A reference value uniquely denotes a particular object.
A variable denotes a location in memory where a value can be stored.

PROGRAM :-

Term program(application - used synonymously) refers to source code that is compiled and directly executed.
To create a program in java, the program must have a class that defines a method named main, which is
invoked at runtime to start the execution of the program. The class with this main method is called the
"entry point of the program".

COMPILING A PROGRAM :-

JDK provides tools for compiling and running programs.
The classes in the Java SE Platform API are already compiled, and the JDK tools know where to find them.
Java source files can be compiled using the Java Language Compiler, javac,which is part of the JDK.
Each source file name has the extension .java. Each class declaration in a source file is compiled into
a separate class file, containing its java bytecode. The name of this file comprises the name of the class
with .class as its extension.

RUNNING A PROGRAM :-

It is the bytecode in the class file that is executed when a java program is run-the source code is immaterial in this regard.
A java program is run by the Java Application Launcher, java, which is also part of the JDK.
The java command creates an instance of the jvm that executes the bytecode.
 */

public class Main {
    public static void main(String[] args) {  // Method header  - public-accessible from any class
        // - static-means the method belongs to the class.
        // - void-indicates that the method does not return any value.
        // - parameter args is an array of strings that can be used to pass information to the main() method when execution starts.


        System.out.println("Hello world!");  // Object of the class java.io.PrintStream

        Point2D point2D =  new Point2D(2,3); // A point with coordinates (10, 20)

        Point2D point2D1 = new Point2D(5, 15); // A point with coordinates (5, 15)

        Point2D point2D2 = new Point2D(-1, -4); // Creates a point with coordinate (-1, -4)

        point2D2.setX(-2);

        int yCoord = point2D2.getY();

        double d = Point2D.distance(point2D, point2D1);
        Point2D.showInfo();
        System.out.println(point2D2.toString());

       // point2D2.distanceFromOrigin();

        Point3D point3D = new Point3D(10, 20, 30);
        System.out.println(point3D.toString());
        System.out.println("x: " + point3D.getX());
        System.out.println("y: " + point3D.getY());
        System.out.println("z: " + point3D.getZ());

        point3D.setX(-10);
        point3D.setY(-20);
        point3D.setZ(-30);
        System.out.println(point3D.toString());

        Line line1 = new Line(new Point2D(5,6), new Point2D(7,8));
        System.out.println(line1.toString());
        line1.setEndPoint1(new Point2D(11, 12));
        line1.setEndPoint2(new Point2D(13, 14));
        System.out.println(line1.toString());
        System.out.println("Length: " + line1.length());

        System.out.printf("Formatted values |%5d|%8.3f|%5s|%n", 2016, Math.PI, "Hi");
        System.out.printf("Formatted values |%3d|%4.2f|%2s|%n", 2016, Math.PI, "Hi");

        // c , b , 2 , b and e , d , c , d and f.   (1.1 to 1.7)

        // d , a , a and d , a. (1.8 to 1.11)
        
    }
}