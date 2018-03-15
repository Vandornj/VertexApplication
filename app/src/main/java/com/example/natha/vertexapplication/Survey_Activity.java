package com.example.natha.vertexapplication;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class Survey_Activity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private fragment_survey_ frag1 = new fragment_survey_();
    private fragment_survey_2 frag2 = new fragment_survey_2();
    private fragment_survey_3 frag3 = new fragment_survey_3();
    private fragment_survey_4 frag4 = new fragment_survey_4();
    private fragment_survey_5 frag5 = new fragment_survey_5();
    private fragment_survey_6 frag6 = new fragment_survey_6();
    private fragment_survey_7 frag7 = new fragment_survey_7();
    private fragment_survey_8 frag8 = new fragment_survey_8();
    private fragment_survey_9 frag9 = new fragment_survey_9();
    private fragment_survey_10 frag10 = new fragment_survey_10();
    private fragment_survey_11 frag11 = new fragment_survey_11();
    private fragment_survey_12 frag12 = new fragment_survey_12();
    private fragment_survey_13 frag13 = new fragment_survey_13();
    private fragment_survey_14 frag14 = new fragment_survey_14();
    private fragment_survey_15 frag15 = new fragment_survey_15();
    private fragment_survey_16 frag16 = new fragment_survey_16();
    private fragment_survey_17 frag17 = new fragment_survey_17();
    private fragment_survey_18 frag18 = new fragment_survey_18();
    private fragment_survey_19 frag19 = new fragment_survey_19();
    private fragment_survey_20 frag20 = new fragment_survey_20();
    private fragment_survey_21 frag21 = new fragment_survey_21();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);



    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a fragment_survey_2 (defined as a static inner class below).
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return frag1.newInstance(0);
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return frag2.newInstance(1);
                case 2: // Fragment # 1 - This will show SecondFragment
                    return frag3.newInstance(2);
                case 3: // Fragment # 1 - This will show SecondFragment
                    return frag4.newInstance(3);
                case 4: // Fragment # 1 - This will show SecondFragment
                    return frag5.newInstance(4);
                case 5: // Fragment # 1 - This will show SecondFragment
                    return frag6.newInstance(5);
                case 6: // Fragment # 1 - This will show SecondFragment
                    return frag7.newInstance(6);
                case 7: // Fragment # 1 - This will show SecondFragment
                    return frag8.newInstance(7);
                case 8: // Fragment # 1 - This will show SecondFragment
                    return frag9.newInstance(8);
                case 9: // Fragment # 1 - This will show SecondFragment
                    return frag10.newInstance(9);
                case 10: // Fragment # 1 - This will show SecondFragment
                    return frag11.newInstance(10);
                case 11: // Fragment # 1 - This will show SecondFragment
                    return frag12.newInstance(11);
                case 12: // Fragment # 1 - This will show SecondFragment
                    return frag13.newInstance(12);
                case 13: // Fragment # 1 - This will show SecondFragment
                    return frag14.newInstance(13);
                case 14: // Fragment # 1 - This will show SecondFragment
                    return frag15.newInstance(14);
                case 15: // Fragment # 1 - This will show SecondFragment
                    return frag16.newInstance(15);
                case 16: // Fragment # 1 - This will show SecondFragment
                    return frag17.newInstance(16);
                case 17: // Fragment # 1 - This will show SecondFragment
                    return frag18.newInstance(17);
                case 18: // Fragment # 1 - This will show SecondFragment
                    return frag19.newInstance(18);
                case 19: // Fragment # 1 - This will show SecondFragment
                    return frag20.newInstance(19);
                case 20: // Fragment # 1 - This will show SecondFragment
                    return frag21.newInstance(20);
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {

            return 21;
        }

    }
}
