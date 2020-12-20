public class ExitDialog implements Dialog {
    @Override
    public void initialize() {
        System.out.println("initialize=>ExitDialog");
    }

    @Override
    public void show() {
        System.out.println("show=>ExitDialog");
    }

    @Override
    public void dismiss() {
        System.out.println("dismiss=>ExitDialog");
    }
}
