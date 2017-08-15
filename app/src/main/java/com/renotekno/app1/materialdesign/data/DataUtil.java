package com.renotekno.app1.materialdesign.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zcabez on 14/08/2017.
 */

public class DataUtil {

    public static final String veggie = "Veggie";
    public static final String veggieDesc = "Veggies es bonus vobis, proinde vos postulo essum magis kohlrabi welsh onion daikon amaranth tatsoi tomatillo melon.";
    public static final String bacon = "Bacon";
    public static final String baconDesc = "Bacon ipsum dolor amet pork belly meatball kevin spare ribs. Frankfurter swine corned beef meatloaf, strip steak";

    public static List<DummyData> getDatas(){
        List<DummyData> datas = new ArrayList<>();

        for (int i = 0; i < 7; i++){
            datas.add(new DummyData(bacon, baconDesc));
        }

        return datas;
    };
}
