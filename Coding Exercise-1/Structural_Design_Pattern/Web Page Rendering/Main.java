public class Main {
    public static void main(String[] args) {
        WebPage basicPage = new BasicWebPage();
        WebPage headerPage = new HeaderDecorator(basicPage);
        WebPage fullPage = new FooterDecorator(headerPage);

        fullPage.display();
    }
}
