package ictgradschool.industry.tetdoku.model.shapes;

import org.apache.commons.math3.linear.MatrixUtils;

public class BackwardsElleShape extends MatrixShape {

    private static final double[][] DATA = new double[][] {
            {0, 1},
            {0, 1},
            {1, 1}
    };

    public BackwardsElleShape() {
        super(MatrixUtils.createRealMatrix(DATA));
    }

}
