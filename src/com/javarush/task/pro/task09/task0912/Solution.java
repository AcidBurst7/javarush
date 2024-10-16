package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String[] patterns = {"http", "https"};
        String result = "неизвестный";

        for (int i = 0; i < patterns.length; i++) {
            if (url.startsWith(patterns[i])) {
                result = patterns[i];
            }
        }

        return result;
    }

    public static String checkDomain(String url) {
        String[] patterns = {"com", "net", "org", "ru"};
        String result = "неизвестный";

        for (int i = 0; i < patterns.length; i++) {
            if (url.endsWith(patterns[i])) {
                result = patterns[i];
            }
        }

        return result;
    }
}
