package ictgradschool.industry.tetdoku.model.shapes;

import org.apache.commons.math3.linear.MatrixUtils;

public class EssShape extends MatrixShape {

    private static final double[][] DATA = new double[][] {
            {0, 1, 1},
            {1, 1, 0}
    };

    public EssShape() {
        super(MatrixUtils.createRealMatrix(DATA));
    }

}