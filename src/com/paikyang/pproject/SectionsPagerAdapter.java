package com.paikyang.pproject;

//import com.paikyang.pproject.MainfrgActivity;
//import com.filenanumi.mapp.webview.WebViewMainFragment;
//import com.filenanumi.mapp.webview.WebViewDevFragment;
//import com.filenanumi.mapp.webview.WebViewTwtFragment;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
//import com.filenanumi.mapp.webview.*;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
		switch(position) {
		case 0:
			return new frgready(mContext);
		case 1:
			return new frgstart(mContext);
		case 2:
			return new frggps(mContext);
		case 3:
		    return new frgcam(mContext);
		case 4:
		    return new frgmms(mContext);
		case 5:
		    return new frglaunch(mContext);
/*		case 6:
		    return new WebViewTwtFragment(mContext);
*/
		}
		return null;
	}

	@Override
	public int getCount() {
		// Show 7 total pages.
		return 6;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1).toUpperCase();
		case 1:
			return mContext.getString(R.string.title_section2).toUpperCase();
		case 2:
			return mContext.getString(R.string.title_section3).toUpperCase();
		case 3:
		    return mContext.getString(R.string.title_section4).toUpperCase();
		case 4:
		    return mContext.getString(R.string.title_section5).toUpperCase();
		case 5:
		    return mContext.getString(R.string.title_section6).toUpperCase();
/*		case 6:
		    return mContext.getString(R.string.title_section7).toUpperCase();
			
	*/
		}
		return null;
	}

}
