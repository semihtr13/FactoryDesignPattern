
public class DialogFactory {
    public Dialog getDialog(DialogType dialogType) {

        if (dialogType == DialogType.EXIT) {
            return new ExitDialog();
        } else if (dialogType == DialogType.RATE) {
            return new RateDialog();
        }
        return null;

    }

}
