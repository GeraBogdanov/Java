package patterns.facade.media_library;

public class CodecFactory extends MPEG4CompressionCodec {
  public static Codec extract(VideoFile file) {
    String type = file.getCodecType();
    if(type.equals("mp4")) {
      System.out.println("CodecFactory: extracting mpeg audio...");
      return new MPEG4CompressionCodec();
    } else {
      System.out.println("CodecFactory: extracting ogg audio...");
      return new OggCompressionCodec();
    }
  }
}
