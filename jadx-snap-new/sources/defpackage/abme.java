package defpackage;

import java.util.Map;

/* renamed from: abme */
public final class abme implements abmg {
    private final Map<Class<? extends abmf>, abmf> a;

    public abme(Map<Class<? extends abmf>, abmf> map) {
        this.a = map;
    }

    public final <T extends abmf> T getTestBridge(Class<T> cls) {
        abmf abmf = (abmf) this.a.get(cls);
        if (cls.isInstance(abmf)) {
            return abmf;
        }
        StringBuilder stringBuilder = new StringBuilder("Could not find a TestBridge of class ");
        stringBuilder.append(cls.getSimpleName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
