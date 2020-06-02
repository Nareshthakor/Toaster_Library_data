package com.zen.librarytoaster;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessageClass
{

    public static void showmsg(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
