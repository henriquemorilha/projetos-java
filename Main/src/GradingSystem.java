public class GradingSystem {

    public boolean isAPass(int percentage) {
        return percentage >= 50;
    }

    public String getGrade(int percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else if (percentage >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public String retakeMessage(int percentage, boolean isRetaking) {
        if (isRetaking) {
            if (percentage >= 50) {
                return "You have passed the retake.";
            } else {
                return "You failed the retake. Better luck next time.";
            }
        } else {
            if (percentage >= 50) {
                return "You passed on the first try!";
            } else {
                return "You need to take the retake.";
            }
        }
    }
}