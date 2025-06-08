public class SmsContact implements ContactInfo {
    long phoneNumber;

    public SmsContact(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage() {
        System.out.println("Text sent to " + phoneNumber);
    }
}
