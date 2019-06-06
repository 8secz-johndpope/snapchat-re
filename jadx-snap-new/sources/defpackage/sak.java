package defpackage;

import java.util.Map;

/* renamed from: sak */
public interface sak<PayloadType> {

    /* renamed from: sak$a */
    public interface a<PayloadType> {
        a<PayloadType> a(String str);

        <TargetType> a<TargetType> b(TargetType targetType);

        <V> a<PayloadType> b(String str, V v);

        a<PayloadType> c(Map<String, ?> map);

        a<PayloadType> d(Map<String, String> map);

        sak<PayloadType> e();
    }

    a<PayloadType> h();

    String i();

    String j();

    sac k();

    Map<String, String> l();

    Map<String, ?> m();

    PayloadType n();

    boolean o();
}
