public class WebFormFactory implements FormFactory {
    @Override
    public FormComponent createTextField() {
        return new TextField();
    }

    @Override
    public FormComponent createCheckbox() {
        return new Checkbox();
    }
}
