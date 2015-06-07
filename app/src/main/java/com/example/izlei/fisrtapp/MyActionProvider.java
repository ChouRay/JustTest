package com.example.izlei.fisrtapp;
import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/**
 * Created by zhouzili on 2015/3/26.
 */
public  class MyActionProvider extends ActionProvider {

    private Context context;

    public MyActionProvider(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public View onCreateActionView() {
        return null;
    }

    @Override
    public void onPrepareSubMenu(SubMenu subMenu) {

        subMenu.clear();
        subMenu.add("sub item 1").setIcon(R.mipmap.ic_launcher)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return true;
                    }
                });
        subMenu.add("sub item 2").setIcon(R.mipmap.ic_launcher)
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return false;
                    }
                });

    }

    @Override
    public boolean hasSubMenu() {
        return true;
    }
}
