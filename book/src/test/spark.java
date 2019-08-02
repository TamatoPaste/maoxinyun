package test;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class spark {
    static {    System.loadLibrary(Core.NATIVE_LIBRARY_NAME );  }
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        // depth 就是 type
        Mat matCV_8U = new Mat(100, 100, CvType.CV_8U);
        System.out.println(matCV_8U.type());
        System.out.println(matCV_8U.channels());
        System.out.println(matCV_8U.depth());

        Mat matCV_8UC1 = new Mat(100, 100, CvType.CV_8UC1);
        System.out.println(matCV_8UC1.type());
        System.out.println(matCV_8UC1.channels());
        System.out.println(matCV_8UC1.depth());

 Mat matCV_8UC3 = new Mat(100, 100, CvType.CV_8UC2);
        System.out.println(matCV_8UC3.type());
        System.out.println(matCV_8UC3.channels());
        System.out.println(matCV_8UC3.depth());

        Mat matCV_32F = new Mat(100, 100, CvType.CV_32F);
        System.out.println(matCV_32F.type());
        System.out.println(matCV_32F.channels()); //创建时没写通道，默认为1
        System.out.println(matCV_32F.depth());
    }
}
