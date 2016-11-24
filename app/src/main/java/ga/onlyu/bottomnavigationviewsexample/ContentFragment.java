package ga.onlyu.bottomnavigationviewsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by K53SV on 11/24/2016.
 */

public class ContentFragment extends Fragment {
    public static final String EXTRA_DATA = "DATA_CONTENT";

    private String content;

    public static ContentFragment newInstance(String data) {
        ContentFragment fragment = new ContentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_DATA, data);
        fragment.setArguments(bundle);
        return fragment;
    }

    private void retrieveExtras() {
        if (getArguments() != null) {
            content = getArguments().getString(EXTRA_DATA);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);
        retrieveExtras();
        TextView tvContent = (TextView) v.findViewById(R.id.tv_content);
        tvContent.setText(content);
        return v;
    }
}
