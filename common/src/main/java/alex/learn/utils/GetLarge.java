package alex.learn.utils;

import java.io.File;

public class GetLarge {

    public static void main(String[] args) {
        getlarge("f://");
    }


    public static void getlarge(String path) {
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File f : files) {
                if (null != f) {
                    if (f.isDirectory()) {
                        getlarge(f.getAbsolutePath());
                    } else if (f.isFile()) {

               /* if(f.length() > 100000000l  && !f.getAbsolutePath().endsWith("mp4") && !f.getAbsolutePath().endsWith("avi")
                        && !f.getAbsolutePath().endsWith("wmv") && !f.getAbsolutePath().endsWith("mkv") && !f.getAbsolutePath().endsWith("rmvb") ){
                    System.out.println(f.getAbsolutePath() +" ---- "+ (f.length()/1000/1000));
                }*/

            /*  if( f.getAbsolutePath().endsWith("exe") ){
                    System.out.println(f.getAbsolutePath() +" ---- "+ (f.length()/1000/1000));
                }*/

                       /* if (f.getAbsolutePath().contains("apache-") && (f.getAbsolutePath().endsWith("gz") || f.getAbsolutePath().endsWith("jar"))) {
                            System.out.println(f.getAbsolutePath() + " ---- " + (f.length() / 1000));
                        }*/

                        if (f.length() > 300000000l  ) {
                            System.out.println(f.getAbsolutePath() + " ---- " + (f.length() / 1000 / 1000));
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
