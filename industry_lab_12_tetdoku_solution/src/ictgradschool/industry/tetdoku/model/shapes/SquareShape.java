package ictgradschool.industry.tetdoku.model.shapes;

/**
 * Represents a square shape. A square shape is an n-by-n grid of cells, all of which are filled.
 */
public class SquareShape extends RectangularShape {

    /**
     * Creates a new square shape with the given size
     *
     * @param size the size of the square
     */
    public SquareShape(int size) {
        super(size, size);
    }
}
