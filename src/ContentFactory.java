interface ContentFactory {
    public abstract Content createContent(Object object);
}

class ImageContentFactory implements ContentFactory {

    @Override
    public Content createContent(Object object) {
        return new ImageContent(object);
    }
}

class VoiceContentFactory implements ContentFactory {
    @Override
    public Content createContent(Object object) {
        return new VoiceContent(object);
    }
}

class TextContentFactory implements ContentFactory {
    @Override
    public Content createContent(Object object) {
        return new TextContent(object);
    }
}