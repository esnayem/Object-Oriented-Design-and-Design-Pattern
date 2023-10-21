public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a basic web page
        WebPage page = new BasicWebPage("This is the content of the web page");

        // Decorate the page with authorization check
        WebPage authorizedPage = new AuthorizedWebPage(page);

        // Decorate the authorized page with pagination
        WebPage paginatedPage = new PaginatedWebPage(authorizedPage, 10);

        // Display and use the decorated page
        System.out.println("Loading and using decorated page:");
        paginatedPage.load();
        paginatedPage.click();
        paginatedPage.display();
    }
}
