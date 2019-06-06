package defpackage;

/* renamed from: qwu */
public final class qwu {
    long a;
    final long b;
    boolean c;

    public qwu(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qwu) {
                qwu qwu = (qwu) obj;
                if ((this.a == qwu.a ? 1 : null) != null) {
                    if ((this.b == qwu.b ? 1 : null) != null) {
                        if ((this.c == qwu.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UploadStatus(totalBytesUploaded=");
        stringBuilder.append(this.a);
        stringBuilder.append(", totalBytes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isClosed=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
