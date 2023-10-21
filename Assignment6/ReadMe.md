# Decorator Pattern Example

This is a Java program that demonstrates the Decorator Pattern for a web page. The Decorator Pattern allows you to attach additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

In this example, we create a basic web page and then decorate it with various features using decorators.

## Features

1. **WebPage Interface:** The `WebPage` interface defines the basic methods that a web page can have, including `display`, `load`, and `click`.

2. **Concrete Component - BasicWebPage:** `BasicWebPage` class implements the `WebPage` interface and represents a simple web page with some content. It provides the basic functionality of a web page.

3. **Decorator - WebPageDecorator:** The `WebPageDecorator` abstract class implements the `WebPage` interface as well and serves as the base class for all decorators. It allows for dynamic addition of behaviors to web pages.

4. **Concrete Decorator 1 - AuthorizedWebPage:** `AuthorizedWebPage` checks if the user is authorized before displaying the page. It adds authorization functionality to the web page.

5. **Concrete Decorator 2 - PaginatedWebPage:** `PaginatedWebPage` adds pagination to the web page, allowing the display of a specified number of items per page.

## Usage

1. Create a basic web page using the `BasicWebPage` class.

2. Decorate the page with additional features using decorators like `AuthorizedWebPage`, `PaginatedWebPage`, etc.

3. Use the decorated web page to take advantage of the added functionality.

### Example

```java
// Create a basic web page
WebPage page = new BasicWebPage("This is the content of the web page");

// Decorate the page with authorization check
WebPage authorizedPage = new AuthorizedWebPage(page);

// Decorate the authorized page with pagination
WebPage paginatedPage = new PaginatedWebPage(authorizedPage, 10);

// Display and use the decorated page
paginatedPage.load();
paginatedPage.click();
paginatedPage.display();
