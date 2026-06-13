# Day 5: Loops and Iteratives

Welcome to Day 5! Imagine you need to print "Hello World" 100 times. Writing `System.out.println` 100 times is inefficient, error-prone, and hard to maintain. 

This is where **loops (iteratives)** come in. They allow you to execute a block of code repeatedly as long as a specified condition remains `true`.

---

## 🔄 1. Types of Loops in Java

Java provides three primary loop structures:
1. `for` loop
2. `while` loop
3. `do-while` loop

### Loop Execution Flow

```mermaid
graph TD
    Start([Start Loop]) --> Init[Initialization]
    Init --> Cond{Condition Check}
    Cond -- True --> Body[Execute Loop Body]
    Body --> Update[Update Statement (Increment/Decrement)]
    Update --> Cond
    Cond -- False --> End([End Loop])
```

---

## 🔁 2. The `for` Loop

The `for` loop is typically used when you **know exactly how many times** you want to iterate through a block of code.

### Syntax
```java
for (initialization; condition; update) {
    // code to be executed
}
```
- **Initialization:** Executed only once before the loop starts.
- **Condition:** Evaluated before every iteration. If `true`, the loop body executes.
- **Update:** Executed after the loop body, usually to increment or decrement a counter.

### Code Example
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
/* Outputs:
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
*/
```

### Enhanced `for` Loop (For-Each)
Used exclusively to iterate through arrays or Collections.
```java
String[] cars = {"Volvo", "BMW", "Ford"};
for (String car : cars) {
    System.out.println(car);
}
```

---

## ⏳ 3. The `while` Loop

The `while` loop is used when you **do not know exactly how many times** the loop should run, but you know the condition that must be true for it to continue.

### Syntax
```java
while (condition) {
    // code to be executed
}
```

### Code Example
```java
int count = 1;
while (count <= 3) {
    System.out.println("Count is: " + count);
    count++; // Don't forget to update, or you'll create an infinite loop!
}
```

---

## 🏃 4. The `do-while` Loop

The `do-while` loop is a variant of the `while` loop. The key difference is that the `do-while` loop will execute the code block **at least once**, before checking if the condition is true.

### Syntax
```java
do {
    // code to be executed
} while (condition);
```

### Code Example
```java
int x = 10;
do {
    System.out.println("Value of x: " + x);
    x++;
} while (x < 5); 
// Even though 10 is not < 5, it prints "Value of x: 10" once.
```

---

## ⚖️ Comparing the Loops

| Feature | `for` loop | `while` loop | `do-while` loop |
| :--- | :--- | :--- | :--- |
| **Use Case** | When the number of iterations is known. | When iterations depend on a condition, not a counter. | When the code must run at least once regardless of the condition. |
| **Condition Check** | Top of the loop (Entry-controlled) | Top of the loop (Entry-controlled) | Bottom of the loop (Exit-controlled) |
| **Minimum Executions** | 0 | 0 | 1 |

---

## 🛑 5. Jump Statements: `break` and `continue`

Sometimes you need to alter the flow inside a loop.

- **`break`:** Exits the loop entirely.
- **`continue`:** Skips the current iteration and jumps to the next iteration of the loop.

### Code Example
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips iteration 3
    }
    if (i == 5) {
        break; // Stops the loop completely when i is 5
    }
    System.out.println(i);
}
// Outputs:
// 1
// 2
// 4
```

---

## 📝 Learning & Assignments
- **Learning:** Check the `Learning/` folder to run and modify these loops. Try intentionally creating an infinite loop to see what happens!
- **Assignments:** Complete the exercises in the `Assignments/` folder. Build programs to find prime numbers, print patterns (nested loops), and reverse an array using loops.
