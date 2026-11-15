# 📚 DSA with Java — Learning Repository

> A step-by-step Data Structures and Algorithms learning journey using Core Java.  
> Every problem is in its own class with its own `main` method — run them independently.

---

## 🎯 Learning Objectives

- Understand DSA concepts from scratch using Java
- Write clean, readable, well-commented Java code
- Build problem-solving intuition through dry runs and analysis
- Understand time and space complexity for every solution

---

## ✅ Prerequisites

| Requirement | Details |
|---|---|
| **Java JDK** | Version 8 or higher (JDK 17 recommended) |
| **IDE** | IntelliJ IDEA (recommended) or any Java IDE |
| **Git** | For cloning the repository |

### Install JDK (if not already installed)

Download from: https://www.oracle.com/java/technologies/downloads/

Verify installation:
```bash
java -version
javac -version
```

---

## 📂 Project Folder Structure

```
DSA/
│
├── README.md                    ← You are here
├── .gitignore
│
└── src/
    ├── arrays/
    │   ├── EvenNumbers.java
    │   ├── OddNumbers.java
    │   ├── FindLargest.java
    │   ├── FindSmallest.java
    │   ├── ReverseArray.java
    │   └── FindSecondLargest.java
    │
    ├── strings/                 ← Coming soon
    ├── searching/               ← Coming soon
    ├── sorting/                 ← Coming soon
    ├── recursion/               ← Coming soon
    ├── linkedlist/              ← Coming soon
    ├── stack/                   ← Coming soon
    ├── queue/                   ← Coming soon
    ├── hashing/                 ← Coming soon
    ├── trees/                   ← Coming soon
    ├── graphs/                  ← Coming soon
    └── dynamicprogramming/      ← Coming soon
```

