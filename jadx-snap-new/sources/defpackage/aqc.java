package defpackage;

import android.graphics.Matrix;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.brightcove.player.captioning.TTMLParser;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.ui.view.TakeSnapButton;
import defpackage.apw.a;
import defpackage.apy.aa;
import defpackage.apy.ab;
import defpackage.apy.ac;
import defpackage.apy.ad;
import defpackage.apy.ad.b;
import defpackage.apy.ae;
import defpackage.apy.af;
import defpackage.apy.ag;
import defpackage.apy.ai;
import defpackage.apy.ak;
import defpackage.apy.al;
import defpackage.apy.am;
import defpackage.apy.an;
import defpackage.apy.ao;
import defpackage.apy.ap;
import defpackage.apy.aq;
import defpackage.apy.ar;
import defpackage.apy.as;
import defpackage.apy.at;
import defpackage.apy.au;
import defpackage.apy.av;
import defpackage.apy.aw;
import defpackage.apy.ax;
import defpackage.apy.ay;
import defpackage.apy.az;
import defpackage.apy.ba;
import defpackage.apy.bb;
import defpackage.apy.bc;
import defpackage.apy.bd;
import defpackage.apy.be;
import defpackage.apy.c;
import defpackage.apy.d;
import defpackage.apy.e;
import defpackage.apy.f;
import defpackage.apy.g;
import defpackage.apy.h;
import defpackage.apy.i;
import defpackage.apy.j;
import defpackage.apy.l;
import defpackage.apy.m;
import defpackage.apy.n;
import defpackage.apy.o;
import defpackage.apy.p;
import defpackage.apy.q;
import defpackage.apy.r;
import defpackage.apy.t;
import defpackage.apy.u;
import defpackage.apy.x;
import defpackage.apy.y;
import defpackage.apy.z;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.opencv.imgproc.Imgproc;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* renamed from: aqc */
public final class aqc extends DefaultHandler2 {
    private apy a = null;
    private ai b = null;
    private boolean c = false;
    private int d;
    private boolean e = false;
    private f f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;
    private Set<String> j = null;

    /* renamed from: aqc$a */
    static class a {
        private static final Map<String, defpackage.apw.a> a;

        static {
            HashMap hashMap = new HashMap(10);
            a = hashMap;
            hashMap.put("none", defpackage.apw.a.None);
            a.put("xMinYMin", defpackage.apw.a.XMinYMin);
            a.put("xMidYMin", defpackage.apw.a.XMidYMin);
            a.put("xMaxYMin", defpackage.apw.a.XMaxYMin);
            a.put("xMinYMid", defpackage.apw.a.XMinYMid);
            a.put("xMidYMid", defpackage.apw.a.XMidYMid);
            a.put("xMaxYMid", defpackage.apw.a.XMaxYMid);
            a.put("xMinYMax", defpackage.apw.a.XMinYMax);
            a.put("xMidYMax", defpackage.apw.a.XMidYMax);
            a.put("xMaxYMax", defpackage.apw.a.XMaxYMax);
        }

        public static defpackage.apw.a a(String str) {
            return (defpackage.apw.a) a.get(str);
        }
    }

    /* renamed from: aqc$b */
    static class b {
        private static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            hashMap.put("aliceblue", Integer.valueOf(15792383));
            a.put("antiquewhite", Integer.valueOf(16444375));
            Map map = a;
            Integer valueOf = Integer.valueOf(65535);
            map.put("aqua", valueOf);
            a.put("aquamarine", Integer.valueOf(8388564));
            a.put("azure", Integer.valueOf(15794175));
            a.put("beige", Integer.valueOf(16119260));
            a.put("bisque", Integer.valueOf(16770244));
            a.put("black", Integer.valueOf(0));
            a.put("blanchedalmond", Integer.valueOf(16772045));
            a.put("blue", Integer.valueOf(255));
            a.put("blueviolet", Integer.valueOf(9055202));
            a.put("brown", Integer.valueOf(10824234));
            a.put("burlywood", Integer.valueOf(14596231));
            a.put("cadetblue", Integer.valueOf(6266528));
            a.put("chartreuse", Integer.valueOf(8388352));
            a.put("chocolate", Integer.valueOf(13789470));
            a.put("coral", Integer.valueOf(16744272));
            a.put("cornflowerblue", Integer.valueOf(6591981));
            a.put("cornsilk", Integer.valueOf(16775388));
            a.put("crimson", Integer.valueOf(14423100));
            a.put("cyan", valueOf);
            a.put("darkblue", Integer.valueOf(Imgproc.COLOR_COLORCVT_MAX));
            a.put("darkcyan", Integer.valueOf(35723));
            a.put("darkgoldenrod", Integer.valueOf(12092939));
            map = a;
            valueOf = Integer.valueOf(11119017);
            map.put("darkgray", valueOf);
            a.put("darkgreen", Integer.valueOf(25600));
            a.put("darkgrey", valueOf);
            a.put("darkkhaki", Integer.valueOf(12433259));
            a.put("darkmagenta", Integer.valueOf(9109643));
            a.put("darkolivegreen", Integer.valueOf(5597999));
            a.put("darkorange", Integer.valueOf(16747520));
            a.put("darkorchid", Integer.valueOf(10040012));
            a.put("darkred", Integer.valueOf(9109504));
            a.put("darksalmon", Integer.valueOf(15308410));
            a.put("darkseagreen", Integer.valueOf(9419919));
            a.put("darkslateblue", Integer.valueOf(4734347));
            map = a;
            valueOf = Integer.valueOf(3100495);
            map.put("darkslategray", valueOf);
            a.put("darkslategrey", valueOf);
            a.put("darkturquoise", Integer.valueOf(52945));
            a.put("darkviolet", Integer.valueOf(9699539));
            a.put("deeppink", Integer.valueOf(16716947));
            a.put("deepskyblue", Integer.valueOf(49151));
            map = a;
            valueOf = Integer.valueOf(6908265);
            map.put("dimgray", valueOf);
            a.put("dimgrey", valueOf);
            a.put("dodgerblue", Integer.valueOf(2003199));
            a.put("firebrick", Integer.valueOf(11674146));
            a.put("floralwhite", Integer.valueOf(16775920));
            a.put("forestgreen", Integer.valueOf(2263842));
            map = a;
            valueOf = Integer.valueOf(16711935);
            map.put("fuchsia", valueOf);
            a.put("gainsboro", Integer.valueOf(14474460));
            a.put("ghostwhite", Integer.valueOf(16316671));
            a.put("gold", Integer.valueOf(16766720));
            a.put("goldenrod", Integer.valueOf(14329120));
            map = a;
            Integer valueOf2 = Integer.valueOf(8421504);
            map.put("gray", valueOf2);
            a.put("green", Integer.valueOf(32768));
            a.put("greenyellow", Integer.valueOf(11403055));
            a.put("grey", valueOf2);
            a.put("honeydew", Integer.valueOf(15794160));
            a.put("hotpink", Integer.valueOf(16738740));
            a.put("indianred", Integer.valueOf(13458524));
            a.put("indigo", Integer.valueOf(4915330));
            a.put("ivory", Integer.valueOf(16777200));
            a.put("khaki", Integer.valueOf(15787660));
            a.put("lavender", Integer.valueOf(15132410));
            a.put("lavenderblush", Integer.valueOf(16773365));
            a.put("lawngreen", Integer.valueOf(8190976));
            a.put("lemonchiffon", Integer.valueOf(16775885));
            a.put("lightblue", Integer.valueOf(11393254));
            a.put("lightcoral", Integer.valueOf(15761536));
            a.put("lightcyan", Integer.valueOf(14745599));
            a.put("lightgoldenrodyellow", Integer.valueOf(16448210));
            map = a;
            valueOf2 = Integer.valueOf(13882323);
            map.put("lightgray", valueOf2);
            a.put("lightgreen", Integer.valueOf(9498256));
            a.put("lightgrey", valueOf2);
            a.put("lightpink", Integer.valueOf(16758465));
            a.put("lightsalmon", Integer.valueOf(16752762));
            a.put("lightseagreen", Integer.valueOf(2142890));
            a.put("lightskyblue", Integer.valueOf(8900346));
            a.put("lightslategray", Integer.valueOf(7833753));
            a.put("lightslategrey", Integer.valueOf(7833753));
            a.put("lightsteelblue", Integer.valueOf(11584734));
            a.put("lightyellow", Integer.valueOf(16777184));
            a.put("lime", Integer.valueOf(65280));
            a.put("limegreen", Integer.valueOf(3329330));
            a.put("linen", Integer.valueOf(16445670));
            a.put("magenta", valueOf);
            a.put("maroon", Integer.valueOf(8388608));
            a.put("mediumaquamarine", Integer.valueOf(6737322));
            a.put("mediumblue", Integer.valueOf(205));
            a.put("mediumorchid", Integer.valueOf(12211667));
            a.put("mediumpurple", Integer.valueOf(9662683));
            a.put("mediumseagreen", Integer.valueOf(3978097));
            a.put("mediumslateblue", Integer.valueOf(8087790));
            a.put("mediumspringgreen", Integer.valueOf(64154));
            a.put("mediumturquoise", Integer.valueOf(4772300));
            a.put("mediumvioletred", Integer.valueOf(13047173));
            a.put("midnightblue", Integer.valueOf(1644912));
            a.put("mintcream", Integer.valueOf(16121850));
            a.put("mistyrose", Integer.valueOf(16770273));
            a.put("moccasin", Integer.valueOf(16770229));
            a.put("navajowhite", Integer.valueOf(16768685));
            a.put("navy", Integer.valueOf(128));
            a.put("oldlace", Integer.valueOf(16643558));
            a.put("olive", Integer.valueOf(8421376));
            a.put("olivedrab", Integer.valueOf(7048739));
            a.put("orange", Integer.valueOf(16753920));
            a.put("orangered", Integer.valueOf(16729344));
            a.put("orchid", Integer.valueOf(14315734));
            a.put("palegoldenrod", Integer.valueOf(15657130));
            a.put("palegreen", Integer.valueOf(10025880));
            a.put("paleturquoise", Integer.valueOf(11529966));
            a.put("palevioletred", Integer.valueOf(14381203));
            a.put("papayawhip", Integer.valueOf(16773077));
            a.put("peachpuff", Integer.valueOf(16767673));
            a.put("peru", Integer.valueOf(13468991));
            a.put("pink", Integer.valueOf(16761035));
            a.put("plum", Integer.valueOf(14524637));
            a.put("powderblue", Integer.valueOf(11591910));
            a.put("purple", Integer.valueOf(8388736));
            a.put("red", Integer.valueOf(16711680));
            a.put("rosybrown", Integer.valueOf(12357519));
            a.put("royalblue", Integer.valueOf(4286945));
            a.put("saddlebrown", Integer.valueOf(9127187));
            a.put("salmon", Integer.valueOf(16416882));
            a.put("sandybrown", Integer.valueOf(16032864));
            a.put("seagreen", Integer.valueOf(3050327));
            a.put("seashell", Integer.valueOf(16774638));
            a.put("sienna", Integer.valueOf(10506797));
            a.put("silver", Integer.valueOf(12632256));
            a.put("skyblue", Integer.valueOf(8900331));
            a.put("slateblue", Integer.valueOf(6970061));
            a.put("slategray", Integer.valueOf(7372944));
            a.put("slategrey", Integer.valueOf(7372944));
            a.put("snow", Integer.valueOf(16775930));
            a.put("springgreen", Integer.valueOf(65407));
            a.put("steelblue", Integer.valueOf(4620980));
            a.put("tan", Integer.valueOf(13808780));
            a.put("teal", Integer.valueOf(32896));
            a.put("thistle", Integer.valueOf(14204888));
            a.put("tomato", Integer.valueOf(16737095));
            a.put("turquoise", Integer.valueOf(4251856));
            a.put("violet", Integer.valueOf(15631086));
            a.put("wheat", Integer.valueOf(16113331));
            a.put("white", Integer.valueOf(16777215));
            a.put("whitesmoke", Integer.valueOf(16119285));
            a.put("yellow", Integer.valueOf(16776960));
            a.put("yellowgreen", Integer.valueOf(10145074));
        }

