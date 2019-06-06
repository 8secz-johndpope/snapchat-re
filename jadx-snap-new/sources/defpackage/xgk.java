package defpackage;

import android.bluetooth.BluetoothDevice;
import com.brightcove.player.event.EventType;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.xgf.a;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: xgk */
public final class xgk {
    private final ajxe a = ajxh.a(c.a);
    private final ajxe b = ajxh.a(f.a);
    private final ajxe c = ajxh.a(e.a);
    private final ajxe d = ajxh.a(a.a);
    private final ajxe e = ajxh.a(bo.a);
    private final ajxe f = ajxh.a(d.a);
    private final ajxe g = ajxh.a(i.a);
    private final ajxe h = ajxh.a(b.a);
    private final ajxe i = ajxh.a(bp.a);
    private final ajxe j = ajxh.a(g.a);
    private final ajdw k;

    /* renamed from: xgk$c */
    static final class c extends akcs implements akbk<ajwo<xge>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$f */
    static final class f extends akcs implements akbk<ajwo<ajxr<? extends xdb, ? extends xgj, ? extends xgi>>> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$e */
    static final class e extends akcs implements akbk<ajwo<xgf>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$a */
    static final class a extends akcs implements akbk<ajwo<abhw>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$bo */
    static final class bo extends akcs implements akbk<ajwo<xgl>> {
        public static final bo a = new bo();

        bo() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$d */
    static final class d extends akcs implements akbk<ajwo<ajxr<? extends xgh, ? extends Integer, ? extends BluetoothDevice>>> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: xgk$i */
    static final class i extends akcs implements akbk<ajwl<xgg>> {
        public static final i a = new i();

        i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: xgk$b */
    static final class b extends akcs implements akbk<ajwl<xgd>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: xgk$bp */
    static final class bp extends akcs implements akbk<ajwl<Boolean>> {
        public static final bp a = new bp();

        bp() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: xgk$g */
    static final class g extends akcs implements akbk<ajwl<ajxm<? extends xdb, ? extends xjm>>> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: xgk$as */
    public static final class as extends akcs implements akbl<xgk, ajxw> {
        public static final as a = new as();

        as() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xhq.d("Application event: onForegrounded", new Object[0]);
            xgk.h().a(xgd.APPLICATION_FOREGROUNDED);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$h */
    static final class h<V> implements Callable<Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ akbl b;

        h(Object obj, akbl akbl) {
            this.a = obj;
            this.b = akbl;
        }

