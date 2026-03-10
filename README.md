# Design Patterns - Definition & Quick Revision Guide

A comprehensive collection of Gang of Four (GoF) design patterns with definitions, use cases, and quick revision notes.

## 📋 Table of Contents

1. [Abstract Factory Pattern](#abstract-factory-pattern)
2. [Builder Pattern](#builder-pattern)
3. [Factory Pattern](#factory-pattern)
4. [Iterator Pattern](#iterator-pattern)
5. [Observer Pattern](#observer-pattern)

---

## Abstract Factory Pattern

### Definition
A creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Key Concepts
- **Purpose**: Separate object creation from usage
- **Type**: Creational Pattern
- **Use When**: You have multiple families of related products

### Quick Revision
- Creates objects without specifying exact classes
- Useful for cross-platform applications
- Ensures consistency among product families
- More complex than Factory Pattern
- Contains multiple factory methods

### Example Use Cases
- GUI frameworks (buttons, checkboxes for different OS)
- Database drivers (MySQL, PostgreSQL, Oracle)
- Theme systems (dark/light mode UI components)

---

## Builder Pattern

### Definition
A creational design pattern that separates the construction of a complex object from its representation, allowing step-by-step object creation.

### Key Concepts
- **Purpose**: Construct complex objects step by step
- **Type**: Creational Pattern
- **Use When**: Objects have many optional parameters

### Quick Revision
- Builds objects step-by-step rather than all at once
- Uses a separate Builder class
- Improves readability with method chaining
- Great for immutable objects
- Reduces constructor overloading

### Example Use Cases
- Building documents (HTML, PDF)
- Creating HTTP requests
- Constructing SQL queries
- Configuration objects

---

## Factory Pattern

### Definition
A creational design pattern that provides an interface for creating objects in a superclass, letting subclasses decide which class to instantiate.

### Key Concepts
- **Purpose**: Create objects without tight coupling
- **Type**: Creational Pattern
- **Use When**: You don't know exact object types at runtime

### Quick Revision
- Single factory method creates objects
- Decouples object creation from usage
- Simpler than Abstract Factory
- One product family only
- Reduces direct instantiation calls

### Example Use Cases
- Database connections
- Logger creation
- Document readers (PDF, Word, Excel)
- Payment processors

---

## Iterator Pattern

### Definition
A behavioral design pattern that provides a way to access elements of a collection sequentially without exposing its underlying representation.

### Key Concepts
- **Purpose**: Traverse collection elements uniformly
- **Type**: Behavioral Pattern
- **Use When**: You need uniform access to collections

### Quick Revision
- Separates traversal logic from collection
- Provides uniform interface for different collections
- Enables multiple iterations simultaneously
- Hides internal collection structure
- Supports different iteration strategies

### Example Use Cases
- File system traversal
- Database result iteration
- Menu/tree navigation
- Stream processing

---

## Observer Pattern

### Definition
A behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

### Key Concepts
- **Purpose**: Notify multiple observers about state changes
- **Type**: Behavioral Pattern
- **Use When**: Multiple objects need updates

### Quick Revision
- Loose coupling between observer and subject
- Subject notifies all observers automatically
- Observers subscribe/unsubscribe dynamically
- Useful for event-driven systems
- Many-to-one relationship (many observers, one subject)

### Example Use Cases
- Event listeners in GUI frameworks
- Pub-Sub messaging systems
- Stock price monitoring
- Model-View-Controller (MVC) architectures
- Real-time notifications

---

## Quick Comparison Table

| Pattern | Type | Purpose | Complexity | Use Case |
|---------|------|---------|-----------|----------|
| **Abstract Factory** | Creational | Create families of objects | High | Multi-platform apps |
| **Builder** | Creational | Build complex objects step-by-step | Medium | Complex object construction |
| **Factory** | Creational | Create single object type | Low | Decoupled object creation |
| **Iterator** | Behavioral | Traverse collections | Medium | Access collection elements |
| **Observer** | Behavioral | Notify multiple observers | Medium | Event-driven systems |

---

## Key Takeaways

✅ **Creational Patterns** focus on object creation mechanisms
- Abstract Factory, Builder, Factory

✅ **Behavioral Patterns** focus on communication between objects
- Iterator, Observer

✅ **Design Patterns solve recurring design problems**

✅ **Choose patterns based on your specific requirements**

✅ **Avoid over-engineering with unnecessary patterns**

---

## Repository Structure
