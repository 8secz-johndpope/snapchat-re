package defpackage;

/* renamed from: kxz */
public interface kxz {

    /* renamed from: kxz$a */
    public enum a {
        LiveCamera(0),
        StoryReply(1),
        ChatReply(2),
        Restart(3),
        PreviewCancel(4),
        Map(1);
        
        final int value;

        private a(int i) {
            this.value = i;
        }
    }

    ajdx<a> a();
}
