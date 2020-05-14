package com.amap.apis.cluster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.model.Marker;

import java.util.List;

/**
 * @author: xpengb@outlook.com
 * @date: 2020/5/14
 * @version: v1.0
 * @desc:
 */
public class InfoWindowAdapter implements AMap.InfoWindowAdapter {
    private Context context;
    private List<ClusterItem> data;
    
    public InfoWindowAdapter(Context context, List<ClusterItem> data) {
        this.context = context;
        this.data = data;
    }
    
    
    @Override
    public View getInfoWindow(Marker marker) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_info_window, null);
        TextView titleTv  = view.findViewById(R.id.tv_title);
        titleTv.setText(data.size() + "");
        
        return view;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
