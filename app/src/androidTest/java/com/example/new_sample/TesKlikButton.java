package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }
    public void tesKlikButtonDua(){
        //cari id button2 terus di klik
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }
    public void tesKlikButtonTiga(){
        //cari id button2 terus di klik
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }
    public void tesKlikButtonLima(){
        //cari id button2 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }
    public void tesKlikButtonEnam(){
        //cari id button2 terus di klik
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
    }
    public void tesKlikButtonTujuh(){
        //cari id button2 terus di klik
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
    }
    public void tesKlikButtonDelapan(){
        //cari id button2 terus di klik
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
    }
    public void tesKlikButtonSembilan(){
        //cari id button9 terus di klik
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
    }
    public void tesKlikButtonNol(){
        //cari id button0 terus di klik
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
    }

    @Test
    public void tesTambahButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    @Test
    public void tesKaliButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    @Test
    public void tesBagiButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    @Test
    public void tesKurangButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }
}
