public enum Gender232 {
    EMPLOYEE("china"),
    BOSSREPLACEMENT("china"),
    BOSS("china");
    private String china;

    Gender232(String china) {
        this.china = china;
    }

    public String getChina() {
        return china;
    }

    public void setChina(String china) {
        this.china = china;
    }

    @Override
    public String toString() {
        return
                "china=" + china ;
    }
}
