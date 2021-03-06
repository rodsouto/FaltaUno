package com.faltauno.faltauno;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Toast;

import static com.facebook.FacebookSdk.getApplicationContext;

//import android.app.FragmentManager;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Partidos", "Mis Partidos", "Canchas" };
    private Context context;

    public CustomFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        String texto = "esto es un texto";
        //Por default devuelvo siempre el de proximos partidos

        switch (position) {
            case 1:
                return FragmentMisPartidos.newInstance(texto);
//                return PageFragment.newInstance(PAGE_COUNT);
            case 2:
                return FragmentCanchas.newInstance(texto);
    }
        //return NuevoPartidoFragment.newInstance(texto);
        return FragmentPartidos.newInstance(texto);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}