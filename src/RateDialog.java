public class RateDialog implements Dialog{
    @Override
    public void initialize() {
        System.out.println("initialize=>RateDialog");
    }

    @Override
    public void show() {
        System.out.println("show=>RateDialog");
    }

    @Override
    public void dismiss() {
        System.out.println("dismiss=>RateDialog");
    }
}
