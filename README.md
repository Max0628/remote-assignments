# 🌟 Remote Assignments 🌟

## Week 1

- **[Assignment 2](https://max0628.github.io/remote-assignments/Week-1/Assignment-2/)**
- **[Assignment 4](https://max0628.github.io/remote-assignments/Week-1/Assignment-4/)**

## Week 2

- **[Assignment 4](https://max0628.github.io/remote-assignments/Week-2/Assignment-4)**

Thank you for checking my homework! 🙏

## Week 3

## 🚀 Cloning the `Week-3` Directory Only

To clone only the `Week-3` directory from this repository, follow these steps:

1. **Create a new directory and initialize a new Git repository:**

   ```sh
   mkdir Max-remote-week-3-repo
   cd Max-remote-week-3-repo
   git init
   ```

2. **Enable sparse checkout:**

   ```sh
   git config core.sparseCheckout true
   ```

3. **Add the remote repository:**

   ```sh
   git remote add origin https://github.com/Max0628/remote-assignments.git
   ```

4. **Specify the `Week-3` directory for sparse checkout:**

   ```sh
   echo "Week-3/" >> .git/info/sparse-checkout
   ```

5. **Pull the specified directory from the remote repository:**

   ```sh
   git pull origin main
   ```

After completing these steps, you will have only the `Week-3` directory from the remote repository in your local directory `Max-remote-week-3-repo`.

## 📋 API Endpoints

### Assignment 1: Your First Web Server

- **Endpoint:** `http://localhost:3000/`
- **Description:** Displays a simple HTML page with the message "Hello, My Server!".

### Assignment 2: Build Backend API for Front-End

- **Endpoint:** `http://localhost:3000/data`
- **Method:** GET
- **Description:** Handles different scenarios based on the query parameter `number`.
  - No parameter: Displays "Lack of Parameter".
  - Non-integer parameter: Displays "Wrong Parameter".
  - Integer parameter: Displays the sum of integers from 1 to the given number.

Examples:

- `http://localhost:3000/data` → "Lack of Parameter"
- `http://localhost:3000/data?number=xyz` → "Wrong Parameter"
- `http://localhost:3000/data?number=5` → "15"

### Assignment 3: Connect to Backend API by AJAX

- **Endpoint:** `http://localhost:3000/sum.html`
- **Description:** Serves a static HTML file that uses AJAX to request data from the backend API and display results.
  - **AJAX Request:** `http://localhost:3000/data?number=10`
  - **Result:** 55

### Assignment 4: HTTP Cookie

1. **Endpoint:** `http://localhost:3000/myName`

   - **Description:** Checks for a cookie storing the user's name.
     - If the cookie exists, displays the name.
     - If the cookie does not exist, displays a form to enter the name.

2. **Endpoint:** `http://localhost:3000/trackName`
   - **Method:** GET
   - **Description:** Takes a query parameter `name` and stores it in a cookie.
   - **Example:** `http://localhost:3000/trackName?name=John`
