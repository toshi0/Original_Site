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
 *リスアニのURLにリクエストをして、 そのHTMLの要素からタイトル、本文、画像を取得するオブジェクト
 *
 * @author yoshikawatoshio
 */
public class URLSeach {
    private String baseURL;
    private Document doc;
    private Elements links;
    private String cdURL;
    private String animeURL;
    private String liveURL;
    private String eventURL;
    
    public URLSeach() {
        this.baseURL  = "http://www.lisani.jp/news/";
        this.cdURL    = "work-info-music";
        this.animeURL = "work-info-anime"; 
        this.liveURL  = "live-repo";
        this.eventURL = "event";
    }
    /**
     * URLのHTMLの情報を取得
     *
     * @param URL
     * @throws IOException
     */
    public void setLisaniURL(String genre) throws IOException {
        this.baseURL += genre;
        this.doc = Jsoup.connect(this.baseURL).get();      
    }
   

    /**
     * 一覧のURLのHTMLの情報を取得
     *
     * @param URL
     * @throws IOException
     */
    public void setGenreURL(String genreURL) throws IOException {
        this.doc = Jsoup.connect(genreURL).userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.73 Safari/537.36").post();
        this.links = this.doc.getElementsByClass("articleList");
    }

    public String getGenreURL() {
        return this.links.html();
    }
    
    public String CD() throws IOException {
        this.baseURL += this.cdURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
               
                String str = links.html();
                return str;
            }
    
    public String BRD_DVD() throws IOException {
        this.baseURL += this.animeURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
                
                String str = links.html();
                return str;
            }
    
    public String LIVE() throws IOException {
        this.baseURL += this.liveURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
                
                String str = links.html();
                return str;
            }
    
    public String EVENT() throws IOException {
        this.baseURL += this.eventURL;
                this.doc = Jsoup.connect(this.baseURL).get();
                this.links = this.doc.getElementsByClass("articleList");
                
                String str = links.html();
                return str;
            }
}
