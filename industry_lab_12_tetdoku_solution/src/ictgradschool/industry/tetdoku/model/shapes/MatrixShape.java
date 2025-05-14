package ictgradschool.industry.tetdoku.model.shapes;

import ictgradschool.industry.tetdoku.model.CellCoordinate;
import ictgradschool.industry.tetdoku.model.CellDimension;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Represents a shape which is set by a {@link RealMatrix}. "empty" spaces within the shape are represented by zeroes
 * in the matrix at those particular cell coordinates, while "filled" spaces are represented as positive values.
 * <p>
 * Each "mutate" operation rotates the matrix by 90 degrees. To do this, the operation is to first transpose
 * the matrix, then reverse the rows in the transposed matrix.
 * See: https://stackoverflow.com/questions/42519/how-do-you-rotate-a-two-dimensional-array
 * <p>
 * This class uses the Apache Commons Math library for its {@link RealMatrix} class.
 * See: http://commons.apache.org/proper/commons-math/
 *
 * @author Andrew Meads
 */
public class MatrixShape extends TetdokuShape {

    private RealMatrix matrix;

    /**
     * Creates a new matrix shape.
     *
     * @param matrix the initial matrix.
     */
    public MatrixShape(RealMatrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public CellDimension getSize() {
        return new CellDimension(matrix.getColumnDimension(), matrix.getRowDimension());
    }

    @Override
    public boolean isFilled(CellCoordinate point) {
        return matrix.getEntry(point.getRow(), point.getCol()) > 0;
    }

    /**
     * Each "mutate" operation rotates the matrix by 90 degrees. To do this, the operation is to first transpose
     * the matrix, then reverse the rows in the transposed matrix.
     * <p>
     * See: https://stackoverflow.com/questions/42519/how-do-you-rotate-a-two-dimensional-array
     */
    @Override
    public void mutate() {
        RealMatrix transposed = matrix.transpose();
        RealMatrix reversedRows = MatrixUtils.createRealMatrix(transposed.getRowDimension(), transposed.getColumnDimension());

        for (int col = 0; col < transposed.getColumnDimension(); col++) {
            for (int row = 0; row < transposed.getRowDimension(); row++) {

                double value = transposed.getEntry(row, col);
                reversedRows.setEntry(reversedRows.getRowDimension() - 1 - row, col, value);

            }
        }

        this.matrix = reversedRows;
    }
}
