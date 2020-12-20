public class Runner {
    public static void main(String[] args) {
        DialogFactory dialogFactory = new DialogFactory();
        Dialog dialog = dialogFactory.getDialog(DialogType.EXIT);
        dialog.initialize();
        dialog.show();
    }
}
