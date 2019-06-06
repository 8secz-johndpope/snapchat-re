package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import defpackage.abnf.a;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: abmv */
public final class abmv implements abnb {
    public static final Creator<abnb> CREATOR = new 1();
    public final byte[] a;
    public final byte[] b;

    /* renamed from: abmv$1 */
    static class 1 implements Creator<abnb> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new abmv(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new abnb[i];
        }
    }

    public abmv() {
        byte[] bArr = new byte[16];
        a.a.nextBytes(bArr);
        byte[] bArr2 = new byte[Cipher.getInstance("AES/CBC/PKCS5Padding").getBlockSize()];
        a.a.nextBytes(bArr2);
        this(bArr, bArr2);
    }

    public abmv(Parcel parcel) {
        this.a = new byte[32];
        this.b = new byte[16];
        parcel.readByteArray(this.a);
        parcel.readByteArray(this.b);
    }

    public abmv(String str, String str2) {
        this(str, str2, (byte) 0);
    }

    public abmv(String str, String str2, byte b) {
        this.a = Base64.decode(str, 0);
        this.b = Base64.decode(str2, 0);
    }

    public abmv(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public static long a(long j) {
        return ((j / 16) + 1) << 4;
    }

    public final InputStream a(InputStream inputStream) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return new abmw(inputStream, instance);
    }

    public final OutputStream a(OutputStream outputStream) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return new abmx(outputStream, instance);
    }

    public final byte[] a(byte[] bArr) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return instance.doFinal(bArr);
    }

    public final InputStream b(InputStream inputStream) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return new abmw(inputStream, instance);
    }

    public final OutputStream b(OutputStream outputStream) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return new abmx(outputStream, instance);
    }

    public final byte[] b(byte[] bArr) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(this.a, "AES"), new IvParameterSpec(this.b));
        return instance.doFinal(bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        if (!abss.a().c()) {
            return super.toString();
        }
        return String.format("CbcEncryptionAlgorithm{%s - %s}", new Object[]{Base64.encodeToString(this.a, 0), Base64.encodeToString(this.b, 0)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeByteArray(this.b);
    }
}
