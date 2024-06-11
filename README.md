# Java Port Scanner

This is a simple Java program that scans ports on a given host to check if they are open or closed. It iterates through all possible ports in the range from 1 to 65535, attempts to establish a connection with each port, and prints a message indicating whether the port is open or closed.

## Usage

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/anumag1/portScanner.git
    ```

2. Navigate to the directory containing the source code:

    ```bash
    cd java-port-scanner
    ```

3. Compile the Java source code:

    ```bash
    javac PortScanner.java
    ```

4. Run the compiled program:

    ```bash
    java PortScanner
    ```

## Customization

You can customize the program by modifying the following variables in the `PortScanner.java` file:

- `host`: The address of the host to scan. By default, it's set to `"localhost"`.
- `timeout`: The timeout for connection attempts (in milliseconds). By default, it's set to `1000`.

## Important Notes

- Port scanning may require administrative privileges, especially for scanning ports below 1024 on UNIX-like systems.
- This program provides a basic demonstration of port scanning and may not be suitable for all use cases. Use it responsibly and ensure compliance with relevant laws and regulations.
