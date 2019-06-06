package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import com.snap.framework.developer.BuildConfigInfo;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: ddt */
public final class ddt {
    public final Map<a, aaua> a = new LinkedHashMap();
    public final Context b;
    private final abss c;
    private final BuildConfigInfo d;

    /* renamed from: ddt$a */
    public enum a {
        CREATE,
        LOGIN,
        EDIT,
        AUTH,
        OAUTH,
        CHANGE_OUTFIT
    }

    public ddt(Context context, abss abss, BuildConfigInfo buildConfigInfo) {
        akcr.b(context, "context");
        akcr.b(abss, "releaseManager");
        akcr.b(buildConfigInfo, "buildConfigInfo");
        this.b = context;
        this.c = abss;
        this.d = buildConfigInfo;
    }

    public final void a(a aVar, String str, aaua aaua) {
        akcr.b(aVar, "action");
        akcr.b(str, "bitmojiRequestToken");
        akcr.b(aaua, "pageType");
        try {
            Intent launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage("com.bitstrips.imoji");
            if (launchIntentForPackage == null) {
                b();
                return;
            }
            String str2 = "snapchat_action";
            String name = aVar.name();
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            if (name != null) {
                Object toLowerCase = name.toLowerCase(obj);
                akcr.a(toLowerCase, "(this as java.lang.String).toLowerCase(locale)");
                launchIntentForPackage.putExtra(str2, toLowerCase);
                if (!TextUtils.isEmpty(str)) {
                    launchIntentForPackage.putExtra("bitmask_request_token", str);
                }
                if (this.c.d()) {
                    launchIntentForPackage.putExtra("build_type", this.d.BUILD_TYPE);
                }
                launchIntentForPackage.addFlags(67108864);
                this.b.startActivity(launchIntentForPackage);
                this.a.put(aVar, aaua);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        } catch (ActivityNotFoundException unused) {
            b();
        }
    }

    public final boolean a() {
        try {
            this.b.getPackageManager().getPackageInfo("com.bitstrips.imoji", 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    public final void b() {
        String str = "android.intent.action.VIEW";
        Context context;
        Intent intent;
        try {
            context = this.b;
            intent = new Intent(str, Uri.parse("market://details?id=com.bitstrips.imoji&referrer=utm_source%3Dsnapchat"));
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context = this.b;
            intent = new Intent(str, Uri.parse("https://play.google.com/store/apps/details?id=com.bitstrips.imoji&referrer=utm_source%3Dsnapchat"));
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        }
    }
}
