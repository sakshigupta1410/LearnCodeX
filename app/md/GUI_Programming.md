# GUI Programming

Java provides `Swing` and `JavaFX` for creating graphical user interfaces.

**Swing Example:**
```java
JFrame frame = new JFrame("My GUI");
frame.setSize(300, 200);
frame.setVisible(true);
```

**JavaFX Example:**
```java
public class MyApp extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Click");
        StackPane root = new StackPane(btn);
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
```