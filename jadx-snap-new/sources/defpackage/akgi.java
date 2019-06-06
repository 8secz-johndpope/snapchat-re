package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import org.opencv.imgproc.Imgproc;

/* renamed from: akgi */
public final class akgi {
    private static final List<Class<? extends akgg>> a = new LinkedList();
    private static akgg b;
    private static ComponentName c;

    static {
        Object obj = new Object();
        a.add(AdwHomeBadger.class);
        a.add(ApexHomeBadger.class);
        a.add(DefaultBadger.class);
        a.add(NewHtcHomeBadger.class);
        a.add(NovaHomeBadger.class);
        a.add(SonyHomeBadger.class);
        a.add(akgj.class);
        a.add(akgl.class);
        a.add(akgm.class);
        a.add(akgn.class);
        a.add(akgq.class);
        a.add(akgo.class);
        a.add(akgp.class);
        a.add(akgk.class);
    }

    private static boolean a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            StringBuilder stringBuilder = new StringBuilder("Unable to find launch intent for package ");
            stringBuilder.append(context.getPackageName());
            Log.e("ShortcutBadger", stringBuilder.toString());
            return false;
        }
        c = launchIntentForPackage.getComponent();
        launchIntentForPackage = new Intent("android.intent.action.MAIN");
        launchIntentForPackage.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(launchIntentForPackage, Imgproc.FLOODFILL_FIXED_RANGE)) {
            String str = resolveInfo.activityInfo.packageName;
            for (Class newInstance : a) {
                akgg akgg;
                try {
                    akgg = (akgg) newInstance.newInstance();
                } catch (Exception unused) {
                    akgg = null;
                }
                if (akgg != null && akgg.a().contains(str)) {
                    b = akgg;
                    break;
                }
            }
            if (b != null) {
                break;
            }
        }
        if (b == null) {
            akgg akgq = Build.MANUFACTURER.equalsIgnoreCase("ZUK") ? new akgq() : Build.MANUFACTURER.equalsIgnoreCase("OPPO") ? new akgm() : Build.MANUFACTURER.equalsIgnoreCase("VIVO") ? new akgo() : Build.MANUFACTURER.equalsIgnoreCase("ZTE") ? new akgp() : new DefaultBadger();
            b = akgq;
        }
        return true;
    }

    public static boolean a(Context context, int i) {
        String str = "Unable to execute badge";
        try {
            if (b == null) {
                if (!akgi.a(context)) {
                    throw new akgh("No default launcher available");
                }
            }
            b.a(context, c, i);
            return true;
        } catch (Exception e) {
            throw new akgh(str, e);
        } catch (akgh e2) {
            String str2 = "ShortcutBadger";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, str, e2);
            }
            return false;
        }
    }
}
