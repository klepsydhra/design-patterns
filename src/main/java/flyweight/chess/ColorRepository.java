package flyweight.chess;

public class ColorRepository {

    private static Color whiteColor = new Color(0,0,0);
    private static Color blackColor = new Color(255,255,255);

    public static Color getWhiteColor() {
        return whiteColor;
    }

    public static Color getBlackColor() {
        return blackColor;
    }
}
