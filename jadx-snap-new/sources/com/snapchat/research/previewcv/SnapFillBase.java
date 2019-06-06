package com.snapchat.research.previewcv;

public class SnapFillBase {
    protected transient boolean a = true;
    private transient long b;

    public static final class a {
        public static final a a = new a("MEDIUM_END_DEVICE");
        private static a c = new a("HIGH_END_DEVICE");
        private static a d = new a("HIGH_END_DEVICE_FACE_MODE");
        private static a e = new a("MEDIUM_END_DEVICE_FACE_MODE");
        private static a f = new a("LOW_END_DEVICE");
        private static a g = new a("LOW_END_DEVICE_FACE_MODE");
        private static a h = new a("ANDROID_HIGH_END_DEVICE");
        private static a i = new a("ANDROID_HIGH_END_DEVICE_FACE_MODE");
        private static a j = new a("ANDROID_MEDIUM_END_DEVICE");
        private static a k = new a("ANDROID_MEDIUM_END_DEVICE_FACE_MODE");
        private static a l = new a("ANDROID_LOW_END_DEVICE");
        private static a m = new a("ANDROID_LOW_END_DEVICE_FACE_MODE");
        private static int n = 0;
        final int b;
        private final String o;

        static {
            a[] aVarArr = new a[]{c, d, a, e, f, g, h, i, j, k, l, m};
        }

        private a(String str) {
            this.o = str;
            int i = n;
            n = i + 1;
            this.b = i;
        }

        public final String toString() {
            return this.o;
        }
    }

    protected SnapFillBase(long j, boolean z) {
        this.b = j;
    }

    public synchronized void a() {
        if (this.b != 0) {
            if (this.a) {
                this.a = false;
                PreviewCVInterfaceJNI.delete_SnapFillBase(this.b);
            }
            this.b = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}
