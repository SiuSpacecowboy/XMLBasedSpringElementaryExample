package springExamples;

public class TestBeans {

    private ForTestBeans testName;

    public TestBeans(ForTestBeans testName) {
        this.testName = testName;
    }

    public void setTestName(ForTestBeans testName) {
        this.testName = testName;
    }

    public String getNicknames() {
        return testName.getNickname();
    }
}
