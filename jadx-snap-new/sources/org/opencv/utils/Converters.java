package org.opencv.utils;

import java.util.List;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.Point;
import org.opencv.core.Point3;
import org.opencv.core.Rect;

public class Converters {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0059 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_Mat(org.opencv.core.Mat r10, java.util.List<org.opencv.core.Mat> r11) {
        /*
        if (r11 == 0) goto L_0x0051;
        r0 = r10.rows();
        r1 = org.opencv.core.CvType.CV_32SC2;
        r2 = r10.type();
        if (r1 != r2) goto L_0x0041;
        r1 = r10.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x0041;
        r11.clear();
        r1 = r0 << 1;
        r1 = new int[r1];
        r3 = 0;
        r10.get(r3, r3, r1);
        if (r3 >= r0) goto L_0x0040;
        r10 = r3 << 1;
        r4 = r1[r10];
        r4 = (long) r4;
        r6 = 32;
        r4 = r4 << r6;
        r10 = r10 + r2;
        r10 = r1[r10];
        r6 = (long) r10;
        r8 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r6 = r6 & r8;
        r4 = r4 | r6;
        r10 = new org.opencv.core.Mat;
        r10.<init>(r4);
        r11.add(r10);
        r3 = r3 + 1;
        goto L_0x0020;
        return;
        r11 = new java.lang.IllegalArgumentException;
        r10 = java.lang.String.valueOf(r10);
        r0 = "CvType.CV_32SC2 != m.type() ||  m.cols()!=1\n";
        r10 = r0.concat(r10);
        r11.<init>(r10);
        throw r11;
        r10 = new java.lang.IllegalArgumentException;
        r11 = "mats == null";
        r10.<init>(r11);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_Mat(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00a1 in {7, 8, 13, 14, 19, 20, 22, 24, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_Point(org.opencv.core.Mat r9, java.util.List<org.opencv.core.Point> r10) {
        /*
        if (r10 == 0) goto L_0x0099;
        r0 = r9.rows();
        r1 = r9.type();
        r2 = r9.cols();
        r3 = 1;
        if (r2 != r3) goto L_0x0089;
        r10.clear();
        r2 = org.opencv.core.CvType.CV_32SC2;
        r4 = 0;
        if (r1 != r2) goto L_0x0037;
        r1 = r0 * 2;
        r1 = new int[r1];
        r9.get(r4, r4, r1);
        if (r4 >= r0) goto L_0x0036;
        r9 = new org.opencv.core.Point;
        r2 = r4 << 1;
        r5 = r1[r2];
        r5 = (double) r5;
        r2 = r2 + r3;
        r2 = r1[r2];
        r7 = (double) r2;
        r9.<init>(r5, r7);
        r10.add(r9);
        r4 = r4 + 1;
        goto L_0x0020;
        return;
        r2 = org.opencv.core.CvType.CV_32FC2;
        if (r1 != r2) goto L_0x0059;
        r1 = r0 * 2;
        r1 = new float[r1];
        r9.get(r4, r4, r1);
        if (r4 >= r0) goto L_0x0058;
        r9 = new org.opencv.core.Point;
        r2 = r4 << 1;
        r5 = r1[r2];
        r5 = (double) r5;
        r2 = r2 + r3;
        r2 = r1[r2];
        r7 = (double) r2;
        r9.<init>(r5, r7);
        r10.add(r9);
        r4 = r4 + 1;
        goto L_0x0042;
        return;
        r2 = org.opencv.core.CvType.CV_64FC2;
        if (r1 != r2) goto L_0x0079;
        r1 = r0 * 2;
        r1 = new double[r1];
        r9.get(r4, r4, r1);
        if (r4 >= r0) goto L_0x0078;
        r9 = new org.opencv.core.Point;
        r2 = r4 << 1;
        r5 = r1[r2];
        r2 = r2 + r3;
        r7 = r1[r2];
        r9.<init>(r5, r7);
        r10.add(r9);
        r4 = r4 + 1;
        goto L_0x0064;
        return;
        r10 = new java.lang.IllegalArgumentException;
        r9 = java.lang.String.valueOf(r9);
        r0 = "Input Mat should be of CV_32SC2, CV_32FC2 or CV_64FC2 type\n";
        r9 = r0.concat(r9);
        r10.<init>(r9);
        throw r10;
        r10 = new java.lang.IllegalArgumentException;
        r9 = java.lang.String.valueOf(r9);
        r0 = "Input Mat should have one column\n";
        r9 = r0.concat(r9);
        r10.<init>(r9);
        throw r10;
        r9 = new java.lang.IllegalArgumentException;
        r10 = "Output List can't be null";
        r9.<init>(r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_Point(org.opencv.core.Mat, java.util.List):void");
    }

    public static void Mat_to_vector_Point2d(Mat mat, List<Point> list) {
        Mat_to_vector_Point(mat, list);
    }

    public static void Mat_to_vector_Point2f(Mat mat, List<Point> list) {
        Mat_to_vector_Point(mat, list);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00b5 in {7, 8, 13, 14, 19, 20, 22, 24, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_Point3(org.opencv.core.Mat r11, java.util.List<org.opencv.core.Point3> r12) {
        /*
        if (r12 == 0) goto L_0x00ad;
        r0 = r11.rows();
        r1 = r11.type();
        r2 = r11.cols();
        r3 = 1;
        if (r2 != r3) goto L_0x009d;
        r12.clear();
        r2 = org.opencv.core.CvType.CV_32SC3;
        r3 = 0;
        if (r1 != r2) goto L_0x003e;
        r1 = r0 * 3;
        r1 = new int[r1];
        r11.get(r3, r3, r1);
        if (r3 >= r0) goto L_0x003d;
        r11 = new org.opencv.core.Point3;
        r2 = r3 * 3;
        r4 = r1[r2];
        r5 = (double) r4;
        r4 = r2 + 1;
        r4 = r1[r4];
        r7 = (double) r4;
        r2 = r2 + 2;
        r2 = r1[r2];
        r9 = (double) r2;
        r4 = r11;
        r4.<init>(r5, r7, r9);
        r12.add(r11);
        r3 = r3 + 1;
        goto L_0x0020;
        return;
        r2 = org.opencv.core.CvType.CV_32FC3;
        if (r1 != r2) goto L_0x0067;
        r1 = r0 * 3;
        r1 = new float[r1];
        r11.get(r3, r3, r1);
        if (r3 >= r0) goto L_0x0066;
        r11 = new org.opencv.core.Point3;
        r2 = r3 * 3;
        r4 = r1[r2];
        r5 = (double) r4;
        r4 = r2 + 1;
        r4 = r1[r4];
        r7 = (double) r4;
        r2 = r2 + 2;
        r2 = r1[r2];
        r9 = (double) r2;
        r4 = r11;
        r4.<init>(r5, r7, r9);
        r12.add(r11);
        r3 = r3 + 1;
        goto L_0x0049;
        return;
        r2 = org.opencv.core.CvType.CV_64FC3;
        if (r1 != r2) goto L_0x008d;
        r1 = r0 * 3;
        r1 = new double[r1];
        r11.get(r3, r3, r1);
        if (r3 >= r0) goto L_0x008c;
        r11 = new org.opencv.core.Point3;
        r2 = r3 * 3;
        r5 = r1[r2];
        r4 = r2 + 1;
        r7 = r1[r4];
        r2 = r2 + 2;
        r9 = r1[r2];
        r4 = r11;
        r4.<init>(r5, r7, r9);
        r12.add(r11);
        r3 = r3 + 1;
        goto L_0x0072;
        return;
        r12 = new java.lang.IllegalArgumentException;
        r11 = java.lang.String.valueOf(r11);
        r0 = "Input Mat should be of CV_32SC3, CV_32FC3 or CV_64FC3 type\n";
        r11 = r0.concat(r11);
        r12.<init>(r11);
        throw r12;
        r12 = new java.lang.IllegalArgumentException;
        r11 = java.lang.String.valueOf(r11);
        r0 = "Input Mat should have one column\n";
        r11 = r0.concat(r11);
        r12.<init>(r11);
        throw r12;
        r11 = new java.lang.IllegalArgumentException;
        r12 = "Output List can't be null";
        r11.<init>(r12);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_Point3(org.opencv.core.Mat, java.util.List):void");
    }

    public static void Mat_to_vector_Point3d(Mat mat, List<Point3> list) {
        Mat_to_vector_Point3(mat, list);
    }

    public static void Mat_to_vector_Point3f(Mat mat, List<Point3> list) {
        Mat_to_vector_Point3(mat, list);
    }

    public static void Mat_to_vector_Point3i(Mat mat, List<Point3> list) {
        Mat_to_vector_Point3(mat, list);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0056 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_Rect(org.opencv.core.Mat r7, java.util.List<org.opencv.core.Rect> r8) {
        /*
        if (r8 == 0) goto L_0x004e;
        r0 = r7.rows();
        r1 = org.opencv.core.CvType.CV_32SC4;
        r2 = r7.type();
        if (r1 != r2) goto L_0x003e;
        r1 = r7.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x003e;
        r8.clear();
        r1 = r0 * 4;
        r1 = new int[r1];
        r2 = 0;
        r7.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x003d;
        r7 = new org.opencv.core.Rect;
        r3 = r2 * 4;
        r4 = r1[r3];
        r5 = r3 + 1;
        r5 = r1[r5];
        r6 = r3 + 2;
        r6 = r1[r6];
        r3 = r3 + 3;
        r3 = r1[r3];
        r7.<init>(r4, r5, r6, r3);
        r8.add(r7);
        r2 = r2 + 1;
        goto L_0x0020;
        return;
        r8 = new java.lang.IllegalArgumentException;
        r7 = java.lang.String.valueOf(r7);
        r0 = "CvType.CV_32SC4 != m.type() ||  m.rows()!=1\n";
        r7 = r0.concat(r7);
        r8.<init>(r7);
        throw r8;
        r7 = new java.lang.IllegalArgumentException;
        r8 = "rs == null";
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_Rect(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_char(org.opencv.core.Mat r3, java.util.List<java.lang.Byte> r4) {
        /*
        if (r4 == 0) goto L_0x003d;
        r0 = r3.rows();
        r1 = org.opencv.core.CvType.CV_8SC1;
        r2 = r3.type();
        if (r1 != r2) goto L_0x002d;
        r1 = r3.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x002d;
        r4.clear();
        r1 = new byte[r0];
        r2 = 0;
        r3.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x002c;
        r3 = r1[r2];
        r3 = java.lang.Byte.valueOf(r3);
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x001e;
        return;
        r4 = new java.lang.IllegalArgumentException;
        r3 = java.lang.String.valueOf(r3);
        r0 = "CvType.CV_8SC1 != m.type() ||  m.cols()!=1\n";
        r3 = r0.concat(r3);
        r4.<init>(r3);
        throw r4;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_char(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_double(org.opencv.core.Mat r5, java.util.List<java.lang.Double> r6) {
        /*
        if (r6 == 0) goto L_0x003d;
        r0 = r5.rows();
        r1 = org.opencv.core.CvType.CV_64FC1;
        r2 = r5.type();
        if (r1 != r2) goto L_0x002d;
        r1 = r5.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x002d;
        r6.clear();
        r1 = new double[r0];
        r2 = 0;
        r5.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x002c;
        r3 = r1[r2];
        r5 = java.lang.Double.valueOf(r3);
        r6.add(r5);
        r2 = r2 + 1;
        goto L_0x001e;
        return;
        r6 = new java.lang.IllegalArgumentException;
        r5 = java.lang.String.valueOf(r5);
        r0 = "CvType.CV_64FC1 != m.type() ||  m.cols()!=1\n";
        r5 = r0.concat(r5);
        r6.<init>(r5);
        throw r6;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "ds == null";
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_double(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_float(org.opencv.core.Mat r3, java.util.List<java.lang.Float> r4) {
        /*
        if (r4 == 0) goto L_0x003d;
        r0 = r3.rows();
        r1 = org.opencv.core.CvType.CV_32FC1;
        r2 = r3.type();
        if (r1 != r2) goto L_0x002d;
        r1 = r3.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x002d;
        r4.clear();
        r1 = new float[r0];
        r2 = 0;
        r3.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x002c;
        r3 = r1[r2];
        r3 = java.lang.Float.valueOf(r3);
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x001e;
        return;
        r4 = new java.lang.IllegalArgumentException;
        r3 = java.lang.String.valueOf(r3);
        r0 = "CvType.CV_32FC1 != m.type() ||  m.cols()!=1\n";
        r3 = r0.concat(r3);
        r4.<init>(r3);
        throw r4;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "fs == null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_float(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_int(org.opencv.core.Mat r3, java.util.List<java.lang.Integer> r4) {
        /*
        if (r4 == 0) goto L_0x003d;
        r0 = r3.rows();
        r1 = org.opencv.core.CvType.CV_32SC1;
        r2 = r3.type();
        if (r1 != r2) goto L_0x002d;
        r1 = r3.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x002d;
        r4.clear();
        r1 = new int[r0];
        r2 = 0;
        r3.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x002c;
        r3 = r1[r2];
        r3 = java.lang.Integer.valueOf(r3);
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x001e;
        return;
        r4 = new java.lang.IllegalArgumentException;
        r3 = java.lang.String.valueOf(r3);
        r0 = "CvType.CV_32SC1 != m.type() ||  m.cols()!=1\n";
        r3 = r0.concat(r3);
        r4.<init>(r3);
        throw r4;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "is == null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_int(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {7, 8, 10, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_uchar(org.opencv.core.Mat r3, java.util.List<java.lang.Byte> r4) {
        /*
        if (r4 == 0) goto L_0x003d;
        r0 = r3.rows();
        r1 = org.opencv.core.CvType.CV_8UC1;
        r2 = r3.type();
        if (r1 != r2) goto L_0x002d;
        r1 = r3.cols();
        r2 = 1;
        if (r1 != r2) goto L_0x002d;
        r4.clear();
        r1 = new byte[r0];
        r2 = 0;
        r3.get(r2, r2, r1);
        if (r2 >= r0) goto L_0x002c;
        r3 = r1[r2];
        r3 = java.lang.Byte.valueOf(r3);
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x001e;
        return;
        r4 = new java.lang.IllegalArgumentException;
        r3 = java.lang.String.valueOf(r3);
        r0 = "CvType.CV_8UC1 != m.type() ||  m.cols()!=1\n";
        r3 = r0.concat(r3);
        r4.<init>(r3);
        throw r4;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_uchar(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0040 in {5, 7, 9, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_vector_Point(org.opencv.core.Mat r3, java.util.List<org.opencv.core.MatOfPoint> r4) {
        /*
        if (r4 == 0) goto L_0x0038;
        if (r3 == 0) goto L_0x0030;
        r0 = new java.util.ArrayList;
        r1 = r3.rows();
        r0.<init>(r1);
        Mat_to_vector_Mat(r3, r0);
        r3 = r0.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002c;
        r1 = r3.next();
        r1 = (org.opencv.core.Mat) r1;
        r2 = new org.opencv.core.MatOfPoint;
        r2.<init>(r1);
        r4.add(r2);
        r1.release();
        goto L_0x0014;
        r0.clear();
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Input Mat can't be null";
        r3.<init>(r4);
        throw r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_vector_Point(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0040 in {5, 7, 9, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_vector_Point2f(org.opencv.core.Mat r3, java.util.List<org.opencv.core.MatOfPoint2f> r4) {
        /*
        if (r4 == 0) goto L_0x0038;
        if (r3 == 0) goto L_0x0030;
        r0 = new java.util.ArrayList;
        r1 = r3.rows();
        r0.<init>(r1);
        Mat_to_vector_Mat(r3, r0);
        r3 = r0.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002c;
        r1 = r3.next();
        r1 = (org.opencv.core.Mat) r1;
        r2 = new org.opencv.core.MatOfPoint2f;
        r2.<init>(r1);
        r4.add(r2);
        r1.release();
        goto L_0x0014;
        r0.clear();
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Input Mat can't be null";
        r3.<init>(r4);
        throw r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_vector_Point2f(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0040 in {5, 7, 9, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_vector_Point3f(org.opencv.core.Mat r3, java.util.List<org.opencv.core.MatOfPoint3f> r4) {
        /*
        if (r4 == 0) goto L_0x0038;
        if (r3 == 0) goto L_0x0030;
        r0 = new java.util.ArrayList;
        r1 = r3.rows();
        r0.<init>(r1);
        Mat_to_vector_Mat(r3, r0);
        r3 = r0.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002c;
        r1 = r3.next();
        r1 = (org.opencv.core.Mat) r1;
        r2 = new org.opencv.core.MatOfPoint3f;
        r2.<init>(r1);
        r4.add(r2);
        r1.release();
        goto L_0x0014;
        r0.clear();
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Input Mat can't be null";
        r3.<init>(r4);
        throw r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_vector_Point3f(org.opencv.core.Mat, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0043 in {5, 7, 9, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static void Mat_to_vector_vector_char(org.opencv.core.Mat r3, java.util.List<java.util.List<java.lang.Byte>> r4) {
        /*
        if (r4 == 0) goto L_0x003b;
        if (r3 == 0) goto L_0x0033;
        r0 = new java.util.ArrayList;
        r1 = r3.rows();
        r0.<init>(r1);
        Mat_to_vector_Mat(r3, r0);
        r3 = r0.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002f;
        r1 = r3.next();
        r1 = (org.opencv.core.Mat) r1;
        r2 = new java.util.ArrayList;
        r2.<init>();
        Mat_to_vector_char(r1, r2);
        r4.add(r2);
        r1.release();
        goto L_0x0014;
        r0.clear();
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Input Mat can't be null";
        r3.<init>(r4);
        throw r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "Output List can't be null";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.utils.Converters.Mat_to_vector_vector_char(org.opencv.core.Mat, java.util.List):void");
    }

    public static Mat vector_Mat_to_Mat(List<Mat> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_32SC2);
        int[] iArr = new int[(size << 1)];
        for (int i = 0; i < size; i++) {
            long j = ((Mat) list.get(i)).nativeObj;
            int i2 = i << 1;
            iArr[i2] = (int) (j >> 32);
            iArr[i2 + 1] = (int) j;
        }
        mat.put(0, 0, iArr);
        return mat;
    }

    public static Mat vector_Point2d_to_Mat(List<Point> list) {
        return vector_Point_to_Mat(list, 6);
    }

    public static Mat vector_Point2f_to_Mat(List<Point> list) {
        return vector_Point_to_Mat(list, 5);
    }

    public static Mat vector_Point3_to_Mat(List<Point3> list, int i) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat;
        int i2;
        Point3 point3;
        int i3;
        if (i == 4) {
            mat = new Mat(size, 1, CvType.CV_32SC3);
            int[] iArr = new int[(size * 3)];
            for (i2 = 0; i2 < size; i2++) {
                point3 = (Point3) list.get(i2);
                i3 = i2 * 3;
                iArr[i3] = (int) point3.x;
                iArr[i3 + 1] = (int) point3.y;
                iArr[i3 + 2] = (int) point3.z;
            }
            mat.put(0, 0, iArr);
            return mat;
        } else if (i == 5) {
            mat = new Mat(size, 1, CvType.CV_32FC3);
            float[] fArr = new float[(size * 3)];
            for (i2 = 0; i2 < size; i2++) {
                point3 = (Point3) list.get(i2);
                i3 = i2 * 3;
                fArr[i3] = (float) point3.x;
                fArr[i3 + 1] = (float) point3.y;
                fArr[i3 + 2] = (float) point3.z;
            }
            mat.put(0, 0, fArr);
            return mat;
        } else if (i == 6) {
            mat = new Mat(size, 1, CvType.CV_64FC3);
            double[] dArr = new double[(size * 3)];
            for (i2 = 0; i2 < size; i2++) {
                point3 = (Point3) list.get(i2);
                i3 = i2 * 3;
                dArr[i3] = point3.x;
                dArr[i3 + 1] = point3.y;
                dArr[i3 + 2] = point3.z;
            }
            mat.put(0, 0, dArr);
            return mat;
        } else {
            throw new IllegalArgumentException("'typeDepth' can be CV_32S, CV_32F or CV_64F");
        }
    }

    public static Mat vector_Point3d_to_Mat(List<Point3> list) {
        return vector_Point3_to_Mat(list, 6);
    }

    public static Mat vector_Point3f_to_Mat(List<Point3> list) {
        return vector_Point3_to_Mat(list, 5);
    }

    public static Mat vector_Point3i_to_Mat(List<Point3> list) {
        return vector_Point3_to_Mat(list, 4);
    }

    public static Mat vector_Point_to_Mat(List<Point> list) {
        return vector_Point_to_Mat(list, 4);
    }

    public static Mat vector_Point_to_Mat(List<Point> list, int i) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat;
        int i2;
        Point point;
        int i3;
        if (i == 4) {
            mat = new Mat(size, 1, CvType.CV_32SC2);
            int[] iArr = new int[(size << 1)];
            for (i2 = 0; i2 < size; i2++) {
                point = (Point) list.get(i2);
                i3 = i2 << 1;
                iArr[i3] = (int) point.x;
                iArr[i3 + 1] = (int) point.y;
            }
            mat.put(0, 0, iArr);
            return mat;
        } else if (i == 5) {
            mat = new Mat(size, 1, CvType.CV_32FC2);
            float[] fArr = new float[(size << 1)];
            for (i2 = 0; i2 < size; i2++) {
                point = (Point) list.get(i2);
                i3 = i2 << 1;
                fArr[i3] = (float) point.x;
                fArr[i3 + 1] = (float) point.y;
            }
            mat.put(0, 0, fArr);
            return mat;
        } else if (i == 6) {
            mat = new Mat(size, 1, CvType.CV_64FC2);
            double[] dArr = new double[(size << 1)];
            for (i2 = 0; i2 < size; i2++) {
                point = (Point) list.get(i2);
                i3 = i2 << 1;
                dArr[i3] = point.x;
                dArr[i3 + 1] = point.y;
            }
            mat.put(0, 0, dArr);
            return mat;
        } else {
            throw new IllegalArgumentException("'typeDepth' can be CV_32S, CV_32F or CV_64F");
        }
    }

    public static Mat vector_Rect_to_Mat(List<Rect> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_32SC4);
        int[] iArr = new int[(size * 4)];
        for (int i = 0; i < size; i++) {
            Rect rect = (Rect) list.get(i);
            int i2 = i * 4;
            iArr[i2] = rect.x;
            iArr[i2 + 1] = rect.y;
            iArr[i2 + 2] = rect.width;
            iArr[i2 + 3] = rect.height;
        }
        mat.put(0, 0, iArr);
        return mat;
    }

    public static Mat vector_char_to_Mat(List<Byte> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_8SC1);
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = ((Byte) list.get(i)).byteValue();
        }
        mat.put(0, 0, bArr);
        return mat;
    }

    public static Mat vector_double_to_Mat(List<Double> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_64FC1);
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        mat.put(0, 0, dArr);
        return mat;
    }

    public static Mat vector_float_to_Mat(List<Float> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_32FC1);
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) list.get(i)).floatValue();
        }
        mat.put(0, 0, fArr);
        return mat;
    }

    public static Mat vector_int_to_Mat(List<Integer> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_32SC1);
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        mat.put(0, 0, iArr);
        return mat;
    }

    public static Mat vector_uchar_to_Mat(List<Byte> list) {
        int size = list != null ? list.size() : 0;
        if (size <= 0) {
            return new Mat();
        }
        Mat mat = new Mat(size, 1, CvType.CV_8UC1);
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = ((Byte) list.get(i)).byteValue();
        }
        mat.put(0, 0, bArr);
        return mat;
    }

    public static Mat vector_vector_Point2f_to_Mat(List<MatOfPoint2f> list, List<Mat> list2) {
        if ((list != null ? list.size() : 0) <= 0) {
            return new Mat();
        }
        for (MatOfPoint2f add : list) {
            list2.add(add);
        }
        return vector_Mat_to_Mat(list2);
    }

    public static Mat vector_vector_Point3f_to_Mat(List<MatOfPoint3f> list, List<Mat> list2) {
        if ((list != null ? list.size() : 0) <= 0) {
            return new Mat();
        }
        for (MatOfPoint3f add : list) {
            list2.add(add);
        }
        return vector_Mat_to_Mat(list2);
    }

    public static Mat vector_vector_Point_to_Mat(List<MatOfPoint> list, List<Mat> list2) {
        if ((list != null ? list.size() : 0) <= 0) {
            return new Mat();
        }
        for (MatOfPoint add : list) {
            list2.add(add);
        }
        return vector_Mat_to_Mat(list2);
    }

    public static Mat vector_vector_char_to_Mat(List<MatOfByte> list, List<Mat> list2) {
        if ((list != null ? list.size() : 0) <= 0) {
            return new Mat();
        }
        for (MatOfByte add : list) {
            list2.add(add);
        }
        return vector_Mat_to_Mat(list2);
    }
}
