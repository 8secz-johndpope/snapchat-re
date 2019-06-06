package defpackage;

/* renamed from: abxo */
public final class abxo {
    public static final a a = new a();

    /* renamed from: abxo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static int a(int i, int i2, float f) {
            float f2 = ((float) (i >>> 24)) / 255.0f;
            float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
            float f4 = ((float) (i2 >>> 24)) / 255.0f;
            float f5 = ((float) ((i2 >> 16) & 255)) / 255.0f;
            float f6 = ((float) ((i2 >> 8) & 255)) / 255.0f;
            float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
            f3 = (float) Math.pow((double) f3, 2.2d);
            float pow2 = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
            pow2 += f * (((float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d)) - pow2);
            f2 = (f2 + ((f4 - f2) * f)) * 255.0f;
            int round = Math.round(f2) << 24;
            return Math.round(((float) Math.pow((double) pow2, 0.45454545454545453d)) * 255.0f) | (((Math.round(((float) Math.pow((double) (pow + ((((float) Math.pow((double) f5, 2.2d)) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | round) | (Math.round(((float) Math.pow((double) (f3 + ((((float) Math.pow((double) f6, 2.2d)) - f3) * f)), 0.45454545454545453d)) * 255.0f) << 8));
        }
    }
}
