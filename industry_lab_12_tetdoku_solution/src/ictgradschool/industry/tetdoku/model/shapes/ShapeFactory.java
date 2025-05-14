package ictgradschool.industry.tetdoku.model.shapes;

import ictgradschool.industry.tetdoku.model.gameboard.GameBoard;

/**
 * An object that can create {@link TetdokuShape} instances intended to be placed on a
 * {@link GameBoard}.
 */
public class ShapeFactory {

    /**
     * Creates a random shape
     *
     * @return a random shape
     */
    public static TetdokuShape createRandomShape() {

        // This won't return SingleCellShape. This is deliberate - I disabled it because I didn't like it :)
        // -- Andrew M
        int shapeType = (int) (Math.random() * 7);

        switch (shapeType) {

            case 0:
                return new LineShape(4);

            case 1:
                return new SquareShape(2);

            case 2:
                return new TeeShape();

            case 3:
                return new ElleShape();

            case 4:
                return new BackwardsElleShape();

            case 5:
                return new EssShape();

            case 6:
                return new ZedShape();

            case 7:
                return new SingleCellShape();

            default:
                throw new RuntimeException("Unexpected shape type!");

        }
    }
}
