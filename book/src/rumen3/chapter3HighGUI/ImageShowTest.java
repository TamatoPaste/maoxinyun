package rumen3.chapter3HighGUI;

import org.opencv.core.Core;
import org.opencv.core.Mat;

import static org.opencv.highgui.HighGui.*;
import static org.opencv.imgcodecs.Imgcodecs.imread;

public class ImageShowTest {
    static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}
    public static void main(String[] args) {
        Mat iamge = imread("C:\\Users\\Daye Ni\\Desktop\\1.jpg",1);
        namedWindow("test");
        imshow("test",iamge);
        waitKey(5);//实际表明并不会自动关闭窗口
    }
}
