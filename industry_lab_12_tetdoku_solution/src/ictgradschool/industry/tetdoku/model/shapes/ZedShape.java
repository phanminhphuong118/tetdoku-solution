package ictgradschool.industry.tetdoku.model.shapes;

import org.apache.commons.math3.linear.MatrixUtils;

public class ZedShape extends MatrixShape {

    private static final double[][] DATA = new double[][] {
            {1, 1, 0},
            {0, 1, 1}
    };

    public ZedShape() {
        super(MatrixUtils.createRealMatrix(DATA));
    }

}