package com.olsys.boardgamegeekexampleapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.olsys.boardgamegeekexampleapp.R;
import com.olsys.utils.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 02.11.15.
 * TODO: Add a class header comment!
 *
 * @author Przemysław Czaus (przemyslaw@czaus.pl)
 */
public class BoardGamesAutocompleteAdapter extends BaseAdapter implements Filterable {

    private static final String TAG = "BoardGamesAutocompleteAdapter";

    private List<String> resultList = new ArrayList<>();
    private Context mContext;

    public BoardGamesAutocompleteAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return resultList.size();
    }

    @Override
    public String getItem(int index) {
        return resultList.get(index);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.simple_dropdown_item_2line, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.boardgame_name))
                .setText(getItem(position));
        ((TextView) convertView.findViewById(R.id.boardgame_year_published))
                .setText(String.valueOf(getItem(position) + "1234"));
        return convertView;
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if (constraint != null) {
                    Log.i(TAG, "Search for: " + constraint.toString());
                    List<String> games = searchData(constraint.toString());
                    filterResults.values = games;
                    filterResults.count = games.size();
                }
                return filterResults;
            }

            protected List<String> searchData(String searchString) {
                List<String> games = new ArrayList<>();
                for(int i = 0; i < 7; i++) {
                    games.add(i + "." + searchString);
                }
                return games;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                if (results != null && results.count > 0) {
                    resultList = (List<String>) results.values;
                    notifyDataSetChanged();
                } else {
                    notifyDataSetInvalidated();
                }
            }};
        return filter;
    }
}
