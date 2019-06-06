package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: gji */
public class gji extends aedh {
    @SerializedName("custom_endpoint")
    final String a;
    @SerializedName("data")
    public final byte[] b;
    @SerializedName("endpoint_path")
    final String c;

    public gji(String str, String str2, byte[] bArr) {
        this.c = str;
        this.b = bArr;
        this.a = str2;
    }
}
