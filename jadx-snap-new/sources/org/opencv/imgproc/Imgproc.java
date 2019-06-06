package org.opencv.imgproc;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfInt4;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

public class Imgproc {
    public static final int ADAPTIVE_THRESH_GAUSSIAN_C = 1;
    public static final int ADAPTIVE_THRESH_MEAN_C = 0;
    public static final int CC_STAT_AREA = 4;
    public static final int CC_STAT_HEIGHT = 3;
    public static final int CC_STAT_LEFT = 0;
    public static final int CC_STAT_MAX = 5;
    public static final int CC_STAT_TOP = 1;
    public static final int CC_STAT_WIDTH = 2;
    public static final int CHAIN_APPROX_NONE = 1;
    public static final int CHAIN_APPROX_SIMPLE = 2;
    public static final int CHAIN_APPROX_TC89_KCOS = 4;
    public static final int CHAIN_APPROX_TC89_L1 = 3;
    public static final int COLORMAP_AUTUMN = 0;
    public static final int COLORMAP_BONE = 1;
    public static final int COLORMAP_COOL = 8;
    public static final int COLORMAP_HOT = 11;
    public static final int COLORMAP_HSV = 9;
    public static final int COLORMAP_JET = 2;
    public static final int COLORMAP_OCEAN = 5;
    public static final int COLORMAP_PARULA = 12;
    public static final int COLORMAP_PINK = 10;
    public static final int COLORMAP_RAINBOW = 4;
    public static final int COLORMAP_SPRING = 7;
    public static final int COLORMAP_SUMMER = 6;
    public static final int COLORMAP_WINTER = 3;
    public static final int COLOR_BGR2BGR555 = 22;
    public static final int COLOR_BGR2BGR565 = 12;
    public static final int COLOR_BGR2BGRA = 0;
    public static final int COLOR_BGR2GRAY = 6;
    public static final int COLOR_BGR2HLS = 52;
    public static final int COLOR_BGR2HLS_FULL = 68;
    public static final int COLOR_BGR2HSV = 40;
    public static final int COLOR_BGR2HSV_FULL = 66;
    public static final int COLOR_BGR2Lab = 44;
    public static final int COLOR_BGR2Luv = 50;
    public static final int COLOR_BGR2RGB = 4;
    public static final int COLOR_BGR2RGBA = 2;
    public static final int COLOR_BGR2XYZ = 32;
    public static final int COLOR_BGR2YCrCb = 36;
    public static final int COLOR_BGR2YUV = 82;
    public static final int COLOR_BGR2YUV_I420 = 128;
    public static final int COLOR_BGR2YUV_IYUV = 128;
    public static final int COLOR_BGR2YUV_YV12 = 132;
    public static final int COLOR_BGR5552BGR = 24;
    public static final int COLOR_BGR5552BGRA = 28;
    public static final int COLOR_BGR5552GRAY = 31;
    public static final int COLOR_BGR5552RGB = 25;
    public static final int COLOR_BGR5552RGBA = 29;
    public static final int COLOR_BGR5652BGR = 14;
    public static final int COLOR_BGR5652BGRA = 18;
    public static final int COLOR_BGR5652GRAY = 21;
    public static final int COLOR_BGR5652RGB = 15;
    public static final int COLOR_BGR5652RGBA = 19;
    public static final int COLOR_BGRA2BGR = 1;
    public static final int COLOR_BGRA2BGR555 = 26;
    public static final int COLOR_BGRA2BGR565 = 16;
    public static final int COLOR_BGRA2GRAY = 10;
    public static final int COLOR_BGRA2RGB = 3;
    public static final int COLOR_BGRA2RGBA = 5;
    public static final int COLOR_BGRA2YUV_I420 = 130;
    public static final int COLOR_BGRA2YUV_IYUV = 130;
    public static final int COLOR_BGRA2YUV_YV12 = 134;
    public static final int COLOR_BayerBG2BGR = 46;
    public static final int COLOR_BayerBG2BGR_EA = 135;
    public static final int COLOR_BayerBG2BGR_VNG = 62;
    public static final int COLOR_BayerBG2GRAY = 86;
    public static final int COLOR_BayerBG2RGB = 48;
    public static final int COLOR_BayerBG2RGB_EA = 137;
    public static final int COLOR_BayerBG2RGB_VNG = 64;
    public static final int COLOR_BayerGB2BGR = 47;
    public static final int COLOR_BayerGB2BGR_EA = 136;
    public static final int COLOR_BayerGB2BGR_VNG = 63;
    public static final int COLOR_BayerGB2GRAY = 87;
    public static final int COLOR_BayerGB2RGB = 49;
    public static final int COLOR_BayerGB2RGB_EA = 138;
    public static final int COLOR_BayerGB2RGB_VNG = 65;
    public static final int COLOR_BayerGR2BGR = 49;
    public static final int COLOR_BayerGR2BGR_EA = 138;
    public static final int COLOR_BayerGR2BGR_VNG = 65;
    public static final int COLOR_BayerGR2GRAY = 89;
    public static final int COLOR_BayerGR2RGB = 47;
    public static final int COLOR_BayerGR2RGB_EA = 136;
    public static final int COLOR_BayerGR2RGB_VNG = 63;
    public static final int COLOR_BayerRG2BGR = 48;
    public static final int COLOR_BayerRG2BGR_EA = 137;
    public static final int COLOR_BayerRG2BGR_VNG = 64;
    public static final int COLOR_BayerRG2GRAY = 88;
    public static final int COLOR_BayerRG2RGB = 46;
    public static final int COLOR_BayerRG2RGB_EA = 135;
    public static final int COLOR_BayerRG2RGB_VNG = 62;
    public static final int COLOR_COLORCVT_MAX = 139;
    public static final int COLOR_GRAY2BGR = 8;
    public static final int COLOR_GRAY2BGR555 = 30;
    public static final int COLOR_GRAY2BGR565 = 20;
    public static final int COLOR_GRAY2BGRA = 9;
    public static final int COLOR_GRAY2RGB = 8;
    public static final int COLOR_GRAY2RGBA = 9;
    public static final int COLOR_HLS2BGR = 60;
    public static final int COLOR_HLS2BGR_FULL = 72;
    public static final int COLOR_HLS2RGB = 61;
    public static final int COLOR_HLS2RGB_FULL = 73;
    public static final int COLOR_HSV2BGR = 54;
    public static final int COLOR_HSV2BGR_FULL = 70;
    public static final int COLOR_HSV2RGB = 55;
    public static final int COLOR_HSV2RGB_FULL = 71;
    public static final int COLOR_LBGR2Lab = 74;
    public static final int COLOR_LBGR2Luv = 76;
    public static final int COLOR_LRGB2Lab = 75;
    public static final int COLOR_LRGB2Luv = 77;
    public static final int COLOR_Lab2BGR = 56;
    public static final int COLOR_Lab2LBGR = 78;
    public static final int COLOR_Lab2LRGB = 79;
    public static final int COLOR_Lab2RGB = 57;
    public static final int COLOR_Luv2BGR = 58;
    public static final int COLOR_Luv2LBGR = 80;
    public static final int COLOR_Luv2LRGB = 81;
    public static final int COLOR_Luv2RGB = 59;
    public static final int COLOR_RGB2BGR = 4;
    public static final int COLOR_RGB2BGR555 = 23;
    public static final int COLOR_RGB2BGR565 = 13;
    public static final int COLOR_RGB2BGRA = 2;
    public static final int COLOR_RGB2GRAY = 7;
    public static final int COLOR_RGB2HLS = 53;
    public static final int COLOR_RGB2HLS_FULL = 69;
    public static final int COLOR_RGB2HSV = 41;
    public static final int COLOR_RGB2HSV_FULL = 67;
    public static final int COLOR_RGB2Lab = 45;
    public static final int COLOR_RGB2Luv = 51;
    public static final int COLOR_RGB2RGBA = 0;
    public static final int COLOR_RGB2XYZ = 33;
    public static final int COLOR_RGB2YCrCb = 37;
    public static final int COLOR_RGB2YUV = 83;
    public static final int COLOR_RGB2YUV_I420 = 127;
    public static final int COLOR_RGB2YUV_IYUV = 127;
    public static final int COLOR_RGB2YUV_YV12 = 131;
    public static final int COLOR_RGBA2BGR = 3;
    public static final int COLOR_RGBA2BGR555 = 27;
    public static final int COLOR_RGBA2BGR565 = 17;
    public static final int COLOR_RGBA2BGRA = 5;
    public static final int COLOR_RGBA2GRAY = 11;
    public static final int COLOR_RGBA2RGB = 1;
    public static final int COLOR_RGBA2YUV_I420 = 129;
    public static final int COLOR_RGBA2YUV_IYUV = 129;
    public static final int COLOR_RGBA2YUV_YV12 = 133;
    public static final int COLOR_RGBA2mRGBA = 125;
    public static final int COLOR_XYZ2BGR = 34;
    public static final int COLOR_XYZ2RGB = 35;
    public static final int COLOR_YCrCb2BGR = 38;
    public static final int COLOR_YCrCb2RGB = 39;
    public static final int COLOR_YUV2BGR = 84;
    public static final int COLOR_YUV2BGRA_I420 = 105;
    public static final int COLOR_YUV2BGRA_IYUV = 105;
    public static final int COLOR_YUV2BGRA_NV12 = 95;
    public static final int COLOR_YUV2BGRA_NV21 = 97;
    public static final int COLOR_YUV2BGRA_UYNV = 112;
    public static final int COLOR_YUV2BGRA_UYVY = 112;
    public static final int COLOR_YUV2BGRA_Y422 = 112;
    public static final int COLOR_YUV2BGRA_YUNV = 120;
    public static final int COLOR_YUV2BGRA_YUY2 = 120;
    public static final int COLOR_YUV2BGRA_YUYV = 120;
    public static final int COLOR_YUV2BGRA_YV12 = 103;
    public static final int COLOR_YUV2BGRA_YVYU = 122;
    public static final int COLOR_YUV2BGR_I420 = 101;
    public static final int COLOR_YUV2BGR_IYUV = 101;
    public static final int COLOR_YUV2BGR_NV12 = 91;
    public static final int COLOR_YUV2BGR_NV21 = 93;
    public static final int COLOR_YUV2BGR_UYNV = 108;
    public static final int COLOR_YUV2BGR_UYVY = 108;
    public static final int COLOR_YUV2BGR_Y422 = 108;
    public static final int COLOR_YUV2BGR_YUNV = 116;
    public static final int COLOR_YUV2BGR_YUY2 = 116;
    public static final int COLOR_YUV2BGR_YUYV = 116;
    public static final int COLOR_YUV2BGR_YV12 = 99;
    public static final int COLOR_YUV2BGR_YVYU = 118;
    public static final int COLOR_YUV2GRAY_420 = 106;
    public static final int COLOR_YUV2GRAY_I420 = 106;
    public static final int COLOR_YUV2GRAY_IYUV = 106;
    public static final int COLOR_YUV2GRAY_NV12 = 106;
    public static final int COLOR_YUV2GRAY_NV21 = 106;
    public static final int COLOR_YUV2GRAY_UYNV = 123;
    public static final int COLOR_YUV2GRAY_UYVY = 123;
    public static final int COLOR_YUV2GRAY_Y422 = 123;
    public static final int COLOR_YUV2GRAY_YUNV = 124;
    public static final int COLOR_YUV2GRAY_YUY2 = 124;
    public static final int COLOR_YUV2GRAY_YUYV = 124;
    public static final int COLOR_YUV2GRAY_YV12 = 106;
    public static final int COLOR_YUV2GRAY_YVYU = 124;
    public static final int COLOR_YUV2RGB = 85;
    public static final int COLOR_YUV2RGBA_I420 = 104;
    public static final int COLOR_YUV2RGBA_IYUV = 104;
    public static final int COLOR_YUV2RGBA_NV12 = 94;
    public static final int COLOR_YUV2RGBA_NV21 = 96;
    public static final int COLOR_YUV2RGBA_UYNV = 111;
    public static final int COLOR_YUV2RGBA_UYVY = 111;
    public static final int COLOR_YUV2RGBA_Y422 = 111;
    public static final int COLOR_YUV2RGBA_YUNV = 119;
    public static final int COLOR_YUV2RGBA_YUY2 = 119;
    public static final int COLOR_YUV2RGBA_YUYV = 119;
    public static final int COLOR_YUV2RGBA_YV12 = 102;
    public static final int COLOR_YUV2RGBA_YVYU = 121;
    public static final int COLOR_YUV2RGB_I420 = 100;
    public static final int COLOR_YUV2RGB_IYUV = 100;
    public static final int COLOR_YUV2RGB_NV12 = 90;
    public static final int COLOR_YUV2RGB_NV21 = 92;
    public static final int COLOR_YUV2RGB_UYNV = 107;
    public static final int COLOR_YUV2RGB_UYVY = 107;
    public static final int COLOR_YUV2RGB_Y422 = 107;
    public static final int COLOR_YUV2RGB_YUNV = 115;
    public static final int COLOR_YUV2RGB_YUY2 = 115;
    public static final int COLOR_YUV2RGB_YUYV = 115;
    public static final int COLOR_YUV2RGB_YV12 = 98;
    public static final int COLOR_YUV2RGB_YVYU = 117;
    public static final int COLOR_YUV420p2BGR = 99;
    public static final int COLOR_YUV420p2BGRA = 103;
    public static final int COLOR_YUV420p2GRAY = 106;
    public static final int COLOR_YUV420p2RGB = 98;
    public static final int COLOR_YUV420p2RGBA = 102;
    public static final int COLOR_YUV420sp2BGR = 93;
    public static final int COLOR_YUV420sp2BGRA = 97;
    public static final int COLOR_YUV420sp2GRAY = 106;
    public static final int COLOR_YUV420sp2RGB = 92;
    public static final int COLOR_YUV420sp2RGBA = 96;
    public static final int COLOR_mRGBA2RGBA = 126;
    public static final int CV_BILATERAL = 4;
    public static final int CV_BLUR = 1;
    public static final int CV_BLUR_NO_SCALE = 0;
    public static final int CV_CANNY_L2_GRADIENT = Integer.MIN_VALUE;
    private static final int CV_CHAIN_APPROX_NONE = 1;
    private static final int CV_CHAIN_APPROX_SIMPLE = 2;
    private static final int CV_CHAIN_APPROX_TC89_KCOS = 4;
    private static final int CV_CHAIN_APPROX_TC89_L1 = 3;
    public static final int CV_CHAIN_CODE = 0;
    public static final int CV_CLOCKWISE = 1;
    public static final int CV_COMP_BHATTACHARYYA = 3;
    public static final int CV_COMP_CHISQR = 1;
    public static final int CV_COMP_CHISQR_ALT = 4;
    public static final int CV_COMP_CORREL = 0;
    public static final int CV_COMP_HELLINGER = 3;
    public static final int CV_COMP_INTERSECT = 2;
    public static final int CV_COMP_KL_DIV = 5;
    public static final int CV_CONTOURS_MATCH_I1 = 1;
    public static final int CV_CONTOURS_MATCH_I2 = 2;
    public static final int CV_CONTOURS_MATCH_I3 = 3;
    public static final int CV_COUNTER_CLOCKWISE = 2;
    public static final int CV_DIST_C = 3;
    public static final int CV_DIST_FAIR = 5;
    public static final int CV_DIST_HUBER = 7;
    public static final int CV_DIST_L1 = 1;
    public static final int CV_DIST_L12 = 4;
    public static final int CV_DIST_L2 = 2;
    public static final int CV_DIST_LABEL_CCOMP = 0;
    public static final int CV_DIST_LABEL_PIXEL = 1;
    public static final int CV_DIST_MASK_3 = 3;
    public static final int CV_DIST_MASK_5 = 5;
    public static final int CV_DIST_MASK_PRECISE = 0;
    public static final int CV_DIST_USER = -1;
    public static final int CV_DIST_WELSCH = 6;
    public static final int CV_GAUSSIAN = 2;
    public static final int CV_GAUSSIAN_5x5 = 7;
    public static final int CV_HOUGH_GRADIENT = 3;
    public static final int CV_HOUGH_MULTI_SCALE = 2;
    public static final int CV_HOUGH_PROBABILISTIC = 1;
    public static final int CV_HOUGH_STANDARD = 0;
    private static final int CV_INTER_AREA = 3;
    private static final int CV_INTER_CUBIC = 2;
    private static final int CV_INTER_LANCZOS4 = 4;
    private static final int CV_INTER_LINEAR = 1;
    private static final int CV_INTER_NN = 0;
    public static final int CV_LINK_RUNS = 5;
    public static final int CV_MAX_SOBEL_KSIZE = 7;
    public static final int CV_MEDIAN = 3;
    private static final int CV_MOP_BLACKHAT = 6;
    private static final int CV_MOP_CLOSE = 3;
    private static final int CV_MOP_DILATE = 1;
    private static final int CV_MOP_ERODE = 0;
    private static final int CV_MOP_GRADIENT = 4;
    private static final int CV_MOP_OPEN = 2;
    private static final int CV_MOP_TOPHAT = 5;
    public static final int CV_POLY_APPROX_DP = 0;
    private static final int CV_RETR_CCOMP = 2;
    private static final int CV_RETR_EXTERNAL = 0;
    private static final int CV_RETR_FLOODFILL = 4;
    private static final int CV_RETR_LIST = 1;
    private static final int CV_RETR_TREE = 3;
    public static final int CV_RGBA2mRGBA = 125;
    public static final int CV_SCHARR = -1;
    public static final int CV_SHAPE_CROSS = 1;
    public static final int CV_SHAPE_CUSTOM = 100;
    public static final int CV_SHAPE_ELLIPSE = 2;
    public static final int CV_SHAPE_RECT = 0;
    private static final int CV_THRESH_BINARY = 0;
    private static final int CV_THRESH_BINARY_INV = 1;
    private static final int CV_THRESH_MASK = 7;
    private static final int CV_THRESH_OTSU = 8;
    private static final int CV_THRESH_TOZERO = 3;
    private static final int CV_THRESH_TOZERO_INV = 4;
    private static final int CV_THRESH_TRIANGLE = 16;
    private static final int CV_THRESH_TRUNC = 2;
    public static final int CV_WARP_FILL_OUTLIERS = 8;
    public static final int CV_WARP_INVERSE_MAP = 16;
    public static final int CV_mRGBA2RGBA = 126;
    public static final int DIST_C = 3;
    public static final int DIST_FAIR = 5;
    public static final int DIST_HUBER = 7;
    public static final int DIST_L1 = 1;
    public static final int DIST_L12 = 4;
    public static final int DIST_L2 = 2;
    public static final int DIST_LABEL_CCOMP = 0;
    public static final int DIST_LABEL_PIXEL = 1;
    public static final int DIST_MASK_3 = 3;
    public static final int DIST_MASK_5 = 5;
    public static final int DIST_MASK_PRECISE = 0;
    public static final int DIST_USER = -1;
    public static final int DIST_WELSCH = 6;
    public static final int FLOODFILL_FIXED_RANGE = 65536;
    public static final int FLOODFILL_MASK_ONLY = 131072;
    public static final int GC_BGD = 0;
    public static final int GC_EVAL = 2;
    public static final int GC_FGD = 1;
    public static final int GC_INIT_WITH_MASK = 1;
    public static final int GC_INIT_WITH_RECT = 0;
    public static final int GC_PR_BGD = 2;
    public static final int GC_PR_FGD = 3;
    public static final int HISTCMP_BHATTACHARYYA = 3;
    public static final int HISTCMP_CHISQR = 1;
    public static final int HISTCMP_CHISQR_ALT = 4;
    public static final int HISTCMP_CORREL = 0;
    public static final int HISTCMP_HELLINGER = 3;
    public static final int HISTCMP_INTERSECT = 2;
    public static final int HISTCMP_KL_DIV = 5;
    public static final int HOUGH_GRADIENT = 3;
    public static final int HOUGH_MULTI_SCALE = 2;
    public static final int HOUGH_PROBABILISTIC = 1;
    public static final int HOUGH_STANDARD = 0;
    public static final int INTERSECT_FULL = 2;
    public static final int INTERSECT_NONE = 0;
    public static final int INTERSECT_PARTIAL = 1;
    public static final int INTER_AREA = 3;
    public static final int INTER_BITS = 5;
    public static final int INTER_BITS2 = 10;
    public static final int INTER_CUBIC = 2;
    public static final int INTER_LANCZOS4 = 4;
    public static final int INTER_LINEAR = 1;
    public static final int INTER_MAX = 7;
    public static final int INTER_NEAREST = 0;
    public static final int INTER_TAB_SIZE = 32;
    public static final int INTER_TAB_SIZE2 = 1024;
    private static final int IPL_BORDER_CONSTANT = 0;
    private static final int IPL_BORDER_REFLECT = 2;
    private static final int IPL_BORDER_REFLECT_101 = 4;
    private static final int IPL_BORDER_REPLICATE = 1;
    private static final int IPL_BORDER_TRANSPARENT = 5;
    private static final int IPL_BORDER_WRAP = 3;
    public static final int LINE_4 = 4;
    public static final int LINE_8 = 8;
    public static final int LINE_AA = 16;
    public static final int LSD_REFINE_ADV = 2;
    public static final int LSD_REFINE_NONE = 0;
    public static final int LSD_REFINE_STD = 1;
    public static final int MARKER_CROSS = 0;
    public static final int MARKER_DIAMOND = 3;
    public static final int MARKER_SQUARE = 4;
    public static final int MARKER_STAR = 2;
    public static final int MARKER_TILTED_CROSS = 1;
    public static final int MARKER_TRIANGLE_DOWN = 6;
    public static final int MARKER_TRIANGLE_UP = 5;
    public static final int MORPH_BLACKHAT = 6;
    public static final int MORPH_CLOSE = 3;
    public static final int MORPH_CROSS = 1;
    public static final int MORPH_DILATE = 1;
    public static final int MORPH_ELLIPSE = 2;
    public static final int MORPH_ERODE = 0;
    public static final int MORPH_GRADIENT = 4;
    public static final int MORPH_HITMISS = 7;
    public static final int MORPH_OPEN = 2;
    public static final int MORPH_RECT = 0;
    public static final int MORPH_TOPHAT = 5;
    public static final int PROJ_SPHERICAL_EQRECT = 1;
    public static final int PROJ_SPHERICAL_ORTHO = 0;
    public static final int RETR_CCOMP = 2;
    public static final int RETR_EXTERNAL = 0;
    public static final int RETR_FLOODFILL = 4;
    public static final int RETR_LIST = 1;
    public static final int RETR_TREE = 3;
    public static final int THRESH_BINARY = 0;
    public static final int THRESH_BINARY_INV = 1;
    public static final int THRESH_MASK = 7;
    public static final int THRESH_OTSU = 8;
    public static final int THRESH_TOZERO = 3;
    public static final int THRESH_TOZERO_INV = 4;
    public static final int THRESH_TRIANGLE = 16;
    public static final int THRESH_TRUNC = 2;
    public static final int TM_CCOEFF = 4;
    public static final int TM_CCOEFF_NORMED = 5;
    public static final int TM_CCORR = 2;
    public static final int TM_CCORR_NORMED = 3;
    public static final int TM_SQDIFF = 0;
    public static final int TM_SQDIFF_NORMED = 1;
    public static final int WARP_FILL_OUTLIERS = 8;
    public static final int WARP_INVERSE_MAP = 16;

