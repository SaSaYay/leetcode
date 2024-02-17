package Decorator;

/**
 * @author sasayaya
 * @create 2024/1/15 23:43
 */
public interface Phone {
    /**
     * 呼入
     * @return
     */
    String  callIn();

    /**
     * 呼出
     * @param info
     * @return
     */
    String  callOut(String info);

}
