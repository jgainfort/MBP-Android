package com.realeyes.primetime.mbp_android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class listMediaActivity extends Activity {
    // Initial Data
    Media[] mediaListArray = new Media[] {
            new Media("Otter Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Otter's"),
            new Media("Dolphin Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Dolphin's"),
            new Media("Penguin Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Penguin's"),
            new Media("Shark Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some killer Shark's"),
            new Media("Whale Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some large Whale's"),
            new Media("Manta Ray Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Manta Ray's"),
            new Media("Sea Lion Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some tricky Sea Lion's"),
            new Media("Octopus Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some slimy Octopus"),
            new Media("Fish Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some colorful Fish"),
            new Media("Crab Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some dancing Crab's"),
            new Media("Lobster Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some sleeping Lobster's"),
            new Media("Shrimp Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some tasty Shrimp"),
            new Media("Tortoise Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some old Tortoise's"),
            new Media("Dolphin Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Dolphin's"),
            new Media("Penguin Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Penguin's"),
            new Media("Shark Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some killer Shark's"),
            new Media("Whale Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some large Whale's"),
            new Media("Manta Ray Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some cute Manta Ray's"),
            new Media("Sea Lion Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some tricky Sea Lion's"),
            new Media("Octopus Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some slimy Octopus"),
            new Media("Fish Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some colorful Fish"),
            new Media("Crab Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some dancing Crab's"),
            new Media("Lobster Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some sleeping Lobster's"),
            new Media("Shrimp Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some tasty Shrimp"),
            new Media("Tortoise Cam", "Monterey Bay Aquarium", "monterey_logo_small", "Watch some old Tortoise's")
    };

    private ListView mMediaListView;
    private PlaceAdapter mPlaceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_media);

        mMediaListView = (ListView) findViewById(R.id.mediaList);

        mPlaceAdapter = new PlaceAdapter(getApplicationContext(), R.layout.row, mediaListArray);

        if (mMediaListView != null) {
            mMediaListView.setAdapter(mPlaceAdapter);
        }

        mMediaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i , long l) {
                Log.v("Media", mediaListArray[i].mTitle);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_media, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
