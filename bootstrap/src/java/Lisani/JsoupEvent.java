/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisani;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author yoshikawatoshio
 */
public class JsoupEvent {
    private String baseURL;
    private Document doc;
    private Elements links;
    private String eventURL;
    
    public JsoupEvent() {
        this.baseURL  = "http://www.lisani.jp/news/";
        this.eventURL = "event";
    }
    public String EVENT() throws IOException {
        this.baseURL += this.eventURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
                
                String str = links.html();
                return str;
            }
}