        public final /* synthetic */ Object call() {
            this.b.invoke(this.a);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$l */
    public static final class l extends akcs implements akbl<xgk, ajxw> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xhq.d("Application event: onBackgrounded", new Object[0]);
            xgk.h().a(xgd.APPLICATION_BACKGROUNDED);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$aa */
    public static final class aa extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;

        public aa(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onEncryptionLayerFailure: device=");
            stringBuilder.append(this.a);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.ENCYRPTION_LAYER_FAILURE, null, null, null, null, 60));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ab */
    public static final class ab extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ab(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFetchingFirmwareDigest: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_FETCHING_DIGEST, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ac */
    static final class ac extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ Set c;
        private /* synthetic */ xgm.a d;
        private /* synthetic */ List e;

        ac(String str, xdb xdb, Set set, xgm.a aVar, List list) {
            this.a = str;
            this.b = xdb;
            this.c = set;
            this.d = aVar;
            this.e = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFinishedTransferringData: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", spectaclesMediaFileType=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.d);
            stringBuilder.append(", contentsSize = ");
            stringBuilder.append(this.e.size());
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.b, xgl.a.FINISHED_TRANSFERRING_DATA, null, this.d, null, null, this.a, this.e, this.c, null, 0, 0, 0, false, null, null, 65076);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ad */
    public static final class ad extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ad(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareApplyingPatch: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_APPLYING_PATCH, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ae */
    public static final class ae extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ae(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareDownloaded: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_DOWNLOADED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$af */
    public static final class af extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public af(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareDownloading: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_DOWNLOADING, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ag */
    public static final class ag extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;
        private /* synthetic */ xcp c;

        public ag(xdb xdb, String str, xcp xcp) {
            this.a = xdb;
            this.b = str;
            this.c = xcp;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareLogsDownloaded: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", logName=");
            stringBuilder.append(this.b);
            stringBuilder.append(", reason=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.FIRMWARE_LOGS_DOWNLOADED, null, this.b, this.c, null, 36));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ah */
    public static final class ah extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ah(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwarePatchApplied: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_APPLIED_PATCH, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ai */
    public static final class ai extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ai(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwarePatchVerified: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_PATCH_VERIFIED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$aj */
    static final class aj extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ float b;
        private /* synthetic */ boolean c;

        aj(xdb xdb, float f, boolean z) {
            this.a = xdb;
            this.b = f;
            this.c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareProgressUpdate: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", progress=");
            stringBuilder.append(this.b);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwl g = xgk.g();
            xdb xdb = this.a;
            float f = this.b;
            g.a((Object) new xgg(xdb, xgg.a.FIRMWARE_PROGRESS_UPDATE, this.c, f, null, 48));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ak */
    public static final class ak extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ak(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareResetState: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.EMPTY, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$al */
    public static final class al extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public al(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareReverted: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_REVERTED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$am */
    public static final class am extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public am(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareReverting: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_REVERTING, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$an */
    static final class an extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        an(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareTransferFailed: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_TRANSFER_FAILED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ao */
    public static final class ao extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ao(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareTransferred: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_TRANSFERRED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ap */
    static final class ap extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        ap(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareUpdateFailed: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_UPDATE_FAILED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$aq */
    static final class aq extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        aq(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareUpdated: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_UPDATED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ar */
    public static final class ar extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public ar(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onFirmwareUpdating: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_UPDATING, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$at */
    public static final class at extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;

        public at(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onIntermediateFirmwareUpdated: device=");
            stringBuilder.append(this.a);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.INTERMEDIATE_FIRMWARE_UPDATED, false, MapboxConstants.MINIMUM_ZOOM, null, 60));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$au */
    static final class au extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ MessageNano b;

        au(xdb xdb, MessageNano messageNano) {
            this.a = xdb;
            this.b = messageNano;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onLagunaBleResponseReceived: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", response=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.a().a((Object) new xge(this.a, xge.a.LAGUNA_BLE_RESPONSE, this.b, null, 8));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$av */
    static final class av extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ MessageNano b;

        av(xdb xdb, MessageNano messageNano) {
            this.a = xdb;
            this.b = messageNano;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onLagunaDebugReportReceived: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", debugReport=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.LAGUNA_DEBUG_REPORT_RECEIVED, this.b, null, null, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$aw */
    public static final class aw extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ MessageNano b;

        public aw(xdb xdb, MessageNano messageNano) {
            this.a = xdb;
            this.b = messageNano;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onMalibuBleResponseReceived: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", response=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.a().a((Object) new xge(this.a, xge.a.MALIBU_BLE_RESPONSE, this.b, null, 8));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ax */
    public static final class ax extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ MessageNano b;

        public ax(xdb xdb, MessageNano messageNano) {
            this.a = xdb;
            this.b = messageNano;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onMalibuCrashReportReceived: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", crashReport=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.MALIBU_CRASH_REPORT_RECEIVED, this.b, null, null, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ay */
    static final class ay extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ MessageNano b;

        ay(xdb xdb, MessageNano messageNano) {
            this.a = xdb;
            this.b = messageNano;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onMalibuErrorReportReceived; device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", errorReport=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.MALIBU_ERROR_REPORT_RECEIVED, this.b, null, null, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$az */
    static final class az extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xgh a;

        az(xgh xgh) {
            this.a = xgh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onOperationUpdate: operationStatus=");
            stringBuilder.append(this.a);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.f().a(new ajxr(this.a, Integer.valueOf(0), null));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$ba */
    static final class ba extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xdf b;
        private /* synthetic */ xdj c;
        private /* synthetic */ xgm.a d;

        ba(xdb xdb, xdf xdf, xdj xdj, xgm.a aVar) {
            this.a = xdb;
            this.b = xdf;
            this.c = xdj;
            this.d = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onSessionFailedToStart: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mediaType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", transferHaltReason=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.d);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.a, xgl.a.SESSION_FAILED_TO_START, null, this.d, this.b, this.c, null, null, null, null, 0, 0, 0, false, null, null, 65476);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bb */
    public static final class bb extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xdk b;
        private /* synthetic */ xgm.a c;

        public bb(xdb xdb, xdk xdk, xgm.a aVar) {
            this.a = xdb;
            this.b = xdk;
            this.c = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onSessionFinished: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.b);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.a, xgl.a.SESSION_FINISHED, this.b, this.c, null, null, null, null, null, null, 0, 0, 0, false, null, null, 65520);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bc */
    static final class bc extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xdk b;

        bc(xdb xdb, xdk xdk) {
            this.a = xdb;
            this.b = xdk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onSessionStarted: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", contentTransferMode:");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.a, xgl.a.SESSION_STARTED, this.b, null, null, null, null, null, null, null, 0, 0, 0, false, null, null, 65528);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bd */
    public static final class bd extends akcs implements akbl<xgk, ajxw> {
        public static final bd a = new bd();

        bd() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xhq.d("Application event: onStartUserInteraction", new Object[0]);
            xgk.i().a(Boolean.TRUE);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$be */
    public static final class be extends akcs implements akbl<xgk, ajxw> {
        public static final be a = new be();

        be() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xhq.d("Application event: onStopUserInteraction", new Object[0]);
            xgk.i().a(Boolean.FALSE);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bf */
    static final class bf extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdk c;
        private /* synthetic */ List d;

        bf(String str, xdb xdb, xdk xdk, List list) {
            this.a = str;
            this.b = xdb;
            this.c = xdk;
            this.d = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferContentsDetermined transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.c);
            stringBuilder.append(", size=");
            stringBuilder.append(this.d.size());
            stringBuilder.append(", contents=");
            stringBuilder.append(this.d);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.b, xgl.a.TRANSFER_CONTENTS_DETERMINED, this.c, null, null, null, this.a, this.d, null, null, 0, 0, 0, false, null, null, 65336);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bg */
    static final class bg extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdk c;
        private /* synthetic */ xgm.a d;

        bg(String str, xdb xdb, xdk xdk, xgm.a aVar) {
            this.a = str;
            this.b = xdb;
            this.c = xdk;
            this.d = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferFinished: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.d);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.b, xgl.a.TRANSFER_FINISHED, this.c, this.d, null, null, null, null, null, null, 0, 0, 0, false, null, null, 65520);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bh */
    static final class bh extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdj c;
        private /* synthetic */ xdk d;
        private /* synthetic */ xdf e;
        private /* synthetic */ xgm.a f;

        bh(String str, xdb xdb, xdj xdj, xdk xdk, xdf xdf, xgm.a aVar) {
            this.a = str;
            this.b = xdb;
            this.c = xdj;
            this.d = xdk;
            this.e = xdf;
            this.f = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferInterrupted: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", transferHaltReason=");
            stringBuilder.append(this.c);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.d);
            stringBuilder.append(", transferSessionVideoType=");
            stringBuilder.append(this.e);
            stringBuilder.append(" ,transferPriority=");
            stringBuilder.append(this.f);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.b, xgl.a.TRANSFER_INTERRUPTED, this.d, this.f, this.e, this.c, this.a, null, null, null, 0, 0, 0, false, null, null, 65408);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bi */
    static final class bi extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;
        private /* synthetic */ xdi c;

        bi(xdb xdb, String str, xdi xdi) {
            this.a = xdb;
            this.b = str;
            this.c = xdi;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferPrioritization device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mediaId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", transferPrioritizationState:");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.a, xgl.a.TRANSFER_PRIORITIZATION, null, null, null, null, null, null, null, null, 0, 0, 0, false, this.b, this.c, 16380);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bj */
    public static final class bj extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ float b;
        private /* synthetic */ boolean c;

        public bj(xdb xdb, float f, boolean z) {
            this.a = xdb;
            this.b = f;
            this.c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferProgressUpdate: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", progress=");
            stringBuilder.append(this.b);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwl g = xgk.g();
            xdb xdb = this.a;
            float f = this.b;
            g.a((Object) new xgg(xdb, xgg.a.FIRMWARE_TRANSFER_PROGRESS_UPDATE, this.c, f, null, 48));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bk */
    public static final class bk extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        public bk(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferStarted: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.FIRMWARE_TRANSFER_STARTED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bl */
    static final class bl extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdk c;
        private /* synthetic */ xgm.a d;

        bl(String str, xdb xdb, xdk xdk, xgm.a aVar) {
            this.a = str;
            this.b = xdb;
            this.c = xdk;
            this.d = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferStarted: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferSessionId=");
            stringBuilder.append(this.a);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xgl xgl = r2;
            xgl xgl2 = new xgl(this.b, xgl.a.TRANSFER_STARTED, this.c, this.d, null, null, this.a, null, null, null, 0, 0, 0, false, null, null, 65456);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bm */
    public static final class bm extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ Set c;
        private /* synthetic */ xgm.a d;
        private /* synthetic */ List e;

        public bm(String str, xdb xdb, Set set, xgm.a aVar, List list) {
            this.a = str;
            this.b = xdb;
            this.c = set;
            this.d = aVar;
            this.e = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onTransferringData: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", spectaclesMediaFileType=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.d);
            stringBuilder.append(", contentsSize=");
            stringBuilder.append(this.e.size());
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xdb xdb = this.b;
            xgl.a aVar = xgl.a.TRANSFERRING_DATA;
            Set set = this.c;
            xgl xgl = r2;
            xgl xgl2 = new xgl(xdb, aVar, null, this.d, null, null, this.a, this.e, set, null, 0, 0, 0, false, null, null, 65076);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$bn */
    public static final class bn extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;

        public bn(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onUnexpectedVersionReceived: device=");
            stringBuilder.append(this.a);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.UNEXPECTED_VERSION_RECEIVED, false, MapboxConstants.MINIMUM_ZOOM, null, 60));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$j */
    public static final class j extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ BluetoothDevice a;
        private /* synthetic */ int b;

        public j(BluetoothDevice bluetoothDevice, int i) {
            this.a = bluetoothDevice;
            this.b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onAmbientSensorDataUpdate; bluetoothDevice=");
            stringBuilder.append(this.a);
            stringBuilder.append(" data=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.f().a(new ajxr(null, Integer.valueOf(this.b), this.a));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$k */
    public static final class k extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;

        public k(xdb xdb, String str) {
            this.a = xdb;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onAnalyticsFileDownloaded: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(" analyticsFileName=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.c().a((Object) new xgf(this.a, a.ANALYTICS_FILE_DOWNLOADED, null, null, null, this.b, 28));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$m */
    static final class m extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;

        m(xdb xdb) {
            this.a = xdb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onBleEncryptionComplete: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", encryptionKey=");
            byte[] d = this.a.d();
            stringBuilder.append(d != null ? d.toString() : null);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.a().a((Object) new xge(this.a, xge.a.BLE_ENCRYPTION_COMPLETE, null, null, 12));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$n */
    static final class n extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ abhw a;

        n(abhw abhw) {
            this.a = abhw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onBlizzardAnalyticsEvent : ");
            stringBuilder.append(this.a.asDictionary());
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.d().a(this.a);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$o */
    public static final class o extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdf c;
        private /* synthetic */ xgm.a d;
        private /* synthetic */ xfe e;

        public o(String str, xdb xdb, xdf xdf, xgm.a aVar, xfe xfe) {
            this.a = str;
            this.b = xdb;
            this.c = xdf;
            this.d = aVar;
            this.e = xfe;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onContentDownloadFailure: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", fileType=");
            stringBuilder.append(this.c);
            stringBuilder.append(" transferPriority=");
            stringBuilder.append(this.d);
            stringBuilder.append(", content=");
            stringBuilder.append(this.e);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xdb xdb = this.b;
            xgl.a aVar = xgl.a.CONTENT_DOWNLOAD_FAILURE;
            String str = this.a;
            xfe xfe = this.e;
            xgl xgl = r2;
            xgl xgl2 = new xgl(xdb, aVar, null, this.d, this.c, null, str, null, null, xfe, 0, 0, 0, false, null, null, 64932);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$p */
    static final class p extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdf c;
        private /* synthetic */ xgm.a d;
        private /* synthetic */ xdk e;
        private /* synthetic */ xfe f;

        p(String str, xdb xdb, xdf xdf, xgm.a aVar, xdk xdk, xfe xfe) {
            this.a = str;
            this.b = xdb;
            this.c = xdf;
            this.d = aVar;
            this.e = xdk;
            this.f = xfe;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onContentDownloadStart: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", fileType=");
            stringBuilder.append(this.c);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.d);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.e);
            stringBuilder.append(", content=");
            stringBuilder.append(this.f);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xdb xdb = this.b;
            xgl.a aVar = xgl.a.CONTENT_DOWNLOAD_START;
            xfe xfe = this.f;
            xdf xdf = this.c;
            xgl xgl = r2;
            xgl xgl2 = new xgl(xdb, aVar, this.e, this.d, xdf, null, this.a, null, null, xfe, 0, 0, 0, false, null, null, 64928);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$q */
    static final class q extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xfe c;
        private /* synthetic */ xdf d;
        private /* synthetic */ xgm.a e;
        private /* synthetic */ xdk f;
        private /* synthetic */ long g;
        private /* synthetic */ long h;
        private /* synthetic */ boolean i;

        q(String str, xdb xdb, xfe xfe, xdf xdf, xgm.a aVar, xdk xdk, long j, long j2, boolean z) {
            this.a = str;
            this.b = xdb;
            this.c = xfe;
            this.d = xdf;
            this.e = aVar;
            this.f = xdk;
            this.g = j;
            this.h = j2;
            this.i = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onContentDownloadSuccess: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            stringBuilder.append(", content=");
            stringBuilder.append(this.c);
            stringBuilder.append(", fileType=");
            stringBuilder.append(this.d);
            stringBuilder.append(", transferPriority=");
            stringBuilder.append(this.e);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.f);
            stringBuilder.append(", latency=");
            stringBuilder.append(this.g);
            stringBuilder.append(" transferSpeed=");
            stringBuilder.append(this.h);
            stringBuilder.append(", cached=");
            stringBuilder.append(this.i);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xdb xdb = this.b;
            xgl.a aVar = xgl.a.CONTENT_DOWNLOAD_SUCCESS;
            String str = this.a;
            xfe xfe = this.c;
            xdf xdf = this.d;
            xgm.a aVar2 = this.e;
            xgl xgl = r2;
            int i = 0;
            xgl xgl2 = new xgl(xdb, aVar, this.f, aVar2, xdf, null, str, null, null, xfe, i, this.g, this.h, this.i, null, null, 50592);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$r */
    public static final class r extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ xdb b;
        private /* synthetic */ xdf c;
        private /* synthetic */ xgm.a d;
        private /* synthetic */ int e;
        private /* synthetic */ xfe f;
        private /* synthetic */ xdk g;

        public r(String str, xdb xdb, xdf xdf, xgm.a aVar, int i, xfe xfe, xdk xdk) {
            this.a = str;
            this.b = xdb;
            this.c = xdf;
            this.d = aVar;
            this.e = i;
            this.f = xfe;
            this.g = xdk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onContentDownloading: transferSessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", device=");
            stringBuilder.append(this.b);
            String str = ", fileType=";
            stringBuilder.append(str);
            stringBuilder.append(this.c);
            stringBuilder.append(" transferPriority=");
            stringBuilder.append(this.d);
            stringBuilder.append(" progressPercent=");
            stringBuilder.append(this.e);
            stringBuilder.append(", content=");
            stringBuilder.append(this.f);
            stringBuilder.append(", contentTransferMode=");
            stringBuilder.append(this.g);
            stringBuilder.append(str);
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            ajwo e = xgk.e();
            xdb xdb = this.b;
            xgl.a aVar = xgl.a.CONTENT_DOWNLOADING;
            String str2 = this.a;
            int i = this.e;
            xfe xfe = this.f;
            xdf xdf = this.c;
            xgl xgl = r2;
            xgl xgl2 = new xgl(xdb, aVar, this.g, this.d, xdf, null, str2, null, null, xfe, i, 0, 0, false, null, null, 63904);
            e.a((Object) xgl);
            return ajxw.a;
        }
    }

    /* renamed from: xgk$s */
    static final class s extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xjm b;

        s(xdb xdb, xjm xjm) {
            this.a = xdb;
            this.b = xjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDeviceStatusChange device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", newState=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.j().a(new ajxm(this.a, this.b));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$t */
    static final class t extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xgj b;

        t(xdb xdb, xgj xgj) {
            this.a = xdb;
            this.b = xgj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xdb xdb = this.a;
            xgk.a(xdb, this.b, new xgi(xdb.n, this.a.z(), null));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$u */
    public static final class u extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xgj b;
        private /* synthetic */ xeg c;

        public u(xdb xdb, xgj xgj, xeg xeg) {
            this.a = xdb;
            this.b = xgj;
            this.c = xeg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            xdb xdb = this.a;
            xgk.a(xdb, this.b, new xgi(xdb.n, this.a.z(), this.c));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$v */
    static final class v extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ xgj b;
        private /* synthetic */ xgi c;

        v(xdb xdb, xgj xgj, xgi xgi) {
            this.a = xdb;
            this.b = xgj;
            this.c = xgi;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDeviceUpdate: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(" updateType=");
            stringBuilder.append(this.b);
            stringBuilder.append(" deviceEvent=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.b().a(new ajxr(this.a, this.b, this.c));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$w */
    public static final class w extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;
        private /* synthetic */ boolean c;

        public w(xdb xdb, String str, boolean z) {
            this.a = xdb;
            this.b = str;
            this.c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDigestReceivedFirmwareAppliedPatch: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", digest=");
            stringBuilder.append(this.b);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.DIGEST_RECEIVED_FIRMWARE_APPLIED_PATCH, this.c, MapboxConstants.MINIMUM_ZOOM, this.b, 24));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$x */
    public static final class x extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;
        private /* synthetic */ String c;

        public x(xdb xdb, boolean z, String str) {
            this.a = xdb;
            this.b = z;
            this.c = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDigestReceivedFirmwareFetchingDigest: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            stringBuilder.append(", digest=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.DIGEST_RECEIVED_FIRMWARE_FETCHING_DIGEST, this.b, MapboxConstants.MINIMUM_ZOOM, this.c, 24));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$y */
    public static final class y extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ String b;
        private /* synthetic */ boolean c;

        public y(xdb xdb, String str, boolean z) {
            this.a = xdb;
            this.b = str;
            this.c = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDigestReceivedFirmwareReverted: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", digest=");
            stringBuilder.append(this.b);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.c);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.DIGEST_RECEIVED_FIRMWARE_REVERTED, this.c, MapboxConstants.MINIMUM_ZOOM, this.b, 24));
            return ajxw.a;
        }
    }

    /* renamed from: xgk$z */
    static final class z extends akcs implements akbl<xgk, ajxw> {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        z(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            xgk xgk = (xgk) obj;
            akcr.b(xgk, "$receiver");
            StringBuilder stringBuilder = new StringBuilder("onDownloadFailed: device=");
            stringBuilder.append(this.a);
            stringBuilder.append(", backgroundUpdate=");
            stringBuilder.append(this.b);
            xhq.d(stringBuilder.toString(), new Object[0]);
            xgk.g().a((Object) new xgg(this.a, xgg.a.DOWNLOAD_FAILED, this.b, MapboxConstants.MINIMUM_ZOOM, null, 56));
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xgk.class), "bleEventObservable", "getBleEventObservable()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "deviceEventObservable", "getDeviceEventObservable()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "debugEventObservable", "getDebugEventObservable()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "analyticsEventObservable", "getAnalyticsEventObservable()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "transferEventPublishSubject", "getTransferEventPublishSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "bleScanObservable", "getBleScanObservable()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(xgk.class), "firmwareUpdateBehaviorSubject", "getFirmwareUpdateBehaviorSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(xgk.class), "applicationEventObservable", "getApplicationEventObservable()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(xgk.class), "userInteractingEventObservable", "getUserInteractingEventObservable()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(xgk.class), "deviceStatusObservable", "getDeviceStatusObservable()Lio/reactivex/subjects/BehaviorSubject;")};
    }

    public xgk(ajdw ajdw) {
        akcr.b(ajdw, "scheduler");
        this.k = ajdw;
    }

    public final <T> ajej a(T t, akbl<? super T, ajxw> akbl) {
        akcr.b(akbl, "block");
        Object e = ajcx.b((Callable) new h(t, akbl)).b(this.k).e();
        akcr.a(e, "Completable.fromCallable…On(scheduler).subscribe()");
        return e;
    }

    public final ajwo<xge> a() {
        return (ajwo) this.a.b();
    }

    public final void a(abhw abhw) {
        akcr.b(abhw, "userTrackedEvent");
        a((Object) this, (akbl) new n(abhw));
    }

    public final void a(String str, xdb xdb, Set<? extends xdf> set, List<? extends xfe> list, xgm.a aVar) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(set, "spectaclesMediaFileTypes");
        akcr.b(list, "contents");
        akcr.b(aVar, "transferPriority");
        a((Object) this, (akbl) new ac(str, xdb, set, aVar, list));
    }

    public final void a(String str, xdb xdb, xdk xdk, List<? extends xfe> list) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdk, "contentTransferMode");
        akcr.b(list, "contents");
        a((Object) this, (akbl) new bf(str, xdb, xdk, list));
    }

    public final void a(String str, xdb xdb, xdk xdk, xdf xdf, xdj xdj, xgm.a aVar) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdk, "contentTransferMode");
        akcr.b(xdf, "transferSessionVideoType");
        akcr.b(xdj, "transferHaltReason");
        akcr.b(aVar, "transferPriority");
        a((Object) this, (akbl) new bh(str, xdb, xdj, xdk, xdf, aVar));
    }

    public final void a(String str, xdb xdb, xdk xdk, xgm.a aVar) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdk, "contentTransferMode");
        akcr.b(aVar, "transferPriority");
        a((Object) this, (akbl) new bl(str, xdb, xdk, aVar));
    }

    public final void a(String str, xdb xdb, xfe xfe, xdf xdf, xgm.a aVar, xdk xdk) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xfe, "content");
        akcr.b(xdf, "fileType");
        akcr.b(aVar, "transferPriority");
        akcr.b(xdk, "contentTransferMode");
        a((Object) this, (akbl) new p(str, xdb, xdf, aVar, xdk, xfe));
    }

    public final void a(String str, xdb xdb, xfe xfe, xdf xdf, xgm.a aVar, xdk xdk, long j, long j2, boolean z) {
        String str2 = str;
        akcr.b(str, "transferSessionId");
        xdb xdb2 = xdb;
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        xfe xfe2 = xfe;
        akcr.b(xfe2, "content");
        xdf xdf2 = xdf;
        akcr.b(xdf2, "fileType");
        xgm.a aVar2 = aVar;
        akcr.b(aVar2, "transferPriority");
        xdk xdk2 = xdk;
        akcr.b(xdk2, "contentTransferMode");
        akbl qVar = new q(str2, xdb2, xfe2, xdf2, aVar2, xdk2, j, j2, z);
        a((Object) this, qVar);
    }

    public final void a(xdb xdb) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new m(xdb));
    }

    public final void a(xdb xdb, float f, boolean z) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new aj(xdb, f, z));
    }

    public final void a(xdb xdb, MessageNano messageNano) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(messageNano, EventType.RESPONSE);
        a((Object) this, (akbl) new au(xdb, messageNano));
    }

    public final void a(xdb xdb, String str, xdi xdi) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(str, "mediaId");
        akcr.b(xdi, "state");
        a((Object) this, (akbl) new bi(xdb, str, xdi));
    }

    public final void a(xdb xdb, xdf xdf, xdj xdj, xgm.a aVar) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdf, "transferSessionMediaType");
        akcr.b(xdj, "transferHaltReason");
        akcr.b(aVar, "transferPriority");
        a((Object) this, (akbl) new ba(xdb, xdf, xdj, aVar));
    }

    public final void a(xdb xdb, xdk xdk) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdk, "contentTransferMode");
        a((Object) this, (akbl) new bc(xdb, xdk));
    }

