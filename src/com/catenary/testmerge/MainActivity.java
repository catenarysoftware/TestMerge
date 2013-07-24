package com.catenary.testmerge;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * working on branch_1, created with rebase option
 * 
 * meanwhile, back at the ranch, new activity on branch_1
 * working on branch_2, merge option
 * 
 * removed all branches, now committing branch_christina
 * @author dan
 *
 */

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
