/*
============================================================
Structural Design Pattern - Decorator
============================================================
 */

interface Text {
    String getText();
}

class SimpleText implements Text {
    private final String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}

abstract class TextDecorator implements Text {
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text.getText();
    }
}

class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "**" + super.getText() + "**";
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Text text = new SimpleText("Hello World");
        text = new BoldDecorator(text);

        System.out.println(text.getText());
    }
}