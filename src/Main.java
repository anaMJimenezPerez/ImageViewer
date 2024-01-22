import java.io.File;
public class Main {
    public static final String root = "C:/Users/anam0/Pictures/Fondos";
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        Image image = new FileImageLoader(new File(root)).load();

        frame.imageDisplay().show(image);
        frame.add("<", new PreviousImageCommand(frame.imageDisplay()));
        frame.add(">", new NextImageCommand(frame.imageDisplay()));

        frame.setVisible(true);
    }
}