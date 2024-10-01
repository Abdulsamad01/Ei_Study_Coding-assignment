public class HeaderDecorator extends WebPageDecorator {
    public HeaderDecorator(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Adding header to the web page.");
    }
}
