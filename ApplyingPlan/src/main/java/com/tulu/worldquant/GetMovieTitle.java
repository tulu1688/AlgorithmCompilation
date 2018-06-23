package com.tulu.worldquant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetMovieTitle {
    static String doGetRequest(String urlStr, int page) throws Exception{
        URL url = new URL(urlStr + "&page=" + page);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

    static String[] getMovieTitles(String substr){
        ArrayList<String> titleList = new ArrayList<String>();

        String totalPagePt = "\"total_pages\":(\\d+)";
        String titlePagePt = "\"Title\"[:](\\\"(.+?)\")";

        String movieSearchPath = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

        Pattern totalPagePattern = Pattern.compile(totalPagePt);
        Pattern titlePagePattern = Pattern.compile(titlePagePt);

        int currentPage = 1;
        String searchContent = "";
        try {
            searchContent = doGetRequest(movieSearchPath + substr, currentPage);
        } catch (Exception e){}
        int totalPage = 1;
        Matcher m = totalPagePattern.matcher(searchContent);
        if (m.find()) {
            String tmp = m.group(0);
            tmp = tmp.substring(14);
            totalPage = Integer.valueOf(tmp);
        }

        m = titlePagePattern.matcher(searchContent);
        while (m.find()){
            String tmp = m.group(0);
            tmp = tmp.substring(9,tmp.length()-1);
            titleList.add(tmp);
        }

        while (currentPage < totalPage) {
            currentPage ++;
            try {
                searchContent = doGetRequest(movieSearchPath + substr, currentPage);
            } catch (Exception e){};

            m = titlePagePattern.matcher(searchContent);
            while (m.find()){
                String tmp = m.group(0);
                tmp = tmp.substring(9,tmp.length()-1);
                titleList.add(tmp);
            }
        }

        Collections.sort(titleList);
        return titleList.toArray(new String[titleList.size()]);
    }
}
