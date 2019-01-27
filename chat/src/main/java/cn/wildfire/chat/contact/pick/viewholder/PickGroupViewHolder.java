package cn.wildfire.chat.contact.pick.viewholder;

import android.view.View;

import androidx.fragment.app.Fragment;
import cn.wildfire.chat.annotation.LayoutRes;
import cn.wildfire.chat.contact.ContactAdapter;
import cn.wildfire.chat.contact.model.GroupValue;
import cn.wildfire.chat.contact.viewholder.header.HeaderViewHolder;
import cn.wildfirechat.chat.R;

@SuppressWarnings("unused")
@LayoutRes(resId = R.layout.contact_header_group)
public class PickGroupViewHolder extends HeaderViewHolder<GroupValue> {

    public PickGroupViewHolder(Fragment fragment, ContactAdapter adapter, View itemView) {
        super(fragment, adapter, itemView);
    }

    @Override
    public void onBind(GroupValue groupValue) {

    }
}
