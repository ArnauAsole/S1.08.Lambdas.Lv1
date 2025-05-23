# 🧠🧪 S1.08.JavaLambdas.Lv1

## 📂 Java 8 – Lambdas, Streams & Functional Interfaces

### 🧾 Exercise Description

The goal of this project is to practice modern Java development using **Java 8+ Lambdas**, Streams, and Functional Interfaces. The exercises cover:

- Filtering and transforming collections  
- Sorting  
- Creating custom functional interfaces with concise lambda expressions  

---

### ✅ Requirements

#### Level 1 Exercises

**Exercise 1**  
Create a method that returns a list of strings containing the letter `'o'` from a given list of strings. Print the result.

---

**Exercise 2**  
Do the same as Exercise 1, but also filter only strings with more than **5 characters**.

---

**Exercise 3**  
Create a list with the names of the months of the year. Print all the elements using a **lambda expression**.

---

**Exercise 4**  
Repeat Exercise 3 but print using a **method reference** instead of a lambda.

---

**Exercise 5**  
Create a **Functional Interface** with a method `getPiValue()` that returns a `double`. In the main class, implement the interface with a lambda that returns `3.1415`, then invoke the method and print the result.

---

**Exercise 6**  
Create a list of strings and sort them by **length (shortest to longest)**.

---

**Exercise 7**  
Sort the same list as in Exercise 6, but from **longest to shortest**.

---

**Exercise 8**  
Create a **Functional Interface** with a method `reverse(String input)` that returns a **reversed version** of the given string. Implement the logic using a lambda, invoke it, and print the result.

---

### 🔨 Methods Implemented

```java
// Exercise1.java
List<String> result = list.stream()
    .filter(s -> s.contains("o"))
    .collect(Collectors.toList());

// Exercise2.java
List<String> result = list.stream()
    .filter(s -> s.contains("o") && s.length() > 5)
    .collect(Collectors.toList());

// Exercise3.java
months.forEach(month -> System.out.println(month));

// Exercise4.java
months.forEach(System.out::println);

// Exercise5.java
@FunctionalInterface
interface PiValue {
    double getPiValue();
}

// Exercise6.java
list.sort(Comparator.comparingInt(String::length));

// Exercise7.java
list.sort(Comparator.comparingInt(String::length).reversed());

// Exercise8.java
@FunctionalInterface
interface Reverser {
    String reverse(String input);
}
```

### 💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

No third-party libraries required

### 📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA Community Edition

Git (optional, for version control)

### 🛠️ Installation and Setup
Install Required Tools:

Java JDK 17

IntelliJ IDEA (Community Edition)

Clone the Repository (Optional):

```
git clone https://github.com/YourUsername/S1.08.JavaLambdas.Lv1.git  

cd S1.08.JavaLambdas.Lv1/
```
Open the Project in IntelliJ:

Go to File → Open

Select the root folder of the project

### ▶️ Running the Project
To run a specific exercise:

Open the corresponding .java file (e.g., Exercise4.java)

Right-click the file and select Run

The result will be printed to the console

### 🌐 Deployment
This is a console-based Java project for learning and testing lambda expressions locally. No deployment needed.

### 🤝 Acknowledgements
Special thanks to the contributors:

Adrià, Ignasi, Ana, Alejandro, Marc,Vanina and Albert.
