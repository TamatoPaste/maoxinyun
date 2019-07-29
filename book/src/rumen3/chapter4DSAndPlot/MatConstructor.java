package rumen3.chapter4DSAndPlot;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

import static org.opencv.core.CvType.CV_8UC3;

public class MatConstructor {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME );}

    public static void main(String[] args) {
        Mat mat = new Mat(2, 2, CV_8UC3, new Scalar(1, 1, 2));
        System.out.println( CV_8UC3 );
        System.out.println( mat.dump());
    }
}
