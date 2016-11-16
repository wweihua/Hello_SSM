package cn.mtoke.utils;
 
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
 
public class GetShortUrl {
	public static final String PRE_URL = "http://api.t.sina.com.cn/short_url/shorten.json?source=3271760578&url_long=";
	
	//���ýӿ�
	public static String madeUrl(String long_url)throws IOException{
		//System.out.println(PRE_URL+long_url);
		long_url =URLEncoder.encode(long_url, "GBK");
		String urlencode=PRE_URL+long_url;
		//System.out.println(urlencode);
		return urlencode;
	}
	//get()����
    public static String readContentFromGet(String GET_URL) throws IOException{
        // ƴ��get�����URL�ִ���ʹ��URLEncoder.encode������Ͳ��ɼ��ַ����б���
        String getURL = GET_URL + "&activatecode=" + URLEncoder.encode("����", "utf-8");
        URL getUrl = new URL(getURL);
        // ����ƴ�յ�URL�������ӣ�URL.openConnection���������URL�����ͣ�
        // ���ز�ͬ��URLConnection����Ķ�������URL��һ��http�����ʵ�ʷ��ص���HttpURLConnection
        HttpURLConnection connection = (HttpURLConnection) getUrl
                .openConnection();
        // �������ӣ�����ʵ����get requestҪ����һ���connection.getInputStream()�����вŻ���������
        // ������
        connection.connect();
        // ȡ������������ʹ��Reader��ȡ
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));//���ñ���,������������
        String lines;
        String url = null;
        while ((lines = reader.readLine()) != null){
            System.out.println(lines);
            url=lines;
        }
        reader.close();
        // �Ͽ�����
        connection.disconnect();
        System.out.println(url);
        return url;
    }
    
    public static String json(String long_url){
    	String short_url=new String("123");
    	try {
    		short_url=readContentFromGet(madeUrl(long_url));
//    		System.out.println(short_url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	int beginIndex=short_url.indexOf(":\"");
		int endIndex=short_url.indexOf("\",\"");
		String nurl=short_url.substring(beginIndex+2, endIndex);
		return nurl;
    }
//    public static void main(String[] args){
//    	json("http://wenda.so.com/q/1381025989065114?src=9999&cid-pre=1000204");
//	}
}
