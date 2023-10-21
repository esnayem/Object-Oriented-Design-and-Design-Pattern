// 3. Decorator
abstract class WebPageDecorator implements WebPage {
    private WebPage page;

    public WebPageDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public void display() {
        page.display();
    }

    @Override
    public void load() {
        page.load();
    }

    @Override
    public void click() {
        page.click();
    }
}