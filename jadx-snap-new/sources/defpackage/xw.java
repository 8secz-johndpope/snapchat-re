package defpackage;

import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.BrightcoveCaptionFormat.Builder;
import java.util.BitSet;

/* renamed from: xw */
public final class xw extends BrightcoveCaptionFormat {
    private final String a;
    private final String b;
    private final boolean c;

    /* renamed from: xw$a */
    public static final class a implements Builder {
        private final BitSet a = new BitSet();
        private String b;
        private String c;
        private boolean d;

        public final BrightcoveCaptionFormat build() {
            int i = 0;
            if (this.a.cardinality() < 3) {
                String[] strArr = new String[]{"type", "language", "hasInBandMetadataTrackDispatchType"};
                StringBuilder stringBuilder = new StringBuilder();
                while (i < 3) {
                    if (!this.a.get(i)) {
                        stringBuilder.append(' ');
                        stringBuilder.append(strArr[i]);
                    }
                    i++;
                }
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(stringBuilder)));
            }
            xw xwVar = new xw(this.b, this.c, this.d, (byte) 0);
            xwVar.validate();
            return xwVar;
        }

        public final Builder hasInBandMetadataTrackDispatchType(boolean z) {
            this.d = z;
            this.a.set(2);
            return this;
        }

        public final Builder language(String str) {
            this.c = str;
            this.a.set(1);
            return this;
        }

        public final Builder type(String str) {
            this.b = str;
            this.a.set(0);
            return this;
        }
    }

    private xw(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null language");
        }
        throw new NullPointerException("Null type");
    }

    /* synthetic */ xw(String str, String str2, boolean z, byte b) {
        this(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BrightcoveCaptionFormat) {
            BrightcoveCaptionFormat brightcoveCaptionFormat = (BrightcoveCaptionFormat) obj;
            return this.a.equals(brightcoveCaptionFormat.type()) && this.b.equals(brightcoveCaptionFormat.language()) && this.c == brightcoveCaptionFormat.hasInBandMetadataTrackDispatchType();
        }
    }

    public final boolean hasInBandMetadataTrackDispatchType() {
        return this.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String language() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BrightcoveCaptionFormat{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", language=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hasInBandMetadataTrackDispatchType=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.a;
    }
}
