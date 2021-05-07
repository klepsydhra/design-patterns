package flyweight.chess;

public abstract class ChessPiece {

    private final String name;
    private final String numberPosition;
    private final String letterPosition;
    private final Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch(color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlackColor();
                break;
            default:
                this.color = ColorRepository.getWhiteColor();
                break;
        }
    }

    public Color getColor() {
        return this.color;
    }
}
