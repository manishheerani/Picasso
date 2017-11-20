package com.example.manish.recycleviewexample.Utils;

import com.example.manish.recycleviewexample.R;
import com.example.manish.recycleviewexample.model.President;

import java.util.ArrayList;

/**
 * Created by Manish on 11/18/2017.
 */

public class DataSource {
    public static ArrayList<President> getPresidentData()
    {
        String [] president_names = {"Rajendra Prasad","Sarvepalli Radhakrishnan",
                "Zakir Husain","Varahagiri Venkata Giri",
                "Fakhruddin Ali Ahmed","Neelam Sanjiva Reddy",
                "Giani Zail Singh","Ramaswamy Venkataraman",
                "Shankar Dayal Sharma","Kocheril Raman Narayanan",
                "Avul Pakir Jainulabdeen Abdul Kalam", "Pratibha Patil",
                "Pranab Mukherjee","Ram Nath Kovind"};

        String[] images={"http://www.culturalindia.net/iliimages/Dr-Rajendra-Prasad-ili-79-img-4.jpg",
                "https://pbs.twimg.com/media/Cr0TOMYWgAApbKr.jpg",
                "https://upload.wikimedia.org/wikipedia/en/thumb/e/e9/Dr_Zakir_Hussain.jpg/220px-Dr_Zakir_Hussain.jpg",
                "https://upload.wikimedia.org/wikipedia/en/6/65/Varahagiri_Venkata_Giri.jpg",
                "http://www.amulyam.in/images/contest/quiz/1304/310490/946484_qimg.jpg",
                "http://spiderimg.amarujala.com/assets/images/2016/11/20/990x460/n_1479635522.jpeg",
                "https://www.telegraphindia.com/legacy/1060601/images/01zail2.jpg",
                "http://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2017/03/18/Pictures/president-independence-venkataraman-addressing-the-nation-occasion_22a46e60-0be9-11e7-ba13-f6aef3964879.jpg",
                "http://amipsyche.com/wp-content/uploads/2017/01/Dr-Shankar-Dayal-Sharma-Presidents-of-India-List.jpg",
                "http://www.stateofkerala.in/kerala_celebrities/images/k%20r%20narayanan%202.jpg",
                "http://www.abdulkalam.com/kalam/theme/assets/images/press-release-abdulkalam.jpg",
                "http://data1.ibtimes.co.in/en/full/221724/pratibha-patil.jpg",
                "http://media2.intoday.in/indiatoday/images/stories/pranab--647_011616085737.jpg",
                "https://pbs.twimg.com/media/DCrJP2QXkAE2TOC.jpg"};

        String number_of_president[]= {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th"};

        String wiki_links[] = {"https://en.wikipedia.org/wiki/Rajendra_Prasad","https://en.wikipedia.org/wiki/Sarvepalli_Radhakrishnan",
                "https://en.wikipedia.org/wiki/Zakir_Husain_(politician)","https://en.wikipedia.org/wiki/V._V._Giri",
                "https://en.wikipedia.org/wiki/Fakhruddin_Ali_Ahmed ",  "https://en.wikipedia.org/wiki/Neelam_Sanjiva_Reddy",
                "https://en.wikipedia.org/wiki/Zail_Singh", "https://en.wikipedia.org/wiki/R._Venkataraman",
                "https://en.wikipedia.org/wiki/Shankar_Dayal_Sharma", "https://en.wikipedia.org/wiki/K._R._Narayanan",
                "https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam", "https://en.wikipedia.org/wiki/Pratibha_Patil",
                "https://en.wikipedia.org/wiki/Pranab_Mukherjee","https://en.wikipedia.org/wiki/Ram_Nath_Kovind"};

        String [] duration={"26 January 1950 – 14 May 1962","14 May 1962 – 13 May 1967",
                "13 May 1967 – 3 May 1969","24 August 1969 – 24 August 1974",
                "24 August 1974 – 11 February 1977","25 July 1977 – 25 July 1982",
                "25 July 1982 – 25 July 1987","25 July 1987 – 25 July 1992",
                "25 July 1992 – 25 July 1997","25 July 1997 – 25 July 2002",
                "25 July 2002 – 25 July 2007","25 July 2007 – 25 July 2012",
                "25 July 2012 – 25 July 2017","Current"};

        ArrayList<President> presidentArrayList = new ArrayList<>();

        for(int i=number_of_president.length-1;i>=0;i--)
        {
            President temp_president= new President(president_names[i],duration[i],wiki_links[i],images[i],number_of_president[i]);
            presidentArrayList.add(temp_president);
        }

        return presidentArrayList;
    }
}
