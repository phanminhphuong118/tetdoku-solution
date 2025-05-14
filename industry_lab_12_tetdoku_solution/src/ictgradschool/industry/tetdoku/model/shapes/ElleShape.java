package ictgradschool.industry.tetdoku.model.shapes;

import org.apache.commons.math3.linear.MatrixUtils;

public class ElleShape extends MatrixShape {

    private static final double[][] DATA = new double[][] {
            {1, 0},
            {1, 0},
            {1, 1}
    };

    public ElleShape() {
        super(MatrixUtils.createRealMatrix(DATA));
    }

}