    public final void a(xdb xdb, xgj xgj) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xgj, "updateType");
        a((Object) this, (akbl) new t(xdb, xgj));
    }

    public final void a(xdb xdb, xgj xgj, xgi xgi) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xgj, "updateType");
        akcr.b(xgi, "deviceEvent");
        a((Object) this, (akbl) new v(xdb, xgj, xgi));
    }

    public final void a(xdb xdb, xjm xjm) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xjm, "newState");
        a((Object) this, (akbl) new s(xdb, xjm));
    }

    public final void a(xdb xdb, boolean z) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new z(xdb, z));
    }

    public final void a(xgh xgh) {
        akcr.b(xgh, "operationStatus");
        a((Object) this, (akbl) new az(xgh));
    }

    public final ajwo<ajxr<xdb, xgj, xgi>> b() {
        return (ajwo) this.b.b();
    }

    public final void b(String str, xdb xdb, xdk xdk, xgm.a aVar) {
        akcr.b(str, "transferSessionId");
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(xdk, "contentTransferMode");
        akcr.b(aVar, "transferPriority");
        a((Object) this, (akbl) new bg(str, xdb, xdk, aVar));
    }

    public final void b(xdb xdb, MessageNano messageNano) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(messageNano, "debugReport");
        a((Object) this, (akbl) new av(xdb, messageNano));
    }

    public final void b(xdb xdb, boolean z) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new an(xdb, z));
    }

    public final ajwo<xgf> c() {
        return (ajwo) this.c.b();
    }

    public final void c(xdb xdb, MessageNano messageNano) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        akcr.b(messageNano, "errorReport");
        a((Object) this, (akbl) new ay(xdb, messageNano));
    }

    public final void c(xdb xdb, boolean z) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new aq(xdb, z));
    }

    public final ajwo<abhw> d() {
        return (ajwo) this.d.b();
    }

    public final void d(xdb xdb, boolean z) {
        akcr.b(xdb, MapboxNavigationEvent.KEY_DEVICE);
        a((Object) this, (akbl) new ap(xdb, z));
    }

    public final ajwo<xgl> e() {
        return (ajwo) this.e.b();
    }

    public final ajwo<ajxr<xgh, Integer, BluetoothDevice>> f() {
        return (ajwo) this.f.b();
    }

    public final ajwl<xgg> g() {
        return (ajwl) this.g.b();
    }

    public final ajwl<xgd> h() {
        return (ajwl) this.h.b();
    }

    public final ajwl<Boolean> i() {
        return (ajwl) this.i.b();
    }

    public final ajwl<ajxm<xdb, xjm>> j() {
        return (ajwl) this.j.b();
    }
}
