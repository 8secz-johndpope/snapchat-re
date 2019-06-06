package org.opencv.imgproc;

import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat4;
import org.opencv.core.MatOfFloat6;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.utils.Converters;

public class Subdiv2D {
    public static final int NEXT_AROUND_DST = 34;
    public static final int NEXT_AROUND_LEFT = 19;
    public static final int NEXT_AROUND_ORG = 0;
    public static final int NEXT_AROUND_RIGHT = 49;
    public static final int PREV_AROUND_DST = 51;
    public static final int PREV_AROUND_LEFT = 32;
    public static final int PREV_AROUND_ORG = 17;
    public static final int PREV_AROUND_RIGHT = 2;
    public static final int PTLOC_ERROR = -2;
    public static final int PTLOC_INSIDE = 0;
    public static final int PTLOC_ON_EDGE = 2;
    public static final int PTLOC_OUTSIDE_RECT = -1;
    public static final int PTLOC_VERTEX = 1;
    protected final long nativeObj;

    public Subdiv2D() {
        this.nativeObj = Subdiv2D_1();
    }

    protected Subdiv2D(long j) {
        this.nativeObj = j;
    }

    public Subdiv2D(Rect rect) {
        this.nativeObj = Subdiv2D_0(rect.x, rect.y, rect.width, rect.height);
    }

    private static native long Subdiv2D_0(int i, int i2, int i3, int i4);

    private static native long Subdiv2D_1();

    private static native void delete(long j);

    private static native int edgeDst_0(long j, int i, double[] dArr);

    private static native int edgeDst_1(long j, int i);

    private static native int edgeOrg_0(long j, int i, double[] dArr);

    private static native int edgeOrg_1(long j, int i);

    private static native int findNearest_0(long j, double d, double d2, double[] dArr);

    private static native int findNearest_1(long j, double d, double d2);

    private static native void getEdgeList_0(long j, long j2);

    private static native int getEdge_0(long j, int i, int i2);

    private static native void getTriangleList_0(long j, long j2);

    private static native double[] getVertex_0(long j, int i, double[] dArr);

    private static native double[] getVertex_1(long j, int i);

    private static native void getVoronoiFacetList_0(long j, long j2, long j3, long j4);

    private static native void initDelaunay_0(long j, int i, int i2, int i3, int i4);

    private static native int insert_0(long j, double d, double d2);

    private static native void insert_1(long j, long j2);

    private static native int locate_0(long j, double d, double d2, double[] dArr, double[] dArr2);

    private static native int nextEdge_0(long j, int i);

    private static native int rotateEdge_0(long j, int i, int i2);

    private static native int symEdge_0(long j, int i);

    public int edgeDst(int i) {
        return edgeDst_1(this.nativeObj, i);
    }

    public int edgeDst(int i, Point point) {
        double[] dArr = new double[2];
        i = edgeDst_0(this.nativeObj, i, dArr);
        if (point != null) {
            point.x = dArr[0];
            point.y = dArr[1];
        }
        return i;
    }

    public int edgeOrg(int i) {
        return edgeOrg_1(this.nativeObj, i);
    }

    public int edgeOrg(int i, Point point) {
        double[] dArr = new double[2];
        i = edgeOrg_0(this.nativeObj, i, dArr);
        if (point != null) {
            point.x = dArr[0];
            point.y = dArr[1];
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        delete(this.nativeObj);
    }

    public int findNearest(Point point) {
        return findNearest_1(this.nativeObj, point.x, point.y);
    }

    public int findNearest(Point point, Point point2) {
        double[] dArr = new double[2];
        int findNearest_0 = findNearest_0(this.nativeObj, point.x, point.y, dArr);
        if (point2 != null) {
            point2.x = dArr[0];
            point2.y = dArr[1];
        }
        return findNearest_0;
    }

    public int getEdge(int i, int i2) {
        return getEdge_0(this.nativeObj, i, i2);
    }

    public void getEdgeList(MatOfFloat4 matOfFloat4) {
        getEdgeList_0(this.nativeObj, matOfFloat4.nativeObj);
    }

    public void getTriangleList(MatOfFloat6 matOfFloat6) {
        getTriangleList_0(this.nativeObj, matOfFloat6.nativeObj);
    }

    public Point getVertex(int i) {
        return new Point(getVertex_1(this.nativeObj, i));
    }

    public Point getVertex(int i, int[] iArr) {
        double[] dArr = new double[1];
        Point point = new Point(getVertex_0(this.nativeObj, i, dArr));
        if (iArr != null) {
            iArr[0] = (int) dArr[0];
        }
        return point;
    }

    public void getVoronoiFacetList(MatOfInt matOfInt, List<MatOfPoint2f> list, MatOfPoint2f matOfPoint2f) {
        Mat mat = new Mat();
        getVoronoiFacetList_0(this.nativeObj, matOfInt.nativeObj, mat.nativeObj, matOfPoint2f.nativeObj);
        Converters.Mat_to_vector_vector_Point2f(mat, list);
        mat.release();
    }

    public void initDelaunay(Rect rect) {
        initDelaunay_0(this.nativeObj, rect.x, rect.y, rect.width, rect.height);
    }

    public int insert(Point point) {
        return insert_0(this.nativeObj, point.x, point.y);
    }

    public void insert(MatOfPoint2f matOfPoint2f) {
        insert_1(this.nativeObj, matOfPoint2f.nativeObj);
    }

    public int locate(Point point, int[] iArr, int[] iArr2) {
        double[] dArr = new double[1];
        double[] dArr2 = new double[1];
        int locate_0 = locate_0(this.nativeObj, point.x, point.y, dArr, dArr2);
        if (iArr != null) {
            iArr[0] = (int) dArr[0];
        }
        if (iArr2 != null) {
            iArr2[0] = (int) dArr2[0];
        }
        return locate_0;
    }

    public int nextEdge(int i) {
        return nextEdge_0(this.nativeObj, i);
    }

    public int rotateEdge(int i, int i2) {
        return rotateEdge_0(this.nativeObj, i, i2);
    }

    public int symEdge(int i) {
        return symEdge_0(this.nativeObj, i);
    }
}
