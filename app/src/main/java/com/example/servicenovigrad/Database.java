package com.example.servicenovigrad;

import android.provider.BaseColumns;


public class Database extends DB_helper {
    private MyopenHelper myopenHelper;
    private static final String SQL_CREATE_ENTRIES = "Create User :" + FeedReaderContract.FeedEntry.Username + " " +
            FeedReaderContract.FeedEntry.Email + " " + FeedReaderContract.FeedEntry.PhoneNumber + " " +
            FeedReaderContract.FeedEntry.Name + "; Password: " + FeedReaderContract.FeedEntry.Password;

    public final class FeedReaderContract {
        private FeedReaderContract() {}

        /* Inner class that defines the table contents */
        public class FeedEntry implements BaseColumns {
            public static final String Username = "entry";
            public static final String Password = "pass";
            public static final String Name = "name";
            public static final String Email = "email";
            public static final String PhoneNumber = "phone";
        }
    }
}
