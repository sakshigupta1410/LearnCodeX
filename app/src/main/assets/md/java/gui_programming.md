
---
# **🔹 What is GUI Programming?**

**GUI (Graphical User Interface)** programming allows users to interact with programs visually using buttons, text fields, menus, and more — instead of a text-based console.

Java provides GUI support through libraries like:

- `AWT` (Abstract Window Toolkit)
- `Swing` (more powerful, flexible, and lightweight)

---

## **🔸 AWT vs Swing**

| Feature         | AWT                         | Swing                         |
|----------------|-----------------------------|-------------------------------|
| Platform       | Heavyweight (depends on OS) | Lightweight (pure Java)       |
| Look & Feel    | OS-dependent                | Customizable                  |
| Package        | `java.awt.*`                | `javax.swing.*`               |

---

## **🔹 Basic Swing Components**

| Component         | Description             |
|------------------|-------------------------|
| `JFrame`          | Main window             |
| `JLabel`          | Displays a text label   |
| `JButton`         | A clickable button      |
| `JTextField`      | Input field for text    |
| `JTextArea`       | Multi-line text input   |
| `JCheckBox`       | Checkbox                |
| `JRadioButton`    | Radio button            |
| `JComboBox`       | Drop-down list          |
| `JPanel`          | Container to group components |

---

## 🔹 Simple Swing Example
<br>

```

import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LearnCodeX GUI");
        JLabel label = new JLabel("Hello, GUI World!");
        
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

<br>

## **🔹 JButton with Action Listener**
<br>


```

import javax.swing.*;
import java.awt.event.*;

public class ButtonExample {
public static void main(String[] args) {
JFrame frame = new JFrame("Button Demo");

        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 120, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

---


## **🔹 Layout Managers**


* **FlowLayout** -> Left to right, top to bottom
* **BorderLayout** -> Top, Bottom, Left, Right, Center
* **GridLayout** -> Arranges in rows and columns
* **BoxLayout** -> One component per line or column

**Example**:

```
frame.setLayout(new FlowLayout());
```

---

## **🔹 Event Handling**

Java uses event-driven programming for GUI.

Common listeners:

* ActionListener

* KeyListener

* MouseListener


```
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// handle event
}
});
```

---

### **✅ Summary**

* GUI in Java can be built using AWT or Swing.

* Swing is more modern and flexible.
 
* Components like JFrame, JButton, JLabel are essential.
 
* Use layout managers to organize UI elements.
 
* Handle events with listeners like ActionListener.

---