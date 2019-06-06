package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: absv */
public final class absv {
    public boolean a = true;
    public List<String> b = new ArrayList();

    /* renamed from: absv$1 */
    static class 1 extends TypeToken<LinkedHashMap<String, absv>> {
        1() {
        }
    }

    static {
        new 1().getType();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OperationResultEntry {success=");
        stringBuilder.append(this.a);
        stringBuilder.append(", messages=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
