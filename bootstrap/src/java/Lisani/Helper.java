/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisani;

/**
 *
 * @author yoshikawatoshio
 */
public class Helper {
    
    public static Helper getInstance() {
        return new Helper();
    }

    public String genre(String genre) {
        String output = "";

        if (genre.equals("work-info-music")) {
            output = "作品情報CD";
        }
        if (genre.equals("work-info-anime")) {
            output = "作品情報(アニメ作品/BRD・DVD)";
        }
        if (genre.equals("live-repo")) {
            output = "ライブ";
        }
        if (genre.equals("event")) {
            output = "イベント";
        }

        return output;
    }

}


