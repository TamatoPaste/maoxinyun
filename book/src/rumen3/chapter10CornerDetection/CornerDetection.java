package rumen3.chapter10CornerDetection;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import static org.opencv.highgui.HighGui.imshow;
import static org.opencv.highgui.HighGui.waitKey;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;
import static org.opencv.imgproc.Imgproc.*;

public class CornerDetection {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}

    public static void main(String[] args) {
        Mat src = imread("C:\\Users\\Administrator\\Desktop\\test.png",CvType.CV_8U);


        Mat cornerStrength = new Mat( src.rows(), src.cols(), src.type());
        cornerHarris(src,cornerStrength,2,3,0.01);

        //imwrite("F:\\corner.jpg",dst);
        Mat harrisCorner = new Mat( src.rows(), src.cols(), src.type());

        threshold(cornerStrength,harrisCorner,0.00001,255,THRESH_BINARY);

        //imwrite("F:\\corner.jpg",harrisCorner);
        System.out.println(harrisCorner.type());
        System.out.println(harrisCorner.channels());

        // 图像显示不出来，java.lang.UnsupportedOperationException: Mat data type is not compatible: 5 ,经查CV_32F = 5,
        harrisCorner.convertTo(harrisCorner,CvType.CV_8S);  // 将harrisCorner变成CV_8U 或者CV_8S 就能正常显示
        imshow("角点检测后的二值效果图", harrisCorner);
        waitKey(0);

    }
}
