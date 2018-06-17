package com.kodcu.baslangic;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {

        /**
         * Okumayi kolaylaştırıyor
         */

        //HashMap<User, List<String>> userListHashMap =  new HashMap<User, List<String>>();

        var userChannels = new HashMap<User, List<String>>();
        userChannels.put(new User("Ali", "Ok"), Arrays.asList("a","b"));

        System.out.println(userChannels);



    }
}
