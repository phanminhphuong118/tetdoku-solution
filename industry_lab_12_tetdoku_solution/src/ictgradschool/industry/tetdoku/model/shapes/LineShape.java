package ictgradschool.industry.tetdoku.model.shapes;

/**
 * A line shape is a single line of a given length. It can be either a vertical or horizontal line.
 * <p>
 * Mutating this shape causes it to flip between vertical and horizontal modes.
 */
public class LineShape extends RectangularShape {

    /**
     * Creates a new line shape with the given length
     *
     * @param length the length
     */
    public LineShape(int length) {
        super(length, 1);
    }
}
