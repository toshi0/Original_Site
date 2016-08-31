/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisani;

import java.io.Serializable;
import java.util.ArrayList;
import org.jsoup.select.Elements;

/**
 *
 * @author yoshikawatoshio
 */
public class LisaniBeans implements Serializable {
    private Elements article;

    private String genre;
    
    private ArrayList<String> dataSrcArr;

    public static LisaniBeans getInstance() {
        return new LisaniBeans();
    }
    public void setArticle(Elements article){
        this.article = article;
    }
    public Elements getArticle() {
        return this.article;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setDataSrcArr(ArrayList<String> dataSrcArr) {
        this.dataSrcArr = dataSrcArr;
    }

    public ArrayList<String> getDataSrcArr() {
        return this.dataSrcArr;
    }
}
