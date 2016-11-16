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
	
	//设置接口
	public static String madeUrl(String long_url)throws IOException{
		//System.out.println(PRE_URL+long_url);
		long_url =URLEncoder.encode(long_url, "GBK");
		String urlencode=PRE_URL+long_url;
		//System.out.println(urlencode);
		return urlencode;
	}
	//get()请求
    public static String readContentFromGet(String GET_URL) throws IOException{
        // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码
        String getURL = GET_URL + "&activatecode=" + URLEncoder.encode("仿宋", "utf-8");
        URL getUrl = new URL(getURL);
        // 根据拼凑的URL，打开连接，URL.openConnection函数会根据URL的类型，
        // 返回不同的URLConnection子类的对象，这里URL是一个http，因此实际返回的是HttpURLConnection
        HttpURLConnection connection = (HttpURLConnection) getUrl
                .openConnection();
        // 进行连接，但是实际上get request要在下一句的connection.getInputStream()函数中才会真正发到
        // 服务器
        connection.connect();
        // 取得输入流，并使用Reader读取
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));//设置编码,否则中文乱码
        String lines;
        String url = null;
        while ((lines = reader.readLine()) != null){
            System.out.println(lines);
            url=lines;
        }
        reader.close();
        // 断开连接
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
