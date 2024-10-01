public class FooterDecorator extends WebPageDecorator {
    public FooterDecorator(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Adding footer to the web page.");
    }
}
