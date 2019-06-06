package defpackage;

import android.util.ArrayMap;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: zog */
public final class zog {
    public View a;
    public final Map<String, Object> b = new ArrayMap();
    final ArrayList<zob> c = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj instanceof zog) {
            zog zog = (zog) obj;
            if (this.a == zog.a && this.b.equals(zog.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.a);
        stringBuilder2 = "\n";
        stringBuilder3.append(stringBuilder2);
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append("    values:");
        stringBuilder4 = stringBuilder5.toString();
        for (String str : this.b.keySet()) {
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(stringBuilder4);
            stringBuilder6.append("    ");
            stringBuilder6.append(str);
            stringBuilder6.append(": ");
            stringBuilder6.append(this.b.get(str));
            stringBuilder6.append(stringBuilder2);
            stringBuilder4 = stringBuilder6.toString();
        }
        return stringBuilder4;
    }
}