        public static Integer a(String str) {
            return (Integer) a.get(str);
        }
    }

    /* renamed from: aqc$c */
    static class c {
        private static final Map<String, o> a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            hashMap.put("xx-small", new o(0.694f, bc.pt));
            a.put("x-small", new o(0.833f, bc.pt));
            a.put("small", new o(10.0f, bc.pt));
            a.put("medium", new o(12.0f, bc.pt));
            a.put("large", new o(14.4f, bc.pt));
            a.put("x-large", new o(17.3f, bc.pt));
            a.put("xx-large", new o(20.7f, bc.pt));
            a.put("smaller", new o(83.33f, bc.percent));
            a.put("larger", new o(120.0f, bc.percent));
        }

        public static o a(String str) {
            return (o) a.get(str);
        }
    }

    /* renamed from: aqc$d */
    static class d {
        private static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(13);
            a = hashMap;
            Integer valueOf = Integer.valueOf(400);
            hashMap.put("normal", valueOf);
            Map map = a;
            Integer valueOf2 = Integer.valueOf(700);
            map.put("bold", valueOf2);
            a.put("bolder", Integer.valueOf(1));
            a.put("lighter", Integer.valueOf(-1));
            a.put("100", Integer.valueOf(100));
            a.put("200", Integer.valueOf(Callback.DEFAULT_DRAG_ANIMATION_DURATION));
            a.put("300", Integer.valueOf(MapboxConstants.ANIMATION_DURATION));
            a.put("400", valueOf);
            a.put("500", Integer.valueOf(TakeSnapButton.LONG_PRESS_TIME));
            a.put("600", Integer.valueOf(600));
            a.put("700", valueOf2);
            a.put("800", Integer.valueOf(800));
            a.put("900", Integer.valueOf(900));
        }

        public static Integer a(String str) {
            return (Integer) a.get(str);
        }
    }

    /* renamed from: aqc$e */
    enum e {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        id,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        
        private static final Map<String, e> cache = null;

        static {
            cache = new HashMap();
        }

        public static e a(String str) {
            e eVar = (e) cache.get(str);
            if (eVar != null) {
                return eVar;
            }
            if (str.equals("class")) {
                cache.put(str, CLASS);
                return CLASS;
            } else if (str.indexOf(95) != -1) {
                cache.put(str, UNSUPPORTED);
                return UNSUPPORTED;
            } else {
                try {
                    eVar = e.valueOf(str.replace('-', '_'));
                    if (eVar != CLASS) {
                        cache.put(str, eVar);
                        return eVar;
                    }
                } catch (IllegalArgumentException unused) {
                }
                cache.put(str, UNSUPPORTED);
                return UNSUPPORTED;
            }
        }
    }

    /* renamed from: aqc$f */
    enum f {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        
        private static final Map<String, f> cache = null;

        static {
            cache = new HashMap();
        }

        public static f a(String str) {
            f fVar = (f) cache.get(str);
            if (fVar != null) {
                return fVar;
            }
            if (str.equals("switch")) {
                cache.put(str, SWITCH);
                return SWITCH;
            }
            try {
                fVar = f.valueOf(str);
                if (fVar != SWITCH) {
                    cache.put(str, fVar);
                    return fVar;
                }
            } catch (IllegalArgumentException unused) {
            }
            cache.put(str, UNSUPPORTED);
            return UNSUPPORTED;
        }
    }

    /* renamed from: aqc$g */
    public static class g {
        protected String a;
        protected int b = 0;
        private int c = 0;
        private apv d = new apv();

        public g(String str) {
            this.a = str.trim();
            this.c = this.a.length();
        }

        private Boolean a() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        protected static boolean a(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final float a(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            e();
            return f();
        }

        public final Boolean a(Object obj) {
            if (obj == null) {
                return null;
            }
            e();
            return a();
        }

        public final boolean a(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        public final boolean a(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        public final String b(char c) {
            if (c()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if (g.a((int) charAt) || charAt == c) {
                return null;
            }
            int i = this.b;
            while (true) {
                int j = j();
                if (j == -1 || j == c || g.a(j)) {
                }
            }
            return this.a.substring(i, this.b);
        }

        public final boolean c() {
            return this.b == this.c;
        }

        public final void d() {
            while (true) {
                int i = this.b;
                if (i < this.c && g.a(this.a.charAt(i))) {
                    this.b++;
                } else {
                    return;
                }
            }
        }

        public final boolean e() {
            d();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            d();
            return true;
        }

        public final float f() {
            float a = this.d.a(this.a, this.b, this.c);
            if (!Float.isNaN(a)) {
                this.b = this.d.a;
            }
            return a;
        }

        public final float g() {
            e();
            float a = this.d.a(this.a, this.b, this.c);
            if (!Float.isNaN(a)) {
                this.b = this.d.a;
            }
            return a;
        }

        public final Integer h() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            String str = this.a;
            this.b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        public final o i() {
            float f = f();
            if (Float.isNaN(f)) {
                return null;
            }
            bc n = n();
            return n == null ? new o(f, bc.px) : new o(f, n);
        }

        /* Access modifiers changed, original: protected|final */
        public final int j() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            this.b = i + 1;
            i = this.b;
            return i < i2 ? this.a.charAt(i) : -1;
        }

        public final String k() {
            return b(' ');
        }

        public final String l() {
            if (c()) {
                return null;
            }
            int i;
            int i2 = this.b;
            int charAt = this.a.charAt(i2);
            while (true) {
                if ((charAt < 97 || charAt > Imgproc.COLOR_YUV2BGRA_YVYU) && (charAt < 65 || charAt > 90)) {
                    i = this.b;
                } else {
                    charAt = j();
                }
            }
            i = this.b;
            while (g.a(charAt)) {
                charAt = j();
            }
            if (charAt == 40) {
                this.b++;
                return this.a.substring(i2, i);
            }
            this.b = i2;
            return null;
        }

        public final String m() {
            int i = this.b;
            while (!c() && !g.a(this.a.charAt(this.b))) {
                this.b++;
            }
            String substring = this.a.substring(i, this.b);
            this.b = i;
            return substring;
        }

        public final bc n() {
            if (c()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                this.b++;
                return bc.percent;
            }
            int i = this.b;
            if (i > this.c - 2) {
                return null;
            }
            try {
                bc valueOf = bc.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final boolean o() {
            int i = this.b;
            if (i == this.c) {
                return false;
            }
            char charAt = this.a.charAt(i);
            return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
        }

        public final String p() {
            if (c()) {
                return null;
            }
            int i = this.b;
            char charAt = this.a.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            char j;
            do {
                j = j();
                if (j == 65535) {
                    break;
                }
            } while (j != charAt);
            if (j == 65535) {
                this.b = i;
                return null;
            }
            this.b++;
            return this.a.substring(i + 1, this.b - 1);
        }

        public final String q() {
            if (c()) {
                return null;
            }
            int i = this.b;
            this.b = this.c;
            return this.a.substring(i);
        }
    }

    private static Set<String> A(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.c()) {
            String k = gVar.k();
            int indexOf = k.indexOf(45);
            if (indexOf != -1) {
                k = k.substring(0, indexOf);
            }
            String str2 = "";
            hashSet.add(new Locale(k, str2, str2).getLanguage());
            gVar.d();
        }
        return hashSet;
    }

    private static Set<String> B(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.c()) {
            hashSet.add(gVar.k());
            gVar.d();
        }
        return hashSet;
    }

    private static float a(String str, int i) {
        float a = new apv().a(str, 0, i);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
    }

    private static int a(float f) {
        return f < MapboxConstants.MINIMUM_ZOOM ? 0 : f > 255.0f ? 255 : Math.round(f);
    }

    private static an a(String str, String str2) {
        if (!str.startsWith("url(")) {
            return aqc.h(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf != -1) {
            str2 = str.substring(4, indexOf).trim();
            an anVar = null;
            str = str.substring(indexOf + 1).trim();
            if (str.length() > 0) {
                anVar = aqc.h(str);
            }
            return new t(str2, anVar);
        }
        StringBuilder stringBuilder = new StringBuilder("Bad ");
        stringBuilder.append(str2);
        stringBuilder.append(" attribute. Unterminated url() reference");
        throw new SAXException(stringBuilder.toString());
    }

    private static o a(g gVar) {
        return gVar.a("auto") ? new o(MapboxConstants.MINIMUM_ZOOM) : gVar.i();
    }

    private static Float a(String str) {
        if (str.length() != 0) {
            int length = str.length();
            Object obj = null;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
                obj = 1;
            }
            try {
                float a = aqc.a(str, length);
                if (obj != null) {
                    a /= 100.0f;
                }
                if (a < MapboxConstants.MINIMUM_ZOOM) {
                    a = MapboxConstants.MINIMUM_ZOOM;
                } else if (a > 100.0f) {
                    a = 100.0f;
                }
                return Float.valueOf(a);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid offset value in <stop>: ".concat(String.valueOf(str)), e);
            }
        }
        throw new SAXException("Invalid offset value in <stop> (empty string)");
    }

    private static void a(aa aaVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                aaVar.a = aqc.c(trim);
            } else if (i2 == 2) {
                aaVar.b = aqc.c(trim);
            } else if (i2 == 3) {
                aaVar.c = aqc.c(trim);
                if (aaVar.c.b()) {
                    throw new SAXException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                aaVar.d = aqc.c(trim);
                if (aaVar.d.b()) {
                    throw new SAXException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                aaVar.f = aqc.c(trim);
                if (aaVar.f.b()) {
                    throw new SAXException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                aaVar.g = aqc.c(trim);
                if (aaVar.g.b()) {
                    throw new SAXException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private static void a(ac acVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (1.b[e.a(attributes.getLocalName(i)).ordinal()] == 37) {
                acVar.a = aqc.a(trim);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x00ac in {2, 7, 12, 15, 19, 24, 26, 29, 30, 33, 35, 37} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void a(defpackage.apy.ad r6, java.lang.String r7) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = "|";
        r0.<init>(r1);
        r0.append(r7);
        r1 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r0.append(r1);
        r0 = r0.toString();
        r1 = "|caption|icon|menu|message-box|small-caption|status-bar|";
        r0 = r1.indexOf(r0);
        r1 = -1;
        if (r0 == r1) goto L_0x001d;
        return;
        r0 = new aqc$g;
        r0.<init>(r7);
        r7 = 0;
        r1 = 0;
        r2 = r7;
        r3 = 47;
        r4 = r0.b(r3);
        r0.d();
        if (r4 == 0) goto L_0x00a4;
        if (r7 == 0) goto L_0x0034;
        if (r1 != 0) goto L_0x0058;
        r5 = "normal";
        r5 = r4.equals(r5);
        if (r5 != 0) goto L_0x0025;
        if (r7 != 0) goto L_0x0044;
        r7 = defpackage.aqc.d.a(r4);
        if (r7 != 0) goto L_0x0025;
        if (r1 != 0) goto L_0x004c;
        r1 = defpackage.aqc.o(r4);
        if (r1 != 0) goto L_0x0025;
        if (r2 != 0) goto L_0x0058;
        r2 = "small-caps";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x0058;
        r2 = r4;
        goto L_0x0025;
        r2 = defpackage.aqc.l(r4);
        r3 = r0.a(r3);
        if (r3 == 0) goto L_0x007a;
        r0.d();
        r3 = r0.k();
        if (r3 == 0) goto L_0x0072;
        defpackage.aqc.c(r3);
        r0.d();
        goto L_0x007a;
        r6 = new org.xml.sax.SAXException;
        r7 = "Invalid font style attribute: missing line-height";
        r6.<init>(r7);
        throw r6;
        r0 = r0.q();
        r0 = defpackage.aqc.k(r0);
        r6.o = r0;
        r6.p = r2;
        if (r7 != 0) goto L_0x008b;
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        goto L_0x008f;
        r7 = r7.intValue();
        r7 = java.lang.Integer.valueOf(r7);
        r6.q = r7;
        if (r1 != 0) goto L_0x0099;
        r1 = defpackage.apy.ad.b.a;
        r6.r = r1;
        r0 = r6.a;
        r2 = 122880; // 0x1e000 float:1.72192E-40 double:6.0711E-319;
        r0 = r0 | r2;
        r6.a = r0;
        return;
        r6 = new org.xml.sax.SAXException;
        r7 = "Invalid font style attribute: missing font size and family";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.a(apy$ad, java.lang.String):void");
    }

    /* JADX WARNING: Missing block: B:10:0x004d, code skipped:
            r6.a = r7 | r0;
     */
    /* JADX WARNING: Missing block: B:11:0x0050, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:78:0x02c8, code skipped:
            return;
     */
    protected static void a(defpackage.apy.ad r6, java.lang.String r7, java.lang.String r8) {
        /*
        r0 = r8.length();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = "inherit";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r0 = defpackage.aqc.1.b;
        r1 = defpackage.aqc.e.a(r7);
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = -1;
        r2 = "|";
        r3 = "none";
        r4 = "currentColor";
        r5 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        switch(r0) {
            case 47: goto L_0x02ba;
            case 48: goto L_0x02ae;
            case 49: goto L_0x029e;
            case 50: goto L_0x0290;
            case 51: goto L_0x0280;
            case 52: goto L_0x0274;
            case 53: goto L_0x0268;
            case 54: goto L_0x025c;
            case 55: goto L_0x024c;
            case 56: goto L_0x0238;
            case 57: goto L_0x022c;
            case 58: goto L_0x021c;
            case 59: goto L_0x0210;
            case 60: goto L_0x020c;
            case 61: goto L_0x0200;
            case 62: goto L_0x01f4;
            case 63: goto L_0x01e7;
            case 64: goto L_0x01da;
            case 65: goto L_0x01cd;
            case 66: goto L_0x01be;
            case 67: goto L_0x01b1;
            case 68: goto L_0x01a4;
            case 69: goto L_0x018f;
            case 70: goto L_0x0182;
            case 71: goto L_0x0175;
            case 72: goto L_0x0168;
            case 73: goto L_0x0128;
            case 74: goto L_0x00e8;
            case 75: goto L_0x00d2;
            case 76: goto L_0x00c1;
            case 77: goto L_0x00b5;
            case 78: goto L_0x00a9;
            case 79: goto L_0x009d;
            case 80: goto L_0x0091;
            case 81: goto L_0x007a;
            case 82: goto L_0x0068;
            case 83: goto L_0x0051;
            case 84: goto L_0x003c;
            case 85: goto L_0x002a;
            default: goto L_0x0028;
        };
    L_0x0028:
        goto L_0x02c8;
    L_0x002a:
        r7 = defpackage.aqc.y(r8);
        r6.L = r7;
        r7 = r6.a;
        r0 = 34359738368; // 0x800000000 float:0.0 double:1.69759663277E-313;
        r7 = r7 | r0;
        r6.a = r7;
        goto L_0x02c8;
    L_0x003c:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.K = r7;
        r7 = r6.a;
        r0 = 17179869184; // 0x400000000 float:0.0 double:8.4879831639E-314;
    L_0x004d:
        r7 = r7 | r0;
        r6.a = r7;
        return;
    L_0x0051:
        r7 = r8.equals(r4);
        if (r7 == 0) goto L_0x005a;
    L_0x0057:
        r7 = defpackage.apy.f.a;
        goto L_0x005e;
    L_0x005a:
        r7 = defpackage.aqc.i(r8);
    L_0x005e:
        r6.J = r7;
        r7 = r6.a;
        r0 = 8589934592; // 0x200000000 float:0.0 double:4.243991582E-314;
        goto L_0x004d;
    L_0x0068:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.I = r7;
        r7 = r6.a;
        r0 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        goto L_0x004d;
    L_0x007a:
        r7 = r8.equals(r4);
        if (r7 == 0) goto L_0x0083;
    L_0x0080:
        r7 = defpackage.apy.f.a;
        goto L_0x0087;
    L_0x0083:
        r7 = defpackage.aqc.i(r8);
    L_0x0087:
        r6.H = r7;
        r7 = r6.a;
        r0 = 2147483648; // 0x80000000 float:-0.0 double:1.0609978955E-314;
        goto L_0x004d;
    L_0x0091:
        r7 = defpackage.aqc.b(r8, r7);
        r6.G = r7;
        r7 = r6.a;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        goto L_0x004d;
    L_0x009d:
        r7 = defpackage.aqc.r(r8);
        r6.F = r7;
        r7 = r6.a;
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        goto L_0x004d;
    L_0x00a9:
        r7 = defpackage.aqc.b(r8, r7);
        r6.E = r7;
        r7 = r6.a;
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        goto L_0x004d;
    L_0x00b5:
        r7 = defpackage.aqc.x(r8);
        r6.w = r7;
        r7 = r6.a;
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        goto L_0x004d;
    L_0x00c1:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.D = r7;
        r7 = r6.a;
        r0 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        goto L_0x004d;
    L_0x00d2:
        r7 = r8.equals(r4);
        if (r7 == 0) goto L_0x00db;
    L_0x00d8:
        r7 = defpackage.apy.f.a;
        goto L_0x00df;
    L_0x00db:
        r7 = defpackage.aqc.i(r8);
    L_0x00df:
        r6.C = r7;
        r7 = r6.a;
        r0 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        goto L_0x004d;
    L_0x00e8:
        r7 = r8.indexOf(r5);
        if (r7 >= 0) goto L_0x0118;
    L_0x00ee:
        r7 = new java.lang.StringBuilder;
        r7.<init>(r2);
        r7.append(r8);
        r7.append(r5);
        r7 = r7.toString();
        r0 = "|visible|hidden|collapse|";
        r7 = r0.indexOf(r7);
        if (r7 == r1) goto L_0x0118;
    L_0x0105:
        r7 = "visible";
        r7 = r8.equals(r7);
        r7 = java.lang.Boolean.valueOf(r7);
        r6.B = r7;
        r7 = r6.a;
        r0 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        goto L_0x004d;
    L_0x0118:
        r6 = new org.xml.sax.SAXException;
        r7 = java.lang.String.valueOf(r8);
        r8 = "Invalid value for \"visibility\" attribute: ";
        r7 = r8.concat(r7);
        r6.<init>(r7);
        throw r6;
    L_0x0128:
        r7 = r8.indexOf(r5);
        if (r7 >= 0) goto L_0x0158;
    L_0x012e:
        r7 = new java.lang.StringBuilder;
        r7.<init>(r2);
        r7.append(r8);
        r7.append(r5);
        r7 = r7.toString();
        r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|";
        r7 = r0.indexOf(r7);
        if (r7 == r1) goto L_0x0158;
    L_0x0145:
        r7 = r8.equals(r3);
        r7 = r7 ^ 1;
        r7 = java.lang.Boolean.valueOf(r7);
        r6.A = r7;
        r7 = r6.a;
        r0 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        goto L_0x004d;
    L_0x0158:
        r6 = new org.xml.sax.SAXException;
        r7 = java.lang.String.valueOf(r8);
        r8 = "Invalid value for \"display\" attribute: ";
        r7 = r8.concat(r7);
        r6.<init>(r7);
        throw r6;
    L_0x0168:
        r7 = defpackage.aqc.b(r8, r7);
        r6.z = r7;
        r7 = r6.a;
        r0 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        goto L_0x004d;
    L_0x0175:
        r7 = defpackage.aqc.b(r8, r7);
        r6.y = r7;
        r7 = r6.a;
        r0 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        goto L_0x004d;
    L_0x0182:
        r7 = defpackage.aqc.b(r8, r7);
        r6.x = r7;
        r7 = r6.a;
        r0 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        goto L_0x004d;
    L_0x018f:
        r7 = defpackage.aqc.b(r8, r7);
        r6.x = r7;
        r7 = r6.x;
        r6.y = r7;
        r7 = r6.x;
        r6.z = r7;
        r7 = r6.a;
        r0 = 14680064; // 0xe00000 float:2.0571151E-38 double:7.2529153E-317;
        goto L_0x004d;
    L_0x01a4:
        r7 = defpackage.aqc.w(r8);
        r6.v = r7;
        r7 = r6.a;
        r0 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        goto L_0x004d;
    L_0x01b1:
        r7 = defpackage.aqc.v(r8);
        r6.u = r7;
        r7 = r6.a;
        r0 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        goto L_0x004d;
    L_0x01be:
        r7 = defpackage.aqc.q(r8);
        r6.t = r7;
        r7 = r6.a;
        r0 = 68719476736; // 0x1000000000 float:0.0 double:3.39519326554E-313;
        goto L_0x004d;
    L_0x01cd:
        r7 = defpackage.aqc.p(r8);
        r6.s = r7;
        r7 = r6.a;
        r0 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        goto L_0x004d;
    L_0x01da:
        r7 = defpackage.aqc.n(r8);
        r6.r = r7;
        r7 = r6.a;
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        goto L_0x004d;
    L_0x01e7:
        r7 = defpackage.aqc.m(r8);
        r6.q = r7;
        r7 = r6.a;
        r0 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        goto L_0x004d;
    L_0x01f4:
        r7 = defpackage.aqc.l(r8);
        r6.p = r7;
        r7 = r6.a;
        r0 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        goto L_0x004d;
    L_0x0200:
        r7 = defpackage.aqc.k(r8);
        r6.o = r7;
        r7 = r6.a;
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        goto L_0x004d;
    L_0x020c:
        defpackage.aqc.a(r6, r8);
        return;
    L_0x0210:
        r7 = defpackage.aqc.i(r8);
        r6.n = r7;
        r7 = r6.a;
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        goto L_0x004d;
    L_0x021c:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.m = r7;
        r7 = r6.a;
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        goto L_0x004d;
    L_0x022c:
        r7 = defpackage.aqc.c(r8);
        r6.l = r7;
        r7 = r6.a;
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        goto L_0x004d;
    L_0x0238:
        r7 = r3.equals(r8);
        if (r7 == 0) goto L_0x0240;
    L_0x023e:
        r7 = 0;
        goto L_0x0244;
    L_0x0240:
        r7 = defpackage.aqc.u(r8);
    L_0x0244:
        r6.k = r7;
        r7 = r6.a;
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        goto L_0x004d;
    L_0x024c:
        r7 = defpackage.aqc.e(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.j = r7;
        r7 = r6.a;
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        goto L_0x004d;
    L_0x025c:
        r7 = defpackage.aqc.t(r8);
        r6.i = r7;
        r7 = r6.a;
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x004d;
    L_0x0268:
        r7 = defpackage.aqc.s(r8);
        r6.h = r7;
        r7 = r6.a;
        r0 = 64;
        goto L_0x004d;
    L_0x0274:
        r7 = defpackage.aqc.c(r8);
        r6.g = r7;
        r7 = r6.a;
        r0 = 32;
        goto L_0x004d;
    L_0x0280:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.f = r7;
        r7 = r6.a;
        r0 = 16;
        goto L_0x004d;
    L_0x0290:
        r7 = "stroke";
        r7 = defpackage.aqc.a(r8, r7);
        r6.e = r7;
        r7 = r6.a;
        r0 = 8;
        goto L_0x004d;
    L_0x029e:
        r7 = defpackage.aqc.f(r8);
        r7 = java.lang.Float.valueOf(r7);
        r6.d = r7;
        r7 = r6.a;
        r0 = 4;
        goto L_0x004d;
    L_0x02ae:
        r7 = defpackage.aqc.r(r8);
        r6.c = r7;
        r7 = r6.a;
        r0 = 2;
        goto L_0x004d;
    L_0x02ba:
        r7 = "fill";
        r7 = defpackage.aqc.a(r8, r7);
        r6.b = r7;
        r7 = r6.a;
        r0 = 1;
        goto L_0x004d;
    L_0x02c8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.a(apy$ad, java.lang.String, java.lang.String):void");
    }

    private static void a(af afVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case requiredFeatures:
                    afVar.a(aqc.z(trim));
                    break;
                case requiredExtensions:
                    afVar.a(trim);
                    break;
                case systemLanguage:
                    afVar.b(aqc.A(trim));
                    break;
                case requiredFormats:
                    afVar.c(aqc.B(trim));
                    break;
                case requiredFonts:
                    List k = aqc.k(trim);
                    afVar.d(k != null ? new HashSet(k) : new HashSet(0));
                    break;
                default:
                    break;
            }
        }
    }

    private static void a(ak akVar, String str) {
        g gVar = new g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String b = gVar.b(':');
            gVar.d();
            if (gVar.a(':')) {
                gVar.d();
                String b2 = gVar.b(';');
                if (b2 != null) {
                    gVar.d();
                    if (gVar.c() || gVar.a(';')) {
                        if (akVar.n == null) {
                            akVar.n = new ad();
                        }
                        aqc.a(akVar.n, b, b2);
                        gVar.d();
                    }
                } else {
                    return;
                }
            }
            return;
        }
    }

    private static void a(ak akVar, Attributes attributes) {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                akVar.k = attributes.getValue(i).trim();
                break;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    akVar.l = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    akVar.l = Boolean.TRUE;
                    return;
                } else {
                    throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                }
            } else {
                i++;
            }
        }
    }

    private static void a(al alVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case x1:
                    alVar.f = aqc.c(trim);
                    break;
                case y1:
                    alVar.g = aqc.c(trim);
                    break;
                case x2:
                    alVar.h = aqc.c(trim);
                    break;
                case y2:
                    alVar.i = aqc.c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void a(ao aoVar, String str) {
        int i;
        g gVar = new g(str);
        gVar.d();
        String k = gVar.k();
        if ("defer".equals(k)) {
            gVar.d();
            k = gVar.k();
        }
        a a = a.a(k);
        gVar.d();
        if (gVar.c()) {
            i = 0;
        } else {
            String k2 = gVar.k();
            if (k2.equals("meet")) {
                i = 1;
            } else if (k2.equals("slice")) {
                i = 2;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            }
        }
        aoVar.r = new apw(a, i);
    }

    private static void a(ap apVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 35) {
                apVar.i = aqc.c(trim);
            } else if (i2 != 36) {
                switch (i2) {
                    case 12:
                        apVar.f = aqc.c(trim);
                        break;
                    case 13:
                        apVar.g = aqc.c(trim);
                        break;
                    case 14:
                        apVar.h = aqc.c(trim);
                        if (!apVar.h.b()) {
                            break;
                        }
                        throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                    default:
                        continue;
                }
            } else {
                apVar.j = aqc.c(trim);
            }
        }
    }

    private static void a(aq aqVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                aqc.a((ao) aqVar, trim);
            } else if (i2 == 86) {
                aqVar.s = aqc.g(trim);
            }
        }
    }

    private static void a(at atVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (1.b[e.a(attributes.getLocalName(i)).ordinal()] == 6) {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    atVar.a = trim;
                }
            }
        }
    }

    private static void a(ay ayVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 6) {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    ayVar.a = trim;
                }
            } else if (i2 == 39) {
                ayVar.b = aqc.c(trim);
            }
        }
    }

    private static void a(az azVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                azVar.b = aqc.d(trim);
            } else if (i2 == 2) {
                azVar.c = aqc.d(trim);
            } else if (i2 == 19) {
                azVar.d = aqc.d(trim);
            } else if (i2 == 20) {
                azVar.e = aqc.d(trim);
            }
        }
    }

    private static void a(bd bdVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                bdVar.c = aqc.c(trim);
            } else if (i2 == 2) {
                bdVar.d = aqc.c(trim);
            } else if (i2 == 3) {
                bdVar.e = aqc.c(trim);
                if (bdVar.e.b()) {
                    throw new SAXException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                bdVar.f = aqc.c(trim);
                if (bdVar.f.b()) {
                    throw new SAXException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6) {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    bdVar.a = trim;
                }
            }
        }
    }

    private static void a(c cVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case cx:
                    cVar.a = aqc.c(trim);
                    break;
                case cy:
                    cVar.b = aqc.c(trim);
                    break;
                case r:
                    cVar.c = aqc.c(trim);
                    if (!cVar.c.b()) {
                        break;
                    }
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                default:
                    break;
            }
        }
    }

    private static void a(d dVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (1.b[e.a(attributes.getLocalName(i)).ordinal()] == 38) {
                Boolean bool;
                if ("objectBoundingBox".equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new SAXException("Invalid value for attribute clipPathUnits");
                }
                dVar.a = bool;
            }
        }
    }

    private static void a(h hVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case rx:
                    hVar.c = aqc.c(trim);
                    if (!hVar.c.b()) {
                        break;
                    }
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                case ry:
                    hVar.d = aqc.c(trim);
                    if (!hVar.d.b()) {
                        break;
                    }
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                case cx:
                    hVar.a = aqc.c(trim);
                    break;
                case cy:
                    hVar.b = aqc.c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void a(i iVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                switch (i2) {
                    case 32:
                        Boolean bool;
                        if ("objectBoundingBox".equals(trim)) {
                            bool = Boolean.FALSE;
                        } else if ("userSpaceOnUse".equals(trim)) {
                            bool = Boolean.TRUE;
                        } else {
                            throw new SAXException("Invalid value for attribute gradientUnits");
                        }
                        iVar.b = bool;
                        break;
                    case 33:
                        iVar.c = aqc.b(trim);
                        break;
                    case 34:
                        try {
                            iVar.d = j.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            StringBuilder stringBuilder = new StringBuilder("Invalid spreadMethod attribute. \"");
                            stringBuilder.append(trim);
                            stringBuilder.append("\" is not a valid value.");
                            throw new SAXException(stringBuilder.toString());
                        }
                    default:
                        continue;
                }
            } else {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    iVar.e = trim;
                }
            }
        }
    }

    private static void a(m mVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (e.a(attributes.getLocalName(i)) == e.transform) {
                mVar.a(aqc.b(attributes.getValue(i)));
            }
        }
    }

    private static void a(n nVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nVar.b = aqc.c(trim);
            } else if (i2 == 2) {
                nVar.c = aqc.c(trim);
            } else if (i2 == 3) {
                nVar.d = aqc.c(trim);
                if (nVar.d.b()) {
                    throw new SAXException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                nVar.e = aqc.c(trim);
                if (nVar.e.b()) {
                    throw new SAXException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6) {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    nVar.a = trim;
                }
            } else if (i2 == 7) {
                aqc.a((ao) nVar, trim);
            }
        }
    }

    private static void a(p pVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case x1:
                    pVar.a = aqc.c(trim);
                    break;
                case y1:
                    pVar.b = aqc.c(trim);
                    break;
                case x2:
                    pVar.c = aqc.c(trim);
                    break;
                case y2:
                    pVar.d = aqc.c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void a(q qVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (e.a(attributes.getLocalName(i))) {
                case refX:
                    qVar.b = aqc.c(trim);
                    break;
                case refY:
                    qVar.c = aqc.c(trim);
                    break;
                case markerWidth:
                    qVar.d = aqc.c(trim);
                    if (!qVar.d.b()) {
                        break;
                    }
                    throw new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                case markerHeight:
                    qVar.e = aqc.c(trim);
                    if (!qVar.e.b()) {
                        break;
                    }
                    throw new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                case markerUnits:
                    if ("strokeWidth".equals(trim)) {
                        qVar.a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        qVar.a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute markerUnits");
                    }
                case orient:
                    qVar.f = Float.valueOf("auto".equals(trim) ? Float.NaN : aqc.e(trim));
                    break;
                default:
                    break;
            }
        }
    }

    private static void a(r rVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rVar.c = aqc.c(trim);
            } else if (i2 == 2) {
                rVar.d = aqc.c(trim);
            } else if (i2 == 3) {
                rVar.e = aqc.c(trim);
                if (rVar.e.b()) {
                    throw new SAXException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 != 4) {
                String str = "userSpaceOnUse";
                String str2 = "objectBoundingBox";
                Boolean bool;
                if (i2 == 43) {
                    if (str2.equals(trim)) {
                        bool = Boolean.FALSE;
                    } else if (str.equals(trim)) {
                        bool = Boolean.TRUE;
                    } else {
                        throw new SAXException("Invalid value for attribute maskUnits");
                    }
                    rVar.a = bool;
                } else if (i2 == 44) {
                    if (str2.equals(trim)) {
                        bool = Boolean.FALSE;
                    } else if (str.equals(trim)) {
                        bool = Boolean.TRUE;
                    } else {
                        throw new SAXException("Invalid value for attribute maskContentUnits");
                    }
                    rVar.b = bool;
                } else {
                    continue;
                }
            } else {
                rVar.f = aqc.c(trim);
                if (rVar.f.b()) {
                    throw new SAXException("Invalid <mask> element. height cannot be negative");
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:38:0x00fa, code skipped:
            r6 = (char) r14;
     */
    /* JADX WARNING: Missing block: B:73:0x01a6, code skipped:
            r10 = r11;
     */
    /* JADX WARNING: Missing block: B:84:0x01ea, code skipped:
            r6 = (char) r6;
     */
    /* JADX WARNING: Missing block: B:85:0x01eb, code skipped:
            r5.append(r6);
            r5.append(r2);
            android.util.Log.e(r12, r5.toString());
     */
    /* JADX WARNING: Missing block: B:90:0x0214, code skipped:
            r8 = r15;
            r10 = r19;
     */
    private static void a(defpackage.apy.u r22, org.xml.sax.Attributes r23) {
        /*
        r0 = r22;
        r1 = r23;
        r3 = 0;
    L_0x0005:
        r4 = r23.getLength();
        if (r3 >= r4) goto L_0x02ae;
    L_0x000b:
        r4 = r1.getValue(r3);
        r4 = r4.trim();
        r5 = defpackage.aqc.1.b;
        r6 = r1.getLocalName(r3);
        r6 = defpackage.aqc.e.a(r6);
        r6 = r6.ordinal();
        r5 = r5[r6];
        r6 = 8;
        r7 = 0;
        if (r5 == r6) goto L_0x004c;
    L_0x0028:
        r6 = 9;
        if (r5 == r6) goto L_0x002e;
    L_0x002c:
        goto L_0x02a8;
    L_0x002e:
        r4 = defpackage.aqc.e(r4);
        r4 = java.lang.Float.valueOf(r4);
        r0.b = r4;
        r4 = r0.b;
        r4 = r4.floatValue();
        r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r4 < 0) goto L_0x0044;
    L_0x0042:
        goto L_0x02a8;
    L_0x0044:
        r0 = new org.xml.sax.SAXException;
        r1 = "Invalid <path> element. pathLength cannot be negative";
        r0.<init>(r1);
        throw r0;
    L_0x004c:
        r5 = new aqc$g;
        r5.<init>(r4);
        r4 = new apy$v;
        r4.<init>();
        r8 = r5.c();
        if (r8 != 0) goto L_0x02a6;
    L_0x005c:
        r8 = r5.h();
        r8 = r8.intValue();
        r9 = 77;
        r15 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r8 == r9) goto L_0x006c;
    L_0x006a:
        if (r8 != r15) goto L_0x02a6;
    L_0x006c:
        r14 = r8;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r16 = 0;
        r17 = 0;
    L_0x0075:
        r5.d();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = " path segment";
        r7 = "Bad path coords for ";
        r12 = "SVGParser";
        switch(r14) {
            case 65: goto L_0x0219;
            case 67: goto L_0x01c6;
            case 72: goto L_0x01a9;
            case 76: goto L_0x0186;
            case 77: goto L_0x0149;
            case 81: goto L_0x0117;
            case 83: goto L_0x00d8;
            case 84: goto L_0x00ae;
            case 86: goto L_0x0094;
            case 90: goto L_0x0085;
            case 97: goto L_0x0219;
            case 99: goto L_0x01c6;
            case 104: goto L_0x01a9;
            case 108: goto L_0x0186;
            case 109: goto L_0x0149;
            case 113: goto L_0x0117;
            case 115: goto L_0x00d8;
            case 116: goto L_0x00ae;
            case 118: goto L_0x0094;
            case 122: goto L_0x0085;
            default: goto L_0x0083;
        };
    L_0x0083:
        goto L_0x02a6;
    L_0x0085:
        r4.a(r6);
        r8 = r16;
        r9 = r8;
        r10 = r17;
        r11 = r10;
    L_0x008e:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r18 = 0;
        goto L_0x0273;
    L_0x0094:
        r11 = r5.f();
        r13 = java.lang.Float.isNaN(r11);
        if (r13 == 0) goto L_0x00a4;
    L_0x009e:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x00fa;
    L_0x00a4:
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r14 != r2) goto L_0x00a9;
    L_0x00a8:
        r11 = r11 + r10;
    L_0x00a9:
        r4.b(r8, r11);
        goto L_0x01a6;
    L_0x00ae:
        r19 = r8 * r13;
        r9 = r19 - r9;
        r13 = r13 * r10;
        r13 = r13 - r11;
        r11 = r5.f();
        r19 = r5.a(r11);
        r20 = java.lang.Float.isNaN(r19);
        if (r20 == 0) goto L_0x00c8;
    L_0x00c2:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x00fa;
    L_0x00c8:
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r14 != r2) goto L_0x00cf;
    L_0x00cc:
        r11 = r11 + r8;
        r19 = r19 + r10;
    L_0x00cf:
        r2 = r19;
        r4.a(r9, r13, r11, r2);
        r10 = r2;
        r8 = r11;
        r11 = r13;
        goto L_0x008e;
    L_0x00d8:
        r19 = r8 * r13;
        r9 = r19 - r9;
        r13 = r13 * r10;
        r11 = r13 - r11;
        r13 = r5.f();
        r6 = r5.a(r13);
        r15 = r5.a(r6);
        r19 = r5.a(r15);
        r21 = java.lang.Float.isNaN(r19);
        if (r21 == 0) goto L_0x00fd;
    L_0x00f5:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
    L_0x00fa:
        r6 = (char) r14;
        goto L_0x01eb;
    L_0x00fd:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r14 != r2) goto L_0x0106;
    L_0x0101:
        r15 = r15 + r8;
        r19 = r19 + r10;
        r13 = r13 + r8;
        r6 = r6 + r10;
    L_0x0106:
        r2 = r13;
        r8 = r4;
        r10 = r11;
        r11 = r2;
        r12 = r6;
        r13 = r15;
        r7 = r14;
        r14 = r19;
        r8.a(r9, r10, r11, r12, r13, r14);
        r9 = r2;
        r11 = r6;
        r14 = r7;
        goto L_0x0214;
    L_0x0117:
        r6 = r14;
        r9 = r5.f();
        r11 = r5.a(r9);
        r13 = r5.a(r11);
        r14 = r5.a(r13);
        r15 = java.lang.Float.isNaN(r14);
        if (r15 == 0) goto L_0x0135;
    L_0x012e:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x01ea;
    L_0x0135:
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        if (r6 != r2) goto L_0x013d;
    L_0x0139:
        r13 = r13 + r8;
        r14 = r14 + r10;
        r9 = r9 + r8;
        r11 = r11 + r10;
    L_0x013d:
        r4.a(r9, r11, r13, r14);
        r8 = r13;
        r10 = r14;
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r18 = 0;
        r14 = r6;
        goto L_0x0273;
    L_0x0149:
        r6 = r14;
        r9 = r5.f();
        r11 = r5.a(r9);
        r13 = java.lang.Float.isNaN(r11);
        if (r13 == 0) goto L_0x015f;
    L_0x0158:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x01ea;
    L_0x015f:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r6 != r2) goto L_0x016e;
    L_0x0163:
        r2 = r4.a;
        if (r2 != 0) goto L_0x0169;
    L_0x0167:
        r2 = 1;
        goto L_0x016a;
    L_0x0169:
        r2 = 0;
    L_0x016a:
        if (r2 != 0) goto L_0x016e;
    L_0x016c:
        r9 = r9 + r8;
        r11 = r11 + r10;
    L_0x016e:
        r4.a(r9, r11);
        r15 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r6 != r15) goto L_0x0178;
    L_0x0175:
        r19 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x017c;
    L_0x0178:
        r12 = 76;
        r19 = 76;
    L_0x017c:
        r8 = r9;
        r16 = r8;
        r10 = r11;
        r17 = r10;
        r14 = r19;
        goto L_0x008e;
    L_0x0186:
        r6 = r14;
        r9 = r5.f();
        r11 = r5.a(r9);
        r13 = java.lang.Float.isNaN(r11);
        if (r13 == 0) goto L_0x019b;
    L_0x0195:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x01ea;
    L_0x019b:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r6 != r2) goto L_0x01a1;
    L_0x019f:
        r9 = r9 + r8;
        r11 = r11 + r10;
    L_0x01a1:
        r4.b(r9, r11);
        r14 = r6;
        r8 = r9;
    L_0x01a6:
        r10 = r11;
        goto L_0x008e;
    L_0x01a9:
        r6 = r14;
        r9 = r5.f();
        r13 = java.lang.Float.isNaN(r9);
        if (r13 == 0) goto L_0x01ba;
    L_0x01b4:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
        goto L_0x01ea;
    L_0x01ba:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r6 != r2) goto L_0x01bf;
    L_0x01be:
        r9 = r9 + r8;
    L_0x01bf:
        r4.b(r9, r10);
        r14 = r6;
        r8 = r9;
        goto L_0x008e;
    L_0x01c6:
        r6 = r14;
        r9 = r5.f();
        r11 = r5.a(r9);
        r13 = r5.a(r11);
        r14 = r5.a(r13);
        r15 = r5.a(r14);
        r19 = r5.a(r15);
        r21 = java.lang.Float.isNaN(r19);
        if (r21 == 0) goto L_0x01fa;
    L_0x01e5:
        r5 = new java.lang.StringBuilder;
        r5.<init>(r7);
    L_0x01ea:
        r6 = (char) r6;
    L_0x01eb:
        r5.append(r6);
        r5.append(r2);
        r2 = r5.toString();
        android.util.Log.e(r12, r2);
        goto L_0x02a6;
    L_0x01fa:
        r2 = 99;
        if (r6 != r2) goto L_0x0205;
    L_0x01fe:
        r15 = r15 + r8;
        r19 = r19 + r10;
        r9 = r9 + r8;
        r11 = r11 + r10;
        r13 = r13 + r8;
        r14 = r14 + r10;
    L_0x0205:
        r10 = r11;
        r2 = r13;
        r7 = r14;
        r8 = r4;
        r11 = r2;
        r12 = r7;
        r13 = r15;
        r14 = r19;
        r8.a(r9, r10, r11, r12, r13, r14);
        r9 = r2;
        r14 = r6;
        r11 = r7;
    L_0x0214:
        r8 = r15;
        r10 = r19;
        goto L_0x008e;
    L_0x0219:
        r6 = r14;
        r9 = r5.f();
        r11 = r5.a(r9);
        r13 = r5.a(r11);
        r14 = java.lang.Float.valueOf(r13);
        r14 = r5.a(r14);
        r15 = r5.a(r14);
        if (r15 != 0) goto L_0x0239;
    L_0x0234:
        r19 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r1 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        goto L_0x0241;
    L_0x0239:
        r1 = r5.g();
        r19 = r5.a(r1);
    L_0x0241:
        r21 = java.lang.Float.isNaN(r19);
        if (r21 != 0) goto L_0x0293;
    L_0x0247:
        r18 = 0;
        r21 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1));
        if (r21 < 0) goto L_0x0293;
    L_0x024d:
        r21 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r21 >= 0) goto L_0x0252;
    L_0x0251:
        goto L_0x0293;
    L_0x0252:
        r2 = 97;
        if (r6 != r2) goto L_0x0259;
    L_0x0256:
        r1 = r1 + r8;
        r19 = r19 + r10;
    L_0x0259:
        r12 = r14.booleanValue();
        r2 = r15.booleanValue();
        r8 = r4;
        r10 = r11;
        r11 = r13;
        r13 = r2;
        r14 = r1;
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r15 = r19;
        r8.a(r9, r10, r11, r12, r13, r14, r15);
        r8 = r1;
        r9 = r8;
        r14 = r6;
        r10 = r19;
        r11 = r10;
    L_0x0273:
        r5.e();
        r1 = r5.c();
        if (r1 != 0) goto L_0x02a6;
    L_0x027c:
        r1 = r5.o();
        if (r1 == 0) goto L_0x028a;
    L_0x0282:
        r1 = r5.h();
        r14 = r1.intValue();
    L_0x028a:
        r1 = r23;
        r6 = 8;
        r7 = 0;
        r15 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x0075;
    L_0x0293:
        r1 = new java.lang.StringBuilder;
        r1.<init>(r7);
        r5 = (char) r6;
        r1.append(r5);
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r12, r1);
    L_0x02a6:
        r0.a = r4;
    L_0x02a8:
        r3 = r3 + 1;
        r1 = r23;
        goto L_0x0005;
    L_0x02ae:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.a(apy$u, org.xml.sax.Attributes):void");
    }

    private static void a(x xVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                xVar.d = aqc.c(trim);
            } else if (i2 == 2) {
                xVar.e = aqc.c(trim);
            } else if (i2 == 3) {
                xVar.f = aqc.c(trim);
                if (xVar.f.b()) {
                    throw new SAXException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                xVar.g = aqc.c(trim);
                if (xVar.g.b()) {
                    throw new SAXException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                String str = "userSpaceOnUse";
                String str2 = "objectBoundingBox";
                Boolean bool;
                switch (i2) {
                    case 40:
                        if (str2.equals(trim)) {
                            bool = Boolean.FALSE;
                        } else if (str.equals(trim)) {
                            bool = Boolean.TRUE;
                        } else {
                            throw new SAXException("Invalid value for attribute patternUnits");
                        }
                        xVar.a = bool;
                        break;
                    case 41:
                        if (str2.equals(trim)) {
                            bool = Boolean.FALSE;
                        } else if (str.equals(trim)) {
                            bool = Boolean.TRUE;
                        } else {
                            throw new SAXException("Invalid value for attribute patternContentUnits");
                        }
                        xVar.b = bool;
                        break;
                    case 42:
                        xVar.c = aqc.b(trim);
                        break;
                    default:
                        continue;
                }
            } else {
                if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    xVar.h = trim;
                }
            }
        }
    }

    private static void a(y yVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (e.a(attributes.getLocalName(i)) == e.points) {
                g gVar = new g(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList();
                gVar.d();
                while (!gVar.c()) {
                    float f = gVar.f();
                    String str2 = "Invalid <";
                    StringBuilder stringBuilder;
                    if (Float.isNaN(f)) {
                        stringBuilder = new StringBuilder(str2);
                        stringBuilder.append(str);
                        stringBuilder.append("> points attribute. Non-coordinate content found in list.");
                        throw new SAXException(stringBuilder.toString());
                    }
                    gVar.e();
                    float f2 = gVar.f();
                    if (Float.isNaN(f2)) {
                        stringBuilder = new StringBuilder(str2);
                        stringBuilder.append(str);
                        stringBuilder.append("> points attribute. There should be an even number of coordinates.");
                        throw new SAXException(stringBuilder.toString());
                    }
                    gVar.e();
                    arrayList.add(Float.valueOf(f));
                    arrayList.add(Float.valueOf(f2));
                }
                yVar.a = new float[arrayList.size()];
                int i2 = 0;
                for (Float floatValue : arrayList) {
                    int i3 = i2 + 1;
                    yVar.a[i2] = floatValue.floatValue();
                    i2 = i3;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0070 in {9, 10, 11, 12, 19, 21, 23, 25} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(org.xml.sax.Attributes r8) {
        /*
        r7 = this;
        r0 = r7.b;
        if (r0 == 0) goto L_0x0068;
        r0 = 0;
        r1 = 1;
        r2 = "all";
        r3 = r2;
        r2 = 1;
        r4 = r8.getLength();
        if (r0 >= r4) goto L_0x003c;
        r4 = r8.getValue(r0);
        r4 = r4.trim();
        r5 = defpackage.aqc.1.b;
        r6 = r8.getLocalName(r0);
        r6 = defpackage.aqc.e.a(r6);
        r6 = r6.ordinal();
        r5 = r5[r6];
        r6 = 87;
        if (r5 == r6) goto L_0x0033;
        r6 = 88;
        if (r5 == r6) goto L_0x0031;
        goto L_0x0039;
        r3 = r4;
        goto L_0x0039;
        r2 = "text/css";
        r2 = r4.equals(r2);
        r0 = r0 + 1;
        goto L_0x000a;
        if (r2 == 0) goto L_0x0063;
        r8 = defpackage.apt.d.screen;
        r0 = new apt$c;
        r0.<init>(r3);
        r0.d();
        r2 = defpackage.apt.a(r0);
        r0 = r0.c();
        if (r0 == 0) goto L_0x005b;
        r8 = defpackage.apt.a(r2, r8);
        if (r8 == 0) goto L_0x0063;
        r7.h = r1;
        return;
        r8 = new org.xml.sax.SAXException;
        r0 = "Invalid @media type list";
        r8.<init>(r0);
        throw r8;
        r7.c = r1;
        r7.d = r1;
        return;
        r8 = new org.xml.sax.SAXException;
        r0 = "Invalid document. Root element must be <svg>";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.a(org.xml.sax.Attributes):void");
    }

    private static Matrix b(String str) {
        Matrix matrix = new Matrix();
        g gVar = new g(str);
        gVar.d();
        while (!gVar.c()) {
            String l = gVar.l();
            if (l != null) {
                String str2 = "Invalid transform list: ";
                float f;
                float f2;
                if (l.equals("matrix")) {
                    gVar.d();
                    f = gVar.f();
                    gVar.e();
                    f2 = gVar.f();
                    gVar.e();
                    float f3 = gVar.f();
                    gVar.e();
                    float f4 = gVar.f();
                    gVar.e();
                    float f5 = gVar.f();
                    gVar.e();
                    float f6 = gVar.f();
                    gVar.d();
                    if (Float.isNaN(f6) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{f, f3, f5, f2, f4, f6, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (l.equals("translate")) {
                    gVar.d();
                    f = gVar.f();
                    f2 = gVar.g();
                    gVar.d();
                    if (Float.isNaN(f) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    } else if (Float.isNaN(f2)) {
                        matrix.preTranslate(f, MapboxConstants.MINIMUM_ZOOM);
                    } else {
                        matrix.preTranslate(f, f2);
                    }
                } else if (l.equals("scale")) {
                    gVar.d();
                    f = gVar.f();
                    f2 = gVar.g();
                    gVar.d();
                    if (Float.isNaN(f) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    } else if (Float.isNaN(f2)) {
                        matrix.preScale(f, f);
                    } else {
                        matrix.preScale(f, f2);
                    }
                } else if (l.equals("rotate")) {
                    gVar.d();
                    f = gVar.f();
                    f2 = gVar.g();
                    float g = gVar.g();
                    gVar.d();
                    if (Float.isNaN(f) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    } else if (Float.isNaN(f2)) {
                        matrix.preRotate(f);
                    } else if (Float.isNaN(g)) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    } else {
                        matrix.preRotate(f, f2, g);
                    }
                } else if (l.equals("skewX")) {
                    gVar.d();
                    f = gVar.f();
                    gVar.d();
                    if (Float.isNaN(f) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) f)), MapboxConstants.MINIMUM_ZOOM);
                } else if (l.equals("skewY")) {
                    gVar.d();
                    f = gVar.f();
                    gVar.d();
                    if (Float.isNaN(f) || !gVar.a(')')) {
                        throw new SAXException(str2.concat(String.valueOf(str)));
                    }
                    matrix.preSkew(MapboxConstants.MINIMUM_ZOOM, (float) Math.tan(Math.toRadians((double) f)));
                } else if (l != null) {
                    StringBuilder stringBuilder = new StringBuilder("Invalid transform list fn: ");
                    stringBuilder.append(l);
                    stringBuilder.append(")");
                    throw new SAXException(stringBuilder.toString());
                }
                if (gVar.c()) {
                    break;
                }
                gVar.e();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    private static String b(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        StringBuilder stringBuilder = new StringBuilder("Bad ");
        stringBuilder.append(str2);
        stringBuilder.append(" attribute. Expected \"none\" or \"url()\" format");
        throw new SAXException(stringBuilder.toString());
    }

    private static void b(ak akVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    aqc.a(akVar, trim);
                } else if (i2 != 46) {
                    if (akVar.m == null) {
                        akVar.m = new ad();
                    }
                    aqc.a(akVar.m, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    akVar.o = apt.a(trim);
                }
            }
        }
    }

    private static o c(String str) {
        if (str.length() != 0) {
            int length = str.length();
            bc bcVar = bc.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                bcVar = bc.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    bcVar = bc.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                }
            }
            try {
                return new o(aqc.a(str, length), bcVar);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
            }
        }
        throw new SAXException("Invalid length value (empty string)");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0059 in {9, 10, 12, 13, 15} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static java.util.List<defpackage.apy.o> d(java.lang.String r4) {
        /*
        r0 = r4.length();
        if (r0 == 0) goto L_0x0051;
        r0 = new java.util.ArrayList;
        r1 = 1;
        r0.<init>(r1);
        r1 = new aqc$g;
        r1.<init>(r4);
        r1.d();
        r4 = r1.c();
        if (r4 != 0) goto L_0x0050;
        r4 = r1.f();
        r2 = java.lang.Float.isNaN(r4);
        if (r2 != 0) goto L_0x0038;
        r2 = r1.n();
        if (r2 != 0) goto L_0x002c;
        r2 = defpackage.apy.bc.px;
        r3 = new apy$o;
        r3.<init>(r4, r2);
        r0.add(r3);
        r1.e();
        goto L_0x0014;
        r4 = new org.xml.sax.SAXException;
        r0 = new java.lang.StringBuilder;
        r2 = "Invalid length list value: ";
        r0.<init>(r2);
        r1 = r1.m();
        r0.append(r1);
        r0 = r0.toString();
        r4.<init>(r0);
        throw r4;
        return r0;
        r4 = new org.xml.sax.SAXException;
        r0 = "Invalid length list (empty string)";
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.d(java.lang.String):java.util.List");
    }

    private static float e(String str) {
        int length = str.length();
        if (length != 0) {
            return aqc.a(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float f(String str) {
        float e = aqc.e(str);
        return e < MapboxConstants.MINIMUM_ZOOM ? MapboxConstants.MINIMUM_ZOOM : e > 1.0f ? 1.0f : e;
    }

    private static apy.a g(String str) {
        g gVar = new g(str);
        gVar.d();
        float f = gVar.f();
        gVar.e();
        float f2 = gVar.f();
        gVar.e();
        float f3 = gVar.f();
        gVar.e();
        float f4 = gVar.f();
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            throw new SAXException("Invalid viewBox definition - should have four numbers");
        } else if (f3 < MapboxConstants.MINIMUM_ZOOM) {
            throw new SAXException("Invalid viewBox. width cannot be negative");
        } else if (f4 >= MapboxConstants.MINIMUM_ZOOM) {
            return new apy.a(f, f2, f3, f4);
        } else {
            throw new SAXException("Invalid viewBox. height cannot be negative");
        }
    }

    private static an h(String str) {
        return str.equals("none") ? null : str.equals("currentColor") ? f.a : aqc.i(str);
    }

    private static e i(String str) {
        if (str.charAt(0) == '#') {
            apu a = apu.a(str, str.length());
            String str2 = "Bad hex colour value: ";
            if (a != null) {
                int i = a.a;
                if (i == 7) {
                    return new e((int) a.b);
                }
                if (i == 4) {
                    int i2 = (int) a.b;
                    int i3 = i2 & 3840;
                    int i4 = i2 & 240;
                    i2 &= 15;
                    return new e(i2 | (((((i3 << 12) | (i3 << 16)) | (i4 << 8)) | (i4 << 4)) | (i2 << 4)));
                }
                throw new SAXException(str2.concat(String.valueOf(str)));
            }
            throw new SAXException(str2.concat(String.valueOf(str)));
        } else if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
            return aqc.j(str);
        } else {
            g gVar = new g(str.substring(4));
            gVar.d();
            float f = gVar.f();
            if (!Float.isNaN(f) && gVar.a('%')) {
                f = (f * 256.0f) / 100.0f;
            }
            float a2 = gVar.a(f);
            if (!Float.isNaN(a2) && gVar.a('%')) {
                a2 = (a2 * 256.0f) / 100.0f;
            }
            float a3 = gVar.a(a2);
            if (!Float.isNaN(a3) && gVar.a('%')) {
                a3 = (a3 * 256.0f) / 100.0f;
            }
            gVar.d();
            if (!Float.isNaN(a3) && gVar.a(')')) {
                return new e(((aqc.a(f) << 16) | (aqc.a(a2) << 8)) | aqc.a(a3));
            }
            throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
        }
    }

    private static e j(String str) {
        Integer a = b.a(str.toLowerCase(Locale.US));
        if (a != null) {
            return new e(a.intValue());
        }
        throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
    }

    private static List<String> k(String str) {
        g gVar = new g(str);
        List<String> list = null;
        do {
            Object p = gVar.p();
            if (p == null) {
                p = gVar.b(',');
            }
            if (p == null) {
                break;
            }
            if (list == null) {
                list = new ArrayList();
            }
            list.add(p);
            gVar.e();
        } while (!gVar.c());
        return list;
    }

    private static o l(String str) {
        o a = c.a(str);
        return a == null ? aqc.c(str) : a;
    }

    private static Integer m(String str) {
        Integer a = d.a(str);
        if (a != null) {
            return a;
        }
        throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str)));
    }

    private static int n(String str) {
        int o = aqc.o(str);
        if (o != 0) {
            return o;
        }
        throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str)));
    }

    private static int o(String str) {
        return "italic".equals(str) ? b.b : "normal".equals(str) ? b.a : "oblique".equals(str) ? b.c : 0;
    }

    private static int p(String str) {
        if ("none".equals(str)) {
            return 1;
        }
        if ("underline".equals(str)) {
            return 2;
        }
        if ("overline".equals(str)) {
            return 3;
        }
        if ("line-through".equals(str)) {
            return 4;
        }
        if ("blink".equals(str)) {
            return 5;
        }
        throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str)));
    }

    private static int q(String str) {
        if ("ltr".equals(str)) {
            return 1;
        }
        if ("rtl".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid direction property: ".concat(String.valueOf(str)));
    }

    private static int r(String str) {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static int s(String str) {
        if (Property.LINE_CAP_BUTT.equals(str)) {
            return 1;
        }
        if ("round".equals(str)) {
            return 2;
        }
        if (Property.LINE_CAP_SQUARE.equals(str)) {
            return 3;
        }
        throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str)));
    }

    private static int t(String str) {
        if (Property.LINE_JOIN_MITER.equals(str)) {
            return 1;
        }
        if ("round".equals(str)) {
            return 2;
        }
        if (Property.LINE_JOIN_BEVEL.equals(str)) {
            return 3;
        }
        throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0084 in {2, 5, 15, 17, 19, 22, 24, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static defpackage.apy.o[] u(java.lang.String r7) {
        /*
        r0 = new aqc$g;
        r0.<init>(r7);
        r0.d();
        r1 = r0.c();
        r2 = 0;
        if (r1 == 0) goto L_0x0010;
        return r2;
        r1 = r0.i();
        if (r1 != 0) goto L_0x0017;
        return r2;
        r3 = r1.b();
        r4 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: ";
        if (r3 != 0) goto L_0x0076;
        r3 = r1.a;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r5.add(r1);
        r1 = r0.c();
        if (r1 != 0) goto L_0x0063;
        r0.e();
        r1 = r0.i();
        if (r1 == 0) goto L_0x0053;
        r6 = r1.b();
        if (r6 != 0) goto L_0x0045;
        r5.add(r1);
        r1 = r1.a;
        r3 = r3 + r1;
        goto L_0x0029;
        r0 = new org.xml.sax.SAXException;
        r7 = java.lang.String.valueOf(r7);
        r7 = r4.concat(r7);
        r0.<init>(r7);
        throw r0;
        r0 = new org.xml.sax.SAXException;
        r7 = java.lang.String.valueOf(r7);
        r1 = "Invalid stroke-dasharray. Non-Length content found: ";
        r7 = r1.concat(r7);
        r0.<init>(r7);
        throw r0;
        r7 = 0;
        r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r7 != 0) goto L_0x0069;
        return r2;
        r7 = r5.size();
        r7 = new defpackage.apy.o[r7];
        r7 = r5.toArray(r7);
        r7 = (defpackage.apy.o[]) r7;
        return r7;
        r0 = new org.xml.sax.SAXException;
        r7 = java.lang.String.valueOf(r7);
        r7 = r4.concat(r7);
        r0.<init>(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.u(java.lang.String):apy$o[]");
    }

    private static int v(String str) {
        if ("start".equals(str)) {
            return 1;
        }
        if ("middle".equals(str)) {
            return 2;
        }
        if (TTMLParser.Attributes.END.equals(str)) {
            return 3;
        }
        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str)));
    }

    private static Boolean w(String str) {
        if (Property.VISIBLE.equals(str) || "auto".equals(str)) {
            return Boolean.TRUE;
        }
        if ("hidden".equals(str) || "scroll".equals(str)) {
            return Boolean.FALSE;
        }
        throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str)));
    }

    private static apy.b x(String str) {
        if ("auto".equals(str)) {
            return null;
        }
        if (str.toLowerCase(Locale.US).startsWith("rect(")) {
            g gVar = new g(str.substring(5));
            gVar.d();
            o a = aqc.a(gVar);
            gVar.e();
            o a2 = aqc.a(gVar);
            gVar.e();
            o a3 = aqc.a(gVar);
            gVar.e();
            o a4 = aqc.a(gVar);
            gVar.d();
            if (gVar.a(')')) {
                return new apy.b(a, a2, a3, a4);
            }
            throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str)));
        }
        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
    }

    private static int y(String str) {
        if ("none".equals(str)) {
            return 1;
        }
        if ("non-scaling-stroke".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str)));
    }

    private static Set<String> z(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.c()) {
            String k = gVar.k();
            hashSet.add(k.startsWith("http://www.w3.org/TR/SVG11/feature#") ? k.substring(35) : "UNSUPPORTED");
            gVar.d();
        }
        return hashSet;
    }

    /* Access modifiers changed, original: protected|final */
    public final apy a(InputStream inputStream) {
        String str = "Exception thrown closing input stream";
        String str2 = "SVGParser";
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(this);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            xMLReader.parse(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e(str2, str);
            }
            return this.a;
        } catch (IOException e) {
            throw new aqb("File error", e);
        } catch (ParserConfigurationException e2) {
            throw new aqb("XML Parser problem", e2);
        } catch (SAXException e3) {
            StringBuilder stringBuilder = new StringBuilder("SVG parse error: ");
            stringBuilder.append(e3.getMessage());
            throw new aqb(stringBuilder.toString(), e3);
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
                Log.e(str2, str);
            }
        }
    }

    public final void characters(char[] cArr, int i, int i2) {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(i2);
                }
                this.g.append(cArr, i, i2);
            } else if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(i2);
                }
                this.i.append(cArr, i, i2);
            } else {
                ai aiVar = this.b;
                if (aiVar instanceof ax) {
                    ag agVar = (ag) aiVar;
                    int size = agVar.i.size();
                    am amVar = size == 0 ? null : (am) agVar.i.get(size - 1);
                    if (amVar instanceof bb) {
                        StringBuilder stringBuilder = new StringBuilder();
                        bb bbVar = (bb) amVar;
                        stringBuilder.append(bbVar.a);
                        stringBuilder.append(new String(cArr, i, i2));
                        bbVar.a = stringBuilder.toString();
                        return;
                    }
                    ((ag) this.b).a(new bb(new String(cArr, i, i2)));
                }
            }
        }
    }

    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    public final void endDocument() {
    }

    /* JADX WARNING: Missing block: B:27:0x006a, code skipped:
            r3.setLength(0);
     */
    /* JADX WARNING: Missing block: B:28:0x006d, code skipped:
            return;
     */
    public final void endElement(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
        r2 = this;
        r5 = r2.c;
        r0 = 1;
        r1 = 0;
        if (r5 == 0) goto L_0x0010;
    L_0x0006:
        r5 = r2.d;
        r5 = r5 - r0;
        r2.d = r5;
        if (r5 != 0) goto L_0x0010;
    L_0x000d:
        r2.c = r1;
        return;
    L_0x0010:
        r5 = "http://www.w3.org/2000/svg";
        r5 = r5.equals(r3);
        if (r5 != 0) goto L_0x0021;
    L_0x0018:
        r5 = "";
        r3 = r5.equals(r3);
        if (r3 != 0) goto L_0x0021;
    L_0x0020:
        return;
    L_0x0021:
        r3 = defpackage.aqc.1.a;
        r4 = defpackage.aqc.f.a(r4);
        r4 = r4.ordinal();
        r3 = r3[r4];
        if (r3 == r0) goto L_0x0094;
    L_0x002f:
        r4 = 2;
        if (r3 == r4) goto L_0x0094;
    L_0x0032:
        r4 = 4;
        if (r3 == r4) goto L_0x0094;
    L_0x0035:
        r4 = 5;
        if (r3 == r4) goto L_0x0094;
    L_0x0038:
        r4 = 13;
        if (r3 == r4) goto L_0x0094;
    L_0x003c:
        r4 = 14;
        if (r3 == r4) goto L_0x0094;
    L_0x0040:
        switch(r3) {
            case 16: goto L_0x0094;
            case 17: goto L_0x0094;
            case 18: goto L_0x0094;
            case 19: goto L_0x0094;
            case 20: goto L_0x0094;
            case 21: goto L_0x0094;
            case 22: goto L_0x006e;
            case 23: goto L_0x006e;
            case 24: goto L_0x0094;
            case 25: goto L_0x0094;
            case 26: goto L_0x0094;
            case 27: goto L_0x0094;
            case 28: goto L_0x0094;
            case 29: goto L_0x0094;
            case 30: goto L_0x0044;
            case 31: goto L_0x0094;
            default: goto L_0x0043;
        };
    L_0x0043:
        goto L_0x009c;
    L_0x0044:
        r3 = r2.i;
        if (r3 == 0) goto L_0x009c;
    L_0x0048:
        r2.h = r1;
        r3 = r3.toString();
        r4 = new apt;
        r5 = defpackage.apt.d.screen;
        r4.<init>(r5);
        r5 = r2.a;
        r0 = new apt$c;
        r0.<init>(r3);
        r0.d();
        r3 = r4.b(r0);
        r4 = r5.d;
        r4.a(r3);
        r3 = r2.i;
    L_0x006a:
        r3.setLength(r1);
        return;
    L_0x006e:
        r2.e = r1;
        r3 = r2.f;
        r4 = defpackage.aqc.f.title;
        if (r3 != r4) goto L_0x0081;
    L_0x0076:
        r3 = r2.a;
        r4 = r2.g;
        r4 = r4.toString();
        r3.b = r4;
        goto L_0x0091;
    L_0x0081:
        r3 = r2.f;
        r4 = defpackage.aqc.f.desc;
        if (r3 != r4) goto L_0x0091;
    L_0x0087:
        r3 = r2.a;
        r4 = r2.g;
        r4 = r4.toString();
        r3.c = r4;
    L_0x0091:
        r3 = r2.g;
        goto L_0x006a;
    L_0x0094:
        r3 = r2.b;
        r3 = (defpackage.apy.am) r3;
        r3 = r3.q;
        r2.b = r3;
    L_0x009c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqc.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void startDocument() {
        this.a = new apy();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.c) {
            this.d++;
        } else if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            f a = f.a(str2);
            str3 = "Invalid document. Root element must be <svg>";
            aq aeVar;
            af lVar;
            y yVar;
            az avVar;
            ai aiVar;
            switch (a) {
                case svg:
                    aeVar = new ae();
                    aeVar.p = this.a;
                    aeVar.q = this.b;
                    aqc.a((ak) aeVar, attributes);
                    aqc.b((ak) aeVar, attributes);
                    aqc.a((af) aeVar, attributes);
                    aqc.a(aeVar, attributes);
                    for (int i = 0; i < attributes.getLength(); i++) {
                        str3 = attributes.getValue(i).trim();
                        int i2 = 1.b[e.a(attributes.getLocalName(i)).ordinal()];
                        if (i2 == 1) {
                            aeVar.a = aqc.c(str3);
                        } else if (i2 == 2) {
                            aeVar.b = aqc.c(str3);
                        } else if (i2 == 3) {
                            aeVar.c = aqc.c(str3);
                            if (aeVar.c.b()) {
                                throw new SAXException("Invalid <svg> element. width cannot be negative");
                            }
                        } else if (i2 == 4) {
                            aeVar.d = aqc.c(str3);
                            if (aeVar.d.b()) {
                                throw new SAXException("Invalid <svg> element. height cannot be negative");
                            }
                        } else if (i2 == 5) {
                            aeVar.e = str3;
                        }
                    }
                    ai aiVar2 = this.b;
                    if (aiVar2 == null) {
                        this.a.a = aeVar;
                    } else {
                        aiVar2.a(aeVar);
                    }
                    this.b = aeVar;
                    return;
                case g:
                case a:
                    if (this.b != null) {
                        lVar = new l();
                        lVar.p = this.a;
                        lVar.q = this.b;
                        aqc.a((ak) lVar, attributes);
                        aqc.b((ak) lVar, attributes);
                        aqc.a((m) lVar, attributes);
                        aqc.a(lVar, attributes);
                        this.b.a(lVar);
                        this.b = lVar;
                        return;
                    }
                    throw new SAXException(str3);
                case defs:
                    if (this.b != null) {
                        m gVar = new g();
                        gVar.p = this.a;
                        gVar.q = this.b;
                        aqc.a((ak) gVar, attributes);
                        aqc.b((ak) gVar, attributes);
                        aqc.a(gVar, attributes);
                        this.b.a(gVar);
                        this.b = gVar;
                        return;
                    }
                    throw new SAXException(str3);
                case use:
                    if (this.b != null) {
                        bd bdVar = new bd();
                        bdVar.p = this.a;
                        bdVar.q = this.b;
                        aqc.a((ak) bdVar, attributes);
                        aqc.b((ak) bdVar, attributes);
                        aqc.a((m) bdVar, attributes);
                        aqc.a((af) bdVar, attributes);
                        aqc.a(bdVar, attributes);
                        this.b.a(bdVar);
                        this.b = bdVar;
                        return;
                    }
                    throw new SAXException(str3);
                case path:
                    if (this.b != null) {
                        u uVar = new u();
                        uVar.p = this.a;
                        uVar.q = this.b;
                        aqc.a((ak) uVar, attributes);
                        aqc.b((ak) uVar, attributes);
                        aqc.a((m) uVar, attributes);
                        aqc.a((af) uVar, attributes);
                        aqc.a(uVar, attributes);
                        this.b.a(uVar);
                        return;
                    }
                    throw new SAXException(str3);
                case rect:
                    if (this.b != null) {
                        aa aaVar = new aa();
                        aaVar.p = this.a;
                        aaVar.q = this.b;
                        aqc.a((ak) aaVar, attributes);
                        aqc.b((ak) aaVar, attributes);
                        aqc.a((m) aaVar, attributes);
                        aqc.a((af) aaVar, attributes);
                        aqc.a(aaVar, attributes);
                        this.b.a(aaVar);
                        return;
                    }
                    throw new SAXException(str3);
                case circle:
                    if (this.b != null) {
                        c cVar = new c();
                        cVar.p = this.a;
                        cVar.q = this.b;
                        aqc.a((ak) cVar, attributes);
                        aqc.b((ak) cVar, attributes);
                        aqc.a((m) cVar, attributes);
                        aqc.a((af) cVar, attributes);
                        aqc.a(cVar, attributes);
                        this.b.a(cVar);
                        return;
                    }
                    throw new SAXException(str3);
                case ellipse:
                    if (this.b != null) {
                        h hVar = new h();
                        hVar.p = this.a;
                        hVar.q = this.b;
                        aqc.a((ak) hVar, attributes);
                        aqc.b((ak) hVar, attributes);
                        aqc.a((m) hVar, attributes);
                        aqc.a((af) hVar, attributes);
                        aqc.a(hVar, attributes);
                        this.b.a(hVar);
                        return;
                    }
                    throw new SAXException(str3);
                case line:
                    if (this.b != null) {
                        p pVar = new p();
                        pVar.p = this.a;
                        pVar.q = this.b;
                        aqc.a((ak) pVar, attributes);
                        aqc.b((ak) pVar, attributes);
                        aqc.a((m) pVar, attributes);
                        aqc.a((af) pVar, attributes);
                        aqc.a(pVar, attributes);
                        this.b.a(pVar);
                        return;
                    }
                    throw new SAXException(str3);
                case polyline:
                    if (this.b != null) {
                        yVar = new y();
                        yVar.p = this.a;
                        yVar.q = this.b;
                        aqc.a((ak) yVar, attributes);
                        aqc.b((ak) yVar, attributes);
                        aqc.a((m) yVar, attributes);
                        aqc.a((af) yVar, attributes);
                        aqc.a(yVar, attributes, "polyline");
                        this.b.a(yVar);
                        return;
                    }
                    throw new SAXException(str3);
                case polygon:
                    if (this.b != null) {
                        yVar = new z();
                        yVar.p = this.a;
                        yVar.q = this.b;
                        aqc.a((ak) yVar, attributes);
                        aqc.b((ak) yVar, attributes);
                        aqc.a((m) yVar, attributes);
                        aqc.a((af) yVar, attributes);
                        aqc.a(yVar, attributes, "polygon");
                        this.b.a(yVar);
                        return;
                    }
                    throw new SAXException(str3);
                case text:
                    if (this.b != null) {
                        avVar = new av();
                        avVar.p = this.a;
                        avVar.q = this.b;
                        aqc.a((ak) avVar, attributes);
                        aqc.b((ak) avVar, attributes);
                        aqc.a((m) avVar, attributes);
                        aqc.a((af) avVar, attributes);
                        aqc.a(avVar, attributes);
                        this.b.a(avVar);
                        this.b = avVar;
                        return;
                    }
                    throw new SAXException(str3);
                case tspan:
                    aiVar = this.b;
                    if (aiVar == null) {
                        throw new SAXException(str3);
                    } else if (aiVar instanceof ax) {
                        avVar = new au();
                        avVar.p = this.a;
                        avVar.q = this.b;
                        aqc.a((ak) avVar, attributes);
                        aqc.b((ak) avVar, attributes);
                        aqc.a((af) avVar, attributes);
                        aqc.a(avVar, attributes);
                        this.b.a(avVar);
                        this.b = avVar;
                        if (avVar.q instanceof ba) {
                            avVar.a = (ba) avVar.q;
                            return;
                        } else {
                            avVar.a = ((aw) avVar.q).g();
                            return;
                        }
                    } else {
                        throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                case tref:
                    aiVar = this.b;
                    if (aiVar == null) {
                        throw new SAXException(str3);
                    } else if (aiVar instanceof ax) {
                        at atVar = new at();
                        atVar.p = this.a;
                        atVar.q = this.b;
                        aqc.a((ak) atVar, attributes);
                        aqc.b((ak) atVar, attributes);
                        aqc.a((af) atVar, attributes);
                        aqc.a(atVar, attributes);
                        this.b.a(atVar);
                        if (atVar.q instanceof ba) {
                            atVar.b = (ba) atVar.q;
                            return;
                        } else {
                            atVar.b = ((aw) atVar.q).g();
                            return;
                        }
                    } else {
                        throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                case SWITCH:
                    if (this.b != null) {
                        lVar = new ar();
                        lVar.p = this.a;
                        lVar.q = this.b;
                        aqc.a((ak) lVar, attributes);
                        aqc.b((ak) lVar, attributes);
                        aqc.a((m) lVar, attributes);
                        aqc.a(lVar, attributes);
                        this.b.a(lVar);
                        this.b = lVar;
                        return;
                    }
                    throw new SAXException(str3);
                case symbol:
                    if (this.b != null) {
                        aeVar = new as();
                        aeVar.p = this.a;
                        aeVar.q = this.b;
                        aqc.a((ak) aeVar, attributes);
                        aqc.b((ak) aeVar, attributes);
                        aqc.a((af) aeVar, attributes);
                        aqc.a(aeVar, attributes);
                        this.b.a(aeVar);
                        this.b = aeVar;
                        return;
                    }
                    throw new SAXException(str3);
                case marker:
                    if (this.b != null) {
                        q qVar = new q();
                        qVar.p = this.a;
                        qVar.q = this.b;
                        aqc.a((ak) qVar, attributes);
                        aqc.b((ak) qVar, attributes);
                        aqc.a((af) qVar, attributes);
                        aqc.a((aq) qVar, attributes);
                        aqc.a(qVar, attributes);
                        this.b.a(qVar);
                        this.b = qVar;
                        return;
                    }
                    throw new SAXException(str3);
                case linearGradient:
                    if (this.b != null) {
                        al alVar = new al();
                        alVar.p = this.a;
                        alVar.q = this.b;
                        aqc.a((ak) alVar, attributes);
                        aqc.b((ak) alVar, attributes);
                        aqc.a((i) alVar, attributes);
                        aqc.a(alVar, attributes);
                        this.b.a(alVar);
                        this.b = alVar;
                        return;
                    }
                    throw new SAXException(str3);
                case radialGradient:
                    if (this.b != null) {
                        ap apVar = new ap();
                        apVar.p = this.a;
                        apVar.q = this.b;
                        aqc.a((ak) apVar, attributes);
                        aqc.b((ak) apVar, attributes);
                        aqc.a((i) apVar, attributes);
                        aqc.a(apVar, attributes);
                        this.b.a(apVar);
                        this.b = apVar;
                        return;
                    }
                    throw new SAXException(str3);
                case stop:
                    aiVar = this.b;
                    if (aiVar == null) {
                        throw new SAXException(str3);
                    } else if (aiVar instanceof i) {
                        ac acVar = new ac();
                        acVar.p = this.a;
                        acVar.q = this.b;
                        aqc.a((ak) acVar, attributes);
                        aqc.b((ak) acVar, attributes);
                        aqc.a(acVar, attributes);
                        this.b.a(acVar);
                        this.b = acVar;
                        return;
                    } else {
                        throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
                    }
                case title:
                case desc:
                    this.e = true;
                    this.f = a;
                    return;
                case clipPath:
                    if (this.b != null) {
                        d dVar = new d();
                        dVar.p = this.a;
                        dVar.q = this.b;
                        aqc.a((ak) dVar, attributes);
                        aqc.b((ak) dVar, attributes);
                        aqc.a((m) dVar, attributes);
                        aqc.a((af) dVar, attributes);
                        aqc.a(dVar, attributes);
                        this.b.a(dVar);
                        this.b = dVar;
                        return;
                    }
                    throw new SAXException(str3);
                case textPath:
                    if (this.b != null) {
                        ay ayVar = new ay();
                        ayVar.p = this.a;
                        ayVar.q = this.b;
                        aqc.a((ak) ayVar, attributes);
                        aqc.b((ak) ayVar, attributes);
                        aqc.a((af) ayVar, attributes);
                        aqc.a(ayVar, attributes);
                        this.b.a(ayVar);
                        this.b = ayVar;
                        if (ayVar.q instanceof ba) {
                            ayVar.c = (ba) ayVar.q;
                            return;
                        } else {
                            ayVar.c = ((aw) ayVar.q).g();
                            return;
                        }
                    }
                    throw new SAXException(str3);
                case pattern:
                    if (this.b != null) {
                        x xVar = new x();
                        xVar.p = this.a;
                        xVar.q = this.b;
                        aqc.a((ak) xVar, attributes);
                        aqc.b((ak) xVar, attributes);
                        aqc.a((af) xVar, attributes);
                        aqc.a((aq) xVar, attributes);
                        aqc.a(xVar, attributes);
                        this.b.a(xVar);
                        this.b = xVar;
                        return;
                    }
                    throw new SAXException(str3);
                case image:
                    if (this.b != null) {
                        n nVar = new n();
                        nVar.p = this.a;
                        nVar.q = this.b;
                        aqc.a((ak) nVar, attributes);
                        aqc.b((ak) nVar, attributes);
                        aqc.a((m) nVar, attributes);
                        aqc.a((af) nVar, attributes);
                        aqc.a(nVar, attributes);
                        this.b.a(nVar);
                        this.b = nVar;
                        return;
                    }
                    throw new SAXException(str3);
                case view:
                    if (this.b != null) {
                        aeVar = new be();
                        aeVar.p = this.a;
                        aeVar.q = this.b;
                        aqc.a((ak) aeVar, attributes);
                        aqc.a((af) aeVar, attributes);
                        aqc.a(aeVar, attributes);
                        this.b.a(aeVar);
                        this.b = aeVar;
                        return;
                    }
                    throw new SAXException(str3);
                case mask:
                    if (this.b != null) {
                        r rVar = new r();
                        rVar.p = this.a;
                        rVar.q = this.b;
                        aqc.a((ak) rVar, attributes);
                        aqc.b((ak) rVar, attributes);
                        aqc.a((af) rVar, attributes);
                        aqc.a(rVar, attributes);
                        this.b.a(rVar);
                        this.b = rVar;
                        return;
                    }
                    throw new SAXException(str3);
                case style:
                    a(attributes);
                    return;
                case solidColor:
                    if (this.b != null) {
                        ak abVar = new ab();
                        abVar.p = this.a;
                        abVar.q = this.b;
                        aqc.a(abVar, attributes);
                        aqc.b(abVar, attributes);
                        this.b.a(abVar);
                        this.b = abVar;
                        return;
                    }
                    throw new SAXException(str3);
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }
}
