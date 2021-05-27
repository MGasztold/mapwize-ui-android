package io.mapwize.mapwizeui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

/**
 * Follow user button allows user to change the follow user mode
 */
public class RoundButton extends androidx.appcompat.widget.AppCompatButton {

    public RoundButton(Context context) {
        super(context);
        initialize(context);
    }

    public RoundButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    public RoundButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
    }

    private void initialize(Context context) {
        setBackgroundResource(R.drawable.mapwize_circle_view);
    }
}
