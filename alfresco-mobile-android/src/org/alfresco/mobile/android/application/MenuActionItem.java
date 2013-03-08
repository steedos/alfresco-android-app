/*******************************************************************************
 * Copyright (C) 2005-2013 Alfresco Software Limited.
 * 
 * This file is part of Alfresco Mobile for Android.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.application;

/**
 * List of all Action Item menu available inside the application.
 * 
 * @author Jean Marie Pascal
 */
public interface MenuActionItem
{

    // ///////////////////////////////////////////
    // BROWSER
    // ///////////////////////////////////////////
    public static final int MENU_SEARCH = 10;

    public static final int MENU_SEARCH_FOLDER = 11;

    public static final int MENU_SEARCH_OPTION = 11;

    public static final int MENU_CREATE_DOCUMENT = 19;

    public static final int MENU_CREATE_FOLDER = 20;

    public static final int MENU_UPLOAD = 30;

    public static final int MENU_DEVICE_CAPTURE = 31;

    public static final int MENU_REFRESH = 40;

    public static final int MENU_DELETE_FOLDER = 191;

    // ///////////////////////////////////////////
    // DETAILS
    // ///////////////////////////////////////////
    public static final int MENU_SHARE = 100;

    public static final int MENU_OPEN_IN = 110;

    public static final int MENU_DOWNLOAD = 120;

    public static final int MENU_UPDATE = 130;

    public static final int MENU_COMMENT = 140;

    public static final int MENU_LIKE = 150;

    public static final int MENU_EDIT = 160;

    public static final int MENU_VERSION_HISTORY = 170;

    public static final int MENU_TAGS = 180;

    public static final int MENU_DELETE = 190;

    // ///////////////////////////////////////////
    // Account
    // ///////////////////////////////////////////

    public static final int MENU_ACCOUNT_ADD = 200;

    public static final int MENU_ACCOUNT_EDIT = 210;

    public static final int MENU_ACCOUNT_DELETE = 220;

    // ///////////////////////////////////////////
    // DEVICE CAPTURE SUB-MENU
    // ///////////////////////////////////////////
    public static final int MENU_DEVICE_CAPTURE_CAMERA_PHOTO = 300;

    public static final int MENU_DEVICE_CAPTURE_CAMERA_VIDEO = 310;

    public static final int MENU_DEVICE_CAPTURE_MIC_AUDIO = 320;

    // ///////////////////////////////////////////
    // SITES
    // ///////////////////////////////////////////
    public static final int MENU_SITE_JOIN = 401;

    public static final int MENU_SITE_LEAVE = 402;

    public static final int MENU_SITE_CANCEL = 403;

    public static final int MENU_SITE_FAVORITE = 404;

    public static final int MENU_SITE_UNFAVORITE = 405;

    public static final int MENU_SITE_LIST_REQUEST = 406;

    // ///////////////////////////////////////////
    // GENERAL
    // ///////////////////////////////////////////

    public static final int ACCOUNT_ID = 1000;

    public static final int PARAMETER_ID = 2000;

    public static final int PARAMETER_HIDE_SHOW_TAB = 3000;

    public static final int ABOUT_ID = 4000;

}
