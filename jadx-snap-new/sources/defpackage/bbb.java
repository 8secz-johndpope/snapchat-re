package defpackage;

@Deprecated
/* renamed from: bbb */
public final class bbb {

    /* renamed from: bbb$a */
    public enum a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        private final String description;

        private a(String str) {
            this.description = str;
        }

        public final String toString() {
            return this.description;
        }
    }

    /* renamed from: bbb$b */
    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }
}
