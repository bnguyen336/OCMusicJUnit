package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by bnguyen336 on 11/22/2016.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {
        mMusicEvent = new MusicEvent();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        assertNull("Expected title to be null.", mMusicEvent.getTitle());
        mMusicEvent.setTitle("Test title.");
        assertEquals("Test title.", mMusicEvent.getTitle());
    }

    @Test
    public void setTitle() throws Exception {

    }

    @Test
    public void getDate() throws Exception {

    }

    @Test
    public void setDate() throws Exception {

    }

    @Test
    public void getDay() throws Exception {

    }

    @Test
    public void setDay() throws Exception {

    }

    @Test
    public void getTime() throws Exception {

    }

    @Test
    public void setTime() throws Exception {

    }

    @Test
    public void getLocation() throws Exception {

    }

    @Test
    public void setLocation() throws Exception {

    }

    @Test
    public void getAddress1() throws Exception {

    }

    @Test
    public void setAddress1() throws Exception {

    }

    @Test
    public void getAddress2() throws Exception {

    }

    @Test
    public void setAddress2() throws Exception {

    }

    @Test
    public void getImageName() throws Exception {

    }

    @Test
    public void setImageName() throws Exception {

    }

}