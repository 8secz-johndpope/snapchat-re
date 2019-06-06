package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.snapchat.bridgeWebview.Message;
import com.snapchat.bridgeWebview.WebGLDetectionCallback;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acbq */
public class acbq extends WebView {
    public Map<String, acbo> a = new HashMap();
    Map<String, a> b = new HashMap();
    abst c = abst.a();
    zfw d;
    ajei e;

    /* renamed from: acbq$1 */
    class 1 implements Runnable {
        private /* synthetic */ String a;

        1(String str) {
            this.a = str;
        }

        public final void run() {
            Message message = (Message) acbq.this.c.a(this.a, Message.class);
            if (message != null) {
                acbq acbq;
                if (message.nativeCallbackId != null) {
                    acbq = acbq.this;
                    a aVar = (a) acbq.b.remove(message.nativeCallbackId);
                    if (aVar != null && VERSION.SDK_INT >= 19) {
                        aVar.onReceiveValue(message.callbackData);
                    }
                    return;
                }
                acbq = acbq.this;
                String str = message.method;
                acbo acbo = (acbo) acbq.a.get(str);
                if (acbo != null) {
                    try {
                        acbo.getClass().getMethod(str, new Class[]{Message.class}).invoke(acbo, new Object[]{message});
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: acbq$3 */
    public class 3 implements Runnable {
        private /* synthetic */ String a;
        private /* synthetic */ WebGLDetectionCallback b;

        public 3(String str, WebGLDetectionCallback webGLDetectionCallback) {
            this.a = str;
            this.b = webGLDetectionCallback;
        }

        public final void run() {
            if (VERSION.SDK_INT >= 19) {
                acbq.this.evaluateJavascript(this.a, this.b);
                return;
            }
            acbq acbq = acbq.this;
            StringBuilder stringBuilder = new StringBuilder("javascript:");
            stringBuilder.append(this.a);
            acbq.loadUrl(stringBuilder.toString());
        }
    }

    /* renamed from: acbq$a */
    public interface a {
        void onReceiveValue(String str);
    }

    public acbq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zfy zfy = new zfy("Cognac");
        this.d = zfy.a(eym.f.callsite("BridgeWebview"));
        this.e = new ajei();
        setWebViewClient(new acbp());
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new acbr(this), acbr.JAVASCRIPT_INTERFACE_NAME);
    }

    private String a(Message message) {
        return this.c.a((Object) message);
    }

    private String a(String str, Message message) {
        String str2 = "\"";
        String replace = a(message).replace("\\", "\\\\").replace(str2, "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace(" ", "\\u2028").replace(" ", "\\u2029");
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("(");
        stringBuilder.append(str2);
        stringBuilder.append(replace);
        stringBuilder.append(str2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void a(final Message message, final a aVar) {
        if (abmr.c()) {
            a("handleNativeCall", message, aVar);
        } else {
            post(new Runnable() {
                public final void run() {
                    acbq.this.a("handleNativeCall", message, aVar);
                }
            });
        }
    }

    public final void a(Message message, String str) {
        if (message.jsCallbackId != null) {
            final Message message2 = new Message();
            message2.method = "callJsCallback";
            message2.jsCallbackId = message.jsCallbackId;
            message2.callbackData = str;
            post(new Runnable() {
                public final void run() {
                    acbq.this.a(message2.method, message2, null);
                }
            });
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, Message message, a aVar) {
        if (aVar != null) {
            String uuid = abpu.a().toString();
            message.nativeCallbackId = uuid;
            this.b.put(uuid, aVar);
        }
        str = a(str, message);
        if (VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
            return;
        }
        loadUrl("javascript:".concat(String.valueOf(str)));
    }

    public void destroy() {
        super.destroy();
        this.e.a();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (webViewClient instanceof acbp) {
            super.setWebViewClient(webViewClient);
            return;
        }
        throw new IllegalArgumentException("WebviewClient must be a subclass of BridgeWebviewClient");
    }
}
