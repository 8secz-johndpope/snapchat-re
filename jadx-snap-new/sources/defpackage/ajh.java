package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: ajh */
final class ajh implements aio {
    private final String a;
    private final int b;
    private final int c;
    private final aiq d;
    private final aiq e;
    private final ais f;
    private final air g;
    private final anm h;
    private final ain i;
    private final aio j;
    private String k;
    private int l;
    private aio m;

    public ajh(String str, aio aio, int i, int i2, aiq aiq, aiq aiq2, ais ais, air air, anm anm, ain ain) {
        this.a = str;
        this.j = aio;
        this.b = i;
        this.c = i2;
        this.d = aiq;
        this.e = aiq2;
        this.f = ais;
        this.g = air;
        this.h = anm;
        this.i = ain;
    }

    public final aio a() {
        if (this.m == null) {
            this.m = new ajm(this.a, this.j);
        }
        return this.m;
    }

    public final void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        this.j.a(messageDigest);
        String str = "UTF-8";
        messageDigest.update(this.a.getBytes(str));
        messageDigest.update(array);
        aiq aiq = this.d;
        String str2 = "";
        messageDigest.update((aiq != null ? aiq.a() : str2).getBytes(str));
        aiq = this.e;
        messageDigest.update((aiq != null ? aiq.a() : str2).getBytes(str));
        ais ais = this.f;
        messageDigest.update((ais != null ? ais.a() : str2).getBytes(str));
        air air = this.g;
        messageDigest.update((air != null ? air.a() : str2).getBytes(str));
        ain ain = this.i;
        if (ain != null) {
            str2 = ain.a();
        }
        messageDigest.update(str2.getBytes(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ajh ajh = (ajh) obj;
        if (!this.a.equals(ajh.a) || !this.j.equals(ajh.j) || this.c != ajh.c || this.b != ajh.b) {
            return false;
        }
        if (((this.f == null ? 1 : 0) ^ (ajh.f == null ? 1 : 0)) != 0) {
            return false;
        }
        ais ais = this.f;
        if (ais != null && !ais.a().equals(ajh.f.a())) {
            return false;
        }
        if (((this.e == null ? 1 : 0) ^ (ajh.e == null ? 1 : 0)) != 0) {
            return false;
        }
        aiq aiq = this.e;
        if (aiq != null && !aiq.a().equals(ajh.e.a())) {
            return false;
        }
        if (((this.d == null ? 1 : 0) ^ (ajh.d == null ? 1 : 0)) != 0) {
            return false;
        }
        aiq = this.d;
        if (aiq != null && !aiq.a().equals(ajh.d.a())) {
            return false;
        }
        if (((this.g == null ? 1 : 0) ^ (ajh.g == null ? 1 : 0)) != 0) {
            return false;
        }
        air air = this.g;
        if (air != null && !air.a().equals(ajh.g.a())) {
            return false;
        }
        if (((this.h == null ? 1 : 0) ^ (ajh.h == null ? 1 : 0)) != 0) {
            return false;
        }
        anm anm = this.h;
        if (anm != null && !anm.a().equals(ajh.h.a())) {
            return false;
        }
        if (((this.i == null ? 1 : 0) ^ (ajh.i == null ? 1 : 0)) != 0) {
            return false;
        }
        ain ain = this.i;
        return ain == null || ain.a().equals(ajh.i.a());
    }

    public final int hashCode() {
        if (this.l == 0) {
            this.l = this.a.hashCode();
            this.l = (this.l * 31) + this.j.hashCode();
            this.l = (this.l * 31) + this.b;
            this.l = (this.l * 31) + this.c;
            int i = this.l * 31;
            aiq aiq = this.d;
            int i2 = 0;
            this.l = i + (aiq != null ? aiq.a().hashCode() : 0);
            i = this.l * 31;
            aiq = this.e;
            this.l = i + (aiq != null ? aiq.a().hashCode() : 0);
            i = this.l * 31;
            ais ais = this.f;
            this.l = i + (ais != null ? ais.a().hashCode() : 0);
            i = this.l * 31;
            air air = this.g;
            this.l = i + (air != null ? air.a().hashCode() : 0);
            i = this.l * 31;
            anm anm = this.h;
            this.l = i + (anm != null ? anm.a().hashCode() : 0);
            i = this.l * 31;
            ain ain = this.i;
            if (ain != null) {
                i2 = ain.a().hashCode();
            }
            this.l = i + i2;
        }
        return this.l;
    }

    public final String toString() {
        if (this.k == null) {
            StringBuilder stringBuilder = new StringBuilder("EngineKey{");
            stringBuilder.append(this.a);
            stringBuilder.append('+');
            stringBuilder.append(this.j);
            stringBuilder.append("+[");
            stringBuilder.append(this.b);
            stringBuilder.append('x');
            stringBuilder.append(this.c);
            stringBuilder.append("]+'");
            aiq aiq = this.d;
            String str = "";
            stringBuilder.append(aiq != null ? aiq.a() : str);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            aiq aiq2 = this.e;
            stringBuilder.append(aiq2 != null ? aiq2.a() : str);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ais ais = this.f;
            stringBuilder.append(ais != null ? ais.a() : str);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            air air = this.g;
            stringBuilder.append(air != null ? air.a() : str);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            anm anm = this.h;
            stringBuilder.append(anm != null ? anm.a() : str);
            stringBuilder.append('\'');
            stringBuilder.append('+');
            stringBuilder.append('\'');
            ain ain = this.i;
            if (ain != null) {
                str = ain.a();
            }
            stringBuilder.append(str);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            this.k = stringBuilder.toString();
        }
        return this.k;
    }
}
