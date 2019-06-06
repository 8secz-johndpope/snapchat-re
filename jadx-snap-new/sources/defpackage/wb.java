package defpackage;

import android.net.Uri;
import com.brightcove.player.media.MediaService;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wb */
public final class wb extends wd {
    private final wl e;

    public wb(wl wlVar) {
        try {
            this.b = new wg(wa.a());
        } catch (SSLException unused) {
            this.b = null;
        }
        this.e = wlVar;
    }

    public final String a(String str, String str2) {
        if (this.e instanceof wr) {
            str2 = new JSONObject(str2).put("authorizationFingerprint", ((wr) this.e).a).toString();
        }
        return super.a(str, str2);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(HttpURLConnection httpURLConnection) {
        try {
            return super.a(httpURLConnection);
        } catch (ux | vj e) {
            if (e instanceof ux) {
                throw new ux(new vd(403, e.getMessage()).getMessage());
            }
            throw new vd(422, e.getMessage());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HttpURLConnection a(String str) {
        HttpURLConnection a = super.a(str);
        wl wlVar = this.e;
        if (wlVar instanceof xi) {
            a.setRequestProperty("Client-Key", wlVar.toString());
        }
        return a;
    }

    public final void a(String str, String str2, vq vqVar) {
        try {
            if (this.e instanceof wr) {
                str2 = new JSONObject(str2).put("authorizationFingerprint", ((wr) this.e).a).toString();
            }
            super.a(str, str2, vqVar);
        } catch (JSONException e) {
            a(vqVar, (Exception) e);
        }
    }

    public final void a(String str, vq vqVar) {
        if (str == null) {
            a(vqVar, (Exception) new IllegalArgumentException("Path cannot be null"));
            return;
        }
        if (!str.startsWith(MediaService.DEFAULT_MEDIA_DELIVERY)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append(str);
            str = stringBuilder.toString();
        }
        Uri parse = Uri.parse(str);
        if (this.e instanceof wr) {
            parse = parse.buildUpon().appendQueryParameter("authorizationFingerprint", ((wr) this.e).a).build();
        }
        super.a(parse.toString(), vqVar);
    }
}
