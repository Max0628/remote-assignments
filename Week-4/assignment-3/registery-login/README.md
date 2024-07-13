### Project Introduction
This project is a simple user registration and login system built with Spring Boot. It includes a controller, service, and DAO layer, and uses a MySQL database for user data storage.

### API

#### Endpoints

1. **Home Page**
    - **URL:** `/`
    - **HTTP Method:** `GET`
    - **Description:** Returns the home page view.

2. **Member Page**
    - **URL:** `/memberPage`
    - **HTTP Method:** `GET`
    - **Description:** Returns the member page view.

3. **Register(press the register button)**
    - **URL:** `/register`
    - **HTTP Method:** `POST`
    - **Description:** Registers a new user. Redirects to the member page if successful, otherwise redirects to the home page.

4. **Login(press the login button)**
    - **URL:** `/login`
    - **HTTP Method:** `POST`
    - **Description:** Authenticates an existing user. Redirects to the member page if successful, otherwise redirects to the home page.

### API Port

- **Port:** 3000

### Database Schema

The database has a table named `user` with the following structure:

- `user_id` (int, primary key, auto-increment)
- `email` (varchar)
- `password` (varchar)