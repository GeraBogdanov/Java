package patterns.facade.media_library;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile result) {
    System.out.println("audioMixer: fixing audio...");
    return new File("tmp");
  }
}
