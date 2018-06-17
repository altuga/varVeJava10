package com.kodcu.baslangic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {


        // var'ın karanlık yüzü
        Map<String, List<String>> countryToCity = getCities(); // ne döndürdüğü anlamak daha kolay
        var countryToCity2 = getCitiesJava10(); // ne döndürdüğü net değil. Belirsizlik...
    }

    /**
     * okumasi daha zor
     */
    public  static Map<String, List<String>>  getCities() {
        Map<String, List<String>> countryToCity = new HashMap<>();
        // ...
        for (Map.Entry<String, List<String>> citiesInCountry : countryToCity.entrySet()) {
            List<String> cities = citiesInCountry.getValue();
            // ...
        }

        return countryToCity;
    }

    /**
     * Okumasi daha kolay
     */
    public static Map<String, List<String>>  getCitiesJava10() {
         var countryToCity = new HashMap<String, List<String>>();
        // ...
        for (var citiesInCountry : countryToCity.entrySet()) {
            var cities = citiesInCountry.getValue();
            // ...
        }
        return countryToCity;
    }
}
