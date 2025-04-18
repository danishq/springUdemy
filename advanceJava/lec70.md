The difference between `Car obj = new WagonR();` and `WagonR obj = new WagonR();` lies in the type of object being referenced by the variable `obj` and what you can do with that reference.

### `Car obj = new WagonR();`

- This declares a variable `obj` of type `Car`.
- You can assign an instance of any subclass of `Car` to this variable, including `WagonR`, as shown in the example.
- Since `obj` is of type `Car`, you can only call methods that are declared in the `Car` class or inherited by its subclasses. You **cannot access** methods that are specific to `WagonR`.
- This allows for **polymorphism**, where the actual method that gets executed depends on the object's runtime class.

### `WagonR obj = new WagonR();`

- This declares a variable `obj` of type `WagonR`.
- You can only assign an instance of `WagonR` to this variable.
- Since `obj` is of type `WagonR`, you can call **both** methods that are declared in the `WagonR` class and those inherited from the `Car` class.
- This provides more flexibility because you have direct access to all methods of the `WagonR` class.

---

### Here's a concrete example to illustrate:

```java
abstract class Car {
    public abstract void drive();
    
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("driving...");
    }

    public void openRoof() {
        System.out.println("Opening roof...");
    }
}

public class lec70 {
    public static void main(String[] args) {
        // Using Car reference to refer to WagonR object
        Car obj1 = new WagonR();
        obj1.drive(); // Output: driving...
        obj1.playMusic(); // Output: Playing Music
        // obj1.openRoof(); // This would cause a compile-time error because openRoof() is not in Car

        // Using WagonR reference to refer to WagonR object
        WagonR obj2 = new WagonR();
        obj2.drive(); // Output: driving...
        obj2.playMusic(); // Output: Playing Music
        obj2.openRoof(); // Output: Opening roof...
    }
}
```

Using a **parent class reference** (`Car obj = new WagonR();`) allows for **polymorphism**, enabling flexible and reusable code. However, it restricts access to subclass-specific methods. On the other hand, using a **subclass reference** (`WagonR obj = new WagonR();`) gives access to all methods but does not leverage polymorphism. Choosing the right approach depends on whether you need **flexibility (polymorphism) or full access to subclass methods**. 🚀
