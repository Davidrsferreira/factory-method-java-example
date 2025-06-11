# 🎯 Factory Method Pattern – Real-World Java Example

This repository demonstrates how to apply the **Factory Method** design pattern to solve a real-world problem using Java. It includes both the initial (problematic) implementation and the refactored solution.

---

## 📦 Project Structure

```
factory-method-pattern/
├── initialversion/         # Code with switch-case (before refactoring)
└── refactoredversion/      # Refactored using Factory Method pattern
```

---

## 📚 Scenario: Notification System

You are building a system to send notifications via **Email**, **SMS**, and **Push**. Initially, the logic to create the notification is handled with a `switch-case` inside the service class.

This approach is:

- ❌ Hard to extend
- ❌ Violates Open/Closed Principle
- ❌ Not testable or loosely coupled

---

## 🚨 Initial Code Problem

In the initial version, the `NotificationService` class directly decides which `Notification` object to instantiate:

```java
switch (type) {
    case "email": return new EmailNotification();
    case "sms": return new SmsNotification();
    case "push": return new PushNotification();
    // ...
}
```

### 🔧 Issues:
- Any new notification type requires **editing the service**.
- Difficult to maintain and **scale**.
- Violates **SOLID** principles.

---

## ✅ Refactored with Factory Method

In the refactored version:

- We define a `NotificationFactory` interface with a method `createNotification()`.
- Each concrete notification has its **own factory**.
- The `NotificationService` now **depends on the factory**, not the concrete class.

### 🔄 Benefits:
- ✅ Open for extension, closed for modification
- ✅ Easier to test and mock
- ✅ Promotes separation of concerns
- ✅ Scalable and clean

---

## 🧠 How It Works

### 1. Define a common interface:
```java
public interface Notification {
    void send(String message);
}
```

### 2. Implement different notification types:
```java
public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
```

### 3. Create factories:
```java
public class EmailNotificationFactory implements NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
```

### 4. Inject factory into service:
```java
NotificationService service = new NotificationService(new EmailNotificationFactory());
service.notify("Hello via Email!");
```

---

## 🛠 Run the Project

```bash
cd refactoredversion
javac *.java
java Main
```

---

## 📌 Design Pattern Summary

| Aspect              | Factory Method Pattern                  |
|---------------------|------------------------------------------|
| Purpose             | Delegate object creation to subclasses   |
| Advantage           | Avoids tight coupling, improves scalability |
| Use Case            | When subclasses decide which class to instantiate |

---

## 🧠 Why Use This Pattern?

The Factory Method pattern is essential when:
- You need to decouple object creation from usage
- You want to follow SOLID principles
- You anticipate frequent changes or extensions in types of objects

---

## 🤝 Contributions

Pull requests are welcome. If you have other real-world pattern examples in mind, feel free to fork and enhance this project!

---

## 📜 License

MIT License
