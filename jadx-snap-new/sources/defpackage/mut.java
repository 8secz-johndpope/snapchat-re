package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* renamed from: mut */
final class mut {
    @SerializedName("cameraContexts")
    final String[] a;
    @SerializedName("applicableContexts")
    final String[] b;

    private /* synthetic */ mut() {
        this(new String[0], new String[0]);
    }

    private mut(String[] strArr, String[] strArr2) {
        akcr.b(strArr, "cameraContexts");
        akcr.b(strArr2, "applicableContexts");
        this.a = strArr;
        this.b = strArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            mut mut = (mut) obj;
            return Arrays.equals(this.a, mut.a) && Arrays.equals(this.b, mut.b);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.lenses.lens.JsonLensContext");
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JsonLensContext(cameraContexts=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append(", applicableContexts=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
