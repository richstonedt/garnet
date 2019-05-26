package com.richstonedt.garnet.filter.helper;

import javax.servlet.ServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpHelper {
    private static final Logger LOG = LoggerFactory
            .getLogger(HttpHelper.class);
    public static String getBodyString(ServletRequest request) {
        StringBuilder sb = new StringBuilder();

        try(
                InputStream inputStream = request.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
                ) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            LOG.error("Exception",e);
            ;
        }
        return sb.toString();
    }
}