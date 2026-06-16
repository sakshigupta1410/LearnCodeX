# 📅 **Date and Time Handling in Python**

---

## 📦 **The `datetime` Module**

Python’s built-in **datetime** module allows you to:

- Work with **dates** and **times**
- Perform **date/time arithmetic**
- Format and parse date/time strings

Import it like this:

```python
import datetime
```
<br>

## **🧾 Getting the Current Date and Time**
<br>

```
from datetime import datetime

now = datetime.now()
print(now)
```

Example Output:

**2025-09-06 13:45:30.123456**

## **🧭 Working with Date Objects**
<br>

```
from datetime import date

today = date.today()
print(today)
print(today.year, today.month, today.day)
```

output:
**2025-09-27
2025 9 27**

<br>

## 🕰**️ Working with Time Objects**
<br>

```
from datetime import time

t = time(14, 30, 45)
print(t)
print(t.hour, t.minute, t.second)
```
Output:
**14:30:45
14 30 45**

## **🧮 Date Arithmetic**
<br>

### **Add or Subtract Days**
<br>

```
from datetime import timedelta
from datetime import date

today = date.today()
future = today + timedelta(days=7)
past = today - timedelta(days=3)

print("Future:", future)
print("Past:", past)
```

Output:
**Future: 2025-10-04
Past: 2025-09-24**

## 🧾 **Formatting Dates and Times (strftime)**
<br>

**Convert date/time objects into readable strings:**

```
now = datetime.now()
formatted = now.strftime("%Y-%m-%d %H:%M:%S")
print(formatted)
```

Output:
**2025-09-27 15:59:36**

## **Common Format Codes:**

| **Code** | **Meaning**       | **Example** |
|----------|-------------------|-------------|
| `%Y`     | Year (4 digits)   | 2025        |
| `%m`     | Month (01–12)     | 09          |
| `%d`     | Day (01–31)       | 06          |
| `%H`     | Hour (00–23)      | 14          |
| `%M`     | Minute (00–59)    | 30          |
| `%S`     | Second (00–59)    | 45          |

## 📥 **Parsing Strings into Dates (strptime)**
<br>

```
date_str = "2025-09-06"
parsed_date = datetime.strptime(date_str, "%Y-%m-%d")
print(parsed_date)
```
Output:
**2025-09-06 00:00:00**

## **⏱️ Measuring Execution Time**
<br>

```
import time

start = time.time()
# Some code block
time.sleep(2)
end = time.time()

print("Time taken:", end - start, "seconds")
```
Output:
**Time taken: 2.000112295150757 seconds**

## **🌍 Time Zones (Using `pytz` or `zoneinfo`)**
<br>

From Python 3.9+, use `zoneinfo`:

```
from datetime import datetime
from zoneinfo import ZoneInfo

dt = datetime.now(ZoneInfo("Asia/Kolkata"))
print(dt)
```
Output:
**2025-09-27 21:32:01.749450+05:30**


## **🧪 Practice Challenge**

**Try This:**

- Ask the user for their birthdate (in **YYYY-MM-DD** format)

- Print how many days old they are


## ✅ **Summary**

- Use **datetime**, **date**, **time**, and **timedelta** for date/time operations

- Format with **strftime()** and parse with **strptime()**

- Use **zoneinfo** (or pytz) for timezone-aware applications