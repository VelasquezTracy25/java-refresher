public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        String testVar = testMethod(address);
        System.out.println(html);
    }

    private String testMethod(String address) {
    return "test string";
    }

    private String sendHttpRequest(String ip) {
        return "127.0.0.1";
    }

    private String findIpAddress(String address) {
        return "<html></html>";
    }

}
