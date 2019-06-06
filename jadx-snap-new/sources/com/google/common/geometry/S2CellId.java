package com.google.common.geometry;

import org.opencv.imgproc.Imgproc;

public final class S2CellId implements Comparable<S2CellId> {
    private static final int[] LOOKUP_IJ = new int[Imgproc.INTER_TAB_SIZE2];
    private static final int[] LOOKUP_POS = new int[Imgproc.INTER_TAB_SIZE2];
    private static final long[] maxValueDivs = new long[]{0, 0, Long.MAX_VALUE, 6148914691236517205L, 4611686018427387903L, 3689348814741910323L, 3074457345618258602L, 2635249153387078802L, 2305843009213693951L, 2049638230412172401L, 1844674407370955161L, 1676976733973595601L, 1537228672809129301L, 1418980313362273201L, 1317624576693539401L, 1229782938247303441L, 1152921504606846975L, 1085102592571150095L, 1024819115206086200L, 970881267037344821L, 922337203685477580L, 878416384462359600L, 838488366986797800L, 802032351030850070L, 768614336404564650L, 737869762948382064L, 709490156681136600L, 683212743470724133L, 658812288346769700L, 636094623231363848L, 614891469123651720L, 595056260442243600L, 576460752303423487L, 558992244657865200L, 542551296285575047L, 527049830677415760L, 512409557603043100L};
    private static final int[] maxValueMods = new int[]{0, 0, 1, 0, 3, 0, 3, 1, 7, 6, 5, 4, 3, 2, 1, 0, 15, 0, 15, 16, 15, 15, 15, 5, 15, 15, 15, 24, 15, 23, 15, 15, 31, 15, 17, 15, 15};
    private final long id;

    static {
        initLookupCell(0, 0, 0, 0, 0, 0);
        initLookupCell(0, 0, 0, 1, 0, 1);
        initLookupCell(0, 0, 0, 2, 0, 2);
        initLookupCell(0, 0, 0, 3, 0, 3);
    }

    public S2CellId() {
        this.id = 0;
    }

    public S2CellId(long j) {
        this.id = j;
    }

    public static S2CellId fromFaceIJ(int i, int i2, int i3) {
        long[] jArr = new long[]{0, (long) (i << 28)};
        i &= 1;
        for (int i4 = 7; i4 >= 0; i4--) {
            i = getBits(jArr, i2, i3, i4, i);
        }
        return new S2CellId((((jArr[1] << 32) + jArr[0]) << 1) + 1);
    }

    public static S2CellId fromLatLng(S2LatLng s2LatLng) {
        return fromPoint(s2LatLng.toPoint());
    }

    public static S2CellId fromPoint(S2Point s2Point) {
        int xyzToFace = S2Projections.xyzToFace(s2Point);
        R2Vector validFaceXyzToUv = S2Projections.validFaceXyzToUv(xyzToFace, s2Point);
        return fromFaceIJ(xyzToFace, stToIJ(S2Projections.uvToST(validFaceXyzToUv.x())), stToIJ(S2Projections.uvToST(validFaceXyzToUv.y())));
    }

    private static int getBits(long[] jArr, int i, int i2, int i3, int i4) {
        int i5 = i3 << 2;
        i = LOOKUP_POS[(i4 + (((i >> i5) & 15) << 6)) + (((i2 >> i5) & 15) << 2)];
        i4 = i3 >> 2;
        jArr[i4] = ((((long) i) >> 2) << (((i3 & 3) << 1) << 2)) | jArr[i4];
        return i & 3;
    }

    private static void initLookupCell(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            i = ((i2 << 4) + i3) << 2;
            i5 <<= 2;
            LOOKUP_POS[i + i4] = i5 + i6;
            LOOKUP_IJ[i5 + i4] = i + i6;
            return;
        }
        i++;
        i2 <<= 1;
        i3 <<= 1;
        i5 <<= 2;
        for (int i7 = 0; i7 < 4; i7++) {
            int posToIJ = S2.posToIJ(i6, i7);
            int i8 = i3 + (posToIJ & 1);
            posToIJ = i;
            int i9 = (posToIJ >>> 1) + i2;
            int i10 = i8;
            i8 = i4;
            initLookupCell(posToIJ, i9, i10, i8, i5 + i7, i6 ^ S2.posToOrientation(i7));
        }
    }

    public static long lowestOnBitForLevel(int i) {
        return 1 << ((30 - i) * 2);
    }

    private static int stToIJ(double d) {
        return (int) Math.max(0, Math.min(1073741823, Math.round((d * 5.36870912E8d) + 5.368709115E8d)));
    }

    public static boolean unsignedLongGreaterThan(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    public static boolean unsignedLongLessThan(long j, long j2) {
        return j + Long.MIN_VALUE < j2 + Long.MIN_VALUE;
    }

    public final int compareTo(S2CellId s2CellId) {
        return unsignedLongLessThan(this.id, s2CellId.id) ? -1 : unsignedLongGreaterThan(this.id, s2CellId.id) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S2CellId)) {
            return false;
        }
        return id() == ((S2CellId) obj).id();
    }

    public final int face() {
        return (int) (this.id >>> 61);
    }

    public final int hashCode() {
        long j = this.id;
        return (int) ((j >>> 32) + j);
    }

    public final long id() {
        return this.id;
    }

    public final boolean isLeaf() {
        return (((int) this.id) & 1) != 0;
    }

    public final int level() {
        if (isLeaf()) {
            return 30;
        }
        long j = this.id;
        int i = (int) j;
        int i2 = -1;
        if (i != 0) {
            i2 = 15;
        } else {
            i = (int) (j >>> 32);
        }
        int i3 = (-i) & i;
        if ((i3 & 21845) != 0) {
            i2 += 8;
        }
        if ((5570645 & i3) != 0) {
            i2 += 4;
        }
        if ((84215045 & i3) != 0) {
            i2 += 2;
        }
        if ((i3 & 286331153) != 0) {
            i2++;
        }
        return i2;
    }

    public final S2CellId parent(int i) {
        long lowestOnBitForLevel = lowestOnBitForLevel(i);
        return new S2CellId(lowestOnBitForLevel | (this.id & (-lowestOnBitForLevel)));
    }

    public final long pos() {
        return this.id & 2305843009213693951L;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(face=");
        stringBuilder.append(face());
        stringBuilder.append(", pos=");
        stringBuilder.append(Long.toHexString(pos()));
        stringBuilder.append(", level=");
        stringBuilder.append(level());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0048 in {3, 7, 13, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final java.lang.String toToken() {
        /*
        r5 = this;
        r0 = r5.id;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x000b;
        r0 = "X";
        return r0;
        r0 = java.lang.Long.toHexString(r0);
        r1 = java.util.Locale.ENGLISH;
        r0 = r0.toLowerCase(r1);
        r1 = new java.lang.StringBuilder;
        r2 = 16;
        r1.<init>(r2);
        r3 = r0.length();
        r4 = 48;
        if (r3 >= r2) goto L_0x002a;
        r1.append(r4);
        r3 = r3 + 1;
        goto L_0x0020;
        r1.append(r0);
        if (r2 <= 0) goto L_0x0040;
        r0 = r2 + -1;
        r0 = r1.charAt(r0);
        if (r0 == r4) goto L_0x003d;
        r0 = 0;
        r0 = r1.substring(r0, r2);
        return r0;
        r2 = r2 + -1;
        goto L_0x002d;
        r0 = new java.lang.RuntimeException;
        r1 = "Shouldn't make it here";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.geometry.S2CellId.toToken():java.lang.String");
    }
}
