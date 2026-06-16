# **Linked Lists in C**
<br>

## **Introduction**
A **linked list** is a linear data structure where elements (called **nodes**) are stored in memory dynamically and are linked using pointers.

Each node has:
1. **Data** – stores the value.
2. **Pointer** – stores the address of the next node.

Unlike arrays:
- Linked lists do not require contiguous memory.
- Size can grow/shrink dynamically.

---

## Structure of a Linked List Node
<br>

```c
struct Node {
    int data;
    struct Node* next;
};
```

**Here**:

**data** → stores value of the node.

**next** → pointer to the next node.

## **Creating a Simple Linked List**
<br>

```
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

int main() {
    // Create nodes
    struct Node* head = (struct Node*)malloc(sizeof(struct Node));
    struct Node* second = (struct Node*)malloc(sizeof(struct Node));
    struct Node* third = (struct Node*)malloc(sizeof(struct Node));

    // Assign data and links
    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = NULL;

    // Traverse
    struct Node* temp = head;
    while(temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    return 0;
}
```

**Output**:

10 -> 20 -> 30 -> NULL
<br>

## **Basic Operations**
<br>

### **1. Traversing a Linked List**
<br>

```
void traverse(struct Node* head) {
    struct Node* temp = head;
    while(temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
}
```

## **2. Insertion**

**At Beginning**

```
struct Node* insertAtBeginning(struct Node* head, int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = head;
    return newNode; // new node becomes head
}
```
<br>

**At End**

```
void insertAtEnd(struct Node* head, int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->next = NULL;

    struct Node* temp = head;
    while(temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newNode;
}
```
<br>

### **3. Deletion**

Delete a Node by Value

```
struct Node* deleteNode(struct Node* head, int value) {
    struct Node* temp = head;
    struct Node* prev = NULL;

    if(temp != NULL && temp->data == value) {
        head = temp->next; // delete head
        free(temp);
        return head;
    }

    while(temp != NULL && temp->data != value) {
        prev = temp;
        temp = temp->next;
    }

    if(temp == NULL) return head; // value not found

    prev->next = temp->next;
    free(temp);

    return head;
}
```
<br>

## **Types of Linked Lists**

* **Singly Linked List** – nodes connected in one direction.

* **Doubly Linked List** – nodes have pointers to both next and previous nodes.
 
* **Circular Linked List** – last node points back to the head.
 
* **Example**: Doubly Linked List Node

```
struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};
```
<br>

## **Use Cases**

- Dynamic memory allocation.

- Implementing stacks, queues, graphs, and hash tables.

- Useful when frequent insertion/deletion is required.

## Summary

- Linked lists store data in nodes dynamically.

- Each node has data + pointer(s).

- Types: **Singly**, **Doubly**, **Circular**.

- Common operations: traversal, insertion, deletion.