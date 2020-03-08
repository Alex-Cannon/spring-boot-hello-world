package alex.helloworld;

public class HelloWorld {

    private final long id;
    private final String content;

    HelloWorld(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}