package ro.jademy.millionaire.model;

public class Level {

    private int number;
    private int difficultyLevel;
    private int reward;
    private int rewardBailout;

    public Level(int number, int difficultyLevel, int reward, int rewardBailout ) {
        this.number = number;
        this.difficultyLevel = difficultyLevel;
        this.reward = reward;
        this.rewardBailout = rewardBailout;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getRewardBailout() {
        return rewardBailout;
    }

    public void setRewardBailout( int rewardBailout ) {
        this.rewardBailout = rewardBailout;
    }
}

