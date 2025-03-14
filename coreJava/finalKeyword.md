# Understanding `static` Variables in Java  

## 🔹 What is `static` in Java?  
- `static` means **the variable belongs to the class, not to any specific instance**.  
- It is **shared among all instances** of the class.  
- It is **initialized once**, when the class is first loaded into memory.  
- If a `static` variable is modified, **the change reflects everywhere**.  

---

## ✅ Example: Static Variable Behavior  

```java
class MyClass {
    static int count = 0;  // Static variable

    void increment() {
        count++;  // Changes the static variable
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.increment();  // Increments count (now 1)
        obj2.increment();  // Increments count (now 2)

        System.out.println(MyClass.count);  // Prints: 2
    }
}
```

### 🔥 Explanation:
- `count` is shared among all instances of `MyClass`.
- When `obj1.increment()` is called, it increments `count` to `1`.
- When `obj2.increment()` is called, it increments `count` to `2`.
- The final print statement shows `2` because both instances modify the same static variable.

---

## ✅ Static Variable in Multiple Methods  

```java
class Counter {
    static int count = 0;

    static void increase() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter.increase();
        Counter.showCount();  // Count: 1

        Counter.increase();
        Counter.showCount();  // Count: 2
    }
}
```

💡 Since `count` is static, every method in the class sees the updated value.

---

## 🔹 Key Points About Static Variables:
- Loaded once and shared across all objects of the class.
- Can be modified (unlike `static final`).
- Accessible using the class name (`ClassName.variable`).
- Can be used inside both static and non-static methods.

---

## ❓ What About `static final`?  
- If a variable is `static final`, it becomes a **constant**.  
- Its value **cannot be changed after initialization**.  

### Example:

```java
class Constants {
    static final int MAX_USERS = 100;
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.MAX_USERS);  // Prints: 100
        // Constants.MAX_USERS = 200;  // ❌ Compilation Error (cannot modify final variable)
    }
}
```


