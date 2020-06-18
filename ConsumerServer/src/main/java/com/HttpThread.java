
package com;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpThread implements Runnable
{

    public HttpThread()
    {
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            HttpClient client = new DefaultHttpClient();
            //String url = getUrl(i);
            //HttpGet request = new HttpGet(url);
            HttpGet request = new HttpGet("https://docs.appdynamics.com/");
            //HttpGet request = new HttpGet("http://localhost:8083/demo/login");
            //HttpGet request = new HttpGet("http://localhost:9091/codenotfound/resources-info");

            HttpResponse response = client.execute(request);
            System.out.println("this is exit call " + response.getStatusLine());
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
