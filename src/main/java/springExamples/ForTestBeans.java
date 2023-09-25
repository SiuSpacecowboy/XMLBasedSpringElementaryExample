package springExamples;

public class ForTestBeans {

    private String nickname;

    public ForTestBeans() {}

    public ForTestBeans(String nickname) {
        this.nickname = nickname;
    }

    public void initMeth() {
        System.out.println("Инициализация");
    }

    public void destroyMeth() {
        System.out.println("Уничтожение");
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}

