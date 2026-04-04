package chap_5.size_path;

import java.io.File;

public class SizePath {
  public static void main(String[] args) {
    File file = new File("D:\\dev\\sofware Engineering\\algorithmss-ds");
    long result = totalSpace(file);

    System.out.println(result);
  }

  public static long totalSpace(File root) {

    if (root.isFile()) {
      return root.length();
    }

    long totalSpace = 0;

    File[] files = root.listFiles();

    if (files != null) {
      for (File f : files) {
        totalSpace += totalSpace(f);
      }
    }

    return totalSpace;
  }
}
