package structural.proxy;

import structural.proxy.internet.Internet;
import structural.proxy.internet.ProxyInternet;
import structural.proxy.video.ProxyVideoDownloader;
import structural.proxy.video.VideoDownloader;

public class Main {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }
}
