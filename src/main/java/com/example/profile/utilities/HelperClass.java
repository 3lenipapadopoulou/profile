package com.example.profile.utilities;

import java.util.UUID;

public class HelperClass {
    public static String CreateRandomId(){
        final String id= UUID.randomUUID().toString();
        return id;
    }

}
