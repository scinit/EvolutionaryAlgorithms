import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.EigenDecomposition;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.Covariance;
import org.apache.commons.math3.linear.*;
/**
 * Created by framg on 15/05/2016.
 */
public class Matlab {
    static double [][] eigV(double [][] m){
        RealMatrix CRealMatrix = new Array2DRowRealMatrix(m);
        EigenDecomposition eigenDecomposition = new EigenDecomposition(CRealMatrix);
        return eigenDecomposition.getV().getData();
    }

    static double [][] eigD(double [][] m){
        RealMatrix CRealMatrix = new Array2DRowRealMatrix(m);
        EigenDecomposition eigenDecomposition = new EigenDecomposition(CRealMatrix);
        return eigenDecomposition.getD().getData();
    }

    static double [][] cov (double [][] m){
        Covariance covariance = new Covariance(m);
        return covariance.getCovarianceMatrix().getData();
    }

    //Identity matrix
    static double [][] eye (int dim){
        return MatrixUtils.createRealIdentityMatrix(dim).getData();
    }

    static double [][] triu(double [][] A, int k){
        double [][] m = Util.copyMatrix(A);

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if( i < j + k){
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }


    static double [] diag (double [][] m){
        double [] a = new double[m.length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(i == j){
                    a[i] = m[i][j];
                }
            }
        }
        return a;
    }

    static double[][] diag (double [] a){
        RealMatrix matrix = MatrixUtils.createRealDiagonalMatrix(a);
        return matrix.getData();
    }

    static double det(double [][] m){
        RealMatrix matrix = new Array2DRowRealMatrix(m);
        return new LUDecomposition(matrix).getDeterminant();
    }
}