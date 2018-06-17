package com.kodcu.baslangic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        var  userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.toString().compareTo(o2.toString());
            }
        };

        /**
         * Lambda ifadeleri ile var Java 10 'da uyumsuz
         */
        // var  userComparator2 = (user1, user2)  -> user1.toString().compareTo(user2.toString());

        List<User> listOfUser = new ArrayList<>();
        listOfUser.add(new User("Kemal" , "Uysal"));
        listOfUser.add(new User("Davut" , "Güzel"));
        listOfUser.add(new User("Ayşe" , "Kutsal"));

        Collections.sort(listOfUser, userComparator);
    }
}
