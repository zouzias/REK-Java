package org.zouzias.rek.BLAS;

import org.zouzias.rek.vector.DoubleVector;

/**
 * Basic Linear Algebra Operations (Level 1)
 *
 */
public interface BLASLevelOne {

    /**
     * Euclidean norm of vector
     *
     * @return  2-norm of vector
     */
    public abstract double DNRM2();
    /**
     * DAXPY operation y <- y + alpha * x
     *
     * @param alpha
     * @param x
     */
    public abstract void   DAXPY(double alpha, DoubleVector x); 
    /**
     * Dot product with vector x
     *
     * @param x
     * @return  Inner product with x
     */
    public abstract double DDOT(DoubleVector x); 
}
