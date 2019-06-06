package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: mwo */
final class mwo implements akbl<String, String> {
    private final Context a;
    private final String b;

    public mwo(Context context, String str) {
        akcr.b(context, "context");
        akcr.b(str, "resourceType");
        this.a = context;
        this.b = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        akcr.b(str, "resourceName");
        Resources resources = this.a.getResources();
        int identifier = resources.getIdentifier(str, this.b, this.a.getPackageName());
        StringBuilder stringBuilder = new StringBuilder("android.resource://");
        stringBuilder.append(resources.getResourcePackageName(identifier));
        stringBuilder.append('/');
        stringBuilder.append(this.b);
        stringBuilder.append('/');
        stringBuilder.append(resources.getResourceEntryName(identifier));
        return stringBuilder.toString();
    }
}
