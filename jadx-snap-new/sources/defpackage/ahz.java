package defpackage;

/* renamed from: ahz */
public enum ahz {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    public float multiplier;

    private ahz(float f) {
        this.multiplier = f;
    }
}
