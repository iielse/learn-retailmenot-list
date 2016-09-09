package org.ielse.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListDemoActivity extends Activity {

    private RetailMeNotLayout retailMeNotLayout;
    private RetailMeNotAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_demo_activity);

        retailMeNotLayout = (RetailMeNotLayout) findViewById(R.id.l_retail_me_not);

        TextView tMoreInfo = new TextView(this);
        tMoreInfo.setText("no more information..");
        retailMeNotLayout.addBottomContent(tMoreInfo);
        retailMeNotLayout.setAdapter(adapter = new RetailMeNotAdapter());

        adapter.set();
    }

    private class RetailMeNotAdapter extends RetailMeNotLayout.Adapter {
        List<DataInfo> list = new ArrayList<>();

        public void set() {
            List<DataInfo> l1 = DataImportUtils.init();
            List<DataInfo> l2 = DataImportUtils.init();
            List<DataInfo> l3 = DataImportUtils.init();

            list.addAll(l1);
            list.addAll(l2);
            list.addAll(l3);

            notifyDataSetChanged();
        }

        @Override
        public View getView(int position, ViewGroup parent, int expandedHeight, int normalHeight) {
            AMzItemLayout item = new AMzItemLayout(parent.getContext());
            item.setData(position, list.get(position), expandedHeight, normalHeight);
            return item;
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }

}
