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
public class JsoupLive {
      private String baseURL;
    private Document doc;
    private Elements links;
    private String liveURL;
    
    public JsoupLive() {
        this.baseURL  = "http://www.lisani.jp/news/";
        this.liveURL  = "live-repo";
    }
    public String LIVE() throws IOException {
        this.baseURL += this.liveURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
                
                String str = links.html();
                return str;
            }
}
