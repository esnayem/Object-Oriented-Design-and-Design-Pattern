// 2. Concrete Component
class BasicWebPage implements WebPage {
    private String content;

    public BasicWebPage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }

    @Override
    public void load() {
        System.out.println("Basic Web Page is loading...");
    }

    @Override
    public void click() {
        System.out.println("Basic Web Page is clickable.");
    }
}
