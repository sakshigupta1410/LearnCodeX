# **🐍 Python Virtual Environments and `pip`**

---

## **🔍 What is a Virtual Environment?**

A **virtual environment** is an isolated Python environment that lets you:

- Manage packages **separately** for each project
- Avoid conflicts between different projects’ dependencies
- Keep your global Python installation clean

---

## **⚙️ Creating a Virtual Environment**
<br>

Python 3 comes with the built-in module `venv` to create virtual environments.

Run this command in your project folder:

```bash
python -m venv env
```

Here, **env** is the name of the virtual environment folder.

## **🚀 Activating the Virtual Environment**
<br>

```
On Windows (PowerShell):
.\env\Scripts\Activate.ps1

On Windows (Command Prompt):
.\env\Scripts\activate.bat

On macOS/Linux:
source env/bin/activate
```
<br>

When activated, your command prompt usually shows **(env)** at the beginning.

## **🛑 Deactivating the Virtual Environment**

Simply run: `deactivate`

## **📦 Using pip to Manage Packages**

**pip** is Python’s package installer.

**Installing a Package:** `pip install package_name`


**Example**: `pip install requests`

<br>

## **Listing Installed Packages**

- pip list

- Freezing Installed Packages

- Save all installed packages and their versions to a file:

- pip freeze > **requirements.txt**


This file is useful for sharing your environment with others.

Installing from **requirements.txt**

To install all packages listed in requirements.txt:

```
pip install -r requirements.txt
```

## 🧪 **Practice Challenge**

1. Create a new virtual environment named **myenv**.
2. Activate it.
3. Install the numpy package.
4. List installed packages.
5. Deactivate the environment.

## **✅ Summary**

* Virtual environments isolate project dependencies.

* Use python -m venv env to create one.
 
* Activate with source env/bin/activate (Linux/macOS) or .\\env\\Scripts\\activate (Windows).
 
* Use pip inside the environment to install/manage packages.
 
* Freeze dependencies with pip freeze > requirements.txt.