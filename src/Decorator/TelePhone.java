package Decorator;

/**
 * @author sasayaya
 * @create 2024/1/15 23:45
 */
public class TelePhone implements Phone{
    @Override
    public String callIn() {
        return "get null";
    }

    @Override
    public String callOut(String info) {
        return "发送语音:"+info;
    }
}
