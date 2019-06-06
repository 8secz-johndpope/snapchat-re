package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.R;

/* renamed from: abuu */
public final class abuu extends RelativeLayout {
    private final Context a;
    private TextView b = ((TextView) findViewById(R.id.auto_fill_prompt_description));
    private TextView c = ((TextView) findViewById(R.id.auto_fill_prompt_title));
    private Button d = ((Button) findViewById(R.id.auto_fill_prompt_no_btn));
    private Button e = ((Button) findViewById(R.id.auto_fill_prompt_yes_btn));

    public abuu(Context context) {
        super(context);
        this.a = context;
        LayoutInflater.from(this.a).inflate(R.layout.promo_prompt_layout, this, true);
    }
}