    public static void Canny(Mat mat, Mat mat2, double d, double d2) {
        Canny_1(mat.nativeObj, mat2.nativeObj, d, d2);
    }

    public static void Canny(Mat mat, Mat mat2, double d, double d2, int i, boolean z) {
        Canny_0(mat.nativeObj, mat2.nativeObj, d, d2, i, z);
    }

    private static native void Canny_0(long j, long j2, double d, double d2, int i, boolean z);

    private static native void Canny_1(long j, long j2, double d, double d2);

    public static void GaussianBlur(Mat mat, Mat mat2, Size size, double d) {
        GaussianBlur_2(mat.nativeObj, mat2.nativeObj, size.width, size.height, d);
    }

    public static void GaussianBlur(Mat mat, Mat mat2, Size size, double d, double d2) {
        Size size2 = size;
        GaussianBlur_1(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, d, d2);
    }

    public static void GaussianBlur(Mat mat, Mat mat2, Size size, double d, double d2, int i) {
        Size size2 = size;
        GaussianBlur_0(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, d, d2, i);
    }

    private static native void GaussianBlur_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void GaussianBlur_1(long j, long j2, double d, double d2, double d3, double d4);

    private static native void GaussianBlur_2(long j, long j2, double d, double d2, double d3);

    public static void HoughCircles(Mat mat, Mat mat2, int i, double d, double d2) {
        HoughCircles_1(mat.nativeObj, mat2.nativeObj, i, d, d2);
    }

