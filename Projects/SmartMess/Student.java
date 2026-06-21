package Projects.SmartMess;


public class Student {
    private int stId;
    private String stName;
    private int roomNo;
    private String password;

    public Student(int stId, String stName, int roomNo, String password) {
        this.stId = stId;
        this.stName = stName;
        this.roomNo = roomNo;
        this.password = password;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
