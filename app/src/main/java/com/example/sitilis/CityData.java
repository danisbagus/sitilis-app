package com.example.sitilis;

import java.util.ArrayList;

public class CityData {
    private static String[] cityNames = {
            "Surabaya",
            "Yogyakarta",
            "Bandung",
            "Semarang",
            "Denpasar",
            "Jakarta",
            "Medan",
            "Samarinda",
            "Makassar",
            "Jayapura"
    };

    private static String[] locations = {
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia"
    };

    private static int[] cityImages = {
            R.drawable.surabaya,
            R.drawable.yogakarta,
            R.drawable.bandung,
            R.drawable.semarang,
            R.drawable.denpasar,
            R.drawable.jakarta,
            R.drawable.medan,
            R.drawable.samarinda,
            R.drawable.makassar,
            R.drawable.jayapura
    };

    private static String[] cityDetails = {
            "Surabaya is the capital of the Indonesian province of East Java and the second-largest city in Indonesia after Jakarta. Located on northeastern border of Java island, on the Madura Strait, it is one of the earliest port cities in Southeast Asia. According to the National Development Planning Agency, Surabaya is one of the four main central cities of Indonesia, alongside Jakarta, Medan, and Makassar. (Wikipedia)",
            "Yogyakarta is the capital city of Special Region of Yogyakarta in Indonesia, on the island of Java. As the only Indonesian royal city still ruled by a monarchy, Yogyakarta is regarded as an important centre for classical Javanese fine arts and culture such as ballet, batik textiles, drama, literature, music, poetry, silversmithing, visual arts, and wayang puppetry. (Wikipedia)",
            "Bandung is the capital of West Java province in Indonesia and third-largest city in Indonesia after Jakarta and Surabaya. Greater Bandung is the country's second-largest metropolitan extended with over 11 million inhabitants. Located 768 metres (2,520 feet) above sea level, approximately 140 kilometres (87 miles) southeast of Jakarta, Bandung has cooler year-round temperatures than most other Indonesian cities. (Wikipedia)",
            "Semarang is the capital and largest city of Central Java province in Indonesia. It was a major port during the Dutch colonial era, and is still an important regional center and port today. The city has been named as the cleanest tourist destination in Southeast Asia by the ASEAN Clean Tourist City Standard (ACTCS) for 2020–2022. (Wikipedia)",
            "Denpasar is the capital of Bali and the main gateway to the island. The city is also a hub for other cities in the Lesser Sunda Islands. This article contains Balinese alphabet. Without proper rendering support, you may see question marks, boxes, or other symbols instead of Balinese characters. With the rapid growth of the tourism industry in Bali, Denpasar has encouraged and promoted business activities and ventures, contributing to it having the highest growth rate in Bali Province. (Wikipedia)",
            "Jakarta officially the Special Capital Region of Jakarta (Indonesian: Daerah Khusus Ibukota Jakarta), is the capital of Indonesia. It lies on the northwest coast of Java (the world's most populous island). Jakarta is the centre of the economy, culture and politics of Indonesia. It has province level status which had a population of 10,562,088 as of 2020. (Wikipedia)",
            "Medan is is the capital and largest city of the Indonesian province of North Sumatra. A regional hub and financial centre of Sumatra, which is one of the four main central cities of Indonesia, alongside Jakarta, Surabaya, and Makassar. Medan has a population of over 2.2 million within its city limits, and over 3.4 million in its built-up urban area, making it the fourth largest urban area in Indonesia. (Wikipedia)",
            "Samarinda is the capital city of the Indonesian province of East Kalimantan on the island of Borneo. The city lies on the banks of the Mahakam River with a land area of 718 km2 (277 sq mi). It is the most populous city on the entire Borneo island, with an estimated population of 842,691, up from 726,223 at the 2010 Census. (Wikipedia)",
            "Makassar is the capital of the Indonesian province of South Sulawesi. It is the largest city in the region of Eastern Indonesia and the country's fifth-largest urban center after Jakarta, Surabaya, Bandung, and Medan. The city is located on the southwest coast of the island of Sulawesi, facing the Makassar Strait. Makassar is not only the gateway of Eastern Indonesia, but also the epicenter of West and East Indonesia, as well as between Australia and Asia. (Wikipedia)",
            "Jayapura is the capital and largest city of the Indonesian province of Papua. It is situated on the northern coast of New Guinea island and covers an area of 935.92 km2 (361.36 sq mi). The city borders the Pacific Ocean and Yos Sudarso Bay to the north, Sandaun Province of Papua New Guinea to the east, Keerom Regency to the south, and Jayapura Regency to the west. (Wikipedia)"
    };

    static ArrayList<City> getListData(){
        ArrayList<City> list = new ArrayList<>();
        for(int pos = 0; pos < cityNames.length; pos++) {
            City city = new City();
            city.setName(cityNames[pos]);
            city.setLocation(locations[pos]);
            city.setDetail(cityDetails[pos]);
            city.setPhoto(cityImages[pos]);
            list.add(city);
        }
        return  list;
    }


}
