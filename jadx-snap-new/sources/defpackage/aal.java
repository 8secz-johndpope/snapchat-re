package defpackage;

/* renamed from: aal */
public abstract class aal {
    public static final aal a = new 2();
    public static final aal b = new 3();
    public static final aal c = new 5();

    /* renamed from: aal$1 */
    class 1 extends aal {
        1() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(yx yxVar) {
            return yxVar == yx.REMOTE;
        }

        public final boolean a(boolean z, yx yxVar, yz yzVar) {
            return (yxVar == yx.RESOURCE_DISK_CACHE || yxVar == yx.MEMORY_CACHE) ? false : true;
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: aal$2 */
    class 2 extends aal {
        2() {
        }

        public final boolean a() {
            return false;
        }

        public final boolean a(yx yxVar) {
            return false;
        }

        public final boolean a(boolean z, yx yxVar, yz yzVar) {
            return false;
        }

        public final boolean b() {
            return false;
        }
    }

    /* renamed from: aal$3 */
    class 3 extends aal {
        3() {
        }

        public final boolean a() {
            return false;
        }

        public final boolean a(yx yxVar) {
            return (yxVar == yx.DATA_DISK_CACHE || yxVar == yx.MEMORY_CACHE) ? false : true;
        }

        public final boolean a(boolean z, yx yxVar, yz yzVar) {
            return false;
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: aal$4 */
    class 4 extends aal {
        4() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(yx yxVar) {
            return false;
        }

        public final boolean a(boolean z, yx yxVar, yz yzVar) {
            return (yxVar == yx.RESOURCE_DISK_CACHE || yxVar == yx.MEMORY_CACHE) ? false : true;
        }

        public final boolean b() {
            return false;
        }
    }

    /* renamed from: aal$5 */
    class 5 extends aal {
        5() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(yx yxVar) {
            return yxVar == yx.REMOTE;
        }

        public final boolean a(boolean z, yx yxVar, yz yzVar) {
            return ((z && yxVar == yx.DATA_DISK_CACHE) || yxVar == yx.LOCAL) && yzVar == yz.TRANSFORMED;
        }

        public final boolean b() {
            return true;
        }
    }

    static {
        1 1 = new 1();
        4 4 = new 4();
    }

    public abstract boolean a();

    public abstract boolean a(yx yxVar);

    public abstract boolean a(boolean z, yx yxVar, yz yzVar);

    public abstract boolean b();
}
