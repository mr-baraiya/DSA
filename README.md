# Data Structures & Algorithms (DSA)

## Overview
This guide covers fundamental concepts of Data Structures and Algorithms (DSA), essential for efficient problem-solving and software development.

## Topics Covered

### 1. Data Structures
Data structures are ways to organize and store data efficiently.

#### a. Arrays
Fixed-size collections of elements stored in contiguous memory locations.
**Example:**
```cpp
int arr[] = {1, 2, 3, 4, 5};
```

#### b. Linked List
A collection of nodes where each node contains data and a reference to the next node.
**Example:**
```cpp
struct Node {
    int data;
    Node* next;
};
```

#### c. Stacks & Queues
- **Stack**: LIFO (Last-In, First-Out) data structure.
- **Queue**: FIFO (First-In, First-Out) data structure.
**Example:**
```cpp
stack<int> s;
s.push(10);
s.pop();
```

#### d. Trees & Graphs
- **Binary Tree**: Each node has at most two children.
- **Graph**: Collection of nodes (vertices) and edges.
**Example (Graph Representation):**
```cpp
vector<int> adj[5]; // Adjacency list
```

#### e. Hashing
A technique to map data to a fixed-size table using hash functions for fast retrieval.
**Example (Hash Map in C++):**
```cpp
unordered_map<int, string> hashTable;
hashTable[1] = "Alice";
```

#### f. File Structure
Methods of storing and organizing data efficiently in files, including sequential, indexed, and direct access methods.

### 2. Algorithms
Algorithms are step-by-step procedures to solve problems efficiently.

#### a. Searching Algorithms
- **Linear Search**: O(n) complexity.
- **Binary Search**: O(log n) complexity.
**Example:**
```cpp
int binarySearch(int arr[], int low, int high, int key);
```

#### b. Sorting Algorithms
- **Bubble Sort, Merge Sort, Quick Sort, Heap Sort, etc.**
**Example (Quick Sort):**
```cpp
void quickSort(int arr[], int low, int high);
```

#### c. Recursion & Dynamic Programming
- **Recursion**: A function calls itself.
- **Dynamic Programming (DP)**: Optimizing overlapping subproblems.
**Example (Fibonacci with DP):**
```cpp
int dp[n+1];
dp[0] = dp[1] = 1;
for (int i = 2; i <= n; i++)
    dp[i] = dp[i-1] + dp[i-2];
```

### 3. Complexity Analysis
Understanding time and space complexity using Big-O notation.
**Example:** O(n), O(log n), O(n^2)

## Summary
This module provides a solid foundation for implementing data structures and algorithms efficiently, crucial for software development and coding interviews.

