# Registration and Login System

This Java project implements a simple user registration and login system using a graphical interface (`JOptionPane`). Users can register with their details, which are validated for format and security, and then log in with their credentials.

## Features

- **User Registration**
  - Collects first name, last name, username, password, and phone number.
  - Username must be 5 characters or fewer and contain an underscore (`_`).
  - Password must be at least 8 characters, include a capital letter, a number, and a special character.
  - Phone number must start with `+27` and be followed by 9 digits.

- **User Login**
  - Prompts for username and password.
  - Validates credentials against registered details.
  - Welcomes the user upon successful login.

## How to Run

1. Open the project in NetBeans or Visual Studio Code.
2. Build the project.
3. Run the `Registration` class.
4. Follow the prompts to register and log in.

## Project Structure
 - St10488786-PROG5121/ └── Registration/ └── src/ └── registration/ ├── Registration.java └── Login.java


## Requirements

- Java 8 or higher
- No external libraries required

## Author

- Duduzile Sibeko

## License

This project is licensed under the MIT License.
