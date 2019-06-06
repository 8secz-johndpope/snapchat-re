package defpackage;

import android.content.Context;

/* renamed from: airn */
public final class airn {
    private final aiqw<String> a = new 1();
    private final aiqu<String> b = new aiqu();

    /* renamed from: airn$1 */
    class 1 implements aiqw<String> {
        1() {
        }

        public final /* synthetic */ Object a(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }

    public final String a(Context context) {
        try {
            String str = (String) this.b.a(context, this.a);
            return "".equals(str) ? null : str;
        } catch (Exception e) {
            aiqj.a().c("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
