# Java Environment Setup Guide

This guide will help you set up a Java development environment on your local machine for this programming course.

## Prerequisites

- A computer with internet access
- Administrative privileges (for installation)

## Installing Java Development Kit (JDK)

### Option 1: Using Package Manager (Linux/macOS)

**Ubuntu/Debian:**
```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

**macOS (using Homebrew):**
```bash
brew install openjdk@17
```

### Option 2: Manual Installation

1. Download the JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.java.net/)
2. Follow the installation instructions for your operating system

## Verifying Installation

Open a terminal and run:
```bash
java -version
javac -version
```

You should see version information for both commands.

## Setting Up an IDE

We recommend using Visual Studio Code with Java extensions:

1. Download VS Code from [code.visualstudio.com](https://code.visualstudio.com/)
2. Install the following extensions:
   - Extension Pack for Java
   - Java Language Support

## Alternative IDEs

- IntelliJ IDEA (Community Edition)
- Eclipse IDE

## Next Steps

- Clone this repository
- Open it in your IDE
- Start working on the labs and assignments

## Troubleshooting

If you encounter issues:
- Ensure JAVA_HOME environment variable is set
- Check that the JDK version is compatible (Java 11 or higher recommended)
- Restart your IDE after installation

## Additional Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [VS Code Java Tutorial](https://code.visualstudio.com/docs/languages/java)