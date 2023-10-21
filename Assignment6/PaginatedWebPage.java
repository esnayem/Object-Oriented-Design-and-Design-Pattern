// 5. Concrete Decorator 2 - Pagination
class PaginatedWebPage extends WebPageDecorator {
    private int itemsPerPage;

    public PaginatedWebPage(WebPage page, int itemsPerPage) {
        super(page);
        this.itemsPerPage = itemsPerPage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Displaying " + itemsPerPage + " items per page.");
    }
}