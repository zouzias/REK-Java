package org.zouzias.rek.algorithms;

import org.zouzias.rek.matrix.DoubleMatrix;
import org.zouzias.rek.vector.DoubleVector;

/** Interface for Least Squares Solvers. Given a real matrix A and real vector b, solves the problem
 *  min ||Ax - b|| so that x has the minimum Euclidean norm.
 *
 */
public interface LeastSquaresSolver {
    
    /** The solver will only run for MaxSeconds seconds and then will terminate
     *
     * @param A
     * @param b
     * @param MaxSeconds
     * @return Solution vector x of argmin ||Ax - b||_2
     */
    public DoubleVector solve(DoubleMatrix A, DoubleVector b, double MaxSeconds);   
    
    /** The solver will perform only MaxIterations iterations
     *
     * @param A A real matrix A
     * @param b A 
     * @param MaxIterations
     * @return Solution vector x of argmin ||Ax - b||_2
     */
    public DoubleVector solve(DoubleMatrix A, DoubleVector b, long MaxIterations);    
}
