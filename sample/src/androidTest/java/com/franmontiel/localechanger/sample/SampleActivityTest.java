/*
 * Copyright (c)  2017  Francisco José Montiel Navarro.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.franmontiel.localechanger.sample;

import android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;

import com.franmontiel.localechanger.sample.pageobjects.SampleScreen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Locale;

/**
 * Advice: It is recommended to run the tests with a system locale configured not listed in the supported ones (to avoid false positives).
 */
@RunWith(AndroidJUnit4.class)
public class SampleActivityTest {

    private SampleScreenTestDelegate sampleScreenTestDelegate = new SampleScreenTestDelegate();

    @Before
    public void setUp() {
        sampleScreenTestDelegate.setUp(new SampleScreen(SampleActivity.class));
    }

    @Test
    public void shouldChangeLocale_WhenUserChangesItManually() {
        sampleScreenTestDelegate.shouldChangeLocale_WhenUserChangesItManually();
    }

    @Test
    public void shouldMaintainLocale_WhenConfigurationChanged() {
        sampleScreenTestDelegate.shouldMaintainLocale_WhenConfigurationChanged();
    }

    @Test
    public void shouldUpdateButtonText_WhenLocaleChanged() {
        sampleScreenTestDelegate.shouldUpdateButtonText_WhenLocaleChanged();
    }

    @Test
    public void shouldMaintainButtonText_WhenConfigurationChanged() {
        sampleScreenTestDelegate.shouldMaintainButtonText_WhenConfigurationChanged();
    }

    @Test
    public void shouldUpdateDate_WhenLocaleChanged() {
        sampleScreenTestDelegate.shouldUpdateDate_WhenLocaleChanged();
    }

    @Test
    public void shouldMaintainDate_WhenConfigurationChanged() {
        sampleScreenTestDelegate.shouldMaintainDate_WhenConfigurationChanged();
    }

    @Test
    public void shouldUpdateItemTitle_WhenLocaleChanged() {
        sampleScreenTestDelegate.shouldUpdateItemTitle_WhenLocaleChanged();
    }

    @Test
    public void shouldMaintainItemTitle_WhenConfigurationChanged() {
        sampleScreenTestDelegate.shouldMaintainItemTitle_WhenConfigurationChanged();
    }

    // TODO Check why this test only works on Nougat.
    // For some reason calling Locale.setDefault causes a NoActivityResumedException(Pressed back and killed the app) when invoking pressBack()
    @Test
    public void shouldUpdateLocale_WhenResumed_IfLocaleHasBeenChanged() throws Exception {
        sampleScreenTestDelegate.shouldUpdateLocale_WhenResumed_IfLocaleHasBeenChanged();
    }

    @Test
    public void shouldChangeLayoutDirection_WhenLocaleChanged() {
        sampleScreenTestDelegate.shouldChangeLayoutDirection_WhenLocaleChanged();
    }

    @Test
    public void shouldMaintainLayoutDirection_WhenConfigurationChanged() {
        sampleScreenTestDelegate.shouldMaintainLayoutDirection_WhenConfigurationChanged();
    }

    // TODO Test Actionbar title

}