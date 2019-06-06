package defpackage;

import android.content.Context;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: snh */
public final class snh implements snu {
    private static final Map<Class<?>, String> c;
    private final Class<? extends slm> a;
    private final String b;

    static {
        String str = "VIDEO";
        c = ImmutableMap.builder().put(som.class, str).put(sog.class, "SC_VIDEO").put(sol.class, "UNSKIPPABLE_VIDEO").put(smw.class, "APP_INSTALL").put(snp.class, "LOCAL_WEB_PAGE").put(sob.class, "REMOTE_WEB_PAGE").put(soo.class, "CHROME_CUSTOM_TABS").put(soa.class, "REMOTE_VIDEO").put(snk.class, "IMAGE").put(snj.class, "GIF").put(spf.class, "OVERLAY_BLOB_SCREEN_OVERLAY_IMAGE").put(spg.class, "OVERLAY_BLOB_STATIC_MEDIA_OVERLAY_IMAGE").put(spd.class, "OVERLAY_BLOB_ROTATABLE_MEDIA_OVERLAY_IMAGE").put(soi.class, "TEXT").put(smx.class, "ARROW").put(sno.class, "LOADING").put(snq.class, "LOGO").put(snb.class, "BLURRED_IMAGE").put(snd.class, "CHROME").put(soj.class, "TIMER").put(sng.class, "DEBUG").put(sok.class, "TUTORIAL").put(spl.class, "PERSPECTIVE_CHANGE_TUTORIAL").put(snz.class, str).put(snc.class, "CARD_INTERACTION").put(smv.class, "ACTION_MENU_BUTTON").put(sni.class, "DISPLAY_MEDIA_LOADING").put(sof.class, "SC_IMAGE").put(spe.class, "SC_OVERLAY_BLOB_IMAGE").put(snm.class, "INTERACTION_ZONE").put(spj.class, "SIMPLE_WEB").put(soh.class, "SWIPE_AWARE_PAGE").build();
    }

    public snh(Class<? extends slm> cls) {
        this.a = (Class) Preconditions.checkNotNull(cls);
        this.b = (String) Preconditions.checkNotNull(c.get(cls));
    }

    public final Class<? extends slm> a() {
        return this.a;
    }

    public final slm a(Context context) {
        Class cls = this.a;
        if (cls == som.class) {
            return new som(context);
        }
        if (cls == sog.class) {
            return new sog(context);
        }
        if (cls == sol.class) {
            return new sol(context);
        }
        if (cls == smw.class) {
            return new smw(context);
        }
        if (cls == snp.class) {
            return new snp(context);
        }
        if (cls == sob.class) {
            return new sob(context);
        }
        if (cls == soo.class) {
            return new soo(context);
        }
        if (cls == soa.class) {
            return new soa(context);
        }
        if (cls == snk.class) {
            return new snk(context);
        }
        if (cls == snj.class) {
            return new snj(context);
        }
        if (cls == soi.class) {
            return new soi(context);
        }
        if (cls == smx.class) {
            return new smx(context);
        }
        if (cls == sno.class) {
            return new sno(context);
        }
        if (cls == snq.class) {
            return new snq(context);
        }
        if (cls == snb.class) {
            return new snb(context);
        }
        if (cls == snd.class) {
            return new snd(context);
        }
        if (cls == soj.class) {
            return new soj(context);
        }
        if (cls == sng.class) {
            return new sng(context);
        }
        if (cls == sok.class) {
            return new sok(context);
        }
        if (cls == spf.class) {
            return new spf(context);
        }
        if (cls == spd.class) {
            return new spd(context);
        }
        if (cls == spg.class) {
            return new spg(context);
        }
        if (cls == snz.class) {
            return new snz(context);
        }
        if (cls == snc.class) {
            return new snc(context);
        }
        if (cls == smv.class) {
            return new smv(context);
        }
        if (cls == sni.class) {
            return new sni(context);
        }
        if (cls == sof.class) {
            return new sof(context);
        }
        if (cls == spl.class) {
            return new spl(context);
        }
        if (cls == spe.class) {
            return new spe(context);
        }
        if (cls == snm.class) {
            return new snm(context);
        }
        if (cls == spj.class) {
            return new spj(context);
        }
        if (cls == soh.class) {
            return new soh(context);
        }
        StringBuilder stringBuilder = new StringBuilder("Unrecognized layer type: ");
        stringBuilder.append(this.a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final String b() {
        return this.b;
    }
}