> `out/` is generated during compilation — it is NOT committed to Git.

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/arfath014/DSA.git
cd DSA
```

### 2. Open in IntelliJ IDEA

1. Open IntelliJ IDEA
2. Click **File → Open**
3. Select the `DSA` folder
4. IntelliJ will detect the project structure automatically
5. Mark `src` as the **Sources Root**:  
   Right-click `src` → **Mark Directory as → Sources Root**

### 3. Run a Program in IntelliJ

- Navigate to any `.java` file (e.g., `src/arrays/EvenNumbers.java`)
- Click the ▶ green **Run** button next to the `main` method
- Output appears in the **Run** panel at the bottom

---

## 🛠️ Compile and Run from Terminal (Windows)

All commands below are run from the **repository root** (`DSA/` folder).

### Compile a single file

```bash
javac -d out src/arrays/EvenNumbers.java
```

> `-d out` tells the compiler to place the `.class` file inside the `out/` directory,  
> maintaining the package folder structure automatically.

### Run after compiling

```bash
java -cp out arrays.EvenNumbers
```

> `-cp out` sets the classpath to the `out/` directory.  
> `arrays.EvenNumbers` is the **fully qualified class name** (package + class).

### Compile ALL files at once

```bash
javac -d out src/arrays/*.java
```

### Run any arrays problem

```bash
java -cp out arrays.OddNumbers
java -cp out arrays.FindLargest
java -cp out arrays.FindSmallest
java -cp out arrays.ReverseArray
java -cp out arrays.FindSecondLargest
```

---

## 🗺️ Learning Roadmap

| Phase | Topic | Status |
|---|---|---|
| **Phase 1** | Java Basics for DSA (loops, arrays, methods) | 🔄 Foundation |
| **Phase 2** | Arrays | 🚀 In Progress |
| **Phase 3** | Strings | ⏳ Upcoming |
| **Phase 4** | Searching & Sorting | ⏳ Upcoming |
| **Phase 5** | Recursion & Backtracking | ⏳ Upcoming |
| **Phase 6** | Linked Lists | ⏳ Upcoming |
| **Phase 7** | Stack & Queue | ⏳ Upcoming |
| **Phase 8** | HashMap & HashSet | ⏳ Upcoming |
| **Phase 9** | Trees & BST | ⏳ Upcoming |
| **Phase 10** | Graphs | ⏳ Upcoming |
| **Phase 11** | Dynamic Programming | ⏳ Upcoming |

---

## 📋 Problem Index

### 🔢 Arrays

| # | Problem | File | Concepts | Time | Space |
|---|---|---|---|---|---|
| 1 | Even Numbers | [EvenNumbers.java](src/arrays/EvenNumbers.java) | Modulo operator, loops | O(n) | O(1) |
| 2 | Odd Numbers | [OddNumbers.java](src/arrays/OddNumbers.java) | Modulo operator, loops | O(n) | O(1) |
| 3 | Find Largest | [FindLargest.java](src/arrays/FindLargest.java) | Linear scan, comparison | O(n) | O(1) |
| 4 | Find Smallest | [FindSmallest.java](src/arrays/FindSmallest.java) | Linear scan, comparison | O(n) | O(1) |
| 5 | Reverse Array | [ReverseArray.java](src/arrays/ReverseArray.java) | Two-pointer technique | O(n) | O(1) |
| 6 | Find Second Largest | [FindSecondLargest.java](src/arrays/FindSecondLargest.java) | Two-variable tracking | O(n) | O(1) |

### 🔤 Strings
*Coming soon...*

### 🔍 Searching
*Coming soon...*

### 📊 Sorting
*Coming soon...*

---

## 🧠 Concepts Covered

### Arrays
- **Modulo (`%`)**: Used to check even/odd. `num % 2 == 0` means even.
- **Linear Scan**: Visit every element once — O(n) time.
- **Two-Pointer Technique**: Use two indices moving toward each other (used in ReverseArray).
- **In-place Operation**: Modify the original array without creating a new one — O(1) space.
- **Tracking variables**: Keep a running "best" value across a loop (used in FindLargest, FindSecondLargest).

---

## 📈 Time & Space Complexity — Quick Reference

| Complexity | Meaning | Example |
|---|---|---|
| **O(1)** | Constant — doesn't grow with input | Accessing `arr[0]` |
| **O(n)** | Linear — grows with input size | Looping through array once |
| **O(n²)** | Quadratic — nested loops | Bubble Sort |
| **O(log n)** | Logarithmic — halves input each step | Binary Search |

---

## ✅ Learning Progress Checklist

### Phase 2: Arrays
- [x] Even Numbers
- [x] Odd Numbers
- [x] Find Largest Element
- [x] Find Smallest Element
- [x] Reverse an Array
- [x] Find Second Largest Element
- [ ] Sum and Average of Array
- [ ] Remove Duplicates
- [ ] Frequency of Elements
- [ ] Two Sum Problem
- [ ] Kadane's Algorithm (Maximum Subarray Sum)

### Phase 3: Strings
- [ ] Reverse a String
- [ ] Check Palindrome
- [ ] Count Vowels and Consonants
- [ ] Character Frequency
- [ ] Check Anagram
- [ ] Find Duplicate Characters

### Phase 4: Searching & Sorting
- [ ] Linear Search
- [ ] Binary Search
- [ ] Bubble Sort
- [ ] Selection Sort
- [ ] Insertion Sort
- [ ] Merge Sort
- [ ] Quick Sort

### Phase 5: Recursion
- [ ] Factorial
- [ ] Fibonacci
- [ ] Sum of digits
- [ ] Tower of Hanoi

### Phase 6: Linked Lists
- [ ] Singly Linked List (Insert, Delete, Traverse)
- [ ] Reverse a Linked List
- [ ] Detect a Loop

### Phase 7: Stack & Queue
- [ ] Stack using Array
- [ ] Queue using Array
- [ ] Balanced Parentheses

### Phase 8: HashMap & HashSet
- [ ] Frequency Count
- [ ] Two Sum using HashMap
- [ ] Find Duplicates

### Phase 9: Trees
- [ ] Binary Tree (Insert, Traverse)
- [ ] Binary Search Tree
- [ ] Height of a Tree

### Phase 10: Graphs
- [ ] BFS (Breadth-First Search)
- [ ] DFS (Depth-First Search)

### Phase 11: Dynamic Programming
- [ ] Fibonacci (Memoization)
- [ ] 0/1 Knapsack
- [ ] Longest Common Subsequence

---

## 🤝 Contributing

This is a personal learning repository. Feel free to fork it and use it as a template for your own DSA learning journey!

---

## 👨‍💻 Author

**Arfath** — Learning DSA one problem at a time 🚀

---

*Last updated: November 2026*
