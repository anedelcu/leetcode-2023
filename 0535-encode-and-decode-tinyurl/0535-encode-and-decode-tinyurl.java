public class Codec {
    
    Map<String, String> encodeMap = new HashMap<>();
    Map<String, String> decodeMap = new HashMap<>();
    String base = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(encodeMap.containsKey(longUrl)) {
            return encodeMap.get(longUrl);
        }
        else {
            String s = base + (encodeMap.size() + 1);
            encodeMap.put(longUrl, s);
            decodeMap.put(s, longUrl);
        }
        return encodeMap.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodeMap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
