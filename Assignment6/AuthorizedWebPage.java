// 4. Concrete Decorator 1 - Authorization
class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage page) {
        super(page);
    }

    @Override
    public void display() {
        // Check if the user is authorized (for simplicity, assume true)
        System.out.println("Checking user authorization...");
        super.display();
    }
}
