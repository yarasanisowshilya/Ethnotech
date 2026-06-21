package Projects.SmartMess;


public class Coupons {
    private int couponId;
    private int studentId;
    private String dayName;
    private String mealType;
    private double amount;
    private String status;
    public Coupons(int couponId, int studentId, String dayName, String mealType, double amount, String status) {
        this.couponId = couponId;
        this.studentId = studentId;
        this.dayName = dayName;
        this.mealType = mealType;
        this.amount = amount;
        this.status = status;
    }
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
