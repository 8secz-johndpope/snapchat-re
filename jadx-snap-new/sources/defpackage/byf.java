package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: byf */
final class byf {
    public final int a;
    public final String b;
    final TreeSet<byn> c = new TreeSet();
    byk d = byk.a;
    boolean e;

    public byf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static byf a(int i, DataInputStream dataInputStream) {
        byf byf = new byf(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            byj byj = new byj();
            byi.a(byj, readLong);
            byf.a(byj);
        } else {
            i = dataInputStream.readInt();
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < i; i2++) {
                String readUTF = dataInputStream.readUTF();
                int readInt = dataInputStream.readInt();
                if (readInt < 0 || readInt > 10485760) {
                    throw new IOException("Invalid value size: ".concat(String.valueOf(readInt)));
                }
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr);
                hashMap.put(readUTF, bArr);
            }
            byf.d = new byk(hashMap);
        }
        return byf;
    }

    public final int a(int i) {
        int hashCode = (this.a * 31) + this.b.hashCode();
        if (i < 2) {
            long a = byi.a(this.d);
            hashCode *= 31;
            i = (int) (a ^ (a >>> 32));
        } else {
            hashCode *= 31;
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public final byn a(long j) {
        byn byn = new byn(this.b, j, -1, -9223372036854775807L, null);
        byn = (byn) this.c.floor(byn);
        if (byn != null && byn.b + byn.c > j) {
            return byn;
        }
        byn = (byn) this.c.ceiling(byn);
        if (byn == null) {
            return byn.a(this.b, j);
        }
        return new byn(this.b, j, byn.b - j, -9223372036854775807L, null);
    }

    public final void a(byn byn) {
        this.c.add(byn);
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.a);
        dataOutputStream.writeUTF(this.b);
        byk byk = this.d;
        dataOutputStream.writeInt(byk.b.size());
        for (Entry entry : byk.b.entrySet()) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final boolean a(byd byd) {
        if (!this.c.remove(byd)) {
            return false;
        }
        byd.e.delete();
        return true;
    }

    public final boolean a(byj byj) {
        byk byk = this.d;
        this.d = byk.a(byj);
        return !this.d.equals(byk);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            byf byf = (byf) obj;
            return this.a == byf.a && this.b.equals(byf.b) && this.c.equals(byf.c) && this.d.equals(byf.d);
        }
    }

    public final int hashCode() {
        return (a(Integer.MAX_VALUE) * 31) + this.c.hashCode();
    }
}
