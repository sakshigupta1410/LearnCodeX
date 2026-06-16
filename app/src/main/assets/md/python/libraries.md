# **Python Libraries Overview**

Python has a rich ecosystem of libraries that simplify various tasks, from data analysis to web development.

---

## **1. NumPy (Numerical Python)**

- **Purpose:** Numerical computations, arrays, mathematical operations
- **Key Features:**
    - Provides **ndarrays** (N-dimensional arrays)
    - Fast element-wise operations
    - Mathematical and statistical functions

**Example:**

```python
import numpy as np

arr = np.array([1, 2, 3, 4])
print(arr + 5)      # [6 7 8 9]
print(np.mean(arr))  # 2.5
```
---

## **2. Pandas**

**Purpose**: Data analysis and manipulation

### **Key Features:**

**Series**: One-dimensional labeled array

**DataFrame**: Two-dimensional labeled data structure

Handles CSV, Excel, SQL, and more

**Example**:

```
import pandas as pd

data = {"Name": ["LearnCodeX", "Python"], "Age": [21, 22]}
df = pd.DataFrame(data)
print(df)
```

Output:

| Name        | Age |
|-------------|-----|
| LearnCodeX  |  21 |
| Python      |  22 |



---

## **3. Matplotlib**

**Purpose**: Data visualization

### **Key Features:**

Create line plots, bar charts, scatter plots, and more

Highly customizable

**Example**:

```
import matplotlib.pyplot as plt

x = [1, 2, 3, 4]
y = [10, 20, 25, 30]

plt.plot(x, y)
plt.title("LearnCodeX Plot")
plt.xlabel("X-axis")
plt.ylabel("Y-axis")
plt.show()
```
---

## **4. Seaborn**

**Purpose**: Advanced statistical data visualization

### **Key Features:**

* Works on top of Matplotlib

* Beautiful default themes
 
* Simplifies plotting complex graphs

**Example**:

```
import seaborn as sns
import pandas as pd

data = pd.DataFrame({"x": [1, 2, 3, 4], "y": [10, 20, 25, 30]})
sns.lineplot(x="x", y="y", data=data)
```
---

## **5. SciPy**

**Purpose**: Scientific and technical computing

### **Key Features:**

* Signal processing

* Optimization
 
* Linear algebra, integration, interpolation

**Example**:

```
from scipy import integrate

result = integrate.quad(lambda x: x**2, 0, 1)
print(result)   # (0.33333333333333337, 3.700743415417189e-15)
```
---

## **6. scikit-learn**

**Purpose**: Machine Learning

### **Key Features:**

- Supervised & unsupervised learning

- Regression, classification, clustering

- Preprocessing and model evaluation

**Example**:

```
from sklearn.linear_model import LinearRegression
import numpy as np

x = np.array([[1], [2], [3], [4]])
y = np.array([2, 4, 6, 8])

model = LinearRegression()
model.fit(x, y)
print(model.predict([[5]]))  # [10.]
```
---

## **7. TensorFlow / PyTorch**

**Purpose**: Deep Learning

### **Key Features:**

- Neural network creation

- GPU acceleration

- Large-scale ML training

## **8. Other Popular Libraries**

**Requests**: HTTP requests (APIs, web scraping)

**BeautifulSoup**: Web scraping

**OpenCV**: Computer vision and image processing

**Pillow (PIL)**: Image manipulation

**Plotly**: Interactive visualizations

**NLTK / spaCy**: Natural Language Processing

## **9. Summary (LearnCodeX)**

* **NumPy**: Arrays & numerical computation

* **Pandas**: Data analysis & manipulation
 
* **Matplotlib / Seaborn**: Visualization
 
* **SciPy**: Scientific computing
 
* **scikit-learn**: Machine learning
 
* **TensorFlow / PyTorch**: Deep learning
 
* **Others**: Requests, BeautifulSoup, OpenCV, Pillow, Plotly, NLTK
 
* Python libraries simplify coding tasks and reduce the need to write complex code from scratch.