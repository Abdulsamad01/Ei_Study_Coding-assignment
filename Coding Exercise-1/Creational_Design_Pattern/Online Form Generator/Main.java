public class Main {
    public static void main(String[] args) {
        FormFactory webFactory = new WebFormFactory();
        FormComponent webTextField = webFactory.createTextField();
        FormComponent webCheckbox = webFactory.createCheckbox();

        webTextField.render();
        webCheckbox.render();
        
        FormFactory mobileFactory = new MobileFormFactory();
        FormComponent mobileTextField = mobileFactory.createTextField();
        FormComponent mobileCheckbox = mobileFactory.createCheckbox();
        
        mobileTextField.render();
        mobileCheckbox.render();
    }
}
