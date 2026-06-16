
---
# ♻️ **Garbage Collection in Java**

## 🔹 **What is Garbage Collection?**

**Garbage Collection (GC)** is the process by which Java automatically reclaims memory by removing objects that are **no longer in use**. It helps in:

- Freeing up heap memory
- Preventing memory leaks
- Improving application performance

> Unlike C/C++, Java handles memory management automatically — developers don't need to manually free memory.

---

## ✅ **Why is Garbage Collection Important?**

- Prevents **OutOfMemoryError**
- Helps manage **object lifecycle**
- Improves **application stability**
- Eliminates need for `free()` or `delete()` functions

---

## 🧠 **How Garbage Collection Works**

1. Objects are created in the **Heap memory**.
2. If no part of the code references an object anymore, it's considered **"garbage"**.
3. The **Garbage Collector (GC)** identifies and removes these unreferenced objects.
4. Memory is reclaimed and made available for future object creation.

---

## 🧩 **JVM Memory Areas & GC**

Garbage Collection mostly targets the **Heap** area of the JVM, which is divided into:

| Generation        | Description                                      |
|-------------------|--------------------------------------------------|
| **Young Generation** | Newly created objects (frequent GC here)       |
| **Old Generation**   | Long-lived objects (GC less frequent)          |
| **Permanent Generation** / **MetaSpace** | Stores class metadata (since Java 8 uses MetaSpace) |

---

## 🔄 **GC Phases (Simplified)**
<br>

### 1. **Mark**
- GC identifies which objects are still in use (reachable).

### 2. **Sweep**
- Unreachable (garbage) objects are removed from memory.

### 3. **Compact** (Optional)
- Remaining objects are moved together to avoid memory fragmentation.

---

## 🚀 **Common Garbage Collectors**

| GC Type                 | Description |
|-------------------------|-------------|
| **Serial GC**           | Single-threaded; suitable for small apps |
| **Parallel GC**         | Multi-threaded; faster than Serial GC    |
| **CMS (Concurrent Mark-Sweep)** | Low pause time GC, runs concurrently with the app |
| **G1 (Garbage First)**  | Modern, default GC in newer Java versions |
| **ZGC / Shenandoah**    | Experimental, ultra-low-latency collectors |

> You can select GC type using JVM flags like `-XX:+UseG1GC`

---

## **🧪 Real-Life Analogy**

Think of the heap as your phone's photo gallery. Over time, unused or duplicate photos pile up. The Garbage Collector is like a smart cleanup assistant that finds and deletes those unneeded photos, freeing up space — without you doing it manually.

---

## **⚠️ When Garbage Collection Happens**

Garbage Collection is **not predictable** — it's triggered when:

- JVM needs memory
- Memory usage reaches a threshold
- You manually request it (e.g., `System.gc()` — **not recommended**)

---

## 🔍 **Can We Force Garbage Collection?**

No. Calling `System.gc()` **suggests** that the JVM should run garbage collection, but it's **not guaranteed** to run immediately or at all.

---

## **🛠️ Best Practices to Avoid Memory Leaks**

- Dereference objects by setting them to `null` if no longer needed
- Unregister listeners and callbacks
- Avoid static references to large objects
- Use tools like **Android Profiler**, **VisualVM**, or **JProfiler**

---

## **💡 Summary**

- Java manages memory automatically using the **Garbage Collector**.
- GC identifies and removes **unreachable objects** from the heap.
- There are multiple GC algorithms optimized for different needs.
- Developers should still write memory-efficient code to avoid leaks.

---