    public static void HoughCircles(Mat mat, Mat mat2, int i, double d, double d2, double d3, double d4, int i2, int i3) {
        HoughCircles_0(mat.nativeObj, mat2.nativeObj, i, d, d2, d3, d4, i2, i3);
    }

    private static native void HoughCircles_0(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3);

    private static native void HoughCircles_1(long j, long j2, int i, double d, double d2);

    public static void HoughLines(Mat mat, Mat mat2, double d, double d2, int i) {
        HoughLines_1(mat.nativeObj, mat2.nativeObj, d, d2, i);
    }

    public static void HoughLines(Mat mat, Mat mat2, double d, double d2, int i, double d3, double d4, double d5, double d6) {
        HoughLines_0(mat.nativeObj, mat2.nativeObj, d, d2, i, d3, d4, d5, d6);
    }

    public static void HoughLinesP(Mat mat, Mat mat2, double d, double d2, int i) {
        HoughLinesP_1(mat.nativeObj, mat2.nativeObj, d, d2, i);
    }

    public static void HoughLinesP(Mat mat, Mat mat2, double d, double d2, int i, double d3, double d4) {
        HoughLinesP_0(mat.nativeObj, mat2.nativeObj, d, d2, i, d3, d4);
    }

    private static native void HoughLinesP_0(long j, long j2, double d, double d2, int i, double d3, double d4);

    private static native void HoughLinesP_1(long j, long j2, double d, double d2, int i);

    private static native void HoughLines_0(long j, long j2, double d, double d2, int i, double d3, double d4, double d5, double d6);

    private static native void HoughLines_1(long j, long j2, double d, double d2, int i);

    public static void HuMoments(Moments moments, Mat mat) {
        Moments moments2 = moments;
        HuMoments_0(moments2.m00, moments2.m10, moments2.m01, moments2.m20, moments2.m11, moments2.m02, moments2.m30, moments2.m21, moments2.m12, moments2.m03, mat.nativeObj);
    }

