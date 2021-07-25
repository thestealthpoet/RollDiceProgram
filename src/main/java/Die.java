public abstract class Die {
    private String name;
    private int minimumFaceValue;
    private int maximumFaceValue;

    public Die(String name, int minimumFaceValue, int maximumFaceValue) {
        this.name = name;
        this.minimumFaceValue = minimumFaceValue;
        this.maximumFaceValue = maximumFaceValue;
    }


    public String getName() {
        return name;
    }
    public int getMinimumFaceValue() {
        return minimumFaceValue;
    }
    public int getMaximumFaceValue() {
        return maximumFaceValue;
    }
    public int rollDie() {
        int rollValue;
        rollValue = (int) Math.floor(Math.random()*(maximumFaceValue-minimumFaceValue+1)+minimumFaceValue);
        return rollValue;
    }
}
