package com.feisukj.ad.permission;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.feisukj.ad.R;
import com.yanzhenjie.permission.Rationale;


/**
 * Author : Gupingping
 * Date : 2018/8/8
 * Mail : gu12pp@163.com
 */
public class AuthorityDialog extends PDialogHolder {
    private View empty_view, mlayout;
    private TextView  mContent, mBtn;

    public AuthorityDialog(@NonNull Context context) {
        super(context);
    }

    public AuthorityDialog(@NonNull Context context, String msg) {
        super(context, msg);
    }

    public AuthorityDialog(@NonNull Context context, Rationale rationale) {
        super(context, rationale);
    }
    public AuthorityDialog(@NonNull Context context, Rationale rationale, String msg) {
        super(context, rationale, msg);
    }

    @Override
    protected void findViews() {
        mlayout = findViewById(R.id.layout_view);
        empty_view = findViewById(R.id.blank_view);
        mContent = (TextView) findViewById(R.id.mContent);
        mBtn = (TextView) findViewById(R.id.authority_tv);
        mBtn.setOnClickListener(this);
    }

    @Override
    protected int layoutID() {
        return R.layout.permission_dialog_layout;
    }

    @Override
    protected TextView msgTextView() {
        return mContent;
    }

    @Override
    public void onClick(View v) {
        mRationale.resume();
        dismiss();
    }
}
