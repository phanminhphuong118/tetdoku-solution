package ictgradschool.industry.tetdoku.model.shapes;

import org.apache.commons.math3.linear.MatrixUtils;

public class TeeShape extends MatrixShape {

    private static final double[][] DATA = new double[][]{
            {1, 0},
            {1, 1},
            {1, 0}
    };

    public TeeShape() {
        super(MatrixUtils.createRealMatrix(DATA));
    }
}