package defpackage;

import android.util.Pair;
import java.io.File;

/* renamed from: daz */
public final class daz extends dat<day> {
    private static final File a = new File("/proc/self/stat");
    private static final ablo<Pair<Long, Long>> c = new 1();
    private File b = a;

    /* renamed from: daz$1 */
    static class 1 extends ablo<Pair<Long, Long>> {
        private Long d = null;
        private Long e = null;

        1() {
        }

        public final boolean a(int i) {
            if (i == 13) {
                this.d = Long.valueOf((long) b());
                return true;
            } else if (i != 14) {
                return true;
            } else {
                this.e = Long.valueOf((long) b());
                return false;
            }
        }

        public final /* synthetic */ Object getResult() {
            return Pair.create(this.d, this.e);
        }
    }

    public final /* synthetic */ boolean a(das das) {
        Object obj = (day) das;
        dau.a(obj, "Null value passed to getSnapshot!");
        Pair pair = (Pair) c.a(this.b);
        if (pair == null) {
            return false;
        }
        obj.a = ((Long) pair.first).longValue();
        obj.b = ((Long) pair.second).longValue();
        return true;
    }

    public final /* synthetic */ das b() {
        return new day();
    }
}
