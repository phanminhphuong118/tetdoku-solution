package ictgradschool.industry.tetdoku.model.shapes;

import ictgradschool.industry.tetdoku.model.CellCoordinate;
import ictgradschool.industry.tetdoku.model.CellDimension;

public class RectangularShape extends TetdokuShape {

    private CellDimension dimensions;

    public RectangularShape(int width, int height) {
        this.dimensions = new CellDimension(width, height);
    }

    @Override
    public CellDimension getSize() {
        return dimensions;
    }

    @Override
    public boolean isFilled(CellCoordinate point) {
        CellDimension size = getSize();
        return (point.getCol() >= 0 && point.getCol() < size.getWidth() &&
                point.getRow() >= 0 && point.getRow() < size.getHeight());
    }

    @Override
    public void mutate() {
        this.dimensions = new CellDimension(dimensions.getHeight(), dimensions.getWidth());
    }
}
