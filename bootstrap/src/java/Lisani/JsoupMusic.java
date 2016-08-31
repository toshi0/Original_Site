/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisani;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author yoshikawatoshio
 */
public class JsoupMusic {
    private String baseURL;
    private Document doc;
    private Elements links;
    private String cdURL;
    
    public JsoupMusic() {
        this.baseURL  = "http://www.lisani.jp/news/";
        this.cdURL    = "work-info-music";
    }
    public ArrayList CD() throws IOException {
                ArrayList<Element> cd = new ArrayList<Element>();
                Document document = Jsoup.connect("http://www.lisani.jp/news/work-info-music").get();
                Elements links = document.getElementsByClass("thumbNail");

                for (int i = 0; i < links.size(); i++) {
                    cd.add(links.get(i));
                }
                return cd;
            }
    public String CD2() throws IOException {
        this.baseURL += this.cdURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
               
                String str = links.html();
                return str;
            }
}