    private static native void HuMoments_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, long j);

    public static void Laplacian(Mat mat, Mat mat2, int i) {
        Laplacian_2(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void Laplacian(Mat mat, Mat mat2, int i, int i2, double d, double d2) {
        Laplacian_1(mat.nativeObj, mat2.nativeObj, i, i2, d, d2);
    }

    public static void Laplacian(Mat mat, Mat mat2, int i, int i2, double d, double d2, int i3) {
        Laplacian_0(mat.nativeObj, mat2.nativeObj, i, i2, d, d2, i3);
    }

    private static native void Laplacian_0(long j, long j2, int i, int i2, double d, double d2, int i3);

    private static native void Laplacian_1(long j, long j2, int i, int i2, double d, double d2);

    private static native void Laplacian_2(long j, long j2, int i);

    public static void Scharr(Mat mat, Mat mat2, int i, int i2, int i3) {
        Scharr_2(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    public static void Scharr(Mat mat, Mat mat2, int i, int i2, int i3, double d, double d2) {
        Scharr_1(mat.nativeObj, mat2.nativeObj, i, i2, i3, d, d2);
    }

    public static void Scharr(Mat mat, Mat mat2, int i, int i2, int i3, double d, double d2, int i4) {
        Scharr_0(mat.nativeObj, mat2.nativeObj, i, i2, i3, d, d2, i4);
    }

    private static native void Scharr_0(long j, long j2, int i, int i2, int i3, double d, double d2, int i4);

    private static native void Scharr_1(long j, long j2, int i, int i2, int i3, double d, double d2);

    private static native void Scharr_2(long j, long j2, int i, int i2, int i3);

    public static void Sobel(Mat mat, Mat mat2, int i, int i2, int i3) {
        Sobel_2(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    public static void Sobel(Mat mat, Mat mat2, int i, int i2, int i3, int i4, double d, double d2) {
        Sobel_1(mat.nativeObj, mat2.nativeObj, i, i2, i3, i4, d, d2);
    }

    public static void Sobel(Mat mat, Mat mat2, int i, int i2, int i3, int i4, double d, double d2, int i5) {
        Sobel_0(mat.nativeObj, mat2.nativeObj, i, i2, i3, i4, d, d2, i5);
    }

    private static native void Sobel_0(long j, long j2, int i, int i2, int i3, int i4, double d, double d2, int i5);

    private static native void Sobel_1(long j, long j2, int i, int i2, int i3, int i4, double d, double d2);

    private static native void Sobel_2(long j, long j2, int i, int i2, int i3);

    public static void accumulate(Mat mat, Mat mat2) {
        accumulate_1(mat.nativeObj, mat2.nativeObj);
    }

    public static void accumulate(Mat mat, Mat mat2, Mat mat3) {
        accumulate_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void accumulateProduct(Mat mat, Mat mat2, Mat mat3) {
        accumulateProduct_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void accumulateProduct(Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        accumulateProduct_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj);
    }

    private static native void accumulateProduct_0(long j, long j2, long j3, long j4);

    private static native void accumulateProduct_1(long j, long j2, long j3);

    public static void accumulateSquare(Mat mat, Mat mat2) {
        accumulateSquare_1(mat.nativeObj, mat2.nativeObj);
    }

    public static void accumulateSquare(Mat mat, Mat mat2, Mat mat3) {
        accumulateSquare_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    private static native void accumulateSquare_0(long j, long j2, long j3);

    private static native void accumulateSquare_1(long j, long j2);

    public static void accumulateWeighted(Mat mat, Mat mat2, double d) {
        accumulateWeighted_1(mat.nativeObj, mat2.nativeObj, d);
    }

    public static void accumulateWeighted(Mat mat, Mat mat2, double d, Mat mat3) {
        accumulateWeighted_0(mat.nativeObj, mat2.nativeObj, d, mat3.nativeObj);
    }

    private static native void accumulateWeighted_0(long j, long j2, double d, long j3);

    private static native void accumulateWeighted_1(long j, long j2, double d);

    private static native void accumulate_0(long j, long j2, long j3);

    private static native void accumulate_1(long j, long j2);

    public static void adaptiveThreshold(Mat mat, Mat mat2, double d, int i, int i2, int i3, double d2) {
        adaptiveThreshold_0(mat.nativeObj, mat2.nativeObj, d, i, i2, i3, d2);
    }

    private static native void adaptiveThreshold_0(long j, long j2, double d, int i, int i2, int i3, double d2);

    public static void applyColorMap(Mat mat, Mat mat2, int i) {
        applyColorMap_0(mat.nativeObj, mat2.nativeObj, i);
    }

    private static native void applyColorMap_0(long j, long j2, int i);

    public static void approxPolyDP(MatOfPoint2f matOfPoint2f, MatOfPoint2f matOfPoint2f2, double d, boolean z) {
        approxPolyDP_0(matOfPoint2f.nativeObj, matOfPoint2f2.nativeObj, d, z);
    }

    private static native void approxPolyDP_0(long j, long j2, double d, boolean z);

    public static double arcLength(MatOfPoint2f matOfPoint2f, boolean z) {
        return arcLength_0(matOfPoint2f.nativeObj, z);
    }

    private static native double arcLength_0(long j, boolean z);

    public static void arrowedLine(Mat mat, Point point, Point point2, Scalar scalar) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        arrowedLine_1(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void arrowedLine(Mat mat, Point point, Point point2, Scalar scalar, int i, int i2, int i3, double d) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        arrowedLine_0(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3, d);
    }

    private static native void arrowedLine_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3, double d9);

    private static native void arrowedLine_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public static void bilateralFilter(Mat mat, Mat mat2, int i, double d, double d2) {
        bilateralFilter_1(mat.nativeObj, mat2.nativeObj, i, d, d2);
    }

    public static void bilateralFilter(Mat mat, Mat mat2, int i, double d, double d2, int i2) {
        bilateralFilter_0(mat.nativeObj, mat2.nativeObj, i, d, d2, i2);
    }

    private static native void bilateralFilter_0(long j, long j2, int i, double d, double d2, int i2);

    private static native void bilateralFilter_1(long j, long j2, int i, double d, double d2);

    public static void blur(Mat mat, Mat mat2, Size size) {
        blur_2(mat.nativeObj, mat2.nativeObj, size.width, size.height);
    }

    public static void blur(Mat mat, Mat mat2, Size size, Point point) {
        blur_1(mat.nativeObj, mat2.nativeObj, size.width, size.height, point.x, point.y);
    }

    public static void blur(Mat mat, Mat mat2, Size size, Point point, int i) {
        Size size2 = size;
        Point point2 = point;
        blur_0(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, point2.x, point2.y, i);
    }

    private static native void blur_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void blur_1(long j, long j2, double d, double d2, double d3, double d4);

    private static native void blur_2(long j, long j2, double d, double d2);

    public static Rect boundingRect(MatOfPoint matOfPoint) {
        return new Rect(boundingRect_0(matOfPoint.nativeObj));
    }

    private static native double[] boundingRect_0(long j);

    public static void boxFilter(Mat mat, Mat mat2, int i, Size size) {
        boxFilter_2(mat.nativeObj, mat2.nativeObj, i, size.width, size.height);
    }

    public static void boxFilter(Mat mat, Mat mat2, int i, Size size, Point point, boolean z) {
        Size size2 = size;
        Point point2 = point;
        boxFilter_1(mat.nativeObj, mat2.nativeObj, i, size2.width, size2.height, point2.x, point2.y, z);
    }

    public static void boxFilter(Mat mat, Mat mat2, int i, Size size, Point point, boolean z, int i2) {
        Size size2 = size;
        Point point2 = point;
        boxFilter_0(mat.nativeObj, mat2.nativeObj, i, size2.width, size2.height, point2.x, point2.y, z, i2);
    }

    private static native void boxFilter_0(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z, int i2);

    private static native void boxFilter_1(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z);

    private static native void boxFilter_2(long j, long j2, int i, double d, double d2);

    public static void boxPoints(RotatedRect rotatedRect, Mat mat) {
        boxPoints_0(rotatedRect.center.x, rotatedRect.center.y, rotatedRect.size.width, rotatedRect.size.height, rotatedRect.angle, mat.nativeObj);
    }

    private static native void boxPoints_0(double d, double d2, double d3, double d4, double d5, long j);

    public static void calcBackProject(List<Mat> list, MatOfInt matOfInt, Mat mat, Mat mat2, MatOfFloat matOfFloat, double d) {
        calcBackProject_0(Converters.vector_Mat_to_Mat(list).nativeObj, matOfInt.nativeObj, mat.nativeObj, mat2.nativeObj, matOfFloat.nativeObj, d);
    }

    private static native void calcBackProject_0(long j, long j2, long j3, long j4, long j5, double d);

    public static void calcHist(List<Mat> list, MatOfInt matOfInt, Mat mat, Mat mat2, MatOfInt matOfInt2, MatOfFloat matOfFloat) {
        calcHist_1(Converters.vector_Mat_to_Mat(list).nativeObj, matOfInt.nativeObj, mat.nativeObj, mat2.nativeObj, matOfInt2.nativeObj, matOfFloat.nativeObj);
    }

    public static void calcHist(List<Mat> list, MatOfInt matOfInt, Mat mat, Mat mat2, MatOfInt matOfInt2, MatOfFloat matOfFloat, boolean z) {
        calcHist_0(Converters.vector_Mat_to_Mat(list).nativeObj, matOfInt.nativeObj, mat.nativeObj, mat2.nativeObj, matOfInt2.nativeObj, matOfFloat.nativeObj, z);
    }

    private static native void calcHist_0(long j, long j2, long j3, long j4, long j5, long j6, boolean z);

    private static native void calcHist_1(long j, long j2, long j3, long j4, long j5, long j6);

    public static void circle(Mat mat, Point point, int i, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        circle_2(mat.nativeObj, point2.x, point2.y, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void circle(Mat mat, Point point, int i, Scalar scalar, int i2) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        circle_1(mat.nativeObj, point2.x, point2.y, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2);
    }

    public static void circle(Mat mat, Point point, int i, Scalar scalar, int i2, int i3, int i4) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        circle_0(mat.nativeObj, point2.x, point2.y, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2, i3, i4);
    }

    private static native void circle_0(long j, double d, double d2, int i, double d3, double d4, double d5, double d6, int i2, int i3, int i4);

    private static native void circle_1(long j, double d, double d2, int i, double d3, double d4, double d5, double d6, int i2);

    private static native void circle_2(long j, double d, double d2, int i, double d3, double d4, double d5, double d6);

    public static boolean clipLine(Rect rect, Point point, Point point2) {
        Rect rect2 = rect;
        Point point3 = point;
        Point point4 = point2;
        double[] dArr = new double[2];
        double[] dArr2 = new double[2];
        double[] dArr3 = dArr;
        boolean clipLine_0 = clipLine_0(rect2.x, rect2.y, rect2.width, rect2.height, point3.x, point3.y, dArr, point4.x, point4.y, dArr2);
        Point point5 = point;
        if (point5 != null) {
            point5.x = dArr3[0];
            point5.y = dArr3[1];
        }
        if (point4 != null) {
            point4.x = dArr2[0];
            point4.y = dArr2[1];
        }
        return clipLine_0;
    }

    private static native boolean clipLine_0(int i, int i2, int i3, int i4, double d, double d2, double[] dArr, double d3, double d4, double[] dArr2);

    public static double compareHist(Mat mat, Mat mat2, int i) {
        return compareHist_0(mat.nativeObj, mat2.nativeObj, i);
    }

    private static native double compareHist_0(long j, long j2, int i);

    public static int connectedComponents(Mat mat, Mat mat2) {
        return connectedComponents_1(mat.nativeObj, mat2.nativeObj);
    }

    public static int connectedComponents(Mat mat, Mat mat2, int i, int i2) {
        return connectedComponents_0(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    public static int connectedComponentsWithStats(Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        return connectedComponentsWithStats_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj);
    }

    public static int connectedComponentsWithStats(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i, int i2) {
        return connectedComponentsWithStats_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i, i2);
    }

    private static native int connectedComponentsWithStats_0(long j, long j2, long j3, long j4, int i, int i2);

    private static native int connectedComponentsWithStats_1(long j, long j2, long j3, long j4);

    private static native int connectedComponents_0(long j, long j2, int i, int i2);

    private static native int connectedComponents_1(long j, long j2);

    public static double contourArea(Mat mat) {
        return contourArea_1(mat.nativeObj);
    }

    public static double contourArea(Mat mat, boolean z) {
        return contourArea_0(mat.nativeObj, z);
    }

    private static native double contourArea_0(long j, boolean z);

    private static native double contourArea_1(long j);

    public static void convertMaps(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i) {
        convertMaps_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i);
    }

    public static void convertMaps(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i, boolean z) {
        convertMaps_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i, z);
    }

    private static native void convertMaps_0(long j, long j2, long j3, long j4, int i, boolean z);

    private static native void convertMaps_1(long j, long j2, long j3, long j4, int i);

    public static void convexHull(MatOfPoint matOfPoint, MatOfInt matOfInt) {
        convexHull_1(matOfPoint.nativeObj, matOfInt.nativeObj);
    }

    public static void convexHull(MatOfPoint matOfPoint, MatOfInt matOfInt, boolean z) {
        convexHull_0(matOfPoint.nativeObj, matOfInt.nativeObj, z);
    }

    private static native void convexHull_0(long j, long j2, boolean z);

    private static native void convexHull_1(long j, long j2);

    public static void convexityDefects(MatOfPoint matOfPoint, MatOfInt matOfInt, MatOfInt4 matOfInt4) {
        convexityDefects_0(matOfPoint.nativeObj, matOfInt.nativeObj, matOfInt4.nativeObj);
    }

    private static native void convexityDefects_0(long j, long j2, long j3);

    public static void cornerEigenValsAndVecs(Mat mat, Mat mat2, int i, int i2) {
        cornerEigenValsAndVecs_1(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    public static void cornerEigenValsAndVecs(Mat mat, Mat mat2, int i, int i2, int i3) {
        cornerEigenValsAndVecs_0(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    private static native void cornerEigenValsAndVecs_0(long j, long j2, int i, int i2, int i3);

    private static native void cornerEigenValsAndVecs_1(long j, long j2, int i, int i2);

    public static void cornerHarris(Mat mat, Mat mat2, int i, int i2, double d) {
        cornerHarris_1(mat.nativeObj, mat2.nativeObj, i, i2, d);
    }

    public static void cornerHarris(Mat mat, Mat mat2, int i, int i2, double d, int i3) {
        cornerHarris_0(mat.nativeObj, mat2.nativeObj, i, i2, d, i3);
    }

    private static native void cornerHarris_0(long j, long j2, int i, int i2, double d, int i3);

    private static native void cornerHarris_1(long j, long j2, int i, int i2, double d);

    public static void cornerMinEigenVal(Mat mat, Mat mat2, int i) {
        cornerMinEigenVal_2(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void cornerMinEigenVal(Mat mat, Mat mat2, int i, int i2) {
        cornerMinEigenVal_1(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    public static void cornerMinEigenVal(Mat mat, Mat mat2, int i, int i2, int i3) {
        cornerMinEigenVal_0(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    private static native void cornerMinEigenVal_0(long j, long j2, int i, int i2, int i3);

    private static native void cornerMinEigenVal_1(long j, long j2, int i, int i2);

    private static native void cornerMinEigenVal_2(long j, long j2, int i);

    public static void cornerSubPix(Mat mat, MatOfPoint2f matOfPoint2f, Size size, Size size2, TermCriteria termCriteria) {
        Size size3 = size;
        Size size4 = size2;
        TermCriteria termCriteria2 = termCriteria;
        long j = mat.nativeObj;
        long j2 = matOfPoint2f.nativeObj;
        double d = size3.width;
        double d2 = size3.height;
        double d3 = size4.width;
        double d4 = size4.height;
        int i = termCriteria2.type;
        int i2 = termCriteria2.maxCount;
        int i3 = i;
        cornerSubPix_0(j, j2, d, d2, d3, d4, i3, i2, termCriteria2.epsilon);
    }

    private static native void cornerSubPix_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2, double d5);

    public static CLAHE createCLAHE() {
        return new CLAHE(createCLAHE_1());
    }

    public static CLAHE createCLAHE(double d, Size size) {
        return new CLAHE(createCLAHE_0(d, size.width, size.height));
    }

    private static native long createCLAHE_0(double d, double d2, double d3);

    private static native long createCLAHE_1();

    public static void createHanningWindow(Mat mat, Size size, int i) {
        createHanningWindow_0(mat.nativeObj, size.width, size.height, i);
    }

    private static native void createHanningWindow_0(long j, double d, double d2, int i);

    public static LineSegmentDetector createLineSegmentDetector() {
        return new LineSegmentDetector(createLineSegmentDetector_1());
    }

    public static LineSegmentDetector createLineSegmentDetector(int i, double d, double d2, double d3, double d4, double d5, double d6, int i2) {
        return new LineSegmentDetector(createLineSegmentDetector_0(i, d, d2, d3, d4, d5, d6, i2));
    }

    private static native long createLineSegmentDetector_0(int i, double d, double d2, double d3, double d4, double d5, double d6, int i2);

    private static native long createLineSegmentDetector_1();

    public static void cvtColor(Mat mat, Mat mat2, int i) {
        cvtColor_1(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void cvtColor(Mat mat, Mat mat2, int i, int i2) {
        cvtColor_0(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    private static native void cvtColor_0(long j, long j2, int i, int i2);

    private static native void cvtColor_1(long j, long j2, int i);

    public static void demosaicing(Mat mat, Mat mat2, int i) {
        demosaicing_1(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void demosaicing(Mat mat, Mat mat2, int i, int i2) {
        demosaicing_0(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    private static native void demosaicing_0(long j, long j2, int i, int i2);

    private static native void demosaicing_1(long j, long j2, int i);

    public static void dilate(Mat mat, Mat mat2, Mat mat3) {
        dilate_2(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void dilate(Mat mat, Mat mat2, Mat mat3, Point point, int i) {
        dilate_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, point.x, point.y, i);
    }

    public static void dilate(Mat mat, Mat mat2, Mat mat3, Point point, int i, int i2, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        dilate_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, point2.x, point2.y, i, i2, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void dilate_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void dilate_1(long j, long j2, long j3, double d, double d2, int i);

    private static native void dilate_2(long j, long j2, long j3);

    public static void distanceTransform(Mat mat, Mat mat2, int i, int i2) {
        distanceTransform_1(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    public static void distanceTransform(Mat mat, Mat mat2, int i, int i2, int i3) {
        distanceTransform_0(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    public static void distanceTransformWithLabels(Mat mat, Mat mat2, Mat mat3, int i, int i2) {
        distanceTransformWithLabels_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i, i2);
    }

    public static void distanceTransformWithLabels(Mat mat, Mat mat2, Mat mat3, int i, int i2, int i3) {
        distanceTransformWithLabels_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i, i2, i3);
    }

    private static native void distanceTransformWithLabels_0(long j, long j2, long j3, int i, int i2, int i3);

    private static native void distanceTransformWithLabels_1(long j, long j2, long j3, int i, int i2);

    private static native void distanceTransform_0(long j, long j2, int i, int i2, int i3);

    private static native void distanceTransform_1(long j, long j2, int i, int i2);

    public static void drawContours(Mat mat, List<MatOfPoint> list, int i, Scalar scalar) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        drawContours_2(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void drawContours(Mat mat, List<MatOfPoint> list, int i, Scalar scalar, int i2) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        drawContours_1(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2);
    }

    public static void drawContours(Mat mat, List<MatOfPoint> list, int i, Scalar scalar, int i2, int i3, Mat mat2, int i4, Point point) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        Point point2 = point;
        drawContours_0(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, i, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2, i3, mat2.nativeObj, i4, point2.x, point2.y);
    }

    private static native void drawContours_0(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3, long j3, int i4, double d5, double d6);

    private static native void drawContours_1(long j, long j2, int i, double d, double d2, double d3, double d4, int i2);

    private static native void drawContours_2(long j, long j2, int i, double d, double d2, double d3, double d4);

    public static void drawMarker(Mat mat, Point point, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        drawMarker_1(mat.nativeObj, point2.x, point2.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void drawMarker(Mat mat, Point point, Scalar scalar, int i, int i2, int i3, int i4) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        drawMarker_0(mat.nativeObj, point2.x, point2.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3, i4);
    }

    private static native void drawMarker_0(long j, double d, double d2, double d3, double d4, double d5, double d6, int i, int i2, int i3, int i4);

    private static native void drawMarker_1(long j, double d, double d2, double d3, double d4, double d5, double d6);

    public static void ellipse(Mat mat, Point point, Size size, double d, double d2, double d3, Scalar scalar) {
        Point point2 = point;
        Size size2 = size;
        Scalar scalar2 = scalar;
        ellipse_2(mat.nativeObj, point2.x, point2.y, size2.width, size2.height, d, d2, d3, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void ellipse(Mat mat, Point point, Size size, double d, double d2, double d3, Scalar scalar, int i) {
        Point point2 = point;
        Size size2 = size;
        Scalar scalar2 = scalar;
        ellipse_1(mat.nativeObj, point2.x, point2.y, size2.width, size2.height, d, d2, d3, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i);
    }

    public static void ellipse(Mat mat, Point point, Size size, double d, double d2, double d3, Scalar scalar, int i, int i2, int i3) {
        Point point2 = point;
        Size size2 = size;
        Scalar scalar2 = scalar;
        ellipse_0(mat.nativeObj, point2.x, point2.y, size2.width, size2.height, d, d2, d3, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3);
    }

    public static void ellipse(Mat mat, RotatedRect rotatedRect, Scalar scalar) {
        RotatedRect rotatedRect2 = rotatedRect;
        Scalar scalar2 = scalar;
        ellipse_5(mat.nativeObj, rotatedRect2.center.x, rotatedRect2.center.y, rotatedRect2.size.width, rotatedRect2.size.height, rotatedRect2.angle, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void ellipse(Mat mat, RotatedRect rotatedRect, Scalar scalar, int i) {
        RotatedRect rotatedRect2 = rotatedRect;
        Scalar scalar2 = scalar;
        ellipse_4(mat.nativeObj, rotatedRect2.center.x, rotatedRect2.center.y, rotatedRect2.size.width, rotatedRect2.size.height, rotatedRect2.angle, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i);
    }

    public static void ellipse(Mat mat, RotatedRect rotatedRect, Scalar scalar, int i, int i2) {
        RotatedRect rotatedRect2 = rotatedRect;
        Scalar scalar2 = scalar;
        ellipse_3(mat.nativeObj, rotatedRect2.center.x, rotatedRect2.center.y, rotatedRect2.size.width, rotatedRect2.size.height, rotatedRect2.angle, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2);
    }

    public static void ellipse2Poly(Point point, Size size, int i, int i2, int i3, int i4, MatOfPoint matOfPoint) {
        Point point2 = point;
        Size size2 = size;
        ellipse2Poly_0(point2.x, point2.y, size2.width, size2.height, i, i2, i3, i4, matOfPoint.nativeObj);
    }

    private static native void ellipse2Poly_0(double d, double d2, double d3, double d4, int i, int i2, int i3, int i4, long j);

    private static native void ellipse_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, int i, int i2, int i3);

    private static native void ellipse_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, int i);

    private static native void ellipse_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11);

    private static native void ellipse_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i, int i2);

    private static native void ellipse_4(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i);

    private static native void ellipse_5(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    public static void equalizeHist(Mat mat, Mat mat2) {
        equalizeHist_0(mat.nativeObj, mat2.nativeObj);
    }

    private static native void equalizeHist_0(long j, long j2);

    public static void erode(Mat mat, Mat mat2, Mat mat3) {
        erode_2(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void erode(Mat mat, Mat mat2, Mat mat3, Point point, int i) {
        erode_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, point.x, point.y, i);
    }

    public static void erode(Mat mat, Mat mat2, Mat mat3, Point point, int i, int i2, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        erode_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, point2.x, point2.y, i, i2, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void erode_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void erode_1(long j, long j2, long j3, double d, double d2, int i);

    private static native void erode_2(long j, long j2, long j3);

    public static void fillConvexPoly(Mat mat, MatOfPoint matOfPoint, Scalar scalar) {
        fillConvexPoly_1(mat.nativeObj, matOfPoint.nativeObj, scalar.val[0], scalar.val[1], scalar.val[2], scalar.val[3]);
    }

    public static void fillConvexPoly(Mat mat, MatOfPoint matOfPoint, Scalar scalar, int i, int i2) {
        Scalar scalar2 = scalar;
        fillConvexPoly_0(mat.nativeObj, matOfPoint.nativeObj, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2);
    }

    private static native void fillConvexPoly_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2);

    private static native void fillConvexPoly_1(long j, long j2, double d, double d2, double d3, double d4);

    public static void fillPoly(Mat mat, List<MatOfPoint> list, Scalar scalar) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        fillPoly_1(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void fillPoly(Mat mat, List<MatOfPoint> list, Scalar scalar, int i, int i2, Point point) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        Point point2 = point;
        fillPoly_0(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, point2.x, point2.y);
    }

    private static native void fillPoly_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2, double d5, double d6);

    private static native void fillPoly_1(long j, long j2, double d, double d2, double d3, double d4);

    public static void filter2D(Mat mat, Mat mat2, int i, Mat mat3) {
        filter2D_2(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj);
    }

    public static void filter2D(Mat mat, Mat mat2, int i, Mat mat3, Point point, double d) {
        Point point2 = point;
        filter2D_1(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, point2.x, point2.y, d);
    }

    public static void filter2D(Mat mat, Mat mat2, int i, Mat mat3, Point point, double d, int i2) {
        Point point2 = point;
        filter2D_0(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, point2.x, point2.y, d, i2);
    }

    private static native void filter2D_0(long j, long j2, int i, long j3, double d, double d2, double d3, int i2);

    private static native void filter2D_1(long j, long j2, int i, long j3, double d, double d2, double d3);

    private static native void filter2D_2(long j, long j2, int i, long j3);

    public static void findContours(Mat mat, List<MatOfPoint> list, Mat mat2, int i, int i2) {
        Mat mat3 = new Mat();
        findContours_1(mat.nativeObj, mat3.nativeObj, mat2.nativeObj, i, i2);
        Converters.Mat_to_vector_vector_Point(mat3, list);
        mat3.release();
    }

    public static void findContours(Mat mat, List<MatOfPoint> list, Mat mat2, int i, int i2, Point point) {
        Point point2 = point;
        Mat mat3 = new Mat();
        findContours_0(mat.nativeObj, mat3.nativeObj, mat2.nativeObj, i, i2, point2.x, point2.y);
        List<MatOfPoint> list2 = list;
        Converters.Mat_to_vector_vector_Point(mat3, list);
        mat3.release();
    }

    private static native void findContours_0(long j, long j2, long j3, int i, int i2, double d, double d2);

    private static native void findContours_1(long j, long j2, long j3, int i, int i2);

    public static RotatedRect fitEllipse(MatOfPoint2f matOfPoint2f) {
        return new RotatedRect(fitEllipse_0(matOfPoint2f.nativeObj));
    }

    private static native double[] fitEllipse_0(long j);

    public static void fitLine(Mat mat, Mat mat2, int i, double d, double d2, double d3) {
        fitLine_0(mat.nativeObj, mat2.nativeObj, i, d, d2, d3);
    }

    private static native void fitLine_0(long j, long j2, int i, double d, double d2, double d3);

    public static int floodFill(Mat mat, Mat mat2, Point point, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        return floodFill_1(mat.nativeObj, mat2.nativeObj, point2.x, point2.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static int floodFill(Mat mat, Mat mat2, Point point, Scalar scalar, Rect rect, Scalar scalar2, Scalar scalar3, int i) {
        Point point2 = point;
        Scalar scalar4 = scalar;
        Rect rect2 = rect;
        Scalar scalar5 = scalar2;
        Scalar scalar6 = scalar3;
        int i2 = i;
        double[] dArr = new double[4];
        double[] dArr2 = dArr;
        double[] dArr3 = dArr;
        int floodFill_0 = floodFill_0(mat.nativeObj, mat2.nativeObj, point2.x, point2.y, scalar4.val[0], scalar4.val[1], scalar4.val[2], scalar4.val[3], dArr2, scalar5.val[0], scalar5.val[1], scalar5.val[2], scalar5.val[3], scalar6.val[0], scalar6.val[1], scalar6.val[2], scalar6.val[3], i2);
        if (rect2 != null) {
            rect2.x = (int) dArr3[0];
            rect2.y = (int) dArr3[1];
            rect2.width = (int) dArr3[2];
            rect2.height = (int) dArr3[3];
        }
        return floodFill_0;
    }

    private static native int floodFill_0(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i);

    private static native int floodFill_1(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6);

    public static Mat getAffineTransform(MatOfPoint2f matOfPoint2f, MatOfPoint2f matOfPoint2f2) {
        return new Mat(getAffineTransform_0(matOfPoint2f.nativeObj, matOfPoint2f2.nativeObj));
    }

    private static native long getAffineTransform_0(long j, long j2);

    public static Mat getDefaultNewCameraMatrix(Mat mat) {
        return new Mat(getDefaultNewCameraMatrix_1(mat.nativeObj));
    }

    public static Mat getDefaultNewCameraMatrix(Mat mat, Size size, boolean z) {
        return new Mat(getDefaultNewCameraMatrix_0(mat.nativeObj, size.width, size.height, z));
    }

    private static native long getDefaultNewCameraMatrix_0(long j, double d, double d2, boolean z);

    private static native long getDefaultNewCameraMatrix_1(long j);

    public static void getDerivKernels(Mat mat, Mat mat2, int i, int i2, int i3) {
        getDerivKernels_1(mat.nativeObj, mat2.nativeObj, i, i2, i3);
    }

    public static void getDerivKernels(Mat mat, Mat mat2, int i, int i2, int i3, boolean z, int i4) {
        getDerivKernels_0(mat.nativeObj, mat2.nativeObj, i, i2, i3, z, i4);
    }

    private static native void getDerivKernels_0(long j, long j2, int i, int i2, int i3, boolean z, int i4);

    private static native void getDerivKernels_1(long j, long j2, int i, int i2, int i3);

    public static Mat getGaborKernel(Size size, double d, double d2, double d3, double d4) {
        Size size2 = size;
        return new Mat(getGaborKernel_1(size2.width, size2.height, d, d2, d3, d4));
    }

    public static Mat getGaborKernel(Size size, double d, double d2, double d3, double d4, double d5, int i) {
        Size size2 = size;
        return new Mat(getGaborKernel_0(size2.width, size2.height, d, d2, d3, d4, d5, i));
    }

    private static native long getGaborKernel_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i);

    private static native long getGaborKernel_1(double d, double d2, double d3, double d4, double d5, double d6);

    public static Mat getGaussianKernel(int i, double d) {
        return new Mat(getGaussianKernel_1(i, d));
    }

    public static Mat getGaussianKernel(int i, double d, int i2) {
        return new Mat(getGaussianKernel_0(i, d, i2));
    }

    private static native long getGaussianKernel_0(int i, double d, int i2);

    private static native long getGaussianKernel_1(int i, double d);

    public static Mat getPerspectiveTransform(Mat mat, Mat mat2) {
        return new Mat(getPerspectiveTransform_0(mat.nativeObj, mat2.nativeObj));
    }

    private static native long getPerspectiveTransform_0(long j, long j2);

    public static void getRectSubPix(Mat mat, Size size, Point point, Mat mat2) {
        getRectSubPix_1(mat.nativeObj, size.width, size.height, point.x, point.y, mat2.nativeObj);
    }

    public static void getRectSubPix(Mat mat, Size size, Point point, Mat mat2, int i) {
        Size size2 = size;
        Point point2 = point;
        getRectSubPix_0(mat.nativeObj, size2.width, size2.height, point2.x, point2.y, mat2.nativeObj, i);
    }

    private static native void getRectSubPix_0(long j, double d, double d2, double d3, double d4, long j2, int i);

    private static native void getRectSubPix_1(long j, double d, double d2, double d3, double d4, long j2);

    public static Mat getRotationMatrix2D(Point point, double d, double d2) {
        return new Mat(getRotationMatrix2D_0(point.x, point.y, d, d2));
    }

    private static native long getRotationMatrix2D_0(double d, double d2, double d3, double d4);

    public static Mat getStructuringElement(int i, Size size) {
        return new Mat(getStructuringElement_1(i, size.width, size.height));
    }

    public static Mat getStructuringElement(int i, Size size, Point point) {
        return new Mat(getStructuringElement_0(i, size.width, size.height, point.x, point.y));
    }

    private static native long getStructuringElement_0(int i, double d, double d2, double d3, double d4);

    private static native long getStructuringElement_1(int i, double d, double d2);

    public static Size getTextSize(String str, int i, double d, int i2, int[] iArr) {
        if (iArr == null || iArr.length == 1) {
            return new Size(n_getTextSize(str, i, d, i2, iArr));
        }
        throw new IllegalArgumentException("'baseLine' must be 'int[1]' or 'null'.");
    }

    public static void goodFeaturesToTrack(Mat mat, MatOfPoint matOfPoint, int i, double d, double d2) {
        goodFeaturesToTrack_1(mat.nativeObj, matOfPoint.nativeObj, i, d, d2);
    }

    public static void goodFeaturesToTrack(Mat mat, MatOfPoint matOfPoint, int i, double d, double d2, Mat mat2, int i2, boolean z, double d3) {
        goodFeaturesToTrack_0(mat.nativeObj, matOfPoint.nativeObj, i, d, d2, mat2.nativeObj, i2, z, d3);
    }

    private static native void goodFeaturesToTrack_0(long j, long j2, int i, double d, double d2, long j3, int i2, boolean z, double d3);

    private static native void goodFeaturesToTrack_1(long j, long j2, int i, double d, double d2);

    public static void grabCut(Mat mat, Mat mat2, Rect rect, Mat mat3, Mat mat4, int i) {
        Rect rect2 = rect;
        grabCut_1(mat.nativeObj, mat2.nativeObj, rect2.x, rect2.y, rect2.width, rect2.height, mat3.nativeObj, mat4.nativeObj, i);
    }

    public static void grabCut(Mat mat, Mat mat2, Rect rect, Mat mat3, Mat mat4, int i, int i2) {
        Rect rect2 = rect;
        grabCut_0(mat.nativeObj, mat2.nativeObj, rect2.x, rect2.y, rect2.width, rect2.height, mat3.nativeObj, mat4.nativeObj, i, i2);
    }

    private static native void grabCut_0(long j, long j2, int i, int i2, int i3, int i4, long j3, long j4, int i5, int i6);

    private static native void grabCut_1(long j, long j2, int i, int i2, int i3, int i4, long j3, long j4, int i5);

    public static void initUndistortRectifyMap(Mat mat, Mat mat2, Mat mat3, Mat mat4, Size size, int i, Mat mat5, Mat mat6) {
        Size size2 = size;
        int i2 = i;
        initUndistortRectifyMap_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, size2.width, size2.height, i2, mat5.nativeObj, mat6.nativeObj);
    }

    private static native void initUndistortRectifyMap_0(long j, long j2, long j3, long j4, double d, double d2, int i, long j5, long j6);

    public static float initWideAngleProjMap(Mat mat, Mat mat2, Size size, int i, int i2, Mat mat3, Mat mat4) {
        Size size2 = size;
        return initWideAngleProjMap_1(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, i, i2, mat3.nativeObj, mat4.nativeObj);
    }

    public static float initWideAngleProjMap(Mat mat, Mat mat2, Size size, int i, int i2, Mat mat3, Mat mat4, int i3, double d) {
        Size size2 = size;
        return initWideAngleProjMap_0(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, i, i2, mat3.nativeObj, mat4.nativeObj, i3, d);
    }

    private static native float initWideAngleProjMap_0(long j, long j2, double d, double d2, int i, int i2, long j3, long j4, int i3, double d3);

    private static native float initWideAngleProjMap_1(long j, long j2, double d, double d2, int i, int i2, long j3, long j4);

    public static void integral(Mat mat, Mat mat2) {
        integral_1(mat.nativeObj, mat2.nativeObj);
    }

    public static void integral(Mat mat, Mat mat2, int i) {
        integral_0(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void integral2(Mat mat, Mat mat2, Mat mat3) {
        integral2_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void integral2(Mat mat, Mat mat2, Mat mat3, int i, int i2) {
        integral2_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i, i2);
    }

    private static native void integral2_0(long j, long j2, long j3, int i, int i2);

    private static native void integral2_1(long j, long j2, long j3);

    public static void integral3(Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        integral3_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj);
    }

    public static void integral3(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i, int i2) {
        integral3_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i, i2);
    }

    private static native void integral3_0(long j, long j2, long j3, long j4, int i, int i2);

    private static native void integral3_1(long j, long j2, long j3, long j4);

    private static native void integral_0(long j, long j2, int i);

    private static native void integral_1(long j, long j2);

    public static float intersectConvexConvex(Mat mat, Mat mat2, Mat mat3) {
        return intersectConvexConvex_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static float intersectConvexConvex(Mat mat, Mat mat2, Mat mat3, boolean z) {
        return intersectConvexConvex_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, z);
    }

    private static native float intersectConvexConvex_0(long j, long j2, long j3, boolean z);

    private static native float intersectConvexConvex_1(long j, long j2, long j3);

    public static void invertAffineTransform(Mat mat, Mat mat2) {
        invertAffineTransform_0(mat.nativeObj, mat2.nativeObj);
    }

    private static native void invertAffineTransform_0(long j, long j2);

    public static boolean isContourConvex(MatOfPoint matOfPoint) {
        return isContourConvex_0(matOfPoint.nativeObj);
    }

    private static native boolean isContourConvex_0(long j);

    public static void line(Mat mat, Point point, Point point2, Scalar scalar) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        line_2(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void line(Mat mat, Point point, Point point2, Scalar scalar, int i) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        line_1(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i);
    }

    public static void line(Mat mat, Point point, Point point2, Scalar scalar, int i, int i2, int i3) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        line_0(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3);
    }

    private static native void line_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3);

    private static native void line_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i);

    private static native void line_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public static void linearPolar(Mat mat, Mat mat2, Point point, double d, int i) {
        Point point2 = point;
        linearPolar_0(mat.nativeObj, mat2.nativeObj, point2.x, point2.y, d, i);
    }

    private static native void linearPolar_0(long j, long j2, double d, double d2, double d3, int i);

    public static void logPolar(Mat mat, Mat mat2, Point point, double d, int i) {
        Point point2 = point;
        logPolar_0(mat.nativeObj, mat2.nativeObj, point2.x, point2.y, d, i);
    }

    private static native void logPolar_0(long j, long j2, double d, double d2, double d3, int i);

    public static double matchShapes(Mat mat, Mat mat2, int i, double d) {
        return matchShapes_0(mat.nativeObj, mat2.nativeObj, i, d);
    }

    private static native double matchShapes_0(long j, long j2, int i, double d);

    public static void matchTemplate(Mat mat, Mat mat2, Mat mat3, int i) {
        matchTemplate_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i);
    }

    public static void matchTemplate(Mat mat, Mat mat2, Mat mat3, int i, Mat mat4) {
        matchTemplate_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i, mat4.nativeObj);
    }

    private static native void matchTemplate_0(long j, long j2, long j3, int i, long j4);

    private static native void matchTemplate_1(long j, long j2, long j3, int i);

    public static void medianBlur(Mat mat, Mat mat2, int i) {
        medianBlur_0(mat.nativeObj, mat2.nativeObj, i);
    }

    private static native void medianBlur_0(long j, long j2, int i);

    public static RotatedRect minAreaRect(MatOfPoint2f matOfPoint2f) {
        return new RotatedRect(minAreaRect_0(matOfPoint2f.nativeObj));
    }

    private static native double[] minAreaRect_0(long j);

    public static void minEnclosingCircle(MatOfPoint2f matOfPoint2f, Point point, float[] fArr) {
        double[] dArr = new double[2];
        double[] dArr2 = new double[1];
        minEnclosingCircle_0(matOfPoint2f.nativeObj, dArr, dArr2);
        if (point != null) {
            point.x = dArr[0];
            point.y = dArr[1];
        }
        if (fArr != null) {
            fArr[0] = (float) dArr2[0];
        }
    }

    private static native void minEnclosingCircle_0(long j, double[] dArr, double[] dArr2);

    public static double minEnclosingTriangle(Mat mat, Mat mat2) {
        return minEnclosingTriangle_0(mat.nativeObj, mat2.nativeObj);
    }

    private static native double minEnclosingTriangle_0(long j, long j2);

    public static Moments moments(Mat mat) {
        return new Moments(moments_1(mat.nativeObj));
    }

    public static Moments moments(Mat mat, boolean z) {
        return new Moments(moments_0(mat.nativeObj, z));
    }

    private static native double[] moments_0(long j, boolean z);

    private static native double[] moments_1(long j);

    public static void morphologyEx(Mat mat, Mat mat2, int i, Mat mat3) {
        morphologyEx_2(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj);
    }

    public static void morphologyEx(Mat mat, Mat mat2, int i, Mat mat3, Point point, int i2) {
        Point point2 = point;
        morphologyEx_1(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, point2.x, point2.y, i2);
    }

    public static void morphologyEx(Mat mat, Mat mat2, int i, Mat mat3, Point point, int i2, int i3, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        morphologyEx_0(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, point2.x, point2.y, i2, i3, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void morphologyEx_0(long j, long j2, int i, long j3, double d, double d2, int i2, int i3, double d3, double d4, double d5, double d6);

    private static native void morphologyEx_1(long j, long j2, int i, long j3, double d, double d2, int i2);

    private static native void morphologyEx_2(long j, long j2, int i, long j3);

    private static native double[] n_getTextSize(String str, int i, double d, int i2, int[] iArr);

    public static Point phaseCorrelate(Mat mat, Mat mat2) {
        return new Point(phaseCorrelate_1(mat.nativeObj, mat2.nativeObj));
    }

    public static Point phaseCorrelate(Mat mat, Mat mat2, Mat mat3, double[] dArr) {
        double[] dArr2 = new double[1];
        Point point = new Point(phaseCorrelate_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, dArr2));
        if (dArr != null) {
            dArr[0] = dArr2[0];
        }
        return point;
    }

    private static native double[] phaseCorrelate_0(long j, long j2, long j3, double[] dArr);

    private static native double[] phaseCorrelate_1(long j, long j2);

    public static double pointPolygonTest(MatOfPoint2f matOfPoint2f, Point point, boolean z) {
        return pointPolygonTest_0(matOfPoint2f.nativeObj, point.x, point.y, z);
    }

    private static native double pointPolygonTest_0(long j, double d, double d2, boolean z);

    public static void polylines(Mat mat, List<MatOfPoint> list, boolean z, Scalar scalar) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        polylines_2(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, z, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void polylines(Mat mat, List<MatOfPoint> list, boolean z, Scalar scalar, int i) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        polylines_1(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, z, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i);
    }

    public static void polylines(Mat mat, List<MatOfPoint> list, boolean z, Scalar scalar, int i, int i2, int i3) {
        List<MatOfPoint> list2 = list;
        Scalar scalar2 = scalar;
        polylines_0(mat.nativeObj, Converters.vector_vector_Point_to_Mat(list2, new ArrayList(list2 != null ? list.size() : 0)).nativeObj, z, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3);
    }

    private static native void polylines_0(long j, long j2, boolean z, double d, double d2, double d3, double d4, int i, int i2, int i3);

    private static native void polylines_1(long j, long j2, boolean z, double d, double d2, double d3, double d4, int i);

    private static native void polylines_2(long j, long j2, boolean z, double d, double d2, double d3, double d4);

    public static void preCornerDetect(Mat mat, Mat mat2, int i) {
        preCornerDetect_1(mat.nativeObj, mat2.nativeObj, i);
    }

    public static void preCornerDetect(Mat mat, Mat mat2, int i, int i2) {
        preCornerDetect_0(mat.nativeObj, mat2.nativeObj, i, i2);
    }

    private static native void preCornerDetect_0(long j, long j2, int i, int i2);

    private static native void preCornerDetect_1(long j, long j2, int i);

    public static void putText(Mat mat, String str, Point point, int i, double d, Scalar scalar) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        putText_2(mat.nativeObj, str, point2.x, point2.y, i, d, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void putText(Mat mat, String str, Point point, int i, double d, Scalar scalar, int i2) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        putText_1(mat.nativeObj, str, point2.x, point2.y, i, d, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2);
    }

    public static void putText(Mat mat, String str, Point point, int i, double d, Scalar scalar, int i2, int i3, boolean z) {
        Point point2 = point;
        Scalar scalar2 = scalar;
        putText_0(mat.nativeObj, str, point2.x, point2.y, i, d, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i2, i3, z);
    }

    private static native void putText_0(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7, int i2, int i3, boolean z);

    private static native void putText_1(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7, int i2);

    private static native void putText_2(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7);

    public static void pyrDown(Mat mat, Mat mat2) {
        pyrDown_2(mat.nativeObj, mat2.nativeObj);
    }

    public static void pyrDown(Mat mat, Mat mat2, Size size) {
        pyrDown_1(mat.nativeObj, mat2.nativeObj, size.width, size.height);
    }

    public static void pyrDown(Mat mat, Mat mat2, Size size, int i) {
        pyrDown_0(mat.nativeObj, mat2.nativeObj, size.width, size.height, i);
    }

    private static native void pyrDown_0(long j, long j2, double d, double d2, int i);

    private static native void pyrDown_1(long j, long j2, double d, double d2);

    private static native void pyrDown_2(long j, long j2);

    public static void pyrMeanShiftFiltering(Mat mat, Mat mat2, double d, double d2) {
        pyrMeanShiftFiltering_1(mat.nativeObj, mat2.nativeObj, d, d2);
    }

    public static void pyrMeanShiftFiltering(Mat mat, Mat mat2, double d, double d2, int i, TermCriteria termCriteria) {
        TermCriteria termCriteria2 = termCriteria;
        long j = mat.nativeObj;
        pyrMeanShiftFiltering_0(j, mat2.nativeObj, d, d2, i, termCriteria2.type, termCriteria2.maxCount, termCriteria2.epsilon);
    }

    private static native void pyrMeanShiftFiltering_0(long j, long j2, double d, double d2, int i, int i2, int i3, double d3);

    private static native void pyrMeanShiftFiltering_1(long j, long j2, double d, double d2);

    public static void pyrUp(Mat mat, Mat mat2) {
        pyrUp_2(mat.nativeObj, mat2.nativeObj);
    }

    public static void pyrUp(Mat mat, Mat mat2, Size size) {
        pyrUp_1(mat.nativeObj, mat2.nativeObj, size.width, size.height);
    }

    public static void pyrUp(Mat mat, Mat mat2, Size size, int i) {
        pyrUp_0(mat.nativeObj, mat2.nativeObj, size.width, size.height, i);
    }

    private static native void pyrUp_0(long j, long j2, double d, double d2, int i);

    private static native void pyrUp_1(long j, long j2, double d, double d2);

    private static native void pyrUp_2(long j, long j2);

    public static void rectangle(Mat mat, Point point, Point point2, Scalar scalar) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        rectangle_2(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    public static void rectangle(Mat mat, Point point, Point point2, Scalar scalar, int i) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        rectangle_1(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i);
    }

    public static void rectangle(Mat mat, Point point, Point point2, Scalar scalar, int i, int i2, int i3) {
        Point point3 = point;
        Point point4 = point2;
        Scalar scalar2 = scalar;
        rectangle_0(mat.nativeObj, point3.x, point3.y, point4.x, point4.y, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3], i, i2, i3);
    }

    private static native void rectangle_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3);

    private static native void rectangle_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i);

    private static native void rectangle_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public static void remap(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i) {
        remap_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i);
    }

    public static void remap(Mat mat, Mat mat2, Mat mat3, Mat mat4, int i, int i2, Scalar scalar) {
        Scalar scalar2 = scalar;
        remap_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, i, i2, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void remap_0(long j, long j2, long j3, long j4, int i, int i2, double d, double d2, double d3, double d4);

    private static native void remap_1(long j, long j2, long j3, long j4, int i);

    public static void resize(Mat mat, Mat mat2, Size size) {
        resize_1(mat.nativeObj, mat2.nativeObj, size.width, size.height);
    }

    public static void resize(Mat mat, Mat mat2, Size size, double d, double d2, int i) {
        Size size2 = size;
        resize_0(mat.nativeObj, mat2.nativeObj, size2.width, size2.height, d, d2, i);
    }

    private static native void resize_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void resize_1(long j, long j2, double d, double d2);

    public static int rotatedRectangleIntersection(RotatedRect rotatedRect, RotatedRect rotatedRect2, Mat mat) {
        RotatedRect rotatedRect3 = rotatedRect;
        RotatedRect rotatedRect4 = rotatedRect2;
        return rotatedRectangleIntersection_0(rotatedRect3.center.x, rotatedRect3.center.y, rotatedRect3.size.width, rotatedRect3.size.height, rotatedRect3.angle, rotatedRect4.center.x, rotatedRect4.center.y, rotatedRect4.size.width, rotatedRect4.size.height, rotatedRect4.angle, mat.nativeObj);
    }

    private static native int rotatedRectangleIntersection_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, long j);

    public static void sepFilter2D(Mat mat, Mat mat2, int i, Mat mat3, Mat mat4) {
        sepFilter2D_2(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, mat4.nativeObj);
    }

    public static void sepFilter2D(Mat mat, Mat mat2, int i, Mat mat3, Mat mat4, Point point, double d) {
        Point point2 = point;
        sepFilter2D_1(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, mat4.nativeObj, point2.x, point2.y, d);
    }

    public static void sepFilter2D(Mat mat, Mat mat2, int i, Mat mat3, Mat mat4, Point point, double d, int i2) {
        Point point2 = point;
        sepFilter2D_0(mat.nativeObj, mat2.nativeObj, i, mat3.nativeObj, mat4.nativeObj, point2.x, point2.y, d, i2);
    }

    private static native void sepFilter2D_0(long j, long j2, int i, long j3, long j4, double d, double d2, double d3, int i2);

    private static native void sepFilter2D_1(long j, long j2, int i, long j3, long j4, double d, double d2, double d3);

    private static native void sepFilter2D_2(long j, long j2, int i, long j3, long j4);

    public static void spatialGradient(Mat mat, Mat mat2, Mat mat3) {
        spatialGradient_2(mat.nativeObj, mat2.nativeObj, mat3.nativeObj);
    }

    public static void spatialGradient(Mat mat, Mat mat2, Mat mat3, int i) {
        spatialGradient_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i);
    }

    public static void spatialGradient(Mat mat, Mat mat2, Mat mat3, int i, int i2) {
        spatialGradient_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, i, i2);
    }

    private static native void spatialGradient_0(long j, long j2, long j3, int i, int i2);

    private static native void spatialGradient_1(long j, long j2, long j3, int i);

    private static native void spatialGradient_2(long j, long j2, long j3);

    public static void sqrBoxFilter(Mat mat, Mat mat2, int i, Size size) {
        sqrBoxFilter_2(mat.nativeObj, mat2.nativeObj, i, size.width, size.height);
    }

    public static void sqrBoxFilter(Mat mat, Mat mat2, int i, Size size, Point point, boolean z) {
        Size size2 = size;
        Point point2 = point;
        sqrBoxFilter_1(mat.nativeObj, mat2.nativeObj, i, size2.width, size2.height, point2.x, point2.y, z);
    }

    public static void sqrBoxFilter(Mat mat, Mat mat2, int i, Size size, Point point, boolean z, int i2) {
        Size size2 = size;
        Point point2 = point;
        sqrBoxFilter_0(mat.nativeObj, mat2.nativeObj, i, size2.width, size2.height, point2.x, point2.y, z, i2);
    }

    private static native void sqrBoxFilter_0(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z, int i2);

    private static native void sqrBoxFilter_1(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z);

    private static native void sqrBoxFilter_2(long j, long j2, int i, double d, double d2);

    public static double threshold(Mat mat, Mat mat2, double d, double d2, int i) {
        return threshold_0(mat.nativeObj, mat2.nativeObj, d, d2, i);
    }

    private static native double threshold_0(long j, long j2, double d, double d2, int i);

    public static void undistort(Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        undistort_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj);
    }

    public static void undistort(Mat mat, Mat mat2, Mat mat3, Mat mat4, Mat mat5) {
        undistort_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj, mat5.nativeObj);
    }

    public static void undistortPoints(MatOfPoint2f matOfPoint2f, MatOfPoint2f matOfPoint2f2, Mat mat, Mat mat2) {
        undistortPoints_1(matOfPoint2f.nativeObj, matOfPoint2f2.nativeObj, mat.nativeObj, mat2.nativeObj);
    }

    public static void undistortPoints(MatOfPoint2f matOfPoint2f, MatOfPoint2f matOfPoint2f2, Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        undistortPoints_0(matOfPoint2f.nativeObj, matOfPoint2f2.nativeObj, mat.nativeObj, mat2.nativeObj, mat3.nativeObj, mat4.nativeObj);
    }

    private static native void undistortPoints_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void undistortPoints_1(long j, long j2, long j3, long j4);

    private static native void undistort_0(long j, long j2, long j3, long j4, long j5);

    private static native void undistort_1(long j, long j2, long j3, long j4);

    public static void warpAffine(Mat mat, Mat mat2, Mat mat3, Size size) {
        warpAffine_2(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size.width, size.height);
    }

    public static void warpAffine(Mat mat, Mat mat2, Mat mat3, Size size, int i) {
        warpAffine_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size.width, size.height, i);
    }

    public static void warpAffine(Mat mat, Mat mat2, Mat mat3, Size size, int i, int i2, Scalar scalar) {
        Size size2 = size;
        Scalar scalar2 = scalar;
        warpAffine_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size2.width, size2.height, i, i2, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void warpAffine_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void warpAffine_1(long j, long j2, long j3, double d, double d2, int i);

    private static native void warpAffine_2(long j, long j2, long j3, double d, double d2);

    public static void warpPerspective(Mat mat, Mat mat2, Mat mat3, Size size) {
        warpPerspective_2(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size.width, size.height);
    }

    public static void warpPerspective(Mat mat, Mat mat2, Mat mat3, Size size, int i) {
        warpPerspective_1(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size.width, size.height, i);
    }

    public static void warpPerspective(Mat mat, Mat mat2, Mat mat3, Size size, int i, int i2, Scalar scalar) {
        Size size2 = size;
        Scalar scalar2 = scalar;
        warpPerspective_0(mat.nativeObj, mat2.nativeObj, mat3.nativeObj, size2.width, size2.height, i, i2, scalar2.val[0], scalar2.val[1], scalar2.val[2], scalar2.val[3]);
    }

    private static native void warpPerspective_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void warpPerspective_1(long j, long j2, long j3, double d, double d2, int i);

    private static native void warpPerspective_2(long j, long j2, long j3, double d, double d2);

    public static void watershed(Mat mat, Mat mat2) {
        watershed_0(mat.nativeObj, mat2.nativeObj);
    }

    private static native void watershed_0(long j, long j2);
}
