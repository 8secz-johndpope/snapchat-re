package defpackage;

/* renamed from: inh */
public enum inh {
    COUNTER(0),
    TIMER(1),
    HISTOGRAM(2);
    
    public final int value;

    private inh(int i) {
        this.value = i;
    }
}
